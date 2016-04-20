package proyecto;
/**
 * Saved as Resistencia.java
 * @author Kevin Oswaldo Cabrera Navarro A01227157
 * @author Mark Octavio Rivera Acosta A01234567
 * 
 * Started in April 6th, 2016
 * Last modified in April 19th, 2016
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Resistencia extends JPanel implements ActionListener {
	@SuppressWarnings("unused")
	private int valor=0;
	private JButton bOk, bReset;	
	private JLabel lLabel;
	private JTextField tTexto;
	private Font fuente;
	
	public Resistencia(){
		super();
		this.setPreferredSize(new Dimension(190,70));
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		
		//Instantiate components
		this.bOk=new JButton("Ok");
		this.bReset= new JButton("Reset");
		this.lLabel= new JLabel("Resistencia");
		this.fuente= new Font("New Times Roman",Font.BOLD,13);
		this.lLabel.setFont(fuente);
		this.tTexto= new JTextField(7);
		
		//Adds components into the panel
		this.bOk.addActionListener(this);
		
		//Adds Listeners
		this.add(lLabel);
		this.add(tTexto);
		this.add(bOk);
		this.add(bReset);
	}
	
	//Actions are perfomed in this method
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.bOk){
		System.out.println(this.tTexto.getText());
		@SuppressWarnings("unused")
		String a= this.tTexto.getText();
		}else if(e.getSource()==this.bReset){
			this.valor=0;
		}
	}
}
