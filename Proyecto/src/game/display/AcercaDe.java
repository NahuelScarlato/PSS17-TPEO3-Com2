package game.display;

import javax.swing.*;

public class AcercaDe extends JFrame{
	
	private JPanel panel;
	
	public AcercaDe(){
		panel = new JPanel();
		JLabel msg = new JLabel();
		msg.setText("<html>Desarrolladores:<br>"+
							"<ul><li>Dennehy, Ana Inez</li>"+
							"<li>Gir�n, Juan Mart�n</li>"+
							"<li>Mar�n, Facundo</li></ul>"+
						"Administradores:<br>"+
							"<ul><li>Llano, Jose</li>"+
							"<li>Scarlato, Nahuel Hern�n</li></html>");
		panel.add(msg);
		this.setTitle("Acerca de...");
		this.setSize(250, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(panel);
	}
}
