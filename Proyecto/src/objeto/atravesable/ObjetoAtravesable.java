package objeto.atravesable;

import logica.Objeto;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class ObjetoAtravesable extends Objeto{
	//atributos
	
	//metodos
	public abstract void modificar(ObjetoNoAtravesable p);
}
