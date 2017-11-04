package game.display;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import game.Game;
import game.Ranking;
import game.gfx.ImageLoader;
import logica.Objeto;
import logica.Portal;
import logica.Tienda;
import logica.Tile;
import objeto.noAtravesable.objetoConVida.personaje.aliado.Arquero;
import objeto.noAtravesable.objetoConVida.personaje.aliado.Clerigo;
import objeto.noAtravesable.objetoConVida.personaje.aliado.Druida;
import objeto.noAtravesable.objetoConVida.personaje.aliado.EnanoCampeon;
import objeto.noAtravesable.objetoConVida.personaje.aliado.EnanoCazador;
import objeto.noAtravesable.objetoConVida.personaje.aliado.Espadachin;
import objeto.noAtravesable.objetoConVida.personaje.aliado.Mago;
import objeto.noAtravesable.objetoConVida.personaje.aliado.Paladin;

import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PanelTienda extends JPanel {
	
	protected Game myGame;
	protected JLabel labelPuntaje;
	protected Objeto prototipo;
	protected JPanel panelPersonajesElfos, panelPersonajesEnanos;
	protected JPanel panelCompraElfos, panelCompraEnanos, panelPre;
	protected BotonCompraPersonaje[] personajesElfos, personajesEnanos, personajesHumanos, objetosTienda;
	protected JPanel panelElves, panelDwarves;
	protected LinkedList<BotonCompra> botones;
	
	//modificacion para version 2.0
		protected Ranking ranking;
	//fin
		
	/* PSS */	
		protected JLabel labelHumanos;
		protected JLabel labelElfos;
		protected JLabel labelEnanos;
		protected JLabel labelOT;
		protected JLabel labelPremios;
		protected JButton botonAliados;
		protected JButton botonEnemigos;
		protected JButton btnAcercaDe;
		protected JButton btnSalir;
		private Boolean idioma;
	/* PSS */
		
	/**
	 * Create the panel.
	 */
	public PanelTienda(Game g, Tienda t) {
		myGame=g;
		
		idioma=true;
		t.setPanel(this);
		//modificacion para version 1.2
		ranking= new Ranking();
		//fin
		
		botones=new LinkedList<BotonCompra>();
		
		this.setLayout(new GridBagLayout());

		GridBagConstraints c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
		c.weightx=0;
		c.weighty=0;
		c.ipady=30;
		c.fill=GridBagConstraints.BOTH;

		labelPuntaje = new JLabel("Puntaje: 0    Monedas: 0");
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

		labelHumanos = new JLabel("Humanos", JLabel.CENTER);

		panelHumanos.add(labelHumanos, cs);
		
		cs.gridy=1;
		cs.weightx=0.5;
		cs.weighty=0.5;
		cs.ipady=0;
		
		JPanel panelPersonajesHumanos= new JPanel(new GridLayout(3, 2));
		personajesHumanos = new BotonCompraPersonaje[5];
		
		BotonCompraPersonaje mago = new BotonCompraPersonaje(this, ImageLoader.mago, new Mago(new Tile(null, 0, 0)));
		BotonCompraPersonaje espadachin = new BotonCompraPersonaje(this, ImageLoader.espadachin, new Espadachin(new Tile(null, 0, 0)));
		BotonCompraPersonaje paladin = new BotonCompraPersonaje(this, ImageLoader.paladin, new Paladin(new Tile(null, 0, 0), new Tile(null, 0, 0)));
		BotonCompraPersonaje arquero = new BotonCompraPersonaje(this, ImageLoader.arquero, new Arquero(new Tile(null, 0, 0)));
		BotonCompraPersonaje monje = new BotonCompraPersonaje(this, ImageLoader.monje, new Clerigo(new Tile(null, 0, 0)));
		
		personajesHumanos[0] = espadachin;
		personajesHumanos[1] = paladin;
		personajesHumanos[2] = arquero;
		personajesHumanos[3] = mago;
		personajesHumanos[4] = monje;
		
		for(int i=0; i<personajesHumanos.length; i++){
			panelPersonajesHumanos.add(personajesHumanos[i]);
			botones.addLast(personajesHumanos[i]);
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
		
		labelElfos = new JLabel("Elfos", JLabel.CENTER);
		
		panelElfos.add(labelElfos, c1);
		
		c1.gridy=1;
		c1.weightx=0.5;
		c1.weighty=0.5;
		c1.ipady=0;
		
		panelElves = new JPanel(new CardLayout());
		
			panelPersonajesElfos= new JPanel(new GridLayout(1, 1));
			personajesElfos = new BotonCompraPersonaje[1];
		
			BotonCompraPersonaje druida = new BotonCompraPersonaje(this, ImageLoader.druida, new Druida(new Tile(null, 0, 0)));
		
			personajesElfos[0] = druida;
		
			for(int i=0; i<personajesElfos.length; i++){
				panelPersonajesElfos.add(personajesElfos[i]);
				personajesElfos[i].setEnabled(false);
				personajesElfos[i].setVisible(false);
				botones.addLast(personajesElfos[i]);
			}
			
			panelCompraElfos = new JPanel(new GridLayout(1,1));
			BotonCompraAlianza b = new BotonCompraAlianza(this, 100, "elfos");
			panelCompraElfos.add(b);
			botones.addLast(b);
		
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
		
		labelEnanos = new JLabel("Enanos", JLabel.CENTER);
		
		panelEnanos.add(labelEnanos, c2);
		
		c2.gridy=1;
		c2.weightx=0.5;
		c2.weighty=0.5;
		c2.ipady=0;
		
		panelDwarves = new JPanel(new CardLayout());
		
			panelPersonajesEnanos= new JPanel(new GridLayout(1, 2));
			personajesEnanos = new BotonCompraPersonaje[2];
		
			BotonCompraPersonaje champ = new BotonCompraPersonaje(this, ImageLoader.campeonEnano, new EnanoCampeon(new Tile(null, 0, 0)));
			BotonCompraPersonaje cazador = new BotonCompraPersonaje(this, ImageLoader.cazadorEnano, new EnanoCazador(new Tile(null, 0, 0)));
		
			personajesEnanos[0] = champ;
			personajesEnanos[1] = cazador;
		
			for(int i=0; i<personajesEnanos.length; i++){
				panelPersonajesEnanos.add(personajesEnanos[i]);
				personajesEnanos[i].setEnabled(false);
				personajesEnanos[i].setVisible(false);
				botones.addLast(personajesEnanos[i]);
			}
			
			panelCompraEnanos = new JPanel(new GridLayout(1,1));
			BotonCompraAlianza b1 = new BotonCompraAlianza(this, 200, "enanos");
			panelCompraEnanos.add(b1);
			botones.addLast(b1);
		
		panelDwarves.add(panelCompraEnanos);
		
			panelCompraEnanos.setVisible(true);
			
		
		panelEnanos.add(panelDwarves, c1);
		
		pScroll.add(panelEnanos, conScroll);
		
		conScroll.gridy=3;
		
		JPanel panelOT = new JPanel(new GridBagLayout());
		
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx=0;
		c3.gridy=0;
		c3.gridx=0;
		c3.gridy=0;
		c3.weightx=0;
		c3.weighty=0;
		c3.ipadx=0;
		c3.ipady=10;
		c3.fill=GridBagConstraints.BOTH;
		
		labelOT = new JLabel("Objetos", JLabel.CENTER);
		
		panelOT.add(labelOT, c3);
		
		c3.gridy=1;
		c3.weightx=0.5;
		c3.weighty=0.5;
		c3.ipady=0;
		
		JPanel panelObjetosTienda= new JPanel(new GridLayout(2, 2));
		objetosTienda = new BotonCompraPersonaje[3];
		
		BotonCompraPersonaje barricada = new BotonCompraPersonaje(this, ImageLoader.portalBlue[0], new Portal());
		BotonCompraPersonaje meteorito = new BotonCompraPersonaje(this, ImageLoader.espadachin, new Espadachin(new Tile(null, 0, 0)));
		BotonCompraPersonaje portal = new BotonCompraPersonaje(this, ImageLoader.paladin, new Paladin(new Tile(null, 0, 0), new Tile(null, 0, 0)));
		
		objetosTienda[0] = barricada;
		objetosTienda[1] = meteorito;
		objetosTienda[2] = portal;
		
		for(int i=0; i<objetosTienda.length; i++){
			panelObjetosTienda.add(objetosTienda[i]);
			botones.addLast(objetosTienda[i]);
		}
		
		panelOT.add(panelObjetosTienda, c3);
		
		pScroll.add(panelOT, conScroll);
		
		conScroll.gridy=4;
		
		JPanel panelPremios = new JPanel(new GridBagLayout());
		
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx=0;
		c4.gridy=0;
		c4.gridx=0;
		c4.gridy=0;
		c4.weightx=0;
		c4.weighty=0;
		c4.ipadx=0;
		c4.ipady=10;
		c4.fill=GridBagConstraints.BOTH;
		
		labelPremios = new JLabel("Premios", JLabel.CENTER);
		
		panelPremios.add(labelPremios, c4);
		
		c4.gridy=1;
		c4.weightx=0.5;
		c4.weighty=0.5;
		c4.ipady=0;
		
		panelPre= new JPanel(new GridLayout(3, 2));
		
		//asociar lista de premios a panelPre
		
		panelPremios.add(panelPre, c4);
		
		pScroll.add(panelPremios, conScroll);
		
		conScroll.gridy=5;

		botonAliados = new JButton("Agregar aliado");
		pScroll.add(botonAliados, conScroll);
		
		conScroll.gridy=6;
		
		botonAliados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myGame.crearAliado();
			}
		});
		
		botonEnemigos = new JButton("Agregar enemigos");
		pScroll.add(botonEnemigos, conScroll);
		botonEnemigos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myGame.crearEnemigo();
			}
		});
		
		
		
/* PSS */
		
		conScroll.gridy++;
		JButton btnRanking = new JButton("Ranking");
		btnRanking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				mostrarRanking();
				
			}
		});
		pScroll.add(btnRanking,conScroll);
			
		
		conScroll.gridy++;
		JButton btnLanguage = new JButton("Espa�ol <=> English");
		pScroll.add(btnLanguage, conScroll);
		
		btnLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myGame.changeIdioma();
				myGame.getDisplay().getFrame().repaint();
			}
		});
		
		add(scrollPane, c);
		
		
		conScroll.gridy++;
		
		btnAcercaDe = new JButton("Acerca de");
		pScroll.add(btnAcercaDe,conScroll);
		
		btnAcercaDe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame fAcercaDe = new AcercaDe();
				fAcercaDe.setVisible(true);
			}
		});
		
		conScroll.gridy++;
		
		btnSalir = new JButton("Salir");
		pScroll.add(btnSalir,conScroll);
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});

/* PSS */
		
		add(scrollPane, c);
		
	}

	public void actualizarPuntaje(int p, int m){
		for(BotonCompra b: botones){
			b.setearComprable(m);
		}
		if(idioma)
			labelPuntaje.setText("Puntaje: "+p+"   Monedas: "+m);
		else
			labelPuntaje.setText("Score: "+p+"   Coins: "+m);
	}
	public void setPrototype(Objeto ob){
		prototipo=ob;
	}
	public Objeto getPrototype(){
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
		Tienda.getTienda(myGame.getLogica()).comprarAlianza(val);
	}
	public void agregarPremio(BotonCompraPremio p){
		panelPre.add(p);
	}
	public void eliminarPremio(BotonCompraPremio p){
		panelPre.remove(p);
	}
	// Modificacion para la version 1.2
		/**
		 * Muestra el Ranking de mejores jugadores.
		 */
		public void mostrarRanking() {
			ranking.mostrar();		
		}	
		//fin

		public void changeIdioma(Boolean idioma) {
			this.idioma=idioma;
			if(this.idioma){
				labelPuntaje.setText("Puntaje: 0    Monedas: 0");
				labelHumanos.setText("Humanos");
				labelElfos.setText("Elfos");
				labelEnanos.setText("Enanos");
				labelOT.setText("Objetos");
				labelPremios.setText("Premios");
				botonAliados.setText("Agregar aliado");
				botonEnemigos.setText("Agregar enemigos");
				btnAcercaDe.setText("Acerca de");
				btnSalir.setText("Salir");
				
			}
			else{
				labelPuntaje.setText("Score: 0    Coins: 0");
				labelHumanos.setText("Humans");
				labelElfos.setText("Elves");
				labelEnanos.setText("Dwarves");
				labelOT.setText("Objects");
				labelPremios.setText("Rewards");
				botonAliados.setText("Add ally");
				botonEnemigos.setText("Add enemy");
				btnAcercaDe.setText("About");
				btnSalir.setText("Exit");
				
			}
			
		}
}
