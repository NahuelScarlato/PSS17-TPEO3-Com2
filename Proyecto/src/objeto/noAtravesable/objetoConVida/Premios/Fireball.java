package objeto.noAtravesable.objetoConVida.Premios;

import objeto.noAtravesable.ObjetoNoAtravesable;

public class Fireball extends Premio{
	public Fireball(){
		super();
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new Fireball();
	}
	
}
