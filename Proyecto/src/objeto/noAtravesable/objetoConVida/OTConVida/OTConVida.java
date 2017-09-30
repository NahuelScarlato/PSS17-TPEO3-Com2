package objeto.noAtravesable.objetoConVida.OTConVida;

import logica.visitor.Visitor;
import objeto.noAtravesable.objetoConVida.*;

public abstract class OTConVida extends ObjetoConVida {
	//atributos
	protected int valor;
	
	//metodos
	public int getValor(){
		return valor;
	}
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
