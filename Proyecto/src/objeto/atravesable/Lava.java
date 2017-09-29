package objeto.atravesable;

import logica.visitor.VisitorLava;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Lava extends ObjetoAtravesable{
	//atributos
	protected VisitorLava v;
	protected int impacto;
	
	public void modificar(ObjetoNoAtravesable o){
		o.accept(v);
	}
	public int getImpacto(){
		return impacto;
	}
}
