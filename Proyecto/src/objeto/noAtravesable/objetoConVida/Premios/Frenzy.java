package objeto.noAtravesable.objetoConVida.Premios;

import objeto.noAtravesable.ObjetoNoAtravesable;

public class Frenzy extends Premio{
	public Frenzy(){
		super();
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Frenzy();
	}

}
