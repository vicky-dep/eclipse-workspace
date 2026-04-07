package ejercicio19;

public class Sonda extends Nave {

	/*
	 * Sonda: Atributo int numeroSensores.
	 * Consumo: Base de 500 unidades. Si tiene más de 5 sensores, el consumo aumenta un 15%.
	 */

	private int numeroSensores;
		
	public Sonda() {
		super();
	}
	public Sonda(int numeroSensores) {
		super();
		this.numeroSensores = numeroSensores;
	}
	public Sonda(String codigoNave, String nombre, int anioFabricacion, boolean enMision, int numeroSensores) {
		super(codigoNave, nombre, anioFabricacion, enMision);
		this.numeroSensores = numeroSensores;
	}
	
	public int getNumeroSensores() {
		return numeroSensores;
	}
	public void setNumeroSensores(int numeroSensores) {
		this.numeroSensores = numeroSensores;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Sonda [numeroSensores=" + numeroSensores + "]";
	}
	
	@Override
	public double calcularConsumoEnergia() {
		double consumo = 500;
		if (numeroSensores > 5) {
			consumo *= 1.15;
		}
		return consumo;
	}
	
}