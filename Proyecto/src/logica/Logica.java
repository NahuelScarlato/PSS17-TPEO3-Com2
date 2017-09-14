package logica;

public class Logica {
	//atributos
	protected Tienda tienda;
	protected int score;
	protected Tile[][] tablero;
	
	//constructor
	public Logica(){
		score=0;
		tablero=new Tile[6][12];
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
