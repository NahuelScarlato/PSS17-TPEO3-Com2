package game.gfx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import objeto.noAtravesable.objetoConVida.personaje.Enemigo;

public class AnimationEnemy extends Animation {

	protected BufferedImage movement[];
	protected int pixelTime;
	protected long movementTimer;
	protected Enemigo myEnemy;
	
	public AnimationEnemy(Enemigo enemy, int x, int y, float atSpd, float movSpd , BufferedImage[] att, BufferedImage[] mov){
		super(x,y,atSpd,att);
		movement = mov;
		pixelTime = (int) ((1000 * movSpd) / 64);
		movementTimer = 0;
		myEnemy = enemy;
	}

	public void drawMove(Graphics g){
		g.drawImage(movement[index], x, y, 64,64, null);
		movementTimer += System.currentTimeMillis() - lastTime;
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		if (movementTimer > pixelTime){
			x++;
			if (x % 64 == 0){
				myEnemy.switchMovementState();
			}
			if (x % 64 == 63){
				myEnemy.switchMovementState();
			}
			movementTimer = 0;
		}
		if (timer > indexTime){
			index = (index + 1) % totalImages;
			timer = 0;
		}
	}
}
