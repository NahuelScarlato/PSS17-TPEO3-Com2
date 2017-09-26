package objeto.noAtravesable.objetoConVida.personaje;

import logica.*;
import objeto.noAtravesable.objetoConVida.OMConVida.*;
import objeto.noAtravesable.objetoConVida.OTConVida.*;
import objeto.noAtravesable.Premio;

public abstract class Enemigo extends Personaje{
	//atributos
	protected float velocidadMov;
	protected float velMovMaxima;
	protected int puntaje;
	protected int maxCoins;
	protected int minCoins;
	
	//metodos
	public void atacar(Aliado a){
		if(reloj==0){
			a.restarVida(impacto);
			//System.out.println("ataque");
		}
		reloj=(reloj+1)%(int)(velocidadAt*60);
		//System.out.println(this.vida);
	}
	public void atacar(OTConVida otcv){
		if(reloj==0)
			otcv.restarVida(impacto);
		reloj=(reloj+1)%(int)(velocidadAt*60);
	}
	public void atacar(OMConVida omcv){
		if(reloj==0){
			omcv.restarVida(impacto);
		}
		reloj=(reloj+1)%(int)(velocidadAt*60);
	}
	public void atacar(Premio p){
		p.eliminar();
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
		if(reloj==0){
			Tile sig=miTile.getRight();
			miTile.setComponente(null);
			miTile=sig;
			sig.setComponente(this);
			this.setTile(sig);
			//System.out.println("avance");
			//System.out.println(this.vida);
		}
		reloj=(reloj+1)%(int)(velocidadMov*60);
	}
	
	public void accept(ObjectManager o){
		o.visit(this);
	}
	
	public boolean serAtacado(Aliado a){
		a.atacar(this);
		return true;
	}
}
