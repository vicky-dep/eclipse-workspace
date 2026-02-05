package ejercicio3;

public class Usuario {
	/**
	 * Crea una clase Usuario que tendrá un atributo estático (static) llamado totalUsuarios y uno no estático 
	 * llamado nombre.Demuestra que el atributo estático es igual para todos los objetos creados de la clase Usuario.
	 */
	
	private static int totalUsuarios = 50;
	private String nombre;
	
	// Constructor
	public Usuario() {
		super();
	}
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}
	// Getters & Setters
	public static int getTotalUsuarios() {
		return totalUsuarios;
	}
	public static void setTotalUsuarios(int totalUsuarios) {
		Usuario.totalUsuarios = totalUsuarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + "]";
	}
	
}