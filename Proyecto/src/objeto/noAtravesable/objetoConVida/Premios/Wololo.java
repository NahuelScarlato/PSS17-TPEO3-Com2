package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Logica;
import logica.Tile;
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
	@Override
	public void efecto(Tile t) {
	}
	public void accept(PremioManager pm) {
		pm.visit(this);
	}
}
