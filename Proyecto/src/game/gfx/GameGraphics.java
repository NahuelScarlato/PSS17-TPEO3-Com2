package game.gfx;

import java.awt.Graphics;

import game.Game;


	
public class GameGraphics {
	
	private Game game;	
	private Graphics g;
	private Logica logic;
	
	public GameGraphics(Game game){
		this.game = game;
		logic = game.
	}
	
	
	 // Como obtenemos los tiles? 
	// hacemos que graficos tenga un atributo logica (horrible) o hacemos que el Game nos pueda pasar la logica?
	
	public void dibujarMapa(){
		int filas = game.
		for (int i = 0; i < filas ; i++){
			for (int j = 0; j < columnas; j++){
				g.drawImage(ImageLoader.tierra, j*64, i*64, 64, 64, null );
				if ((tablero[i][j].getComponenteAtravesable())!=null){
					g.drawImage(tablero[i][j].getComponenteAtravesable().getImage(), j*64, i*64, 64,64, null);
				}
				if ((tablero[i][j].getComponente())!=null){
					g.drawImage(tablero[i][j].getComponente().getImage(), j*64, i*64, tablero[i][j].getComponente().getAncho()*64,tablero[i][j].getComponente().getAlto()*64, null);
					int v = tablero[i][j].getComponente().getVida();
					int m = tablero[i][j].getComponente().getMaxVida();
					g.drawImage(ImageLoader.vida[1], j*64, i*64, 40, 4, null);
					g.drawImage(ImageLoader.vida[0], j*64, i*64, (40*v)/m, 4, null);
				}
			}
		}
	}
}
