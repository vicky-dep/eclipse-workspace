package examenHerencia05;

public class Gato extends Mascota {
	/*
	 * En el caso de los gatos, se clasificarán en pelo corto o pelo largo.
	 * calcularTarifa(int minutos)
	 * Pelo corto → minutos * 1.5 € / 60
	 * Pelo largo → minutos * 2.5 € / 60
	 * Si la mascota tiene un plan de membresía, se aplicará un descuento del 30% sobre la tarifa final
	 */
	
	private String pelo; // corto o largo
	
	public Gato() {
		super();
	}
	public Gato(String pelo) {
		super();
		this.pelo = pelo;
	}
	public Gato(String nombre, String raza, int edad, int minutosEstancia, int numChip, boolean planMembresia,
			String pelo) {
		super(nombre, raza, edad, minutosEstancia, numChip, planMembresia);
		this.pelo = pelo;
	}

	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	
	@Override
	public String toString() {
		return "Gato [pelo=" + pelo + ", getNombre()=" + getNombre() + ", getRaza()=" + getRaza() + ", getEdad()="
				+ getEdad() + ", getMinutosEstancia()=" + getMinutosEstancia() + ", getNumChip()=" + getNumChip()
				+ ", isPlanMembresia()=" + isPlanMembresia() + "]";
	}
	
	@Override
	public double calcularTarifa(int minutos) {
		double tarifa = 0;
		if (pelo.equalsIgnoreCase("corto")) {
			tarifa = (minutos * 1.5 / 60);
		} else if (pelo.equalsIgnoreCase("largo")) {
			tarifa = (minutos * 2.5 / 60);
		}
		if (isPlanMembresia()) {
			tarifa *= 0.70;
		}
		tarifa = Math.round(tarifa * 100.0) / 100.0;
		return tarifa;
	}
	
}