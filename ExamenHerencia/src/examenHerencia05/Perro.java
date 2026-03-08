package examenHerencia05;

public class Perro extends Mascota {
	/* 
	 * En el caso de los perros, se diferencian en tres tamaños: pequeño, mediano y grande. 
	 * calcularTarifa(int minutos)
	 * Pequeño → minutos * 2.0 € / 60
	 * Mediano → minutos * 3.0 € / 60
	 * Grande → minutos * 4.0 € / 60
	 * Si la mascota tiene un plan de membresía, se aplicará un descuento del 30% sobre la tarifa final
	 */
	
	private String tamanio; // pequenio, mediano o grande

	public Perro() {
		super();
	}
	public Perro(String tamanio) {
		super();
		this.tamanio = tamanio;
	}
	public Perro(String nombre, String raza, int edad, int minutosEstancia, int numChip, boolean planMembresia,
			String tamanio) {
		super(nombre, raza, edad, minutosEstancia, numChip, planMembresia);
		this.tamanio = tamanio;
	}

	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	@Override
	public String toString() {
		return "Perro [tamanio=" + tamanio + ", getNombre()=" + getNombre() + ", getRaza()=" + getRaza()
				+ ", getEdad()=" + getEdad() + ", getMinutosEstancia()=" + getMinutosEstancia() + ", getNumChip()="
				+ getNumChip() + ", isPlanMembresia()=" + isPlanMembresia() + "]";
	}

	@Override
	public double calcularTarifa(int minutos) {
		double tarifa = 0;
		if (tamanio.equalsIgnoreCase("pequenio")) {
			tarifa = (minutos * 2.0 / 60);
		} else if (tamanio.equalsIgnoreCase("mediano")) {
			tarifa = (minutos * 3.0 / 60);
		} else if (tamanio.equalsIgnoreCase("grande")) {
			tarifa = (minutos * 4.0 / 60);
		}
		if (isPlanMembresia()) {
			tarifa *= 0.70;
		}
		tarifa = Math.round(tarifa * 100.0) / 100.0;
		return tarifa;
	}
}