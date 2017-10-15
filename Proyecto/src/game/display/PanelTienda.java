package game.display;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import game.Game;
import game.gfx.ImageLoader;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanelTienda extends JPanel {
	
	protected Game myGame;
	protected JLabel labelPuntaje;

	/**
	 * Create the panel.
	 */
	public PanelTienda(Game g) {
		
		myGame=g;
		
		this.setLayout(new GridBagLayout());

		GridBagConstraints c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
		c.weightx=0;
		c.weighty=0;
		c.ipady=30;
		c.fill=GridBagConstraints.BOTH;

		labelPuntaje = new JLabel("Score: 0");
		labelPuntaje.setHorizontalAlignment(JLabel.CENTER);
		add(labelPuntaje, c);
		
		c.gridy=1;
		c.weightx=0.5;
		c.weighty=0.5;
		
		JPanel pScroll=new JPanel(new GridLayout(3,1));
		
		JScrollPane scrollPane = new JScrollPane(pScroll);
		scrollPane.setPreferredSize(new Dimension(100, 100));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		JPanel panelHumanos = new JPanel(new GridBagLayout());
		
		GridBagConstraints cs = new GridBagConstraints();
		cs.gridx=0;
		cs.gridy=0;
		cs.gridx=0;
		cs.gridy=0;
		cs.weightx=0;
		cs.weighty=0;
		cs.ipadx=0;
		cs.ipady=10;
		cs.fill=GridBagConstraints.BOTH;
		
		JLabel labelHumanos = new JLabel("Humanos", JLabel.CENTER);
		
		panelHumanos.add(labelHumanos, cs);
		
		cs.gridy=1;
		cs.weightx=0.5;
		cs.weighty=0.5;
		cs.ipady=0;
		
		JPanel panelPersonajesHumanos= new JPanel(new GridLayout(3, 2));
		JLabel[] personajesHumanos = new JLabel[5];
		
		JLabel cazador = new JLabel(new ImageIcon(ImageLoader.cazadorEnano));
		cazador.setOpaque(true);
		JLabel mago = new JLabel(new ImageIcon(ImageLoader.mago));
		mago.setOpaque(true);
		JLabel espadachin = new JLabel(new ImageIcon(ImageLoader.espadachin));
		espadachin.setOpaque(true);
		JLabel paladin = new JLabel(new ImageIcon(ImageLoader.paladin));
		paladin.setOpaque(true);
		JLabel arquero = new JLabel(new ImageIcon(ImageLoader.arquero));
		arquero.setOpaque(true);
		JLabel monje = new JLabel(new ImageIcon(ImageLoader.monje));
		monje.setOpaque(true);
		
		OyenteCompra o = new OyenteCompra();
		paladin.addMouseListener(o);
		espadachin.addMouseListener(o);
		arquero.addMouseListener(o);
		monje.addMouseListener(o);
		cazador.addMouseListener(o);
		mago.addMouseListener(o);
		
		personajesHumanos[0] = espadachin;
		personajesHumanos[1] = paladin;
		personajesHumanos[2] = arquero;
		personajesHumanos[3] = mago;
		personajesHumanos[4] = monje;
		
		for(int i=0; i<personajesHumanos.length; i++){
			panelPersonajesHumanos.add(personajesHumanos[i]);
		}
		
		panelHumanos.add(panelPersonajesHumanos, cs);
		
		pScroll.add(panelHumanos);
		

		JButton botonAliados = new JButton("Agregar aliado");
		pScroll.add(botonAliados, null);
		botonAliados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myGame.crearAliado();
			}
		});
		
		JButton botonEnemigos = new JButton("Agregar enemigos");
		pScroll.add(botonEnemigos, null);
		botonEnemigos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myGame.crearEnemigo();
			}
		});
		
		
		add(scrollPane, c);
		
	}

	public void actualizarPuntaje(int p){
		labelPuntaje.setText("Score: "+p);
	}
	
	private class OyenteCompra implements MouseListener{
		public void mouseClicked(MouseEvent arg0) {
			((JLabel)arg0.getSource()).setBackground(Color.LIGHT_GRAY);
		}
		public void mouseEntered(MouseEvent arg0) {
			((JLabel)arg0.getSource()).setBackground(Color.LIGHT_GRAY);
		}
		public void mouseExited(MouseEvent arg0) {
			((JLabel)arg0.getSource()).setBackground(Color.WHITE);
		}
		public void mousePressed(MouseEvent arg0) {
			((JLabel)arg0.getSource()).setBackground(Color.GRAY);
		}
		public void mouseReleased(MouseEvent arg0) {
			((JLabel)arg0.getSource()).setBackground(Color.LIGHT_GRAY);
			
		}
	}
	
}
