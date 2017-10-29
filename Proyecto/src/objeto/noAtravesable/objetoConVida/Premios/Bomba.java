package objeto.noAtravesable.objetoConVida.Premios;

import objeto.noAtravesable.ObjetoNoAtravesable;

public class Bomba extends Premio{
	public Bomba(){
		super();
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Bomba();
	}

}
