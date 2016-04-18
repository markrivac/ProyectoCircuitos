package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelControles extends JPanel implements ActionListener{
	private JLabel lLabel;
	private JButton bOk,
			bResultado;
	private JTextField tTexto;
	private JComboBox jComboBox;
	private Font fuente;
	
	private int[] resistencia = new int[6];
	
	
	
	
	public PanelControles() {
		super();
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		this.setPreferredSize(new Dimension(200,720));
		this.setBackground(new Color(225,225,225));
		
		this.lLabel= new JLabel("Resistencia");
		this.jComboBox= new JComboBox();
		this.tTexto= new JTextField(15);
		this.bOk= new JButton("Ok");
		this.bResultado= new JButton("Resultado");
		this.fuente= new Font("New Times Roman",Font.BOLD,13);
		this.lLabel.setFont(fuente);
		
		this.bOk.addActionListener(this);
		
		this.add(lLabel);
		this.add(tTexto);
		//this.add(jComboBox);
		this.add(bOk);
		
		this.add(bResultado);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.bOk){
		System.out.println(this.tTexto.getText());
		}
	}
}
