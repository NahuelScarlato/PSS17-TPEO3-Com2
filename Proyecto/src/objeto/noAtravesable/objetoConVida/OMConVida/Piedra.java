package objeto.noAtravesable.objetoConVida.OMConVida;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Piedra extends OMConVida{

	public Piedra(){
		vida=100;
		maxVida=100;
		ancho=1;
		alto=1;
		image = ImageLoader.piedra;
	}
	public ObjetoNoAtravesable clone(){
		return new Piedra();
	}
}
