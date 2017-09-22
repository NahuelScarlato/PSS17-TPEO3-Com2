package objeto.noAtravesable;

public abstract class OTConVida extends ObjetoConVida {
	//atributos
	protected int valor;
	
	//metodos
	public int getValor(){
		return valor;
	}
	public void serAtacado(Enemigo e){
		e.atacar(this);
	}
}
