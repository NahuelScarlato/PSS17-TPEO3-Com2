package objeto.noAtravesable.objetoConVida.Premios;

import objeto.noAtravesable.ObjetoNoAtravesable;

public class Peste extends Premio{
	public Peste(){
		super();
	}
	
	@Override
	public ObjetoNoAtravesable clone() {
		return new Peste();
	}

}
