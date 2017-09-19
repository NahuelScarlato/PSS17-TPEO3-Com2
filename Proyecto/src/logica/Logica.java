package logica;

import java.util.LinkedList;
import java.util.Random;
import java.awt.Graphics;
import game.gfx.ImageLoader;
import objeto.atravesable.Agua;
import objeto.noAtravesable.Arbol;
import objeto.noAtravesable.Piedra;

public class Logica {
	//atributos
	protected Tienda tienda;
	protected ObjectManager om;
	protected LinkedList<Objeto> lista;
	protected int score;
	protected Tile[][] tablero;
	protected final int filas=6, columnas=12;
	
	//constructor
	public Logica(){
		score=0;
		tablero=new Tile[filas][columnas];
		lista=new LinkedList<Objeto>();
		om=new ObjectManager();
	}
	
	//metodos
	
	public void generarMapa(){
		
		int r;
		Random random = new Random();
		
		for (int i = 0; i < filas ; i++){
			for (int j = 0; j < columnas; j++){
				tablero[i][j] = new Tile(this,i,j);
			}
		}
		
		for (int i = 0; i < filas ; i++){
			for (int j = 1; j < columnas; j++){
				r = random.nextInt(100);
				if (r < 6) {
					Agua a=new Agua();
					tablero[i][j].setComponenteAtravesable(a);
					a.setTile(tablero[i][j]);
					lista.addLast(a);
				}
				else if ( r < 9) {
					Arbol a= new Arbol();
					tablero[i][j].setComponente(a);
					a.setTile(tablero[i][j]);
					lista.addLast(a);
				}
				else if (r < 12) {
					Piedra p=new Piedra();
					tablero[i][j].setComponente(p);
					p.setTile(tablero[i][j]);
					lista.addLast(p);
				}
				
			}
		}
	}
	
	public void dibujarMapa(Graphics g){
		for (int i = 0; i < filas ; i++){
			for (int j = 0; j < columnas; j++){
				g.drawImage(ImageLoader.tierra, j*64, i*64, 64, 64, null );
				if ((tablero[i][j].getComponenteAtravesable())!=null){
					g.drawImage(tablero[i][j].getComponenteAtravesable().getImage(), j*64, i*64, 64,64, null);
				}
				if ((tablero[i][j].getComponente())!=null){
					g.drawImage(tablero[i][j].getComponente().getImage(), j*64, i*64, 64,64, null);
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