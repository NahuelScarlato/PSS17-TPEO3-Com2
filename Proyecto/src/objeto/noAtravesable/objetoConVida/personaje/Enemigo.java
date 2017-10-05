package objeto.noAtravesable.objetoConVida.personaje;

import logica.*;
import logica.visitor.*;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class Enemigo extends Personaje{
	//atributos
	protected float velocidadMov;
	protected float velMovMaxima;
	protected int puntaje;
	protected int maxCoins;
	protected int minCoins;
	protected VisitorEnemigo v;
	
	//metodos
	public int getPuntaje(){
		return puntaje;
	}
	public void atacar(ObjetoNoAtravesable ona){
		if(reloj==0){
			ona.accept(v);
		}
		reloj=(reloj+1)%(int)(velocidadAt*60);
		//System.out.println(this.vida);
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
		if(reloj==0 && miTile.getRight().getComponente()==null){
			Tile sig=miTile.getRight();
			miTile.setComponente(null);
			miTile=sig;
			sig.setComponente(this);
			this.setTile(sig);
			normalizarVelocidad();
		}
		reloj=(reloj+1)%(int)(velocidadMov*60);
	}
	public void restarVida(int v){
		vida-=v;
		if(vida<=0){
			miTile.destruirEnemigo(this);
			miTile = null;
		}
	}
	
	public void accept(Visitor o){
		o.afectar(this);
	}
}
