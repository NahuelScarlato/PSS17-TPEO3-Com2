package objeto.noAtravesable.objetoConVida.personaje;
import logica.*;
import logica.visitor.VisitorEnemigo;
import objeto.noAtravesable.*;
import game.gfx.Animation;
import game.gfx.AnimationEnemy;
import game.gfx.ImageLoader;

public class Brujo extends Enemigo{
	public Brujo(Tile t){
		super();
		vida=50;
		maxVida=50;
		miTile=t;
		t.setComponente(this);
		image = ImageLoader.brujo;
		ancho=1;
		alto=1;
		impacto=20;
		alcance=4;
		velocidadMov=2.3f;
		velMovMaxima=2.3f;
		velocidadAt=1.2f;
		velAtMaxima=1.2f;
		puntaje=20;
		Coins=200;
		reloj=1;
		v = new VisitorEnemigo(this);
		setState(new ObjectStateMoving());
		animation = new AnimationEnemy(0 , t.getFila()*64, velocidadMov ,ImageLoader.warlockAtk, ImageLoader.warlockMove);
	}
}
