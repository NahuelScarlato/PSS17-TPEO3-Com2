package objeto.noAtravesable;

import logica.Tile;

public abstract class ObjetoNoAtravesable {
	protected Tile miTile;
	
	public Tile getTile(){
		return miTile;
	}
	public void setTile(Tile t){
		miTile=t;
	}
}
