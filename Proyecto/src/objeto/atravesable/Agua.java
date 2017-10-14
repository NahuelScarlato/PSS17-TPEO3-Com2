package objeto.atravesable;

import java.awt.Graphics;

import game.gfx.ImageLoader;
import logica.visitor.*;
import objeto.noAtravesable.ObjetoNoAtravesable;
import objeto.noAtravesable.objetoConVida.personaje.Personaje;

public class Agua extends ObjetoAtravesable{
	//atributos
	protected float rall;
	protected VisitorAgua v;
	
	//constructor
	public Agua(){
		image = ImageLoader.agua;
		rall=1.5f;
		v=new VisitorAgua(this);
	}
	
	//metodos
	public void modificar(ObjetoNoAtravesable o){
		o.accept(v);
	}
	public float getRall(){
		return rall;
	}

	public void normalizar(Personaje p) {
		p.normalizarVelocidad();
	}

}
