package ejerciciosTransparencias;

public class Gestor {
	// Atributos privados
	private String nombre;
	private int telefono;
	private float maxAutorizado;
	
	// Constructores
	// sin parametros
	public Gestor() {
		super(); // metodo de la clase padre que se llama cuando se instancia con el constructor vacio
	}
	// con parametros
	public Gestor(String nombre, int telefono, float maxAutorizado) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.maxAutorizado = maxAutorizado;
	}
	
	// Getters / Setters 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public float getMaxAutorizado() {
		return maxAutorizado;
	}
	public void setMaxAutorizado(float maxAutorizado) {
		this.maxAutorizado = maxAutorizado;
	}
	
	@Override
	public String toString() {
		return "Gestor [nombre=" + nombre + ", telefono=" + telefono + ", maxAutorizado=" + maxAutorizado + "]";
	}

	
	
	
	

}
