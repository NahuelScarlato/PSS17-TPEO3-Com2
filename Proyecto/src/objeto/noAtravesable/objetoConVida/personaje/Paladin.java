package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorAliado;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Paladin extends Aliado{
	//constructor
		public Paladin(Tile t){
			super();
			miTile=t;
			if(miTile.getColumna()!=11){
				Tile sig=miTile.getRight();
				sig.setComponente(this);
			}
			velocidadAt=1.2f;
			velAtMaxima=1.2f;
			t.setComponente(this);
			image=ImageLoader.paladin;
			vida=120;
			maxVida=120;
			ancho=2;
			alto=1;
			impacto=45;
			alcance=1;
			valor=50;
			v=new VisitorAliado(this);
			animation = new Animation(t.getFila() * 64,t.getColumna()*64, velocidadAt, ImageLoader.paladinAtk);
			
		}
		public void restarVida(int v){
			vida-=v;
			if(vida<=0){
				miTile.destruirAliado(this);
				if(miTile.getColumna()!=11){
					Tile sig=miTile.getRight();
					sig.setComponente(null);
				}
				miTile = null;
			}
		}
		public ObjetoNoAtravesable clone(){
			return new Paladin(new Tile(null, 0, 0));
		}
}
