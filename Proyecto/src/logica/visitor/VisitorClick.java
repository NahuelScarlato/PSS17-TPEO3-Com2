package logica.visitor;

import game.display.PanelTienda;
import objeto.noAtravesable.objetoConVida.OMConVida.OMConVida;
import objeto.noAtravesable.objetoConVida.OTConVida.OTConVida;
import objeto.noAtravesable.objetoConVida.Premios.Premio;
import objeto.noAtravesable.objetoConVida.personaje.Aliado;
import objeto.noAtravesable.objetoConVida.personaje.Enemigo;

public class VisitorClick extends Visitor{
	//atributos
	protected PanelTienda p;
	
	//constructor
	public VisitorClick(PanelTienda pan){
		p=pan;
	}
	
	//metodos
	public void afectar(Aliado a) {
		
	}
	public void afectar(Enemigo e) {
		
	}
	public void afectar(OTConVida otcv) {
		
	}
	public void afectar(OMConVida omcv) {
		
	}
	public void afectar(Premio p) {
		
	}

}
