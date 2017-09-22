package objeto.noAtravesable;

public abstract class OMConVida extends ObjetoConVida {
	public void serAtacado(Enemigo e){
		e.atacar(this);
	}
}
