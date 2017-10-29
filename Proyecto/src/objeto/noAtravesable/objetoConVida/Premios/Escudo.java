package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Escudo extends Premio{
	public Escudo(){
		super();
		image = ImageLoader.pEscudo;
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Escudo();
	}

}
