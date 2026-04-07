package ejercicio19;

public class Carguero extends Nave {

	/*
	 * Carguero: Atributo double capacidadCarga.
	 * Consumo: 100 unidades por cada tonelada de capacidad. 
	 * Si la carga es superior a 1000 toneladas, se añade un coste fijo de 500 unidades extra.
	 */
	
	private double capacidadCarga;
	
	public Carguero() {
		super();
	}
	public Carguero(double capacidadCarga) {
		super();
		this.capacidadCarga = capacidadCarga;
	}
	public Carguero(String codigoNave, String nombre, int anioFabricacion, boolean enMision, double capacidadCarga) {
		super(codigoNave, nombre, anioFabricacion, enMision);
		this.capacidadCarga = capacidadCarga;
	}
	
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public String toString() {
		return super.toString() + "Carguero [capacidadCarga=" + capacidadCarga + "]";
	}

	@Override
	public double calcularConsumoEnergia() {
		double consumo = 100 * capacidadCarga;
		if (capacidadCarga > 1000) {
			consumo += 500;
		}
		return consumo;
	}
	
}