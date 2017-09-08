package logica.noAtravesable;

public abstract class Enemigo extends Personaje{
	//atributos
	protected int velocidad;
	protected static int vel;
	protected int puntaje;
	protected int maxCoins;
	protected int minCoins;
	
	//metodos
	public void atacar(Aliado a){
		a.restarVida(impacto);
	}
	public void atacar(OTConVida otcv){
		otcv.restarVida(impacto);
	}
	public void atacar(OMConVida omcv){
		omcv.restarVida(impacto);
	}
	public void atacar(Premio p){
		p.eliminar();
	}
	public void restarVelocidad(int v){
		velocidad-=v;
	}
	public void normalizarVelocidad(){
		velocidad=vel;
	}
}
