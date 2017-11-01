package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Frenzy extends Premio{
	public Frenzy(){
		super();
		image = ImageLoader.pFrenzy;
		b = PremioManager.frenzy;
	}
	public ObjetoNoAtravesable clone() {
		return new Frenzy();
	}
	public void efecto(Tile t) {
	}
}
