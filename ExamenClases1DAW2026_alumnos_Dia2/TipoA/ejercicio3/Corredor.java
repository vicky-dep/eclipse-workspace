package ejercicio3;

public class Corredor {

	// Atributos
	private String nombre;
	private static int totalCorredores = 0;
	
	// Constructor
	public Corredor() {
		super();
	}
	public Corredor(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static int getTotalCorredores() {
		return totalCorredores;
	}
	public static void setTotalCorredores(int totalCorredores) {
		Corredor.totalCorredores = totalCorredores;
	}

	// toString
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + "]";
	}
}