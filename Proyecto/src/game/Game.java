package game;

import java.awt.Graphics;
import java.util.Random;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import logica.*;
import objeto.noAtravesable.Goblin;
import game.display.Display;
import game.gfx.ImageLoader;

public class Game implements Runnable{

	private Display display;
	public int width,height;
	public String title;
	
	private Logica myLogic;
	
	private boolean running=false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private BufferedImage testImage; int x = 0;// Codigo temporal para el bichito moviendose.

	private Goblin goblin;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	private void init(){
		display = new Display(title , width , height);
		myLogic = new Logica();
		ImageLoader.init();
		myLogic.generarMapa();
		Random r = new Random();
		int ran = r.nextInt(6);
		goblin=new Goblin(myLogic.getTile(ran, 0));
		myLogic.agregarObjeto(goblin);
		testImage = goblin.getImage();// Codigo temporal, goblin caminando.
	}
	
	private void update(){
		myLogic.actualizar();
	}
	
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		// Clear Screen
		
		g.clearRect(0, 0, width, height);
		
		// Dibujos aca
		
		myLogic.dibujarMapa(g);
		g.drawImage(testImage, goblin.getTile().getColumna()*64, goblin.getTile().getFila()*64, 64, 64,  null);
		
		bs.show();
		g.dispose();
	}
	
	public void run(){
		
		init();
		
		// Aca estabilizamos la cantidad de fps de la ejecucion del juego.
		
		int fps=60;
		double timePerTick = 1000000000/fps; 
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		
		while(running){
			
			now = System.nanoTime();	
			delta += (now - lastTime) / timePerTick; // delta va a ir aumentando lentamente por cada vuelta del ciclo while
			lastTime = now;   
			
			if(delta >= 1){		// Cuando delta llegue a 1, llamo a los metodos update y render
				
				update();
				render();
				
				delta--;
				
			}
			
		}
		
		stop();
		
	}
	
	public synchronized void start(){
		if(running){
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running){
			return;
		}
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
