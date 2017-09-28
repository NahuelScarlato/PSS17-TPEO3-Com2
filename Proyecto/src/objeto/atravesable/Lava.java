package objeto.atravesable;

import objeto.noAtravesable.ObjetoNoAtravesable;
import objeto.noAtravesable.objetoConVida.personaje.*;

public class Lava extends ObjetoAtravesable{
	public void modificar(Personaje p){
		p.restarVida(5);
	}

	@Override
	public void modificar(ObjetoNoAtravesable p) {
		// TODO Auto-generated method stub
		
	}
}
