package logica;

import logica.visitor.VisitorPortal;
import objeto.atravesable.PortalIn;
import objeto.atravesable.PortalOut;
import objeto.noAtravesable.objetoConVida.OTConVida.OTConVida;

public class Portal extends OTConVida{
	protected PortalIn pi;
	protected PortalOut po;
	
	
	public Portal(){
		valor=50;
	}
	
	public PortalOut getOut(){
		return po;
	}
	public PortalIn getIn(){
		return pi;
	}
	
	//despues lo borro
	public void restarVida(int v) {
	}
	public Objeto clone() {
		return new Portal();
	}
	public void agregar(Tienda tien, Tile t){
		if(pi==null && t.getComponenteAtravesable()==null){
			pi=new PortalIn(null, t);
			tien.comprar(this);
			tien.getPanel().setPrototype(this);
		}
		else{
			if(po==null && t.getComponenteAtravesable()==null){
				po=new PortalOut(t);
				VisitorPortal v = new VisitorPortal(po, pi);
				pi.setVP(v);
				tien.agregar(pi);
				tien.agregar(po);
			}
			else tien.getPanel().setPrototype(this);
		}
	}
}

