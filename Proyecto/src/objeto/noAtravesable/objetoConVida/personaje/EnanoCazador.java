package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.Tienda;
import logica.Tile;
import logica.visitor.VisitorAliado;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class EnanoCazador extends Aliado {
	public EnanoCazador(Tile t){
		super();
		miTile=t;
		velocidadAt=1.1f;
		velAtMaxima=1.1f;
		t.setComponente(this);
		image=ImageLoader.cazadorEnano;
		vida=50;
		maxVida=50;
		escudo = 0;
		maxEscudo = (int)(maxVida*0.2);
		ancho=1;
		alto=1;
		impacto=35;
		alcance=4;
		valor=75;
		v=new VisitorAliado(this);
		animation = new Animation(t.getFila() * 64,t.getColumna()*64, velocidadAt, ImageLoader.mageAtk);
	}
	
	public void agregar(Tienda tien, Tile t){
		miTile=t;
		t.setComponente(this);
		if(t.getFila()!=5 && t.getAbajo().getComponente()==null){
			Tile abajo=t.getAbajo();
			Oso o= new Oso(abajo);
			tien.comprar(o);
		}
		tien.comprar(this);
	}
	
	public ObjetoNoAtravesable clone(){
		return new EnanoCazador(new Tile(null, 0, 0));
	}
}
