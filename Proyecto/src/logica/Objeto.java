package logica;

import java.awt.image.BufferedImage;

public abstract class Objeto {
	//atributos
	
	
	//metodos
	public void accept(ObjectManager o){
		o.visit(this);
	}
	

}
