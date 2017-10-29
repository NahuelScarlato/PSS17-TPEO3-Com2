package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Frenzy extends Premio{
	public Frenzy(){
		super();
		image = ImageLoader.pFrenzy;
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Frenzy();
	}

}
