package objeto.noAtravesable.objetoConVida.OMConVida;

import logica.visitor.Visitor;
import objeto.noAtravesable.objetoConVida.*;

public abstract class OMConVida extends ObjetoConVida {
	public void accept(Visitor v){
		v.afectar(this);
	}
	public void restarVida(int v){
		vida-=v;
		if(vida<=0){
			miTile.destruirObjeto(this);
			miTile = null;
		}
	}
}
