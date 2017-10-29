package objeto.noAtravesable.objetoConVida.Premios;

import objeto.noAtravesable.ObjetoNoAtravesable;

public class Wololo extends Premio{
	public Wololo(){
		super();
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Wololo();
	}
	
}
