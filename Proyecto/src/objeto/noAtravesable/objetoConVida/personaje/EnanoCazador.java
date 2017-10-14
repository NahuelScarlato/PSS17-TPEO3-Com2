package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorAliado;

public class EnanoCazador extends Aliado {
	public EnanoCazador(Tile t){
		super();
		miTile=t;
		velocidadAt=1.3f;
		velAtMaxima=1.3f;
		t.setComponente(this);
		image=ImageLoader.cazadorEnano;
		vida=50;
		maxVida=50;
		ancho=1;
		alto=1;
		impacto=15;
		alcance=4;
		valor=70;
		v=new VisitorAliado(this);
	}
}
