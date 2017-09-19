package objeto.atravesable;


import logica.ObjectManager;
import logica.Objeto;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class ObjetoAtravesable extends Objeto{
	//atributos
	
	//metodos
	public void modificar(ObjetoNoAtravesable p){};
	
	public void accept(ObjectManager o){
		o.visit(this);
	}
}
