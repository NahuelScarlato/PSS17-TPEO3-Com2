package game;

import game.display.Display;

public class Launcher {

	public static void main(String[] args){
		
		Game game = new Game("Juegazo",480, 288);
		game.start();
	}
}
