package logica.visitor;

import objeto.noAtravesable.objetoConVida.OMConVida.OMConVida;
import objeto.noAtravesable.objetoConVida.OTConVida.OTConVida;
import objeto.noAtravesable.objetoConVida.Premios.Premio;
import objeto.noAtravesable.objetoConVida.personaje.aliado.*;
import objeto.noAtravesable.objetoConVida.personaje.enemigo.*;

public class VisitorEscudo extends Visitor{

	@Override
	public void afectar(Aliado a) {
		a.crearEscudo();
	}
	public void afectar(Enemigo e) {}
	public void afectar(OTConVida otcv) {}
	public void afectar(OMConVida omcv) {}
	public void afectar(Premio p) {}

}
