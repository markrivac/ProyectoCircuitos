package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelResultados extends JPanel {
	public PanelResultados() {
		super();
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		this.setPreferredSize(new Dimension(440,680));
		this.setBackground(new Color(251,250,250));
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}

}


