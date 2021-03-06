package objeto.noAtravesable.objetoConVida.personaje.enemigo;
import game.gfx.AnimationEnemy;
import game.gfx.ImageLoader;
import logica.*;
import logica.visitor.VisitorEnemigo;
import objeto.noAtravesable.ObjectStateMoving;
import objeto.noAtravesable.ObjetoNoAtravesable;
import objeto.noAtravesable.objetoConVida.Premios.Peste;
import objeto.noAtravesable.objetoConVida.Premios.VisitorWololo;

public class Goblin extends Enemigo {
	//constructor
	public Goblin(Tile t){
		super();
		vida=35;
		maxVida=35;
		miTile=t;
		velocidadAt=0.7f;
		velocidadMov=0.5f;
		animation = new AnimationEnemy(this, 0, t.getFila() * 64, velocidadAt, velocidadMov, ImageLoader.goblinAtk, ImageLoader.goblinMove);
		t.setComponente(this);
		image = ImageLoader.goblin;
		ancho=1;
		alto=1;
		impacto=10;
		alcance=1;
		velMovMaxima=1.5f;
		velAtMaxima=0.7f;
		puntaje=20;
		Coins=15;
		reloj=1;
		v=new VisitorEnemigo(this);
		state=new ObjectStateMoving();
		premio = new Peste();
	}
	public ObjetoNoAtravesable clone(){
		return new Goblin(new Tile(null,0,0));
	}
	public void accept(VisitorWololo vw, Tile t){
		vw.visit(this, t);
	}
}
