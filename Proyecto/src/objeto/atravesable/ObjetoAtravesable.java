package objeto.atravesable;

import logica.Tile;
import objeto.noAtravesable.*;

public abstract class ObjetoAtravesable {
	//atributos
	protected Tile miTile;
	
	//metodos
	public void modificar(ObjetoNoAtravesable p){};
	public Tile getTile(){
		return miTile;
	}
}
