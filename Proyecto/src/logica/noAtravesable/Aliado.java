package logica.noAtravesable;

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
}
