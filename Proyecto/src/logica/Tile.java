package logica;

import logica.atravesable.ObjetoAtravesable;
import logica.noAtravesable.ObjetoNoAtravesable;

public class Tile {
	//atributos
	protected ObjetoNoAtravesable componente;
	protected ObjetoAtravesable componenteAtravesable;
	protected Juego miJuego;
	protected int fila, columna;
	
	//constructor
	public Tile(Juego j,int f, int c){
		componente=null;
		componenteAtravesable=null;
		fila=f;
		columna=c;
		miJuego=j;
	}
	
	//metodos
	public ObjetoNoAtravesable getComponente(){
		return componente;
	}
	public ObjetoAtravesable getComponenteAtravesable(){
		return componenteAtravesable;
	}
	public void setComponente(ObjetoNoAtravesable o){
		componente=o;
	}
	public void setComponenteAtravesable(ObjetoAtravesable o){
		componenteAtravesable=o;
	}
	public int getFila(){
		return fila;
	}
	public int getColumna(){
		return columna;
	}
	public Tile getSiguiente(){
		return miJuego.getTile(fila, columna+1);
	}
}
