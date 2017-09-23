package objeto.noAtravesable;
import logica.*;
import game.gfx.ImageLoader;

public class Brujo extends Enemigo{
	public Brujo(Tile t){
		vida=50;
		maxVida=50;
		miTile=t;
		t.setComponente(this);
		image=ImageLoader.brujo;
		ancho=1;
		alto=1;
		impacto=30;
		alcance=3;
		velocidadMov=0.9f;
		velMovMaxima=0.9f;
		velocidadAt=0.7f;
		velAtMaxima=0.7f;
		puntaje=20;
		maxCoins=15;
		minCoins=5;
		reloj=1;
	}
}
