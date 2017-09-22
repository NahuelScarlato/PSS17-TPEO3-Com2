package objeto.noAtravesable;

import game.gfx.*;
import logica.*;

public class Mago extends Aliado {
	//constructor
	public Mago(Tile t){
		miTile=t;
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
