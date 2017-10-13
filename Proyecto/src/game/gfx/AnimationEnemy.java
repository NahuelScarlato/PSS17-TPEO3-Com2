package game.gfx;

import java.awt.image.BufferedImage;

public class AnimationEnemy extends Animation {

	protected BufferedImage movimiento[];
	
	public AnimationEnemy(int n1, int n2, int x, int y){
		super(n1,x,y);
		movimiento = new BufferedImage[n2];
	}
}
