package objeto.noAtravesable;

public abstract class Personaje extends ObjetoConVida{
	//atributos
	protected int impacto;
	protected int alcance;
	protected int reloj;
	protected float velocidadAt;
	protected float velAtMaxima;
	
	//metodos
	public void atacar(ObjetoNoAtravesable o){}
	public int getAlcance(){
		return alcance;
	}
	public void modificarVelocidad(float rall){
		velocidadAt=(int)(rall*velAtMaxima);
	}
	public void aumentarReloj(){
		reloj=(reloj+1)%(int)(velocidadAt*60);
	}
}
