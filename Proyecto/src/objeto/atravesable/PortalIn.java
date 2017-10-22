package objeto.atravesable;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorPortal;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class PortalIn extends ObjetoAtravesable{
	protected VisitorPortal v;
	
	public PortalIn(VisitorPortal v, Tile t){
		this.v = v;
		miTile = t;
		animation = new Animation(miTile.getFila()*64, miTile.getColumna()*64, 0.5f, ImageLoader.portalBlue);
	}
	
	public void setVP(VisitorPortal v){
		this.v = v;
	}
	
	public void modificar(ObjetoNoAtravesable p) {
		p.accept(v);
	}
}
