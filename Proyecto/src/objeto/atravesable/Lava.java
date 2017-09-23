package objeto.atravesable;

import objeto.noAtravesable.objetoConVida.personaje.*;

public class Lava extends ObjetoAtravesable{
	public void modificar(Personaje p){
		p.restarVida(5);
	}
}
