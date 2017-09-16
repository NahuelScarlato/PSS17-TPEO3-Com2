package objeto.atravesable;

import game.gfx.ImageLoader;
import objeto.noAtravesable.Enemigo;
import java.awt.image.BufferedImage;

public class Agua extends ObjetoAtravesable{
	//atributos
	protected int rall;
	//constructor
	public Agua(BufferedImage image){
		this.image = image;
	}
	
	//metodos
	public void modificar(Enemigo e){
		e.modificarVelocidad(rall);
	}
	
}
