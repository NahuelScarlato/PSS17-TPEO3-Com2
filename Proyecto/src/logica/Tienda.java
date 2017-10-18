package logica;

import objeto.noAtravesable.objetoConVida.OTConVida.*;
import objeto.noAtravesable.objetoConVida.personaje.*;

public class Tienda {
	//atributos
	protected int monedas;
	protected Logica juego;
	protected static Tienda instance = null;

	//constructor
	private Tienda(Logica l){
		monedas=0;
		juego=l;
	}
	
	public static Tienda getTienda(Logica l){
		if (instance == null)
			instance = new Tienda(l);
		
		return instance;
	}
	public void sumarMonedas(int m){
		monedas+=m;
	}
	public int getMonedas(){
		return monedas;
	}
	public void comprar(Aliado a, int f, int c){
		monedas-=a.getValor();
		juego.agregarAliado(a);
		
	}
	public void comprar(OTConVida otcv, int f, int c){
		monedas-=otcv.getValor();
	}
	//agregar comprar para temporales
	
	public void vender(Aliado a){
		if(a.fullVida()){
			a.getTile().setComponente(null);
			monedas+=a.getValor();
		}
		else{
			a.getTile().setComponente(null);
			monedas+=a.getValor()/2;
		}
	}
	public void vender(OTConVida otcv){
		if(otcv.fullVida()){
			otcv.getTile().setComponente(null);
			monedas+=otcv.getValor();
		}
		else{
			otcv.getTile().setComponente(null);
			monedas+=otcv.getValor()/2;
		}
	}
	
	//agregar vender para temporales
}
