package objeto.noAtravesable.objetoConVida.personaje;

import logica.visitor.VisitorAliado;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Oso extends Aliado{
	//constructor
	public Oso(){
		super();
		vida=60;
		impacto=30;
		valor=75;
		ancho=1;
		alto=1;
		v=new VisitorAliado(this);
	}
	public ObjetoNoAtravesable clone(){
		return new Oso();
	}
}
