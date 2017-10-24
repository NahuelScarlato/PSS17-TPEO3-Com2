package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.AnimationEnemy;
import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorEnemigo;
import objeto.noAtravesable.ObjectStateMoving;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class JefeOrco extends Enemigo{
	
	public JefeOrco(Tile t){
		super();
		vida=100;
		maxVida=100;
		miTile=t;
		velocidadAt=1.8f;
		velocidadMov=1.4f;
		animation = new AnimationEnemy(this, 0, t.getFila() * 64, velocidadAt, velocidadMov, ImageLoader.jefeOrcoMov, ImageLoader.jefeOrcoMov);
		t.setComponente(this);
		image = ImageLoader.jefeOrco;
		ancho=1;
		alto=1;
		impacto=50;
		alcance=1;
		velMovMaxima=1.4f;
		velAtMaxima=1.8f;
		puntaje=20;
		Coins=25;
		reloj=1;
		v=new VisitorEnemigo(this);
		state=new ObjectStateMoving();
	}
	@Override
	public ObjetoNoAtravesable clone() {
		return new JefeOrco(new Tile(null, 0, 0));
	}

}
