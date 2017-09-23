package objeto.noAtravesable;

public abstract class ObjetoConVida extends ObjetoNoAtravesable{
	//atributos
	protected int vida;
	protected static int maxVida;
	
	//metodos
	public void restarVida(int v){
		vida-=v;
		if(vida<=0){
			miTile.matar(this);
		}
	}
	public boolean vivo(){
		return vida>0;
	}
	public boolean fullVida(){
		return vida==maxVida;
	}
	
	public int getVida(){
		return vida;
	}
	
	public int getMaxVida(){
		return maxVida;
	}
}
