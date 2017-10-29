package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import logica.Logica;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Bomba extends Premio{
	public Bomba(){
		super();
		image = ImageLoader.pBomba;
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Bomba();
	}
	@Override
	public void efecto(int x, int y, Logica l) {
		// TODO Auto-generated method stub
		
	}

}
