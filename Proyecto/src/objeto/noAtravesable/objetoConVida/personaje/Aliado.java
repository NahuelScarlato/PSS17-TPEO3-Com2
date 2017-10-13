package objeto.noAtravesable.objetoConVida.personaje;

import java.awt.Graphics;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.visitor.*;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class Aliado extends Personaje {
	//atributos
	protected int valor;
	protected VisitorAliado v;
	protected Animation animation;
	
	//metodos
	public void atacar(ObjetoNoAtravesable e){
		if(reloj==0){
			e.accept(v);
		}
	}
	
	public int getValor(){
		return valor;
	}
	public void restarVida(int v){
		vida-=v;
		if(vida<=0){
			miTile.destruirAliado(this);
			miTile = null;
		}
	}
	
	public void accept(Visitor o){
		o.afectar(this);
	}
	
	public void dibujar(Graphics g){
		int c = getTile().getColumna() * 64;
		int f = getTile().getFila() * 64; 
		g.drawImage(image, c, f, 64,64, null);
		g.drawImage(ImageLoader.vida[1], c, f, 40, 4, null);
		g.drawImage(ImageLoader.vida[0], c, f, (40*getVida())/getMaxVida(), 4, null);
	}
}
