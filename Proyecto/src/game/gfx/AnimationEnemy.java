package game.gfx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class AnimationEnemy extends Animation {

	protected BufferedImage movement[];
	
	public AnimationEnemy(int x, int y, BufferedImage[] att, BufferedImage[] mov){
		super(x,y,att);
		movement = mov;
	}
	
	public void setMovementImage(BufferedImage img, int n){
		movement[n] = img;
	}
	
	public void drawMove(Graphics g){
		g.drawImage(movement[index], x, y, 64,64, null);
	}
}
