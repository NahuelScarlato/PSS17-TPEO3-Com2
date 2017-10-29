package objeto.noAtravesable.objetoConVida.Premios;

import game.gfx.ImageLoader;
import logica.Logica;
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
	public void efecto(int x, int y, Logica l) {
		// TODO Auto-generated method stub
		
	}

}
