package logica;

public abstract class ObjetoTemporal {

	protected int reloj;
	protected Logica logica;
	
	public ObjetoTemporal(int reloj, Logica logica){
		this.reloj = reloj;
		this.logica = logica;
		this.logica.agregarObjetoTemporal(this);
	}
	
	protected abstract void efecto();
	
	protected abstract void efectoFinal();
	
	public void decrementarReloj(){
		reloj--;
		if (reloj == 0){
			efectoFinal();
			logica.agregarObjetoTemporalABorrar(this);
			logica = null;
		}
		efecto();
	}
	
}
