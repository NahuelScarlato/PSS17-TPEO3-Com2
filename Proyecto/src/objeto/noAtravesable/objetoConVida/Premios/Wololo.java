package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Wololo extends Premio{
	public Wololo(){
		super();
		image = ImageLoader.pWololo;
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Wololo();
	}
	
}
