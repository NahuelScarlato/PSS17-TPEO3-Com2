package logica;

import java.util.LinkedList;
import java.util.Random;
import java.awt.Graphics;
import game.gfx.ImageLoader;
import objeto.atravesable.*;
import objeto.noAtravesable.objetoConVida.OMConVida.*;
import objeto.noAtravesable.objetoConVida.personaje.*;
import java.util.Random;

public class Logica {
	//atributos
	protected Tienda tienda;
	protected LinkedList<Enemigo> listaEnemigos, enemigosABorrar;
	protected LinkedList<Aliado> listaAliados, aliadosABorrar;
	protected LinkedList<ObjetoAtravesable> listaAtravesables, atravesablesABorrar;
	protected int score;
	protected Tile[][] tablero;
	protected final int filas=6, columnas=12;
	
	//constructor
	public Logica(){
		score = 0;
		tablero = new Tile[filas][columnas];
		listaEnemigos = new LinkedList<Enemigo>();
		enemigosABorrar = new LinkedList<Enemigo>();
		listaAliados = new LinkedList<Aliado>();
		aliadosABorrar = new LinkedList<Aliado>();
		listaAtravesables = new LinkedList<ObjetoAtravesable>();
		atravesablesABorrar = new LinkedList<ObjetoAtravesable>();
	}
	
	//metodos
	public void agregarAliado(Aliado a){
		listaAliados.addLast(a);
	}
	public void agregarEnemigo(Enemigo e){
		listaEnemigos.addLast(e);
	}
	public void agregarAtravesable(ObjetoAtravesable oa){
		listaAtravesables.addLast(oa);
	}

	public void agregarAliadoABorrar(Aliado a){
		aliadosABorrar.addLast(a);
	}
	public void agregarEnemigoABorrar(Enemigo e){
		enemigosABorrar.addLast(e);
	}
	public void agregarAtravesableABorrar(ObjetoAtravesable oa){
		atravesablesABorrar.addLast(oa);
	}
	
	public void eliminarObjetos(){
		for (Aliado a : aliadosABorrar){
			listaAliados.remove(a);
		}
		aliadosABorrar=new LinkedList<Aliado>();
		for (Enemigo e : enemigosABorrar){
			listaEnemigos.remove(e);
		}
		enemigosABorrar=new LinkedList<Enemigo>();
		for (ObjetoAtravesable oa : atravesablesABorrar){
			listaAtravesables.remove(oa);
		}
		atravesablesABorrar=new LinkedList<ObjetoAtravesable>();
	}
	
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
					listaAtravesables.addLast(a);
				}
				else if ( r < 9) {
					Arbol a= new Arbol();
					tablero[i][j].setComponente(a);
					a.setTile(tablero[i][j]);
				}
				else if (r < 12) {
					Piedra p=new Piedra();
					tablero[i][j].setComponente(p);
					p.setTile(tablero[i][j]);
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
					g.drawImage(tablero[i][j].getComponente().getImage(), j*64, i*64, tablero[i][j].getComponente().getAncho()*64,tablero[i][j].getComponente().getAlto()*64, null);
					int v = tablero[i][j].getComponente().getVida();
					int m = tablero[i][j].getComponente().getMaxVida();
					g.drawImage(ImageLoader.vida[1], j*64, i*64, 40, 4, null);
					g.drawImage(ImageLoader.vida[0], j*64, i*64, (40*v)/m, 4, null);
				}
			}
		}
	}
	
	public void actualizar(){
		eliminarObjetos();
		for(Aliado a:listaAliados){
			Tile actual = a.getTile().getLeft();
			for(int i=0; i<a.getAlcance(); i++){
				if(actual.getComponente()!=null){
					a.atacar(actual.getComponente());
				}
				actual=actual.getLeft();
			}
			a.aumentarReloj();
			eliminarObjetos();
		}
		for(Enemigo e:listaEnemigos){
			boolean encontre=false;
			Tile actual=e.getTile();
			if (actual.getColumna()==11){
				encontre=true;
			}
			int restantes = 12 - (actual.getColumna()+e.getAlcance());
			for(int i=0; restantes > 0 && i<e.getAlcance() && !encontre; i++){
				actual=actual.getRight();
				if(actual.getComponente()!=null){
					encontre=true;
					e.atacar(actual.getComponente());
				}
			}
			if(!encontre){
				e.avanzar();
			}
			eliminarObjetos();
		}
		for(ObjetoAtravesable oa: listaAtravesables){
			if(oa.getTile().getComponente()!=null)
				oa.modificar(oa.getTile().getComponente());
			eliminarObjetos();
		}
	}
	
	public int getScore(){
		return score;
	}
	
	public void setScore(int s){
		score=s;
	}
	
	public Tile getTile(int f, int c){
		return tablero[f][c];
	}
	
	public int getFilas(){
		return filas;
	}
	
	public int getColumnas(){
		return columnas;
	}
}
