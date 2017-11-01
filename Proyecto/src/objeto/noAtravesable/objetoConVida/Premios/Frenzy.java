package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Logica;
import logica.Tile;
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
	@Override
	public void efecto(Tile t) {
	}
	public void accept(PremioManager pm) {
		pm.visit(this);
	}
}
