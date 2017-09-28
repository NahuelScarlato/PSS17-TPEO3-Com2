package objeto.noAtravesable;

import logica.visitor.Visitor;

public abstract class Premio extends ObjetoNoAtravesable{
	//metodos
	public void eliminar(){
		miTile.setComponente(null);
	}
	public void accept(Visitor v){
		v.afectar(this);
	}
}