package objeto.noAtravesable.objetoConVida.Premios;

import java.awt.Graphics;

import game.display.PremioManager;
import logica.Tienda;
import logica.Tile;
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
	public abstract void accept(PremioManager pm);
	
	public void dibujar(Graphics g){
		g.drawImage(image, miTile.getColumna()*64, miTile.getFila()*64, 64, 64, null);
	}
	
	public void restarVida(int n){}
	public abstract void efecto(Tile t);
	public void agregar(Tienda tien, Tile t){
		efecto(t);
	}
}