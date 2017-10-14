package objeto.noAtravesable.objetoConVida.OMConVida;

import game.gfx.Animation;
import game.gfx.ImageLoader;

public class Piedra extends OMConVida{

	public Piedra(){
		vida=100;
		maxVida=100;
		ancho=1;
		alto=1;
		image = new Animation(64,64, ImageLoader.piedra);
	}
	
}
