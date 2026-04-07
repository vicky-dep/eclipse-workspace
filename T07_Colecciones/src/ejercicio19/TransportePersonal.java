package ejercicio19;

public class TransportePersonal extends Nave {

	/*
	 * TransportePersonal: Atributo int numeroPasajeros.
	 * Consumo: 50 unidades por pasajero. 
	 * Si el transporte lleva más de 10 pasajeros, el consumo total se reduce 
	 * un 5% gracias al sistema de soporte vital compartido.
	 */

	private int numeroPasajeros;
	
	public TransportePersonal() {
		super();
	}
	public TransportePersonal(int numeroPasajeros) {
		super();
		this.numeroPasajeros = numeroPasajeros;
	}
	public TransportePersonal(String codigoNave, String nombre, int anioFabricacion, boolean enMision,
			int numeroPasajeros) {
		super(codigoNave, nombre, anioFabricacion, enMision);
		this.numeroPasajeros = numeroPasajeros;
	}
	
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	@Override
	public String toString() {
		return super.toString() + "TransportePersonal [numeroPasajeros=" + numeroPasajeros + "]";
	}

	@Override
	public double calcularConsumoEnergia() {
		double consumo = 50 * numeroPasajeros;
		if (numeroPasajeros > 10) {
			consumo *= 0.95;
		}
		return consumo;
	}
	
}