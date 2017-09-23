package game.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	private static int width = 32, height = 32;
	private static BufferedImage sheet;
	public static BufferedImage tierra, agua, piedra , arbol, mago, goblin, brujo;
	public static BufferedImage[] vida = new BufferedImage[3];
	
	public static void init(){
		sheet = loadImage("/Textures/SpriteSheet2x2.png");
		tierra = sheet.getSubimage(0, 0, width, height);
		agua = sheet.getSubimage(0, height, width, height);
		piedra = sheet.getSubimage(width, 0, width, height);
		arbol = loadImage("/Textures/arbol.png");
		mago=loadImage("/Textures/Personajes/mago.png");
		goblin=loadImage("/Textures/Personajes/Goblin.png");
		brujo=loadImage("/Textures/Personajes/OrcoBrujo.png");
		vida[0] =loadImage("/Textures/VidaVerde.png");
		vida[1] =loadImage("/Textures/VidaRoja.png");
		vida[2] =loadImage("/Textures/VidaAzul.png");
		
	}
	
	public static BufferedImage loadImage(String path){
		try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
	
	/*public BufferedImage crop(int x, int y, int width, int height){
		return sheet.getSubimage(x, y, width, height);
	}*/
	
}
