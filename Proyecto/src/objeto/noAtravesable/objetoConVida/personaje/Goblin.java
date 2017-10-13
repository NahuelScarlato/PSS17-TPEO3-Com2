package objeto.noAtravesable.objetoConVida.personaje;
import game.gfx.ImageLoader;
import logica.*;
import logica.visitor.VisitorEnemigo;

public class Goblin extends Enemigo {
	//constructor
	public Goblin(Tile t){
		vida=35;
		maxVida=35;
		miTile=t;
		t.setComponente(this);
		image=ImageLoader.goblin;
		ancho=1;
		alto=1;
		impacto=10;
		alcance=1;
		velocidadMov=0.7f;
		velMovMaxima=0.7f;
		velocidadAt=0.7f;
		velAtMaxima=0.7f;
		puntaje=20;
		Coins=15;
		reloj=1;
		v=new VisitorEnemigo(this);
	}
}
