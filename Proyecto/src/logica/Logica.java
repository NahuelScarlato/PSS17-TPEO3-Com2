package logica;

import java.util.LinkedList;
import java.util.Random;
import objeto.atravesable.*;
import objeto.noAtravesable.ObjectStateStatic;
import objeto.noAtravesable.objetoConVida.OMConVida.*;
import objeto.noAtravesable.objetoConVida.Premios.Bomba;
import objeto.noAtravesable.objetoConVida.Premios.Escudo;
import objeto.noAtravesable.objetoConVida.Premios.Fireball;
import objeto.noAtravesable.objetoConVida.Premios.Frenzy;
import objeto.noAtravesable.objetoConVida.Premios.Wololo;
import objeto.noAtravesable.objetoConVida.personaje.*;
import objeto.noAtravesable.objetoConVida.personaje.aliado.Aliado;
import objeto.noAtravesable.objetoConVida.personaje.enemigo.Enemigo;

public class Logica {
	//atributos
	protected LinkedList<Enemigo> listaEnemigos, enemigosABorrar, enemigosAAgregar;
	protected LinkedList<Aliado> listaAliados, aliadosABorrar, aliadosAAgregar;
	protected LinkedList<ObjetoAtravesable> listaAtravesables, atravesablesABorrar;
	protected LinkedList<ObjetoTemporal> objetosTemporales, objetosTemporalesABorrar;
	protected Tienda tienda;
	protected int score;
	protected Tile[][] tablero;
	protected final int filas=6, columnas=12;
	private static Logica logica = new Logica();
	
	//constructor
	private Logica(){
		tienda=Tienda.getTienda(this);
		score = 0;
		tablero = new Tile[filas][columnas];
		listaEnemigos = new LinkedList<Enemigo>();
		enemigosABorrar = new LinkedList<Enemigo>();
		enemigosAAgregar = new LinkedList<Enemigo>();
		listaAliados = new LinkedList<Aliado>();
		aliadosABorrar = new LinkedList<Aliado>();
		aliadosAAgregar = new LinkedList<Aliado>();
		listaAtravesables = new LinkedList<ObjetoAtravesable>();
		atravesablesABorrar = new LinkedList<ObjetoAtravesable>();
		objetosTemporales = new LinkedList<ObjetoTemporal>();
		objetosTemporalesABorrar = new LinkedList<ObjetoTemporal>();
		
	}
	
	public static Logica getLogica(){
		return logica;
	}
	
	//metodos
	public void agregarMonedas(int m){
		tienda.sumarMonedas(m);
	}
	public void agregarAliado(Aliado a){
		aliadosAAgregar.addLast(a);
	}
	public void agregarEnemigo(Enemigo e){
		enemigosAAgregar.addLast(e);
	}
	public void agregarAtravesable(ObjetoAtravesable oa){
		listaAtravesables.addLast(oa);
	}

	public void agregarAliadoABorrar(Aliado a){
		aliadosABorrar.addLast(a);
	}
	public void agregarEnemigoABorrar(Enemigo e){
		enemigosABorrar.addLast(e);
		score+=e.getPuntaje();
	}
	public void agregarAtravesableABorrar(ObjetoAtravesable oa){
		atravesablesABorrar.addLast(oa);
	}
	
	public void agregarObjetoTemporal(ObjetoTemporal obj){
		objetosTemporales.addLast(obj);
	}
	
	public void agregarObjetoTemporalABorrar(ObjetoTemporal obj){
		objetosTemporalesABorrar.addLast(obj);
	}
	
	private void agregarObjetos(){
		for(Aliado a : aliadosAAgregar){
			listaAliados.addLast(a);
		}
		aliadosAAgregar = new LinkedList<Aliado>();
		for(Enemigo e : enemigosAAgregar){
			listaEnemigos.addLast(e);
		}
		enemigosAAgregar = new LinkedList<Enemigo>();
	}
	public void eliminarObjetos(){
		for (ObjetoTemporal obj : objetosTemporalesABorrar){
			objetosTemporales.remove(obj);
		}
		objetosTemporalesABorrar = new LinkedList<ObjetoTemporal>();
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
		
		Bomba b = new Bomba();
		tablero[0][0].setComponente(b);
		b.setTile(tablero[0][0]);
		Escudo e = new Escudo();
		tablero[0][1].setComponente(e);
		e.setTile(tablero[0][1]);
		Fireball f = new Fireball();
		tablero[0][2].setComponente(f);
		f.setTile(tablero[0][2]);
		Wololo w = new Wololo();
		tablero[0][3].setComponente(w);
		w.setTile(tablero[0][3]);
		Frenzy fr = new Frenzy();
		tablero[0][4].setComponente(fr);
		fr.setTile(tablero[0][4]);
		Frenzy fre = new Frenzy();
		tablero[0][5].setComponente(fre);
		fre.setTile(tablero[0][5]);
		
		
		for (int i = 0; i < filas ; i++){
			for (int j = 1; j < columnas; j++){
				r = random.nextInt(100);
				if (r < 6) {
					Agua a=new Agua(tablero[i][j]);
					tablero[i][j].setComponenteAtravesable(a);
					listaAtravesables.addLast(a);
				}
				else if ( r < 9) {
					if(tablero[i][j].getComponenteAtravesable()==null){
						Arbol a= new Arbol();
						tablero[i][j].setComponente(a);
						a.setTile(tablero[i][j]);
					}
				}
				else if (r < 12) {
					if(tablero[i][j].getComponenteAtravesable()==null){
						Piedra p=new Piedra();
						tablero[i][j].setComponente(p);
						p.setTile(tablero[i][j]);
					}
				}
				
			}
		}
	}
	
	public void actualizar(){
		for(ObjetoTemporal obj: objetosTemporales){
			obj.decrementarReloj();
		}
		eliminarObjetos();
		for(Aliado a:listaAliados){
			boolean encontre = false;
			if(a.getTile().getColumna()!=0){
				Tile actual = a.getTile().getLeft();
				
				for(int i=0; !encontre && actual.getColumna()!=0 && i<a.getAlcance(); i++){
					if(actual.getComponente()!=null){
						a.atacar(actual.getComponente());
						encontre = true;
					}
					actual=actual.getLeft();
				}
			}
			if (!encontre)
				a.setState(new ObjectStateStatic());
			a.aumentarReloj();
			eliminarObjetos();
		}
		agregarObjetos();
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
					e.atacar(actual.getComponente());
					encontre=true;
				} 
			}
			if(!encontre){
				e.avanzar();
				e.setState(e.getMovingState());
			}
			eliminarObjetos();
		}
		agregarObjetos();
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
