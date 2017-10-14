package objeto.noAtravesable;

import java.awt.Graphics;

import logica.Objeto;
import objeto.noAtravesable.objetoConVida.OMConVida.OMConVida;
import objeto.noAtravesable.objetoConVida.OTConVida.OTConVida;
import objeto.noAtravesable.objetoConVida.personaje.Aliado;
import objeto.noAtravesable.objetoConVida.personaje.Enemigo;

public abstract class ObjectState {
	
	protected Object myObject;
	
	public abstract void draw(Graphics g, Enemigo e);
	public abstract void draw(Graphics g, Aliado a);
	public abstract void draw(Graphics g, OTConVida otcv);
	public abstract void draw(Graphics g, OMConVida omcv);
	public abstract void draw(Graphics g, Premio p);
	public void setObject(Objeto o){
		myObject = o;
	}
	
}
