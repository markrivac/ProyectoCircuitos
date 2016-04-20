package proyecto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Resistencia extends JPanel implements ActionListener {
	private int valor;
	private JButton bOk;
	private JLabel lLabel;
	private JTextPane tTexto;
	private Font fuente;
	
	public Resistencia(){
		this.valor=0;
		this.bOk.addActionListener(this);
		this.add(lLabel);
		this.add(tTexto);
		this.add(bOk);
		this.fuente= new Font("New Times Roman",Font.BOLD,13);
		this.lLabel.setFont(fuente);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.bOk){
		System.out.println(this.tTexto.getText());
		}
	}
}
