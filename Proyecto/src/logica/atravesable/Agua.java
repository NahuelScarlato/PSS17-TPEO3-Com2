package logica.atravesable;

import logica.noAtravesable.Enemigo;

public class Agua extends ObjetoAtravesable{
	//atributos
	protected int rall;
	
	//metodos
	public void modificar(Enemigo e){
		e.restarVelocidad(rall);
	}
}
