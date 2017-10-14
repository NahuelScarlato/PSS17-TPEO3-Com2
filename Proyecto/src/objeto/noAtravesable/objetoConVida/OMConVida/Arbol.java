package objeto.noAtravesable.objetoConVida.OMConVida;

import game.gfx.Animation;
import game.gfx.ImageLoader;

public class Arbol extends OMConVida{

	public Arbol(){
		vida=100;
		maxVida=100;
		ancho=1;
		alto=1;
		image = ImageLoader.arbol;
	}
	
}
