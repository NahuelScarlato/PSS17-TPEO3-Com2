package logica.visitor;

import objeto.noAtravesable.*;
import objeto.noAtravesable.objetoConVida.OMConVida.*;
import objeto.noAtravesable.objetoConVida.OTConVida.*;
import objeto.noAtravesable.objetoConVida.personaje.*;

public class VisitorAliado extends Visitor {
	//atributos
	protected Aliado aliado;
	
	//constructor
	public VisitorAliado(Aliado a){
		aliado=a;
	}
	//metodos
	public void afectar(Aliado a) {}
	public void afectar(Enemigo e) {
		e.restarVida(aliado.getImpacto());
	}
	public void afectar(OTConVida otcv) {}
	public void afectar(OMConVida omcv) {}
	public void afectar(Premio p) {}
}
