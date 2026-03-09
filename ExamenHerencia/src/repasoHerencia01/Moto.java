package repasoHerencia01;

public class Moto extends Vehiculo {
	/*
	 * Moto:
	 * Atributo extra: int cilindrada.
	 * Redefine mostrarDetalles() para que imprima la marca, el modelo y la cilindrada.
	 * Sobrescribe conducir() : "Rugiendo moto de [cilindrada]cc".
	 */
	
	private int cilindrada;

	public Moto() {
		super();
	}
	public Moto(int cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}
	public Moto(String marca, String modelo, int cilindrada) {
		super(marca, modelo);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Moto [cilindrada=" + cilindrada + "]";
	}
	
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Cilindrada: " + cilindrada);
	}
	
	@Override
	public void conducir() {
		System.out.println("Rugiendo moto de " + cilindrada + "cc");	
	}
	
}