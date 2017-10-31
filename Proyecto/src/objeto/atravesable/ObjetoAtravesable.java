package objeto.atravesable;

import java.awt.Graphics;

import game.gfx.Animation;
import logica.Objeto;
import logica.Tienda;
import logica.Tile;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class ObjetoAtravesable extends Objeto{
	//atributos
	protected Animation animation;
	
	//metodos
	public abstract void modificar(ObjetoNoAtravesable p);
	
	public void dibujar(Graphics g){
		animation.drawrAtk(g);
	}
	public void agregar(Tienda tien, Tile t){
		miTile=t;
		t.setComponenteAtravesable(this);
		tien.getPanel().setPrototype(null);
	}
}
