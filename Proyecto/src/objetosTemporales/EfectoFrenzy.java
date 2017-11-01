package objetosTemporales;

import java.util.LinkedList;

import logica.Logica;
import logica.ObjetoTemporal;
import objeto.noAtravesable.objetoConVida.personaje.Aliado;

public class EfectoFrenzy extends ObjetoTemporal {

	private LinkedList<Aliado> aliados;
	private float modificador;
	
	public EfectoFrenzy(int reloj, Logica logica, float mod, LinkedList<Aliado> alis){
		super(reloj, logica);
		modificador = mod;
		aliados = alis;
	}
	
	protected void efecto(){
		for (Aliado ali: aliados){
			ali.modificarAtaque(modificador);
		}
	}
}
