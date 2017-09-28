package objeto.noAtravesable.objetoConVida.OMConVida;

import logica.visitor.Visitor;
import objeto.noAtravesable.objetoConVida.*;

public abstract class OMConVida extends ObjetoConVida {
	public void accept(Visitor v){
		v.afectar(this);
	}
}
