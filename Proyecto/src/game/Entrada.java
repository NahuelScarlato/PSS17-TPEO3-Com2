/**
 * 
 */
package game;



/**
 * Representa un contenedor para componentes de puntajes.
 * @author Llano Jose, Scarlato Nahuel Hernan; Tecnologia de Programacion 2015.
 */
public class Entrada{
	private String clave;
	private int valor;
	private String date;
	
	
	/**
     * Construye una entrada,con su respectivo nombre,puntaje y tiempo de juego.
     * @param clave String.
     * @param valor int.
     * @param tiempo String.
     */
	public Entrada(String clave, int valor, String date ) {
		this.clave = clave;
		this.valor = valor;
		this.date=date;
		
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate( String d) {
		date=d;
	}
	
	 /**
     * Retorna la clave de la entrada.
     * @return clave String.
     */
	public String getKey(){
		return clave;
	}
	
	 /**
     * Retorna el valor de la entrada.
     * @return valor int.
     */
	public int getValue(){
		return valor;
	}
	
	/**
     * Modifica la clave con una clave pasada por parametro.
     * @param k String.
     */
	public void setKey(String k){
		clave=k;
	}
	
	/**
     * Modifica el valor con un valor pasado por parametro.
     * @param v int..
     */
	public void setValue(int v){
		valor=v;
	}
	
	 /**
     * Retorna el tiempo de la entrada.
     * @return tiempo String.
     */
	
}

