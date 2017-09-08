package logica;

public abstract class Aliado extends Personaje {
	public void atacar(Enemigo e){
		e.restarVida(impacto);
	}
}
