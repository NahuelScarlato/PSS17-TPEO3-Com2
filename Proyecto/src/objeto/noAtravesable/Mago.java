package objeto.noAtravesable;

import game.gfx.*;
import logica.*;

public class Mago extends Aliado {
	//constructor
	public Mago(Tile t){
		miTile=t;
		velocidadAt=0.5f;
		velAtMaxima=0.5f;
		t.setComponente(this);
		image=ImageLoader.mago;
		vida=40;
		maxVida=40;
		ancho=1;
		alto=1;
		impacto=40;
		alcance=4;
		valor=70;
	}
}
