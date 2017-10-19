package objeto.noAtravesable.objetoConVida.personaje;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import game.gfx.SoundLoader;
import logica.Tile;
import logica.visitor.VisitorClerigo;
import objeto.noAtravesable.ObjetoNoAtravesable;
import javafx.scene.media.*;

public class Clerigo extends Aliado {
	AudioInputStream hit = SoundLoader.loadSound("/Sounds/wololo.mp3"); 
	
	//constructor
	public Clerigo(Tile t){
		super();
		miTile=t;
		velocidadAt=1f;
		velAtMaxima=1f;
		t.setComponente(this);
		image=ImageLoader.monje;
		vida=30;
		maxVida=30;
		ancho=1;
		alto=1;
		impacto=5;
		alcance=1;
		valor=40;
		v=new VisitorClerigo(this);
		animation = new Animation(t.getFila() * 64,t.getColumna()*64, velocidadAt, ImageLoader.monkAtk);
		
			Clip c;
			try {
				c = AudioSystem.getClip();
				c.open(hit);
				c.start();
			} catch (LineUnavailableException | IOException e) {}
		
	}
	public ObjetoNoAtravesable clone(){
		return new Clerigo(new Tile(null, 0, 0));
	}
}
