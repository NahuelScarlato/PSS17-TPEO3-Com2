package game;

import game.display.Display;

public class Launcher {

	public static void main(String[] args){
		
		Game game = new Game("Jelou",300,300);
		game.start();
	}
}
