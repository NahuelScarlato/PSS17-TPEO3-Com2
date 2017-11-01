package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Wololo extends Premio{
	public Wololo(){
		super();
		image = ImageLoader.pWololo;
		b = PremioManager.wololo;
	}
	public ObjetoNoAtravesable clone() {
		return new Wololo();
	}
	public void efecto(Tile t) {
	}
}
