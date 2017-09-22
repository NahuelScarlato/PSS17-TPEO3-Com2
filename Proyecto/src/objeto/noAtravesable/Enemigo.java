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
		System.out.println("ataque");
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
		Tile sig=miTile.getRight();
		miTile.setComponente(null);
		miTile=sig;
		sig.setComponente(this);
		this.setTile(sig);
		System.out.println("avance");
	}
	
	public void accept(ObjectManager o){
		o.visit(this);
	}
}
