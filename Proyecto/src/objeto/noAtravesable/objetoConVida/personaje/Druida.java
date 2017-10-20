package objeto.noAtravesable.objetoConVida.personaje;

import java.util.Random;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorAliado;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Druida extends Aliado{
	//atributos
	protected float velocidadSummon;
	protected float velocidadMaximaSummon;
	protected int relojSummon;
	
	public Druida(Tile t){
		super();
		reloj=0;
		relojSummon=0;
		miTile=t;
		velocidadAt=1.4f;
		velAtMaxima=1.4f;
		velocidadSummon=5f;
		velocidadMaximaSummon=5f;
		t.setComponente(this);
		image=ImageLoader.druida;
		vida=60;
		maxVida=60;
		ancho=1;
		alto=1;
		impacto=30;
		alcance=3;
		valor=80;
		v=new VisitorAliado(this);
		animation = new Animation(t.getFila() * 64,t.getColumna()*64, velocidadAt, ImageLoader.mageAtk);
	}
	public ObjetoNoAtravesable clone(){
		return new Druida(new Tile(null, 0, 0));
	}
	public void aumentarReloj(){
		reloj=(reloj+1)%(int)(velocidadAt*60);
		relojSummon=(reloj+1)%(int)(velocidadAt*60);
		if(relojSummon==0){
			Random r=new Random();
			int f = r.nextInt(6);
			int c = r.nextInt(12);
			Treant t=new Treant()
		}
	}
}
