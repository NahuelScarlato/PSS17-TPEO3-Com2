package logica;

import objeto.noAtravesable.*;

public class Tienda {
	//atributos
	protected int monedas;
	protected Logica juego;
	
	//constructor
	public Tienda(){
		monedas=0;
	}
	public void sumarMonedas(int m){
		monedas+=m;
	}
	public void comprar(Aliado a, int f, int c){
		boolean posible=true;
		Tile t=juego.getTile(f, c);
		for(int i=0; i<a.getAncho() && posible; i++){
			posible=t.getRight().getComponente()==null;
			t=t.getRight();
		}
		if(juego.getTile(f, c).getComponente()==null && posible){
			juego.getTile(f, c).setComponente(a);
			if(a.getAncho()!=1){
				t=juego.getTile(f, c);
				for(int i=0; i<a.getAncho(); i++){
					t.getRight().setComponente(a);
					t=t.getRight();
				}
			}
		}
		monedas-=a.getValor();
	}
	public void comprar(EnanoCazador ec, int f, int c){
		boolean posible=juego.getTile(f, c).getComponente()==null;
		if(juego.getTile(f, c).getComponente()==null && posible){
			juego.getTile(f, c).setComponente(ec);
			if(juego.getTile(f+1, c).getComponente()==null){
				Oso o=new Oso();
				juego.getTile(f+1, c).setComponente(o);
				o.setTile(juego.getTile(f+1, c));
			}
		}
		monedas-=ec.getValor();
	}
	public void comprar(OTConVida otcv, int f, int c){
		boolean posible=true;
		for(int i=0; i<otcv.getAncho() && posible; i++){
			posible=juego.getTile(f, c).getComponente()==null;
			f++;
		}
		if(juego.getTile(f, c).getComponente()==null && posible){
			juego.getTile(f, c).setComponente(otcv);
			if(otcv.getAncho()!=1){
				for(int i=0; i<otcv.getAncho(); i++){
					juego.getTile(f+1, c).setComponente(otcv);
					f++;
				}
			}
		}
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
