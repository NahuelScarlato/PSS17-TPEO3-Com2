package game.display;

import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

@SuppressWarnings("serial")
public class BotonCompra extends JLabel{
	//atributos
	protected ObjetoNoAtravesable o;
	protected PanelTienda p;
	
	public BotonCompra(PanelTienda pan, BufferedImage i, ObjetoNoAtravesable ob){
		o=ob;
		setLayout(new CardLayout());
		setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/Boton.png")));
		p=pan;
		OyenteCompra o=new OyenteCompra();
		addMouseListener(o);
		setOpaque(true);
		JLabel per=new JLabel(new ImageIcon(i));
		add(per);
		setHorizontalAlignment(JLabel.CENTER);
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
			setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/Boton.png")));
			ObjetoNoAtravesable aux=o.clone();
			p.setPrototype(aux);
		}
	}
}
