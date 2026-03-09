package examenDAMTipoA;

public class Furgoneta extends Vehiculo {

	private boolean isRefrigerada;
	
	public Furgoneta() {
		super();
	}
	public Furgoneta(boolean isRefrigerada) {
		super();
		this.isRefrigerada = isRefrigerada;
	}
	public Furgoneta(String matricula, double capacidadCarga, double nivelCombustile, boolean isRefrigerada) {
		super(matricula, capacidadCarga, nivelCombustile);
		this.isRefrigerada = isRefrigerada;
	}

	public boolean isRefrigerada() {
		return isRefrigerada;
	}
	public void setRefrigerada(boolean isRefrigerada) {
		this.isRefrigerada = isRefrigerada;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Furgoneta [isRefrigerada=" + isRefrigerada + "]";
	}
	
	@Override
	public void realizarViaje(double distancia) {
		double combustibleDespuesViaje = getNivelCombustile() - 0.1 * distancia;
		if(isRefrigerada) {
			combustibleDespuesViaje *= 0.9;
		}
		if(combustibleDespuesViaje > 0) {
			setNivelCombustile(combustibleDespuesViaje);			
			System.out.println("Se ha disminuido el nivel de combustible.");
		} else {
			System.out.println("El combustible no es suficiente para realizar el viaje.");
		}
	}

}