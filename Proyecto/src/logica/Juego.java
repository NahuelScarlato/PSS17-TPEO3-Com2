package logica;

public class Juego {
	//atributos
	protected int monedas;
	protected int score;
	protected Tile[][] tablero;
	
	//constructor
	public Juego(){
		monedas=0;
		score=0;
		tablero=new Tile[6][15];
	}
	
	//metodos
	public int monedas(){
		return monedas;
	}
	public void setMonedas(int m){
		monedas=m;
	}
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
