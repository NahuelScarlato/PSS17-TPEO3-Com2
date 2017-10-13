package game.gfx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Animation {
	
	protected BufferedImage ataque[];
	protected int x, y, index, totalImages, speed;
	protected long timer, lastTime;
	
	public Animation (int x, int y, BufferedImage[] anim){
		ataque = anim;
		this.x = x;
		this.y = y;
		timer = 0;
		index = 0;
		lastTime = System.currentTimeMillis();
		speed = 200;
	}
	
	public void drawrAtk(Graphics g){
		g.drawImage(ataque[index], x, y, 64,64, null);
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		if(timer > speed){
			index = (index + 1) % ataque.length;
			timer = 0;
		}
	}
	
}
