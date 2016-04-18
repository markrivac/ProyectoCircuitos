package proyecto;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 PROYECTO:
 Kevin Oswaldo Cabrera Navarro A01227157
 Mark Rivera Acosta A01234567
 */

public class MainProyecto extends JFrame{
	private static final long serialVersionUID = 1L;

	public MainProyecto(){
		super("Circuitos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(1080, 720));

		PanelControles pc = new PanelControles();	
		this.add(pc, BorderLayout.WEST);

		PanelMalla pm = new PanelMalla(pc);
		this.add(pm, BorderLayout.CENTER);	
		
		PanelResultados pr = new PanelResultados();
		this.add(pr, BorderLayout.EAST);
		
		PanelCircuitos pcr = new PanelCircuitos();
		this.add(pcr, BorderLayout.SOUTH);
		this.setLocation(50, 0);
		this.pack();
		this.setVisible(true);


	}

	public static void main(String[] args){
		@SuppressWarnings("unused")
		MainProyecto frame = new MainProyecto();
	}
}