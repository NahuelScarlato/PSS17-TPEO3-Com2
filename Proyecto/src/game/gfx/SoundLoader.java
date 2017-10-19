package game.gfx;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundLoader {
	//atributos
	
	//metodos
	public static AudioInputStream loadSound(String path){
		try{
			return AudioSystem.getAudioInputStream(SoundLoader.class.getResource(path));
		}
		catch(IOException | UnsupportedAudioFileException e){
			e.printStackTrace();
		}
		return null;
	}
}
