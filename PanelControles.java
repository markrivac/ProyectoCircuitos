package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelControles extends JPanel{
	public PanelControles() {
		super();
		((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		this.setPreferredSize(new Dimension(200,720));
		this.setBackground(new Color(225,225,225));
	}
}
