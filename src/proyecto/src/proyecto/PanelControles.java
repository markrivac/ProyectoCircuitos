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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelControles extends JPanel implements ActionListener{
	//Buttons
	private JButton bResultado;
	
	//Resistances array
	private Resistencia[] arrRes = new Resistencia[6];
	//Possible resistances
	private Resistencia panelRes, 
						panelRes2,
						panelRes3,
						panelRes4,
						panelRes5;
	
	//Panel where all the sums will go
	private PanelResultados pr;
	//Possible Voltages
	@SuppressWarnings("unused")
	private Voltaje voltaje;
	//Counter of possible resistances
	private int contador;
	
	//Constructor
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
		
		//Add components into the array
		arrRes[0]=this.panelRes;
		arrRes[1]=this.panelRes2;
		arrRes[2]=this.panelRes3;
		arrRes[3]=this.panelRes4;
		arrRes[4]=this.panelRes5;
		
		//Adds components into the panel
		this.add(bResultado);
		
		//Adds Listeners
		this.bResultado.addActionListener(this);
	}
	
	//Adds the resistances and voltages into the array
	public void agregaPanel(){
		System.out.println(this.contador);
		/*for(int i=0;i<contador;i++){
			this.add(arrRes[contador]);
			this.contador=this.contador+1;
		}*/
		this.add(bResultado);
		System.out.println("agrega panel");
		this.revalidate();
	}
	
	//Actions of the buttons
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.bResultado){
			System.out.println("resultado");
			pr.setBackground(Color.black);
			this.agregaPanel();
		}
	}
	
	//Suma Resitencia
	public void setContadorR(){
			if(this.contador<=5){
			this.contador++;	
			}else{
				JOptionPane.showMessageDialog(this, "Limit reached");
			}
	}
	
	//Getter
	public int getContadorR(){
		return this.contador;
	}
}