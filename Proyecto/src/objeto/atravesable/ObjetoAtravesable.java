package objeto.atravesable;

import logica.Tile;
import objeto.noAtravesable.Personaje;

public abstract class ObjetoAtravesable {
	//atributos
	protected Tile miTile;
	
	//metodos
	public void modificar(Personaje p){};
	public Tile getTile(){
		return miTile;
	}
}
