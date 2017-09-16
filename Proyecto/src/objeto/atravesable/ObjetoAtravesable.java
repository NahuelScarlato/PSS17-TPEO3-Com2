package objeto.atravesable;

import java.awt.image.BufferedImage;

import logica.ObjectManager;
import logica.Objeto;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class ObjetoAtravesable extends Objeto{
	//atributos
	protected Tile miTile;
	protected BufferedImage image;
	
	//metodos
	public void modificar(ObjetoNoAtravesable p){};
	public Tile getTile(){
		return miTile;
	}
	
	public BufferedImage getImage(){
		return image;
	}
	
	public void accept(ObjectManager o){
		o.visit(this);
	}
}
