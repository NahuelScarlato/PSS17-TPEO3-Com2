package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorAliado;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Oso extends Aliado{
	//constructor
	public Oso(Tile t){
		super();
		miTile=t;
		velocidadAt=1.6f;
		velAtMaxima=1.6f;
		t.setComponente(this);
		image=ImageLoader.oso;
		vida=60;
		maxVida=60;
		ancho=1;
		alto=1;
		impacto=30;
		alcance=1;
		v=new VisitorAliado(this);
	}
	public ObjetoNoAtravesable clone(){
		return new Oso(new Tile(null, 0, 0));
	}
}
