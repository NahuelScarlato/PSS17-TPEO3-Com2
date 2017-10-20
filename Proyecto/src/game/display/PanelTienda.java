package game.display;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import game.Game;
import game.gfx.ImageLoader;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;
import objeto.noAtravesable.objetoConVida.personaje.Arquero;
import objeto.noAtravesable.objetoConVida.personaje.Clerigo;
import objeto.noAtravesable.objetoConVida.personaje.Druida;
import objeto.noAtravesable.objetoConVida.personaje.EnanoCampeon;
import objeto.noAtravesable.objetoConVida.personaje.EnanoCazador;
import objeto.noAtravesable.objetoConVida.personaje.Espadachin;
import objeto.noAtravesable.objetoConVida.personaje.Mago;
import objeto.noAtravesable.objetoConVida.personaje.Paladin;

import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelTienda extends JPanel {
	
	protected Game myGame;
	protected JLabel labelPuntaje;
	protected ObjetoNoAtravesable prototipo;
	protected JPanel panelPersonajesElfos, panelPersonajesEnanos;
	protected JPanel panelCompraElfos, panelCompraEnanos;
	protected JLabel[] personajesElfos, personajesEnanos;
	protected JPanel panelElves, panelDwarves;

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

		labelPuntaje = new JLabel("Score: 0    Monedas:0");
		labelPuntaje.setHorizontalAlignment(JLabel.CENTER);
		add(labelPuntaje, c);
		
		c.gridy=1;
		c.ipady=0;
		c.ipadx=40;
		c.weightx=0.5;
		c.weighty=0.5;
		
		JPanel pScroll=new JPanel(new GridBagLayout());
		
		GridBagConstraints conScroll = new GridBagConstraints();
		conScroll.gridx=0;
		conScroll.gridy=0;
		conScroll.fill=GridBagConstraints.BOTH;
		
		JScrollPane scrollPane = new JScrollPane(pScroll);
		scrollPane.setPreferredSize(new Dimension(100, 100));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
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
		
		BotonCompra mago = new BotonCompra(this, ImageLoader.mago, new Mago(new Tile(null, 0, 0)));
		BotonCompra espadachin = new BotonCompra(this, ImageLoader.espadachin, new Espadachin(new Tile(null, 0, 0)));
		BotonCompra paladin = new BotonCompra(this, ImageLoader.paladin, new Paladin(new Tile(null, 0, 0), new Tile(null, 0, 0)));
		BotonCompra arquero = new BotonCompra(this, ImageLoader.arquero, new Arquero(new Tile(null, 0, 0)));
		BotonCompra monje = new BotonCompra(this, ImageLoader.monje, new Clerigo(new Tile(null, 0, 0)));
		
		personajesHumanos[0] = espadachin;
		personajesHumanos[1] = paladin;
		personajesHumanos[2] = arquero;
		personajesHumanos[3] = mago;
		personajesHumanos[4] = monje;
		
		for(int i=0; i<personajesHumanos.length; i++){
			panelPersonajesHumanos.add(personajesHumanos[i]);
		}
		
		panelHumanos.add(panelPersonajesHumanos, cs);
		
		pScroll.add(panelHumanos, conScroll);
		
		conScroll.gridy=1;
		
		
		JPanel panelElfos = new JPanel(new GridBagLayout());
		
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx=0;
		c1.gridy=0;
		c1.gridx=0;
		c1.gridy=0;
		c1.weightx=0;
		c1.weighty=0;
		c1.ipadx=0;
		c1.ipady=10;
		c1.fill=GridBagConstraints.BOTH;
		
		JLabel labelElfos = new JLabel("Elfos", JLabel.CENTER);
		
		panelElfos.add(labelElfos, c1);
		
		c1.gridy=1;
		c1.weightx=0.5;
		c1.weighty=0.5;
		c1.ipady=0;
		
		panelElves = new JPanel(new CardLayout());
		
			panelPersonajesElfos= new JPanel(new GridLayout(1, 1));
			personajesElfos = new JLabel[1];
		
			BotonCompra druida = new BotonCompra(this, ImageLoader.druida, new Druida(new Tile(null, 0, 0)));
		
			personajesElfos[0] = druida;
		
			for(int i=0; i<personajesElfos.length; i++){
				panelPersonajesElfos.add(personajesElfos[i]);
				personajesElfos[i].setEnabled(false);
				personajesElfos[i].setVisible(false);
			}
			
			panelCompraElfos = new JPanel(new GridLayout(1,1));
			BotonCompraAlianza b = new BotonCompraAlianza(this, 100, "elfos");
			panelCompraElfos.add(b);
		
		panelElves.add(panelCompraElfos);
		
			panelCompraElfos.setVisible(true);
			
		
		panelElfos.add(panelElves, c1);
		
		pScroll.add(panelElfos, conScroll);
		
		conScroll.gridy=2;
		
		JPanel panelEnanos = new JPanel(new GridBagLayout());
		
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx=0;
		c2.gridy=0;
		c2.gridx=0;
		c2.gridy=0;
		c2.weightx=0;
		c2.weighty=0;
		c2.ipadx=0;
		c2.ipady=10;
		c2.fill=GridBagConstraints.BOTH;
		
		JLabel labelEnanos = new JLabel("Enanos", JLabel.CENTER);
		
		panelEnanos.add(labelEnanos, c2);
		
		c2.gridy=1;
		c2.weightx=0.5;
		c2.weighty=0.5;
		c2.ipady=0;
		
		panelDwarves = new JPanel(new CardLayout());
		
			panelPersonajesEnanos= new JPanel(new GridLayout(1, 2));
			personajesEnanos = new JLabel[2];
		
			BotonCompra champ = new BotonCompra(this, ImageLoader.campeonEnano, new EnanoCampeon(new Tile(null, 0, 0)));
			BotonCompra cazador = new BotonCompra(this, ImageLoader.cazadorEnano, new EnanoCazador(new Tile(null, 0, 0)));
		
			personajesEnanos[0] = champ;
			personajesEnanos[1] = cazador;
		
			for(int i=0; i<personajesEnanos.length; i++){
				panelPersonajesEnanos.add(personajesEnanos[i]);
				personajesEnanos[i].setEnabled(false);
				personajesEnanos[i].setVisible(false);
			}
			
			panelCompraEnanos = new JPanel(new GridLayout(1,1));
			BotonCompraAlianza b1 = new BotonCompraAlianza(this, 200, "enanos");
			panelCompraEnanos.add(b1);
		
		panelDwarves.add(panelCompraEnanos);
		
			panelCompraEnanos.setVisible(true);
			
		
		panelEnanos.add(panelDwarves, c1);
		
		pScroll.add(panelEnanos, conScroll);
		
		
		
		conScroll.gridy=3;

		JButton botonAliados = new JButton("Agregar aliado");
		pScroll.add(botonAliados, conScroll);
		
		conScroll.gridy=4;
		
		botonAliados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myGame.crearAliado();
			}
		});
		
		JButton botonEnemigos = new JButton("Agregar enemigos");
		pScroll.add(botonEnemigos, conScroll);
		botonEnemigos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myGame.crearEnemigo();
			}
		});
		
		
		add(scrollPane, c);
		
	}

	public void actualizarPuntaje(int p, int m){
		labelPuntaje.setText("Score: "+p+"   Monedas: "+m);
	}
	public void setPrototype(ObjetoNoAtravesable ob){
		prototipo=ob;
	}
	public ObjetoNoAtravesable getPrototype(){
		return prototipo;
	}
	public void comprarAlianza(String al, int val){
		if(al.equals("elfos")){
			personajesElfos[0].setVisible(true);
			personajesElfos[0].setEnabled(true);
			panelCompraElfos.setVisible(false);
			panelElves.remove(panelCompraElfos);
			panelElves.add(panelPersonajesElfos);
		}
		else if(al.equals("enanos")){
			for(JLabel b: personajesEnanos){
				b.setVisible(true);
				b.setEnabled(true);
			}
			panelCompraEnanos.setVisible(false);
			panelDwarves.remove(panelCompraEnanos);
			panelDwarves.add(panelPersonajesEnanos);
		}
		myGame.getLogica().getTienda().comprarAlianza(val);
	}
}
