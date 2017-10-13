package game.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	private static int width = 32, height = 32;
	private static BufferedImage sheet;
	public static BufferedImage tierra, agua, piedra , arbol, mago, goblin, brujo, cazadorEnano, grunt;
	public static BufferedImage[] vida = new BufferedImage[3];
	public static BufferedImage[] goblinMove = new BufferedImage[4];
	public static BufferedImage[] goblinAtk = new BufferedImage[4];
	public static void init(){
		sheet = loadImage("/Textures/SpriteSheet2x2.png");
		tierra = sheet.getSubimage(0, 0, width, height);
		agua = sheet.getSubimage(0, height, width, height);
		piedra = sheet.getSubimage(width, 0, width, height);
		arbol = loadImage("/Textures/arbol.png");
		mago=loadImage("/Textures/Personajes/mago.png");
		goblin=loadImage("/Textures/Personajes/Goblin.png");
		brujo=loadImage("/Textures/Personajes/OrcoBrujo.png");
		cazadorEnano=loadImage("/Textures/Personajes/Cazador Enano.png");
		grunt=loadImage("/Textures/Personajes/Grunt.png");
		vida[0] =loadImage("/Textures/VidaVerde.png");
		vida[1] =loadImage("/Textures/VidaRoja.png");
		vida[2] =loadImage("/Textures/VidaAzul.png");
		sheet = loadImage("/Textures/Animations/Goblin walk.png");
		goblinMove[0] = sheet.getSubimage(0, 0, 60, 60);
		goblinMove[1] = sheet.getSubimage(60, 0, 60, 60);
		goblinMove[2] = sheet.getSubimage(120, 0, 60, 60);
		goblinMove[3] = sheet.getSubimage(180, 0, 60, 60);
		sheet = loadImage("/Textures/Animations/Goblin attack.png");
		goblinAtk[0] = sheet.getSubimage(0, 0, 60, 60);
		goblinAtk[1] = sheet.getSubimage(60, 0, 60, 60);
		goblinAtk[2] = sheet.getSubimage(120, 0, 60, 60);
		goblinAtk[3] = sheet.getSubimage(180, 0, 60, 60);
		
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
