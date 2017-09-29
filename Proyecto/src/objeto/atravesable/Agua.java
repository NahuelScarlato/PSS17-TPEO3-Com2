package objeto.atravesable;

import game.gfx.ImageLoader;
import logica.visitor.*;
import objeto.noAtravesable.ObjetoNoAtravesable;

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
}
