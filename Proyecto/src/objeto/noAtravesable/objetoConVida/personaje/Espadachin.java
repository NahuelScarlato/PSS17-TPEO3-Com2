package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorAliado;

public class Espadachin extends Aliado{
	public Espadachin(Tile t){
		super();
		miTile=t;
		velocidadAt=1.25f;
		velAtMaxima=1.25f;
		t.setComponente(this);
		image=ImageLoader.espadachin;
		vida=65;
		maxVida=65;
		ancho=1;
		alto=1;
		impacto=30;
		alcance=1;
		valor=20;
		v=new VisitorAliado(this);
		animation = new Animation(t.getFila() * 64,t.getColumna()*64, velocidadAt, ImageLoader.mageAtk);
	}
}
