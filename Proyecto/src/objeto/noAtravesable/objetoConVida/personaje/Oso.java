package objeto.noAtravesable.objetoConVida.personaje;

import logica.visitor.VisitorAliado;

public class Oso extends Aliado{
	//constructor
	public Oso(){
		vida=60;
		impacto=30;
		valor=75;
		ancho=1;
		alto=1;
		v=new VisitorAliado(this);
	}
}
