package objeto.atravesable;

import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class PortalOut extends ObjetoAtravesable{
	
	public PortalOut(Tile t){
		miTile = t;
	}
	
	public void modificar(ObjetoNoAtravesable p){}
}

