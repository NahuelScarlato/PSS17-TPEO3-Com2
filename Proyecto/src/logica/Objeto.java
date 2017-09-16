package logica;

import java.awt.Image;

public abstract class Objeto {
	//atributos
	protected Image imagen;
	
	//metodos
	public void accept(ObjectManager o){
		o.visit(this);
	}
}
