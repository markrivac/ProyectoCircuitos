package proyecto;
/**
 * Saved as PanelMalla.java
 * @author Kevin Oswaldo Cabrera Navarro A01227157
 * @author Mark Octavio Rivera Acosta A01234567
 * 
 * Started in April 6th, 2016
 * Last modified in April 20th, 2016
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelMalla extends JPanel implements MouseListener{
	//Declaration 
	private ImageIcon resistenciaIMG,
					  capacitorIMG,
					  conductorIMG,
					  voltajeIMG;
	
	private String componente;

	//Main Constructor
	public PanelMalla()  {
		super();
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		this.setPreferredSize(new Dimension(440,680));
		this.setBackground(Color.WHITE);
		
		
		//Instantiation of images
		this.resistenciaIMG = new ImageIcon(getClass().getResource("resistencia.png"));
		this.capacitorIMG = new ImageIcon(getClass().getResource("capacitor.png"));
		this.conductorIMG =new ImageIcon(getClass().getResource("conductor.png"));
		this.voltajeIMG = new ImageIcon(getClass().getResource("voltaje.png"));
		
		Image img = resistenciaIMG.getImage() ;  
		 Image newimg = img.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		 resistenciaIMG = new ImageIcon( newimg );
		   
		 Image img2 = capacitorIMG.getImage() ;  
		 Image newimg2 = img2.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		 capacitorIMG = new ImageIcon( newimg2 );
		   
		 Image img3 = conductorIMG.getImage() ;  
		 Image newimg3 = img3.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		 conductorIMG = new ImageIcon( newimg3 );
		   
		 Image img4 = voltajeIMG.getImage() ;  
		 Image newimg4 = img4.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		 voltajeIMG = new ImageIcon( newimg4 );
		 
		 //Adds listeners
		 this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		dibujaMalla(g);
	}
	
	//Draws the initial circuit
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
		System.out.println("hola");
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
	
	public void cambiarComponente(String componente){
		this.componente=componente;
		System.out.println("hola soy un: "+this.componente);
	}
}