package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.ImageLoader;
import logica.visitor.VisitorEnemigo;
import logica.*;

public class Grunt extends Enemigo{
	public Grunt(Tile t){
		vida=45;
		maxVida=45;
		miTile=t;
		t.setComponente(this);
		image=ImageLoader.grunt;
		ancho=1;
		alto=1;
		impacto=20;
		alcance=1;
		velocidadMov=0.6f;
		velMovMaxima=0.6f;
		velocidadAt=0.7f;
		velAtMaxima=0.7f;
		puntaje=20;
		Coins=15;
		reloj=1;
		v=new VisitorEnemigo(this);
	}
}
