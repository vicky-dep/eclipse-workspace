package ejercicio3;

public class Animales {

	private static int totalVendidos = 28;
	private String nombreAnimales;
	
	// Constructor
	public Animales() {
		super();
	}
	public Animales(String nombreAnimales) {
		super();
		this.nombreAnimales = nombreAnimales;
	}
	// Getters & Setters
	public static int getTotalVendidos() {
		return totalVendidos;
	}
	public static void setTotalVendidos(int totalVendidos) {
		Animales.totalVendidos = totalVendidos;
	}
	public String getNombreAnimales() {
		return nombreAnimales;
	}
	public void setNombreAnimales(String nombreAnimales) {
		this.nombreAnimales = nombreAnimales;
	}
	@Override
	public String toString() {
		return "Animales [nombreAnimales=" + nombreAnimales + "]";
	}
	
}