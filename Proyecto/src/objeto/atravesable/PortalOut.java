package objeto.atravesable;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class PortalOut extends ObjetoAtravesable{
	
	public PortalOut(Tile t){
		miTile = t;
		animation = new Animation(t.getColumna()*64, t.getFila()*64, 0.5f, ImageLoader.portalOrange);
	}
	
	public void modificar(ObjetoNoAtravesable p){}
}

