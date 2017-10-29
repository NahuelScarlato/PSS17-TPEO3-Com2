package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import logica.Logica;
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
	public void efecto(int x, int y, Logica l) {
		// TODO Auto-generated method stub
		
	}
	
}
