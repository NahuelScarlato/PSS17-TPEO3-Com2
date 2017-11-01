package game.display;

import game.gfx.ImageLoader;
import objeto.noAtravesable.objetoConVida.Premios.*;

public class PremioManager {
	//atributos
	protected static PanelTienda pan;
	public static BotonCompraPremio bomba, escudo, fireball, frenzy, peste, wololo;
	
	//constructor
	public static void init(PanelTienda p){
		pan=p;
		bomba=new BotonCompraPremio(pan, ImageLoader.pBomba, new Bomba());
		escudo=new BotonCompraPremio(pan, ImageLoader.pEscudo, new Escudo());
		fireball=new BotonCompraPremio(pan, ImageLoader.pBolaDeFuego, new Fireball());
		frenzy=new BotonCompraPremio(pan, ImageLoader.pFrenzy, new Frenzy());
		peste=new BotonCompraPremio(pan, ImageLoader.pPeste, new Peste());
		wololo=new BotonCompraPremio(pan, ImageLoader.pWololo, new Wololo());
	}
}
