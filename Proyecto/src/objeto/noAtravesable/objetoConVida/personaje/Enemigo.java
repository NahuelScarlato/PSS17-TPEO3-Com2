package objeto.noAtravesable.objetoConVida.personaje;

import logica.*;
import logica.visitor.*;
import objeto.noAtravesable.ObjectState;
import objeto.noAtravesable.ObjectStateMoving;
import objeto.noAtravesable.ObjetoNoAtravesable;

import java.awt.Graphics;
import java.util.Random;

import game.gfx.Animation;
import game.gfx.AnimationEnemy;

public abstract class Enemigo extends Personaje{
	//atributos
	protected float velocidadMov;
	protected float velMovMaxima;
	protected int puntaje;
	protected int Coins;
	protected VisitorEnemigo v;
	protected ObjectState stateMoving;
	protected AnimationEnemy animation;
	protected boolean detenido;
	
	public Enemigo(){
		super();
		stateMoving = new ObjectStateMoving();
		state = stateMoving;
		detenido = false;
	}
	
	//metodos
	public int getPuntaje(){
		return puntaje;
	}
	
	public ObjectState getMovingState(){
		return stateMoving;
	}
	
	public void atacar(ObjetoNoAtravesable ona){
		if(reloj==0){
			ona.accept(v);
		}
		reloj=(reloj+1)%(int)(velocidadAt*60);
	}
	
	public void modificarVelocidad(float rall){
		velocidadAt=(rall*velAtMaxima);
		velocidadMov=(velMovMaxima*rall);
	}
	
	public void normalizarVelocidad(){
		velocidadMov=velMovMaxima;
		velocidadAt=velAtMaxima;
	}
	
	public void avanzar(){
		if(!detenido && reloj==0 && miTile.getRight().getComponente()==null){
			Tile sig = miTile.getRight();
			miTile.setComponente(null);
			miTile=sig;
			sig.setComponente(this);
			this.setTile(sig);
			normalizarVelocidad();
		}
		reloj = (reloj+1)%(int)(velocidadMov*60);
	}
	
	public void restarVida(int v){
		vida-=v;
		if(vida<=0){
			miTile.destruirEnemigo(this);
			miTile = null;
		}
	}
	
	public int getCoins(){
		Random r = new Random();
		double ran = (r.nextInt((int) (0.2 * Coins)) - (0.1 * Coins));
		return (int) ran + Coins;
	}
	
	public AnimationEnemy getAnimation(){
		return animation;
	}
	
	public void accept(Visitor o){
		o.afectar(this);
	}
	
	public void dibujar(Graphics g){
		state.draw(g, this);
	}
	
	public void switchMovementState(){
		detenido = !detenido;
	}
}
