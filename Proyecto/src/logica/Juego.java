package logica;

public class Juego {
	//atributos
	protected Tienda tienda;
	protected int score;
	protected Tile[][] tablero;
	
	//constructor
	public Juego(){
		score=0;
		tablero=new Tile[6][15];
	}
	
	//metodos
	public int score(){
		return score;
	}
	public void setScore(int s){
		score=s;
	}
	public Tile getTile(int f, int c){
		return tablero[f][c];
	}
}
