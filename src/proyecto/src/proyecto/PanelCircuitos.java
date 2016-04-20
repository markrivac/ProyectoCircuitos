package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelCircuitos extends JPanel implements MouseListener
{
	
	private ImageIcon resistenciaIMG,capacitorIMG,conductorIMG,voltajeIMG;
	private JButton resistencia, capacitor, conductor, voltaje;
	
	public PanelCircuitos() {
		super();
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		this.setPreferredSize(new Dimension(1080,160));
		this.setBackground(new Color(183,183,183));
		
		this.resistenciaIMG = new ImageIcon(getClass().getResource("resistencia.png"));
		this.capacitorIMG = new ImageIcon(getClass().getResource("capacitor.png"));
		this.conductorIMG =new ImageIcon(getClass().getResource("conductor.png"));
		this.voltajeIMG = new ImageIcon(getClass().getResource("voltaje.png"));
		
		this.resistencia = new JButton(resistenciaIMG);
		this.capacitor = new JButton(capacitorIMG);
		this.conductor = new JButton(conductorIMG);
		this.voltaje = new JButton(voltajeIMG);
		
		this.add(this.resistencia);
		this.add(this.capacitor);
		this.add(this.conductor);
		this.add(this.voltaje);
		
		this.resistencia.setSize(100, 100);
		this.capacitor.setSize(100, 100);
		this.conductor.setSize(100, 100);
		this.voltaje.setSize(100, 100);
		
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		/*g.drawImage(this.resistencia.getImage(),120 ,getHeight()/5,100,100,this);
		g.drawImage(this.capacitor.getImage(),365 ,getHeight()/5,100,100,this);
		g.drawImage(this.conductor.getImage(),610 ,getHeight()/5,100,100,this);
		g.drawImage(this.voltaje.getImage(),855 ,getHeight()/5,100,100,this);*/
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
}
	
	/*
}
		MouseMotionListener mml = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				xTexto=e.getX();
				yTexto=e.getY();		
				repaint();
			}
		};
		
		this.addMouseMotionListener(mml);
		this.xTexto=110+this.xV;
		this.yTexto=550-this.yV;
		this.hilo = new Thread(this);
		this.hilo.start();
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(this.fondo, 0, 0, this.getWidth(),this.getHeight(),this);
		this.pintaNave(g);
		this.pintaMensaje(g);
	
	}
	
	private void pintaMensaje(Graphics g){
		g.drawString(this.texto, this.xTexto, this.yTexto);
		g.drawString("xV= "+this.xV,550,550);
		g.drawString("yV="+this.yV,550,570);
		g.drawString("xNave="+this.xNave , 650, 550);
		g.drawString("yNave="+this.yNave , 650, 570);
	}
	
	private void pintaNave(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(xNave+50+xV, yNave-200+yV, 100, 100);

		g.setColor(colorNave);
		g.fillOval(this.xNave+this.xV, this.yNave+this.yV, 200, 100);

		g.setColor(Color.WHITE);
		g.drawLine(this.xV+xNave+100,this.yV+yNave,this.xV+this.xNave+100,this.yV+yNave-100);
	}

	public void setMensaje(String texto) {
		this.texto=texto;
		this.repaint();
	}

	public void setColor(int r){
		this.colorNave=new Color(r,210,1);
		this.repaint();
		this.pc.setBackground(Color.BLACK);
	}
	
	public void setPanelControles(PanelControles pc){
		this.pc=pc;
	}


	public void mouseClicked(MouseEvent e) {
		this.xV=0;
		this.yV=0;
		this.xNave=e.getX();
		this.yNave=e.getY();
		this.repaint();
	}

	public void mousePressed(MouseEvent e) {
		this.correr=true;
	}


	public void mouseReleased(MouseEvent e) {
		this.correr=false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void run() {
		try{
			Thread.sleep(1000);
			while(this.xV<(this.getWidth()-200-100)){
				if(this.correr){
					this.xV+=4;	
					this.yV-=2;
					repaint();
				}
				Thread.sleep(10);
			}
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.colorNave=color;
		this.repaint();

	}
}*/