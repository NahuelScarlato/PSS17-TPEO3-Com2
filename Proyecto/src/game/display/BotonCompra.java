package game.display;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BotonCompra extends JLabel{
	//atributos
	protected Strategy s;
	protected PanelTienda p;
	
	public BotonCompra(Strategy str, PanelTienda pan, BufferedImage i){
		s=str;
		p=pan;
		OyenteCompra o=new OyenteCompra();
		addMouseListener(o);
		setOpaque(true);
		setIcon(new ImageIcon(i));
		setHorizontalAlignment(JLabel.CENTER);
	}
	public Strategy getStrat(){
		return s;
	}
	
	private class OyenteCompra implements MouseListener{
		public void mouseClicked(MouseEvent arg0) {
			((BotonCompra)arg0.getSource()).setBackground(Color.LIGHT_GRAY);
		}
		public void mouseEntered(MouseEvent arg0) {
			((BotonCompra)arg0.getSource()).setBackground(Color.LIGHT_GRAY);
		}
		public void mouseExited(MouseEvent arg0) {
			((BotonCompra)arg0.getSource()).setBackground(Color.WHITE);
		}
		public void mousePressed(MouseEvent arg0) {
			((BotonCompra)arg0.getSource()).setBackground(Color.GRAY);
		}
		public void mouseReleased(MouseEvent arg0) {
			BotonCompra b=(BotonCompra)arg0.getSource();
			b.setBackground(Color.LIGHT_GRAY);
			p.setStrat(b.getStrat());
		}
	}
}
