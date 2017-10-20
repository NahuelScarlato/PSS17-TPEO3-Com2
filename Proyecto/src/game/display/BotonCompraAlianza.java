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
public class BotonCompraAlianza extends JLabel{
	//atributos
		protected PanelTienda p;
		protected String alianza;
		protected int val;
		
		
		public BotonCompraAlianza(PanelTienda pan, int valor, String al){
			alianza=al;
			val=valor;
			setLayout(new CardLayout());
			setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/BotonAlianza.png")));
			p=pan;
			OyenteCompra oy=new OyenteCompra();
			addMouseListener(oy);
			setOpaque(true);
			JLabel per=new JLabel("Comprar alianza con "+al);
			per.setHorizontalAlignment(CENTER);
			per.setLayout(new CardLayout());
			JLabel v=new JLabel();
			v.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.anchor=GridBagConstraints.SOUTHEAST;
			c.gridx=0;
			c.gridy=0;
			c.ipadx=95;
			c.ipady=45;
			JLabel val=new JLabel();
			val.setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/Coin.png")));
			val.setText("" + valor);
			val.setHorizontalAlignment(JLabel.RIGHT);
			val.setVerticalAlignment(JLabel.BOTTOM);
			val.setLocation(val.getX()-10, val.getY()-10);
			v.add(val,c);
			v.setVisible(true);
			per.add(v);
			per.setVerticalTextPosition(BOTTOM);
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
				setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/BotonAlianzaPresionado.png")));
			}
			public void mouseReleased(MouseEvent arg0) {
				setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/BotonAlianza.png")));
				p.comprarAlianza(alianza, val);
			}
		}
}
