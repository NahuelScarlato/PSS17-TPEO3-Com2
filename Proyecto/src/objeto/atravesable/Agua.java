package objeto.atravesable;

import game.gfx.ImageLoader;
import logica.ObjectManager;
import objeto.noAtravesable.objetoConVida.personaje.*;

public class Agua extends ObjetoAtravesable{
	//atributos
	protected float rall;
	//constructor
	public Agua(){
		image = ImageLoader.agua;
		rall=1.5f;
	}
	
	//metodos
	public void modificar(Personaje e){
		e.modificarVelocidad(rall);
	}
	public void normalizar(Personaje e){
		e.normalizarVelocidad();
	}

	public void accept(ObjectManager o){
		o.visit(this);
	}
	
}
