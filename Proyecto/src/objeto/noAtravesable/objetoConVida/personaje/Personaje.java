package objeto.noAtravesable.objetoConVida.personaje;

import objeto.atravesable.Agua;
import objeto.noAtravesable.objetoConVida.*;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class Personaje extends ObjetoConVida{
	//atributos
	protected int impacto;
	protected int alcance;
	protected int reloj;
	protected float velocidadAt;
	protected float velAtMaxima;
	
	//metodos
	public abstract void atacar(ObjetoNoAtravesable o);
	public int getAlcance(){
		return alcance;
	}
	public int getImpacto(){
		return impacto;
	}
	public void modificarVelocidad(float rall){
		velocidadAt=(rall*velAtMaxima);
	}
	public void normalizarVelocidad(){
		velocidadAt=velAtMaxima;
	}
	public void aumentarReloj(){
		reloj=(reloj+1)%(int)(velocidadAt*60);
	}
	public void serModificado(Agua a){
		a.modificar(this);
	}
	public void serNormalizado(Agua a){
		a.normalizar(this);
	}
}
