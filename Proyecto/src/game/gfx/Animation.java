package game.gfx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Animation {
	
	protected BufferedImage ataque[];
	protected int x, y, index, totalImages, speed;
	protected long timer, lastTime, now;
	
	//Hacer los constructores sin los arreglos por parametro, y hacer seters para los arreglos.
	
	public Animation (int x, int y, float spd , BufferedImage[] anim){
		ataque = anim;
		this.x = x;
		this.y = y;
		timer = 0;
		index = 0;
		lastTime = System.currentTimeMillis();
		speed = (int) (spd * 1000 / 64);
		System.out.println("Velocidad: "+ spd+ " * 100 = "+ speed);
	}
	
	public void drawrAtk(Graphics g){
		g.drawImage(ataque[index], x, y, 64,64, null);
		now = System.currentTimeMillis();
		timer += now - lastTime;
		lastTime =	now;
		if(timer > speed){
			index = (index + 1) % ataque.length;
			timer = 0;
		}
	}
	
}
