package examenHerencia04;

public class Persona {
	/*
	 * Persona quedará identificada con el nombre, DNI y teléfono.
	 */
	
	private String nombre;
	private String dni;
	private int telefono;
	
	public Persona() {
		super();
	}
	public Persona(String nombre, String dni, int telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}

}