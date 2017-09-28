package objeto.noAtravesable.objetoConVida.personaje;
import logica.*;
import logica.visitor.VisitorEnemigo;
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
		impacto=20;
		alcance=4;
		velocidadMov=0.9f;
		velMovMaxima=0.9f;
		velocidadAt=1.2f;
		velAtMaxima=1.2f;
		puntaje=20;
		maxCoins=15;
		minCoins=5;
		reloj=1;
		v=new VisitorEnemigo(this);
	}
}
