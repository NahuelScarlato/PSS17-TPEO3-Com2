package objeto.atravesable;

import objeto.noAtravesable.Personaje;

public class Lava extends ObjetoAtravesable{
	public void modificar(Personaje p){
		p.restarVida(5);
	}
}
