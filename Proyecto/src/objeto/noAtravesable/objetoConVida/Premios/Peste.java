package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Peste extends Premio{
	public Peste(){
		super();
		image = ImageLoader.pPeste;
		b = PremioManager.peste;
	}
	
	public ObjetoNoAtravesable clone() {
		return new Peste();
	}

	public void efecto(Tile t) {
		
	}
}
