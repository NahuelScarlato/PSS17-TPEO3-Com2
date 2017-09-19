package objeto.noAtravesable;

import game.gfx.ImageLoader;

public class Piedra extends OMConVida{

	public Piedra(){
		vida=100;
		maxVida=100;
		ancho=1;
		alto=1;
		image = ImageLoader.piedra;
	}
	
}
