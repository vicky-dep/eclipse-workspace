package examenDAMTipoA;

public class Camion extends Vehiculo {

	private int numeroEjes;
	
	public Camion() {
		super();
	}
	public Camion(int numeroEjes) {
		super();
		this.numeroEjes = numeroEjes;
	}
	public Camion(String matricula, double capacidadCarga, double nivelCombustile, int numeroEjes) {
		super(matricula, capacidadCarga, nivelCombustile);
		this.numeroEjes = numeroEjes;
	}

	public int getNumeroEjes() {
		return numeroEjes;
	}
	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}

	@Override
	public String toString() {
		return super.toString() + "Camion [numeroEjes=" + numeroEjes + "]";
	}
	
	@Override
	public void realizarViaje(double distancia) {
		double combustibleDespuesViaje = getNivelCombustile() - 0.3 * distancia;
		if(combustibleDespuesViaje > 0) {
			setNivelCombustile(combustibleDespuesViaje);			
			System.out.println("Se ha disminuido el nivel de combustible.");
		} else {
			System.out.println("El combustible no es suficiente para realizar el viaje.");
		}
	}

}