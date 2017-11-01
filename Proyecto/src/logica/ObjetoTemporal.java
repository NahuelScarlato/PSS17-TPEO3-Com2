package logica;

public class ObjetoTemporal {

	protected int reloj;
	protected Logica logica;
	
	public ObjetoTemporal(int reloj, Logica logica){
		this.reloj = reloj;
		this.logica = logica;
		this.logica.agregarObjetoTemporal(this);
	}
	
	public void decrementarReloj(){
		reloj--;
		if (reloj == 0){
			logica.agregarObjetoTemporalABorrar(this);
		}
		logica = null;
	}
	
}
