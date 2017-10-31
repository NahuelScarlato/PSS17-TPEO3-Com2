package game.display;

import game.gfx.ImageLoader;
import objeto.noAtravesable.objetoConVida.Premios.*;

public class PremioManager {
	//atributos
	protected BotonCompraPremio[] botones;
	protected PanelTienda pan;
	
	//constructor
	public PremioManager(PanelTienda p){
		pan=p;
		botones=new BotonCompraPremio[6];
		botones[0]=new BotonCompraPremio(pan, ImageLoader.pBomba, new Bomba());
		botones[1]=new BotonCompraPremio(pan, ImageLoader.pEscudo, new Escudo());
		botones[2]=new BotonCompraPremio(pan, ImageLoader.pBolaDeFuego, new Fireball());
		botones[3]=new BotonCompraPremio(pan, ImageLoader.pFrenzy, new Frenzy());
		botones[4]=new BotonCompraPremio(pan, ImageLoader.pPeste, new Peste());
		botones[5]=new BotonCompraPremio(pan, ImageLoader.pWololo, new Wololo());
	}
	
	//metodos
	public void visit(Bomba b){
		botones[0].sumarPremio();
	}
	public void visit(Escudo e){
		botones[1].sumarPremio();
	}
	public void visit(Fireball f){
		botones[2].sumarPremio();
	}
	public void visit(Frenzy f){
		botones[3].sumarPremio();
	}
	public void visit(Peste p){
		botones[4].sumarPremio();
	}
	public void visit(Wololo w){
		botones[5].sumarPremio();
	}
}
