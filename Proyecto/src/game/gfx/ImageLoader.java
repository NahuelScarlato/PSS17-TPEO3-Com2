package game.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	private static int width = 32, height = 32;
	private static BufferedImage sheet;
	public static BufferedImage tierra, agua, piedra , arbol;
	public static BufferedImage mago, espadachin, paladin, arquero, monje, campeonEnano, cazadorEnano, druida, oso, treant;
	public static BufferedImage goblin, brujo, grunt;
	public static BufferedImage[] vida = new BufferedImage[3];
	public static BufferedImage[] goblinMove = new BufferedImage[4];
	public static BufferedImage[] goblinAtk = new BufferedImage[4];
	public static BufferedImage[] mageAtk = new BufferedImage[4];
	public static BufferedImage[] warriorAtk = new BufferedImage[4];
	public static BufferedImage[] monkAtk = new BufferedImage[4];
	public static BufferedImage[] paladinAtk = new BufferedImage[4];
	public static BufferedImage[] arqueroAtk = new BufferedImage[4];
	public static BufferedImage[] dwarfHunterAtk = new BufferedImage[4];
	public static BufferedImage[] warlockAtk = new BufferedImage[4];
	public static BufferedImage[] warlockMove = new BufferedImage[4];
	public static BufferedImage[] gruntAtk = new BufferedImage[4];
	public static BufferedImage[] gruntMove = new BufferedImage[4];
	
 	public static void init(){
		sheet = loadImage("/Textures/SpriteSheet3x2.png");
		//tierra = new BufferedImage[1]; 
		tierra = sheet.getSubimage(0, 0, width, height);
		//agua = new BufferedImage[1];
		agua = sheet.getSubimage(0, height, width, height);
		//piedra = new BufferedImage[1]; 
		piedra =	sheet.getSubimage(width, 0, width, height);
		//arbol = new BufferedImage[1];
		arbol = loadImage("/Textures/arbol.png");
		espadachin = loadImage("/Textures/Personajes/Soldado.png");
		paladin = loadImage("/Textures/Personajes/Paladin.png");
		arquero = loadImage("/Textures/Personajes/Arquero.png");
		monje = loadImage("/Textures/Personajes/Clerigo.png");
		mago = loadImage("/Textures/Personajes/mago.png");
		druida = loadImage("/Textures/Personajes/Druida.png");
		treant = loadImage("/Textures/Personajes/Treant.png");
		goblin=loadImage("/Textures/Personajes/Goblin.png");
		brujo=loadImage("/Textures/Personajes/OrcoBrujo.png");
		campeonEnano=loadImage("/Textures/Personajes/Campeon Enano.png");
		cazadorEnano=loadImage("/Textures/Personajes/Cazador Enano.png");
		oso=loadImage("/Textures/Personajes/Oso.png");
		grunt=loadImage("/Textures/Personajes/Grunt.png");
		vida[0] =loadImage("/Textures/VidaVerde.png");
		vida[1] =loadImage("/Textures/VidaRoja.png");
		vida[2] =loadImage("/Textures/VidaAzul.png");
		sheet = loadImage("/Textures/Animations/Goblin walk.png");
		goblinMove[0] = sheet.getSubimage(0, 0, 64, 64);
		goblinMove[1] = sheet.getSubimage(64, 0, 64, 64);
		goblinMove[2] = sheet.getSubimage(128, 0, 64, 64);
		goblinMove[3] = sheet.getSubimage(192, 0, 64, 64);
		sheet = loadImage("/Textures/Animations/Goblin attack.png");
		goblinAtk[0] = sheet.getSubimage(0, 0, 64, 64);
		goblinAtk[1] = sheet.getSubimage(64, 0, 64, 64);
		goblinAtk[2] = sheet.getSubimage(128, 0, 64, 64);
		goblinAtk[3] = sheet.getSubimage(192, 0, 64, 64);
		warriorAtk[0] = espadachin;
		warriorAtk[1] = espadachin;
		warriorAtk[2] = espadachin;
		warriorAtk[3] = espadachin;
		monkAtk[0] = monje;
		monkAtk[1] = monje;
		monkAtk[2] = monje;
		monkAtk[3] = monje;
		paladinAtk[0] = paladin;
		paladinAtk[1] = paladin;
		paladinAtk[2] = paladin;
		paladinAtk[3] = paladin;
		arqueroAtk[0] = arquero;
		arqueroAtk[1] = arquero;
		arqueroAtk[2] = arquero;
		arqueroAtk[3] = arquero;
		mageAtk[0] = mago;
		mageAtk[1] = mago;
		mageAtk[2] = mago;
		mageAtk[3] = mago;
		dwarfHunterAtk[0] = cazadorEnano;
		dwarfHunterAtk[1] = cazadorEnano;
		dwarfHunterAtk[2] = cazadorEnano;
		dwarfHunterAtk[3] = cazadorEnano;
		warlockAtk[0] = brujo;
		warlockAtk[1] = brujo;
		warlockAtk[2] = brujo;
		warlockAtk[3] = brujo;
		warlockMove[0] = brujo;
		warlockMove[1] = brujo;
		warlockMove[2] = brujo;
		warlockMove[3] = brujo;
		gruntAtk[0] = grunt;
		gruntAtk[1] = grunt;
		gruntAtk[2] = grunt;
		gruntAtk[3] = grunt;
		gruntMove[0] = grunt;
		gruntMove[1] = grunt;
		gruntMove[2] = grunt;
		gruntMove[3] = grunt;
		
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
	
}
