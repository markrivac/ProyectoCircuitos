package proyecto;

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
	private int[] resistencia = new int[6];

	public PanelControles() {
		super();
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		this.setPreferredSize(new Dimension(200,720));
		this.setBackground(new Color(225,225,225));	

		this.bResultado= new JButton("Resultado");

		this.add(bResultado);
		this.bResultado.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.bResultado){
			resistencia[0]=1;
			this.add(bResultado);
		}
	}
}
