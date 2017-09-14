package objeto.atravesable;

import objeto.noAtravesable.Enemigo;

public class Agua extends ObjetoAtravesable{
	//atributos
	protected int rall;
	
	
	public Agua(){
		
	}
	
	//metodos
	public void modificar(Enemigo e){
		e.restarVelocidad(rall);
	}
}
