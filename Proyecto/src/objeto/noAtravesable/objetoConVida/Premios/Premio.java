package objeto.noAtravesable.objetoConVida.Premios;

import java.awt.Graphics;

import game.gfx.ImageLoader;
import logica.visitor.Visitor;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class Premio extends ObjetoNoAtravesable{
	//metodos
	public void eliminar(){
		miTile.setComponente(null);
	}
	public void accept(Visitor v){
		v.afectar(this);
	}
	
	public void dibujar(Graphics g){
		g.drawImage(image, miTile.getColumna()*64, miTile.getFila()*64, 64, 64, null);

	}
}