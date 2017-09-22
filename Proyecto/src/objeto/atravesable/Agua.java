package objeto.atravesable;

import game.gfx.ImageLoader;
import objeto.noAtravesable.*;

public class Agua extends ObjetoAtravesable{
	//atributos
	protected float rall;
	//constructor
	public Agua(){
		image = ImageLoader.agua;
		rall=0.1f;
	}
	
	//metodos
	public void modificar(Personaje e){
		e.modificarVelocidad(rall);
	}
	
}
