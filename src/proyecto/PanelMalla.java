package proyecto;
/**
 * Saved as PanelMalla.java
 * @author Kevin Oswaldo Cabrera Navarro A01227157
 * @author Mark Octavio Rivera Acosta A01234567
 * 
 * Started in April 6th, 2016
 * Last modified in April 25th, 2016
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
<<<<<<< HEAD:src/proyecto/PanelMalla.java
import java.awt.Image;

=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
>>>>>>> origin/master:src/proyecto/src/proyecto/PanelMalla.java

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelMalla extends JPanel implements ActionListener{
	//Declaration 
	private JButton bComponente1,
					bComponente2,
					bComponente3,
					bComponente4,
					bComponente5,
					bComponente6;
	
<<<<<<< HEAD:src/proyecto/PanelMalla.java
	ImageIcon resistenciaIMG;
	private ImageIcon capacitorIMG,conductorIMG,voltajeIMG;
	private PanelCircuitos pc = new PanelCircuitos();
=======
	private PanelControles pc;
	private String componente;
>>>>>>> origin/master:src/proyecto/src/proyecto/PanelMalla.java

	//Main Constructor
	public PanelMalla(PanelControles pc)  {
		super();
		//((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		this.setLayout(null);
		this.setPreferredSize(new Dimension(440,680));
		this.setBackground(Color.WHITE);
		this.pc=pc;
		this.bComponente1=new JButton("Componente1");
		this.bComponente2=new JButton("Componente2");
		this.bComponente3=new JButton("Componente3");
		this.bComponente4=new JButton("Componente4");
		this.bComponente5=new JButton("Componente5");
		this.bComponente6=new JButton("Componente6");
		

		//Adding components
		this.add(bComponente1);
		this.add(bComponente2);
		this.add(bComponente3);
		this.add(bComponente4);
		this.add(bComponente5);
		this.add(bComponente6);

		//Adds listeners
		this.bComponente1.addActionListener(this);
		this.bComponente2.addActionListener(this);
		this.bComponente3.addActionListener(this);
		this.bComponente4.addActionListener(this);
		this.bComponente5.addActionListener(this);
		this.bComponente6.addActionListener(this);
		
		this.bComponente1.setBounds(160, 20, 100, 80);
		this.bComponente2.setBounds(320, 140, 100, 80);
		this.bComponente3.setBounds(320, 300, 100, 80);
		this.bComponente4.setBounds(160, 420, 100, 80);
		this.bComponente5.setBounds(20, 300, 100, 80);
		this.bComponente6.setBounds(20, 140, 100, 80);
	}

	//Method with all the Graphics functions
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
		//g.drawRect(20, 140, 100, 80);
		if (pc.getFoto()==true){
			g.drawImage(this.resistenciaIMG.getImage(), 20, 140, 100, 80, null);}
		g.drawLine(60, 60, 60, 140);

		g.drawLine(60, 260, 380, 260);
		repaint();
	}
	
	public void dibujaResistencia(){
	}
	public void dibujaVoltaje(Graphics g){
		
	}
	public void dibujaConductor(Graphics g){
	
	}
	public void dibujaCapacitor(Graphics g){
	
	}

	public void cambiarComponente(String componente){
		this.componente=componente;
		System.out.println("malla: "+this.componente);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(pc.getContadorTotal()<6){
			//Adds numbers to the sum in the panel controls
			if(this.componente=="resistencia"){
				System.out.println(this.componente);
				pc.setContadorR();
				System.out.println("num r: "+pc.getContadorR());
				pc.agregaPanel();
			}else if(this.componente=="voltaje"){
				pc.setContadorV();
				System.out.println("num v: "+pc.getContadorV());
				pc.agregaPanel();
			}else if(this.componente=="conductor"||this.componente=="capacitor"){
				pc.setContadorT();
			}else{
				System.out.println("no hay boton presionado");
			}
		}else{
			JOptionPane.showMessageDialog(this, "Limit reached");
		}
	}
}