package objeto.noAtravesable;

import java.awt.image.BufferedImage;

import logica.Objeto;
import logica.Tile;

public abstract class ObjetoNoAtravesable extends Objeto{
	protected Tile miTile;
	protected BufferedImage image;
	
	
	public Tile getTile(){
		return miTile;
	}
	public void setTile(Tile t){
		miTile=t;
	}
	
	public BufferedImage getImage(){
		return image;
	}
}
