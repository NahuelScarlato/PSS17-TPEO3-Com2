package objeto.noAtravesable;


import logica.Objeto;
import logica.visitor.Visitor;
import objeto.atravesable.Agua;

public abstract class ObjetoNoAtravesable extends Objeto{
	public int getVida(){return 0;}
	public int getMaxVida(){return 0;}
	public void serModificado(Agua a){}
	public void serNormalizado(Agua a){}
	public void accept(Visitor v){}
}
