package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Logica;
import logica.Tile;
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

	@Override
	public void efecto(Tile t) {
	}
	public void accept(PremioManager pm) {
		pm.visit(this);
	}
}
