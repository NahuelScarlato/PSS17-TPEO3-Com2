package objeto.noAtravesable.objetoConVida.Premios;

import objeto.noAtravesable.ObjetoNoAtravesable;

public class Escudo extends Premio{
	
	public Escudo(){
		super();
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Escudo();
	}

}
