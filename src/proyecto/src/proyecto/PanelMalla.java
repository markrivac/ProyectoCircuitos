package proyecto;
/**
 * Saved as PanelMalla.java
 * @author Kevin Oswaldo Cabrera Navarro A01227157
 * @author Mark Octavio Rivera Acosta A01234567
 * 
 * Started in April 6th, 2016
 * Last modified in April 19th, 2016
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelMalla extends JPanel implements MouseMotionListener, MouseListener {
	
	public PanelMalla(PanelControles pc)  {
		super();
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		this.setPreferredSize(new Dimension(440,680));
		this.setBackground(Color.WHITE);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		dibujaMalla(g);
	}
	
	public void dibujaMalla(Graphics g){
		
		g.setColor(Color.BLACK);
		g.drawLine(60, 60, 160, 60);
		g.drawRect(160, 20, 100, 80);
		
		g.drawLine(260, 60, 380, 60);
		g.drawLine(380, 60, 380, 140);
		g.drawRect(320, 140, 100, 80);
		
		g.drawLine(380, 220, 380, 300);
		g.drawRect(320, 300, 100, 80);
		
		g.drawLine(380, 380, 380, 460);
		g.drawLine(380, 460, 260, 460);
		g.drawRect(160, 420, 100, 80);
		
		g.drawLine(160, 460, 60, 460);
		g.drawLine(60, 460, 60, 380);
		g.drawRect(20, 300, 100, 80);
		
		g.drawLine(60, 300, 60, 220);
		g.drawRect(20, 140, 100, 80);
		g.drawLine(60, 60, 60, 140);
		
		g.drawLine(60, 260, 380, 260);
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

/*
		import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;









	public void mouseClicked(MouseEvent e) {
		for(int j=0;j<puntos.length;j++){
			if(puntos[j] == null){
				puntos[j] = new Point((e.getX()-(this.getWidth()-this.x*19)),(this.getHeight()-this.y-e.getY()));
				this.numOfPoints+=1;
				//	debug
				System.out.print("x: "+puntos[j].getX());
				System.out.print(" y: "+puntos[j].getY());
				System.out.print(" # de puntos: "+this.numOfPoints);
				// debug
				break;
			}
			else{
				temp = new Point[puntos.length+10];
				for(int k=0; k<puntos.length;k++){
					this.temp[k]=this.puntos[k];
				}
				this.puntos = temp;
			}

		}

		System.out.print(" x2: "+xSum2());
		System.out.print(" X sum: "+xSum());
		System.out.print(" Y sum: "+ySum());
		System.out.print(" X*Y: "+xyMult());
		System.out.print( " m = "+getM());
		System.out.println( " b = "+getB());

	}

	public void drawPoint(Graphics g){
		for(int x=0;x<this.puntos.length;x++){
			if(this.puntos[x] != null){
				g.setColor(Color.BLACK);
				g.drawString(".", (int)((this.puntos[x].getX()+(this.getWidth()-this.x*19))),(int)(this.getHeight()-this.y-puntos[x].getY()));
				//g.fillOval((int)(this.puntos[x].getX()+(this.getWidth()-this.x*19)), (int)(this.getHeight()-this.y-puntos[x].getY()), 10, 10);
			}
		}		
	}

	public Point[] getPuntos(){
		return this.puntos;
	}

	public void setPuntos(Point[] puntos){
		this.puntos = puntos;
	}

	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}

	public void seePoint(Graphics g){
		g.setColor(new Color(30,144,255));
		g.drawString("X:"+(xp-(this.getWidth()-this.x*19))+" "+"Y: "+(this.getHeight()-this.y-yp), xp,yp);
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
		this.xp=e.getX();
		this.yp=e.getY();		
	}

	public int xSum2(){
		int xsum2 = 0;
		for(int x=0;x<this.puntos.length;x++){
			if(this.puntos[x] != null){
				xsum2 = (int) (xsum2 + (this.puntos[x].getX()*this.puntos[x].getX()));
			}
		}
		return xsum2;
	}

	public int xSum(){
		int xsum = 0;
		for(int x=0;x<this.puntos.length;x++){
			if(this.puntos[x] != null){
				xsum = (int) (xsum + this.puntos[x].getX());
			}
		}
		return xsum;
	}

	public int ySum(){
		int ysum = 0;
		for(int y=0;y<this.puntos.length;y++){
			if(this.puntos[y] != null){
				ysum = (int) (ysum + this.puntos[y].getY());
			}
		}
		return ysum;
	}

	public int xyMult(){
		int xtemp=0, ytemp=0, multi=0, sumMulti=0;
		for(int m=0;m<this.puntos.length;m++){
			if(puntos[m] != null){
				xtemp = (int) this.puntos[m].getX();
				ytemp = (int) this.puntos[m].getY();
				multi = xtemp*ytemp;
				sumMulti = sumMulti + multi; 
			}
		}
		return sumMulti;
	}

	public double getM(){
		double num = 0, den = 0;	
		num = ((this.numOfPoints*xyMult())-(xSum()*ySum()));
		den = (this.numOfPoints*xSum2()-(xSum()*xSum()));
		return num/den;
	}

	public double getB(){
		double num=0;
		num = (ySum()-(getM()*xSum()));
		return num/this.numOfPoints;
	}

	//-------------y=mx+b----------
	public void dibujarFormula(Graphics g){
		double m=this.getM();
		m=m*100;
		m=(int)m;
		m=(double)m;
		m=m/100;
		
		g.setColor(Color.GRAY);
		if(this.numOfPoints<2){
			g.drawString("no hay recta todavia",100,100);
		}else
		
		if(this.getB()<0){
			g.drawString("y="+m+"x"+(int)this.getB(), 100, 100);
		}else{
			g.drawString("y="+m+"x+"+(int)this.getB(), 100, 100);
		}
		this.repaint();
	}
}

*/

/*
g.setColor(Color.gray);
for(int i=0;i<this.getWidth();i+=50){
	g.drawLine(i, 0, i, 680);
}*/