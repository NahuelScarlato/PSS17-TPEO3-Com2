package game.display;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

@SuppressWarnings("serial")
public class BotonCompraPremio extends BotonCompra {
	//atributos
	protected ObjetoNoAtravesable o;
	protected int c;
	protected JLabel cant;
	
	//constructor
	public BotonCompraPremio(PanelTienda pan, BufferedImage i, ObjetoNoAtravesable ob){
		super(pan, ob.getValor());
		setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/Boton.png")));
		setDisabledIcon(new ImageIcon(ImageLoader.loadImage("/Textures/BotonAnulado.png")));
		addMouseListener(new OyenteCompra());
		o=ob;
		setearIcono(i);
		
		JLabel v=new JLabel();
		v.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.anchor=GridBagConstraints.NORTHEAST;
		c.gridx=0;
		c.gridy=0;
		c.ipadx=95;
		c.ipady=45;
		cant=new JLabel();
		cant.setText("" + 1);
		cant.setHorizontalAlignment(JLabel.RIGHT);
		cant.setVerticalAlignment(JLabel.TOP);
		cant.setLocation(cant.getX()-10, cant.getY()+10);
		v.add(cant,c);
		v.setVisible(true);
		add(v);
	}
	public void sumarPremio(){
		c++;
		cant.setText(""+c);
		setEnabled(true);
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
			if(((BotonCompra)arg0.getSource()).isEnabled()){
				setIcon(new ImageIcon(ImageLoader.loadImage("/Textures/Boton.png")));
				if(c>0){
					ObjetoNoAtravesable aux=o.clone();
					p.setPrototype(aux);
					c--;
					cant.setText(""+c);
					if(c==0)
						setEnabled(false);
				}
			}
		}
	}
}
