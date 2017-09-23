package objeto.noAtravesable;

import logica.ObjectManager;

public abstract class Aliado extends Personaje {
	//atributos
	protected int valor;
	
	//metodos
	public void atacar(Enemigo e){
		if(reloj==0){
			e.restarVida(impacto);
			//System.out.println("ataque:mago");
		}
		reloj=(reloj+1)%(int)(velocidadAt*60);
	}
	public int getValor(){
		return valor;
	}
	public boolean serAtacado(Enemigo e){
		e.atacar(this);
		return true;
	}
	public void accept(ObjectManager o){
		o.visit(this);
	}
}
