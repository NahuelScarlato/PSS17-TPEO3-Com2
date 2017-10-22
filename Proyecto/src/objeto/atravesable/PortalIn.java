package objeto.atravesable;

import java.awt.Graphics;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorPortal;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class PortalIn extends ObjetoAtravesable{
	protected VisitorPortal v;
	protected Animation animation;
	protected Tile myTile;
	
	public PortalIn(VisitorPortal v, Tile t){
		this.v = v;
		myTile = t;
		animation = new Animation(myTile.getFila()*64, myTile.getColumna()*64, 0.5f, ImageLoader.portalBlue);
	}
	
	public void setVP(VisitorPortal v){
		this.v = v;
	}
	
	public void modificar(ObjetoNoAtravesable p) {
		p.accept(v);
	}
}
