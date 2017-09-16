package logica;

import java.util.LinkedList;
import java.util.Random;
import objeto.atravesable.*;
import objeto.noAtravesable.*;

public class Logica {
	//atributos
	protected Tienda tienda;
	protected ObjectManager om;
	protected LinkedList<Objeto> lista;
	protected int score;
	protected Tile[][] tablero;
	protected final int alto=6, ancho=12;
	
	//constructor
	public Logica(){
		score=0;
		tablero=new Tile[alto][ancho];
		lista=new LinkedList<Objeto>();
		om=new ObjectManager();
	}
	
	//metodos
	
	public void generarMapa(){
		
		int r;
		Random random = new Random();
		
		for (int i = 0; i < alto ; i++){
			for (int j = 0; j < ancho; j++){
				tablero[i][j] = new Tile(this,i,j);
			}
		}
		
		for (int i = 0; i < alto ; i++){
			for (int j = 0; j < ancho; j++){
				r = random.nextInt(100);
				if (r < 5) {
					tablero[i][j].setComponenteAtravesable(new Agua());
				}
				else if ( r < 7) {
					tablero[i][j].setComponente(new Arbol());
				}
				else if (r < 9) {
					tablero[i][j].setComponente(new Piedra());
				}
				
			}
		}
		
	}
	public void actualizar(){
		for(Objeto objeto:lista){
			objeto.accept(om);
		}
	}
	public int score(){
		return score;
	}
	public void setScore(int s){
		score=s;
	}
	public Tile getTile(int f, int c){
		return tablero[f][c];
	}
}
