package objeto.noAtravesable;

import logica.*;

public abstract class Enemigo extends Personaje{
	//atributos
	protected float velocidadMov;
	protected static float velMovMaxima;
	protected int puntaje;
	protected int maxCoins;
	protected int minCoins;
	
	//metodos
	public void atacar(Aliado a){
		if(reloj==0)
			a.restarVida(impacto);
		reloj=(reloj+1)%(int)(velocidadMov*60);
	}
	public void atacar(OTConVida otcv){
		if(reloj==0)
			otcv.restarVida(impacto);
		reloj=(reloj+1)%(int)(velocidadMov*60);
	}
	public void atacar(OMConVida omcv){
		if(reloj==0){
			omcv.restarVida(impacto);
			System.out.println("ataque");
		}
		reloj=(reloj+1)%(int)(velocidadMov*60);
	}
	public void atacar(Premio p){
		p.eliminar();
	}
	public void modificarVelocidad(float rall){
		velocidadAt=(int)(rall*velAtMaxima);
		velocidadMov=(int)(velMovMaxima*rall);
	}
	public void normalizarVelocidad(){
		velocidadMov=velMovMaxima;
	}
	public void avanzar(){
		if(reloj==0){
			Tile sig=miTile.getRight();
			miTile.setComponente(null);
			miTile=sig;
			sig.setComponente(this);
			this.setTile(sig);
			System.out.println("avance");
		}
		reloj=(reloj+1)%(int)(velocidadMov*60);
	}
	
	public void accept(ObjectManager o){
		o.visit(this);
	}
}
