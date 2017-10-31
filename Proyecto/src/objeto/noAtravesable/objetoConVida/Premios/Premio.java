package objeto.noAtravesable.objetoConVida.Premios;

import java.awt.Graphics;

import game.display.PremioManager;
import game.gfx.ImageLoader;
import logica.Logica;
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
	public abstract void efecto(int x, int y, Logica l);
}