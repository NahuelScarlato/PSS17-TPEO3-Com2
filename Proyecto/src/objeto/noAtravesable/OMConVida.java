package objeto.noAtravesable;

public abstract class OMConVida extends ObjetoConVida {
	public boolean serAtacado(Enemigo e){
		e.atacar(this);
		return true;
	}
}
