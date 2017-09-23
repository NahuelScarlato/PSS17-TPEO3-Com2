package objeto.noAtravesable.objetoConVida.OMConVida;

import objeto.noAtravesable.objetoConVida.personaje.*;
import objeto.noAtravesable.objetoConVida.*;

public abstract class OMConVida extends ObjetoConVida {
	public boolean serAtacado(Enemigo e){
		e.atacar(this);
		return true;
	}
}
