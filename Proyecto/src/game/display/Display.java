package game.display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import game.Game;

public class Display {

	private JFrame frame;
	private Canvas canvas;
	private Game myGame;
	private String title;
	private int width, height;
	private PanelTienda panel;
	
	
	public Display(String title, int width, int height, Game g){
		this.title = title;
		this.width = width;
		this.height = height;
		myGame = g;
		createDisplay();
	}
	
	private void createDisplay(){
		
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(new GridBagLayout());

		panel = new PanelTienda(myGame);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		
		canvas.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				click(e);
			}
		}
		);
		GridBagConstraints c=new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		frame.add(canvas,c);
		c.gridx=1;
		c.ipadx=width/4;
		frame.add(panel,c);
		frame.pack();
	}
	
	public Canvas getCanvas(){
		return canvas;
	}
	
	public void click(MouseEvent e){
		System.out.println(e.getX() + " " + e.getY());
		myGame.interaccion(e.getX(),e.getY());
	}
	

	public void actualizarPuntaje(int p){
		panel.actualizarPuntaje(p);
	}
}
