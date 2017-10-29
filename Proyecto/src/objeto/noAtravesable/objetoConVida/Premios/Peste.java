package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Peste extends Premio{
	public Peste(){
		super();
		image = ImageLoader.pPeste;
	}
	
	@Override
	public ObjetoNoAtravesable clone() {
		return new Peste();
	}

}
