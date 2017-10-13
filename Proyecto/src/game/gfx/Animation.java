package game.gfx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Animation {
	
	protected BufferedImage ataque[];
	protected int x, y, reloj, index, totalImages;
	
	public Animation (int n, int x, int y){
		ataque = new BufferedImage[n];
		this.x = x;
		this.y = y;
		reloj = 0;
		index = 0;
		totalImages = n;
	}
	
	public void dibujar(Graphics g){
		g.drawImage(ataque[index], x, y, null);
		
	}
}
