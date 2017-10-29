package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
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
	
}
