package logica;

public abstract class ObjetoConVida extends ObjetoNoAtravesable{
	//atributos
	protected int vida;
	
	//metodos
	public void restarVida(int v){
		vida-=v;
	}
	public boolean vivo(){
		return vida>0;
	}
}
