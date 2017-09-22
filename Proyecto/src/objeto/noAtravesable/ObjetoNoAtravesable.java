package objeto.noAtravesable;


import logica.Objeto;

public abstract class ObjetoNoAtravesable extends Objeto{
	public boolean serAtacado(Enemigo e){return false;}
	public boolean serAtacado(Aliado a){return false;}
}
