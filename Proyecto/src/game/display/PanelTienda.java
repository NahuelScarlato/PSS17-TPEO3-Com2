package game.display;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import game.Game;

import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
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
		c.weightx=1;
		c.weighty=1;
		c.fill=GridBagConstraints.BOTH;

		labelPuntaje = new JLabel("Score: 0");
		labelPuntaje.setHorizontalAlignment(JLabel.CENTER);
		add(labelPuntaje, c);
		
		c.gridy=1;
		c.ipady=325;
		c.weightx=0;
		c.weighty=0;
		
		JPanel pScroll=new JPanel(new GridLayout(2,1));
		
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
		
		JScrollPane scrollPane = new JScrollPane(pScroll);
		scrollPane.setPreferredSize(new Dimension(100, 100));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(scrollPane, c);
		
	}

	public void actualizarPuntaje(int p){
		labelPuntaje.setText("Score: "+p);
	}

}
