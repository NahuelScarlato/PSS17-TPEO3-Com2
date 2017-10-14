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
	
	public Aliado(){
		super();
		state = stateStatic;
	}
	
	//metodos
	public void atacar(ObjetoNoAtravesable e){
		if(reloj==0){
			e.accept(v);
		}
	}
	
	public int getValor(){
		return valor;
	}
	
	public Animation getAnimation(){
		return animation;
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
		state.draw(g, this);
	}
}
