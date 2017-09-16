package objeto.noAtravesable;

import logica.*;

public abstract class Enemigo extends Personaje{
	//atributos
	protected float velocidad;
	protected static float vel;
	protected int puntaje;
	protected int maxCoins;
	protected int minCoins;
	
	//metodos
	public void atacar(Aliado a){
		a.restarVida(impacto);
	}
	public void atacar(OTConVida otcv){
		otcv.restarVida(impacto);
	}
	public void atacar(OMConVida omcv){
		omcv.restarVida(impacto);
	}
	public void atacar(Premio p){
		p.eliminar();
	}
	public void modificarVelocidad(int v){
		velocidad=vel*v;
	}
	public void normalizarVelocidad(){
		velocidad=vel;
	}
	public void avanzar(){
		Tile sig=miTile.getLeft();
		miTile.setComponente(null);
		miTile=sig;
		sig.setComponente(this);
	}
}
