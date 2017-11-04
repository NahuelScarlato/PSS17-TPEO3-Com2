package game.display;

import javax.swing.*;

@SuppressWarnings("serial")
public class AcercaDe extends JFrame{
	
	private JPanel panel;
	private JLabel msg;
	
	public AcercaDe(){
		panel = new JPanel();
		msg = new JLabel();
		msg.setText("<html>Desarrolladores:<br>"+
							"<ul><li>Dennehy, Ana Inez</li>"+
							"<li>Girón, Juan Martín</li>"+
							"<li>Marín, Facundo</li></ul>"+
						"Administradores:<br>"+
							"<ul><li>Llano, Jose</li>"+
							"<li>Scarlato, Nahuel Hernán</li></html>");
		panel.add(msg);
		this.setTitle("Acerca de...");
		this.setSize(250, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(panel);
	}
}
