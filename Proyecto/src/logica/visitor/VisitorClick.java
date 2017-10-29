package logica.visitor;

import game.display.PanelTienda;
import objeto.noAtravesable.objetoConVida.OMConVida.OMConVida;
import objeto.noAtravesable.objetoConVida.OTConVida.OTConVida;
import objeto.noAtravesable.objetoConVida.Premios.Premio;
import objeto.noAtravesable.objetoConVida.personaje.Aliado;
import objeto.noAtravesable.objetoConVida.personaje.Enemigo;

public class VisitorClick extends Visitor{
	//atributos
	protected PanelTienda panel;
	
	//constructor
	public VisitorClick(PanelTienda pan){
		panel=pan;
	}
	
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
		panel.agregarPremio(p);
	}

}
