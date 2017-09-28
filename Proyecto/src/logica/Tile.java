package logica;

import objeto.noAtravesable.objetoConVida.*;
import objeto.noAtravesable.objetoConVida.personaje.*;
import objeto.atravesable.*;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Tile {
	//atributos
	protected ObjetoNoAtravesable componente;
	protected ObjetoAtravesable componenteAtravesable;
	protected Logica miJuego;
	protected int fila, columna;
	
	
	//constructor
	public Tile(Logica j,int f, int c){
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
	public Tile getRight(){
		return miJuego.getTile(fila, columna+1);
	}
	public Tile getLeft(){
		return miJuego.getTile(fila, columna-1);
	}
	public void destruirAliado(Aliado a){
		componente = null;
		miJuego.agregarAliadoABorrar(a);
	}
	public void destruirEnemigo(Enemigo e){
		componente = null;
		miJuego.agregarEnemigoABorrar(e);
	}
	public void destruirObjeto(ObjetoConVida ocv){
		componente=null;
	}
}
