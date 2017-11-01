package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Logica;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Bomba extends Premio{
	public Bomba(){
		super();
		image = ImageLoader.pBomba;
	}
	public ObjetoNoAtravesable clone() {
		return new Bomba();
	}
	public void efecto(Tile t) {
		
	}
	public void accept(PremioManager pm) {
		pm.visit(this);
	}

}
