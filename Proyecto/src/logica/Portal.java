package logica;

import logica.visitor.VisitorPortal;
import objeto.atravesable.PortalIn;
import objeto.atravesable.PortalOut;

public class Portal {
	protected PortalIn pi;
	protected PortalOut po;
	
	public Portal(Tile in, Tile out){
		po = new PortalOut();
		pi = new PortalIn(null, in);
		VisitorPortal v = new VisitorPortal(po, pi);
		pi.setVP(v);
		po.setTile(out);
		pi.setTile(in);
	}
	
	public PortalOut getOut(){
		return po;
	}
	public PortalIn getIn(){
		return pi;
	}
}

