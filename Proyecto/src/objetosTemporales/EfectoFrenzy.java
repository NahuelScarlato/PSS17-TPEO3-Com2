package objetosTemporales;

import java.util.LinkedList;
import logica.Logica;
import logica.ObjetoTemporal;
import objeto.noAtravesable.objetoConVida.personaje.aliado.Aliado;

public class EfectoFrenzy extends ObjetoTemporal {

	private LinkedList<Aliado> aliados;
	private float modificador;
	
	public EfectoFrenzy(int reloj, float mod, LinkedList<Aliado> alis){
		super(reloj);
		modificador = mod;
		aliados = alis;
	}
	
	public void efectoInicial(){
		for (Aliado ali: aliados){
			ali.modificarAtaque(modificador);	
		}
		System.out.print("Modifique "+ aliados.size() + "Objetos");
	}
	
	public void efecto(){}
	
	public void efectoFinal(){
		for (Aliado ali: aliados){
			ali.normalizarAtaque();
		}
		System.out.print("Modifique "+ aliados.size() + "Objetos");
	}
}
