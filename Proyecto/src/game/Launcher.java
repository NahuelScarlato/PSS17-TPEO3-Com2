package game;

import java.io.*;
import sun.audio.*;

public class Launcher {

	public static void main(String[] args) throws Exception{
		String audio = "nix.wav";
		InputStream in = new FileInputStream(audio);
		AudioStream music = new AudioStream(in);
		Game game = new Game("Very good Game", 768 , 384);
		
		game.start();
		AudioPlayer.player.start(music);
	}
}
