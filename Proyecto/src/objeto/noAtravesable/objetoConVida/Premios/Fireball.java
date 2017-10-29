package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import logica.Logica;
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
	public void efecto(int x, int y, Logica l) {
		if (l.getTile(x, y).getComponente() != null)
			l.getTile(x, y).getComponente().restarVida(50);
	}
	
}
