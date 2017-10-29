package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Bomba extends Premio{
	public Bomba(){
		super();
		image = ImageLoader.pBomba;
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Bomba();
	}

}
