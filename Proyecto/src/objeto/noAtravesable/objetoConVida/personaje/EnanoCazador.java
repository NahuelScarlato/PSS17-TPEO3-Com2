package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.ImageLoader;
import logica.Tile;

public class EnanoCazador extends Aliado {
	public EnanoCazador(Tile t){
		miTile=t;
		velocidadAt=0.4f;
		velAtMaxima=0.4f;
		t.setComponente(this);
		image=ImageLoader.cazadorEnano;
		vida=50;
		maxVida=50;
		ancho=1;
		alto=1;
		impacto=15;
		alcance=4;
		valor=70;
	}
}
