package logica.visitor;

import game.display.PremioManager;
import objeto.noAtravesable.objetoConVida.OMConVida.OMConVida;
import objeto.noAtravesable.objetoConVida.OTConVida.OTConVida;
import objeto.noAtravesable.objetoConVida.Premios.Premio;
import objeto.noAtravesable.objetoConVida.personaje.Aliado;
import objeto.noAtravesable.objetoConVida.personaje.Enemigo;

public class VisitorClick extends Visitor{
	
	//metodos
	public void afectar(Aliado a) {
		a.restarVida(1000);
	}
	public void afectar(Enemigo e) {
		e.restarVida(1000);
	}
	public void afectar(OTConVida otcv) {
		otcv.restarVida(1000);
	}
	public void afectar(OMConVida omcv) {
		omcv.restarVida(1000);
	}
	public void afectar(Premio p) {
		p.serClickeado();
		p.eliminar();
	}

}
