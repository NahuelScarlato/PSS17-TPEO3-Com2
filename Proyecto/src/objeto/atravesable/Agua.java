package objeto.atravesable;

import game.gfx.ImageLoader;
import logica.ObjectManager;
import objeto.noAtravesable.*;

public class Agua extends ObjetoAtravesable{
	//atributos
	protected float rall;
	//constructor
	public Agua(){
		image = ImageLoader.agua;
		rall=5.0f;
	}
	
	//metodos
	public void modificar(Personaje e){
		e.modificarVelocidad(rall);
	}

	public void accept(ObjectManager o){
		o.visit(this);
	}
	
}
