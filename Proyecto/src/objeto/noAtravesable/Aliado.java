package objeto.noAtravesable;

import logica.ObjectManager;

public abstract class Aliado extends Personaje {
	//atributos
	protected int valor;
	
	//metodos
	public void atacar(Enemigo e){
		e.restarVida(impacto);
	}
	public int getValor(){
		return valor;
	}
	
	public void accept(ObjectManager o){
		o.visit(this);
	}
}
