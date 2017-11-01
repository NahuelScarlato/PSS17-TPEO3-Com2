package logica.visitor;

import objeto.noAtravesable.objetoConVida.OMConVida.*;
import objeto.noAtravesable.objetoConVida.OTConVida.*;
import objeto.noAtravesable.objetoConVida.Premios.Premio;
import objeto.noAtravesable.objetoConVida.personaje.*;

public abstract class Visitor {
	public abstract void afectar(Aliado a);
	public abstract void afectar(Enemigo e);
	public abstract void afectar(OTConVida otcv);
	public abstract void afectar(OMConVida omcv);
	public abstract void afectar(Premio p);
}
