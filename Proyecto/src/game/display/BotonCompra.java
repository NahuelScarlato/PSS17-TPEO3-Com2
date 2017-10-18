package game.display;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.gfx.ImageLoader;
import objeto.noAtravesable.objetoConVida.personaje.Aliado;

@SuppressWarnings("serial")
public class BotonCompra extends JLabel{
	//atributos
	protected Strategy s;
	protected PanelTienda p;
	
	public BotonCompra(Strategy str, PanelTienda pan, BufferedImage i){
		setLayout(new CardLayout());
		setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/Boton.png")));
		s=str;
		p=pan;
		OyenteCompra o=new OyenteCompra();
		addMouseListener(o);
		setOpaque(true);
		JLabel per=new JLabel(new ImageIcon(i));
		add(per);
		setHorizontalAlignment(JLabel.CENTER);
	}
	public Strategy getStrat(){
		return s;
	}
	
	private class OyenteCompra implements MouseListener{
		public void mouseClicked(MouseEvent arg0) {
		}
		public void mouseEntered(MouseEvent arg0) {
		}
		public void mouseExited(MouseEvent arg0) {
		}
		public void mousePressed(MouseEvent arg0) {
			setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/BotonPresionado.png")));
		}
		public void mouseReleased(MouseEvent arg0) {
			BotonCompra b=(BotonCompra)arg0.getSource();
			setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/Boton.png")));
			p.setStrat(s);
		}
	}
}
