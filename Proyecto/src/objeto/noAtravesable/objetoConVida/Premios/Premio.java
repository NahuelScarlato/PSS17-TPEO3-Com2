package objeto.noAtravesable.objetoConVida.Premios;

import logica.visitor.Visitor;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class Premio extends ObjetoNoAtravesable{
	//metodos
	public void eliminar(){
		miTile.setComponente(null);
	}
	public void accept(Visitor v){
		v.afectar(this);
	}
}