package objeto.noAtravesable.objetoConVida.OTConVida;

import objeto.noAtravesable.objetoConVida.personaje.*;
import objeto.noAtravesable.objetoConVida.*;

public abstract class OTConVida extends ObjetoConVida {
	//atributos
	protected int valor;
	
	//metodos
	public int getValor(){
		return valor;
	}
	public boolean serAtacado(Enemigo e){
		e.atacar(this);
		return true;
	}
}
