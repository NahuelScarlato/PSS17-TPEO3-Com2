package objeto.noAtravesable;

import logica.ObjectManager;

public abstract class Aliado extends Personaje {
	//atributos
	protected int valor;
	
	//metodos
	public void atacar(Enemigo e){
		if(reloj==0)
			e.restarVida(impacto);
		reloj=(reloj+1)%(int)(velocidadAt*60);
	}
	public int getValor(){
		return valor;
	}
	public void serAtacado(Enemigo e){
		e.atacar(this);
	}
	public void accept(ObjectManager o){
		o.visit(this);
	}
}
