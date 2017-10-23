package game.display;

import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.gfx.ImageLoader;

@SuppressWarnings("serial")
public class BotonCompraAlianza extends BotonCompra{
	//atributos
		protected String alianza;
		
		
		public BotonCompraAlianza(PanelTienda pan, int valor, String al){
			super(pan, valor);
			alianza=al;
			addMouseListener(new OyenteCompra());
			setearTexto("Comprar alianza con "+al);
		}
		
		private class OyenteCompra implements MouseListener{
			public void mouseClicked(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
				setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/BotonAlianzaPresionado.png")));
			}
			public void mouseReleased(MouseEvent arg0) {
				setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/BotonAlianza.png")));
				p.comprarAlianza(alianza, valor);
			}
		}
}
