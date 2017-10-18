package game.display;

import game.Game;
import objeto.noAtravesable.objetoConVida.personaje.Espadachin;

public class StrategyEspadachin extends Strategy {
	//atributos
		protected Game g;
		
		//constructor
		public StrategyEspadachin(Game ga){
			g = ga;
		}
		
		//metodos
		public void comprar(int x, int y){
			if(g.getLogica().getTile(x,y)!=null){
				Espadachin e = new Espadachin(g.getLogica().getTile(x, y));
				g.getLogica().getTienda().comprar(e, x, y);
			}
		}
}
