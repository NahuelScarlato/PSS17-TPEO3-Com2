package objeto.noAtravesable.objetoConVida.Premios;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Fireball extends Premio{
	public Fireball(){
		super();
		image = ImageLoader.pBolaDeFuego;
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Fireball();
	}
	@Override
	public void efecto(Tile t) {
		if (t.getComponente() != null)
			t.getComponente().restarVida(50);
	}
	public void accept(PremioManager pm) {
		pm.visit(this);
	}
}
