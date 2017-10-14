package logica.visitor;

import objeto.noAtravesable.*;
import objeto.noAtravesable.objetoConVida.OMConVida.*;
import objeto.noAtravesable.objetoConVida.OTConVida.*;
import objeto.noAtravesable.objetoConVida.personaje.*;

public class VisitorEnemigo extends Visitor {
	//atributos
	protected Enemigo enemigo;
	
	//constructor
	public VisitorEnemigo(Enemigo e){
		enemigo=e;
	}
	
	//metodos
	public void afectar(Aliado a){
		a.restarVida(enemigo.getImpacto());
		enemigo.setState(enemigo.getAttackingState());
	}
	public void afectar(Enemigo e){
		enemigo.avanzar();
		enemigo.setState(enemigo.getMovingState());
	}
	public void afectar(OMConVida omcv){
		omcv.restarVida(enemigo.getImpacto());
		enemigo.setState(enemigo.getAttackingState());
	}
	public void afectar(OTConVida otcv){
		otcv.restarVida(enemigo.getImpacto());
		enemigo.setState(enemigo.getAttackingState());
	}
	public void afectar(Premio p){
		p.eliminar();
	}
}
