package ejercicio1;

public class Plato {
	
	private String nombre;
	private String tipo; // puede ser entrada, principal y postre (tambien podria hacerse con constantes)
	private float precio; // usaria double pero en el main se uso float

	// Constructor
	public Plato() {
		super();
	}
	public Plato(String nombre, String tipo, float precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
		
}