package objeto.noAtravesable.objetoConVida.OMConVida;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Arbol extends OMConVida{

	public Arbol(){
		vida=100;
		maxVida=100;
		ancho=1;
		alto=1;
		image = ImageLoader.arbol;
	}
	public ObjetoNoAtravesable clone(){
		return new Arbol();
	}
}
