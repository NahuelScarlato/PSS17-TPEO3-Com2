package logica.visitor;

import objeto.noAtravesable.Premio;
import objeto.noAtravesable.objetoConVida.OMConVida.OMConVida;
import objeto.noAtravesable.objetoConVida.OTConVida.OTConVida;
import objeto.noAtravesable.objetoConVida.personaje.Aliado;
import objeto.noAtravesable.objetoConVida.personaje.Clerigo;
import objeto.noAtravesable.objetoConVida.personaje.Enemigo;

public class VisitorClerigo extends VisitorAliado{
	public VisitorClerigo(Clerigo a){
		super(a);
	}
	public void afectar(Aliado a) {a.sumarVida(5);}
	public void afectar(Enemigo e) {
		e.restarVida(aliado.getImpacto());
	}
	public void afectar(OTConVida otcv) {}
	public void afectar(OMConVida omcv) {}
	public void afectar(Premio p) {}
}
