package objeto.atravesable;

import logica.visitor.VisitorPortal;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class PortalIn extends ObjetoAtravesable{
	protected VisitorPortal v;
	
	public PortalIn(VisitorPortal v){
		this.v = v;
	}
	
	public void setVP(VisitorPortal v){
		this.v = v;
	}
	
	public void modificar(ObjetoNoAtravesable p) {
		p.accept(v);
	}
}
