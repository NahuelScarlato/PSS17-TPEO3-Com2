package objeto.noAtravesable;


import logica.Objeto;
import logica.visitor.Visitor;
import objeto.atravesable.Agua;

public abstract class ObjetoNoAtravesable extends Objeto{
	
	protected ObjectState state;
	protected ObjectState stateStatic;
	
	public int getVida(){return 0;}
	public int getMaxVida(){return 0;}
	public void serModificado(Agua a){}
	public void serNormalizado(Agua a){}
	public void accept(Visitor v){}
	public void setState(ObjectState newState){
		state = newState;
	}
}
