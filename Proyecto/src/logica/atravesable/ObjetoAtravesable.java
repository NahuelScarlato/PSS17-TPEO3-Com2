package logica.atravesable;

import logica.Tile;
import logica.noAtravesable.Personaje;

public abstract class ObjetoAtravesable {
	//atributos
	protected Tile miTile;
	
	//metodos
	public void modificar(Personaje p){};
	public Tile getTile(){
		return miTile;
	}
}
