package proyecto;
/**
 * Saved as PanelControles.java
 * @author Kevin Oswaldo Cabrera Navarro A01227157
 * @author Mark Octavio Rivera Acosta A01234567
 * 
 * Started in April 6th, 2016
 * Last modified in April 19th, 2016
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelControles extends JPanel implements ActionListener{
	private JButton bResultado;
	@SuppressWarnings("unused")
	private Resistencia[] arrRes = new Resistencia[6];
	private Resistencia panelRes, 
						panelRes2,
						panelRes3,
						panelRes4,
						panelRes5;
	private PanelResultados pr;
	private Voltaje voltaje;
	public PanelControles(PanelResultados pr) {
		super();
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.CENTER);
		this.setPreferredSize(new Dimension(200,720));
		this.setBackground(new Color(225,225,225));	
		
		//Instantiate components
		this.bResultado= new JButton("Resultado");
		this.panelRes=new Resistencia();
		this.panelRes2=new Resistencia();
		this.panelRes3=new Resistencia();
		this.panelRes4=new Resistencia();
		this.panelRes5=new Resistencia();
		this.voltaje=new Voltaje();
		this.pr=pr;
		
		//Adds components into the panel
		this.add(bResultado);
		
		//Adds Listeners
		this.bResultado.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.bResultado){
			System.out.println("resultado");
			pr.setBackground(Color.black);
			this.add(panelRes);
			this.add(voltaje);
			this.revalidate();
		}
	}
}