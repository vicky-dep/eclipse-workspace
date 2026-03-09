package examenDAMTipoA;

public abstract class Vehiculo {

	private String matricula;
	private double capacidadCarga;
	private double nivelCombustible;

	public Vehiculo() {
		super();
	}
	public Vehiculo(String matricula, double capacidadCarga, double nivelCombustible) {
		super();
		this.matricula = matricula;
		this.capacidadCarga = capacidadCarga;
		this.nivelCombustible = nivelCombustible;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public double getNivelCombustible() {
		return nivelCombustible;
	}
	public void setNivelCombustile(double nivelCombustible) {
		this.nivelCombustible = nivelCombustible;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", capacidadCarga=" + capacidadCarga + ", nivelCombustible="
				+ nivelCombustible + "]";
	}
	
	public abstract void realizarViaje(double distancia);
	
	public void repostar(double litros) {
		nivelCombustible += litros;
	}
	
	public void validarCarga(double cargaActual) {
		if(cargaActual <= 1000) {
			System.out.println("La carga actual del vehículo es correcta.");
		} else {
			System.out.println("La carga actual del vehículo NO es correcta, superas la carga máxima (1000kg).");
		}
	}
	
}