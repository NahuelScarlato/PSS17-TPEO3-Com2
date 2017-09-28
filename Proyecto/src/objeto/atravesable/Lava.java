package objeto.atravesable;

import logica.visitor.VisitorLava;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Lava extends ObjetoAtravesable{
	//atributos
	protected VisitorLava v;
	protected int impacto;
	
	//constructor
	public Lava(){
		v=new VisitorLava(this);
		impacto=5;
	}
	
	public void modificar(ObjetoNoAtravesable ona){
		ona.accept(v);
	}
	
	public int getImpacto(){
		return impacto;
	}
}
