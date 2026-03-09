package repasoHerencia01;

public class Coche extends Vehiculo {
	/*
	 * Coche:
	 * Atributo extra: int numPuertas.
	 * Redefine mostrarDetalles() para que imprima la marca, el modelo y también el número de puertas.
	 * Sobrescribe conducir() :"Conduciendo un coche de [puertas] puertas".
	 */
	
	private int numPuertas;

	public Coche() {
		super();
	}
	public Coche(int numPuertas) {
		super();
		this.numPuertas = numPuertas;
	}
	public Coche(String marca, String modelo, int numPuertas) {
		super(marca, modelo);
		this.numPuertas = numPuertas;
	}
	
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Coche [numPuertas=" + numPuertas + "]";
	}
	
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Numero de puertas: " + numPuertas);
	}
	
	@Override
	public void conducir() {
		System.out.println("Conduciendo un coche de " + numPuertas + " puertas");
	}
	
}