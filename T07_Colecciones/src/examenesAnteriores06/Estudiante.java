package examenesAnteriores06;

public class Estudiante implements Comparable<Estudiante> {

	/*
	 * La clase Estudiante tendrá como atributos nombre y DNI (este único dentro del array).
	 * Ambas variables serán de tipo String.
	 * Los estudiantes se ordenarán de forma natural por el nombre. 
	 * Además se necesita también ordenar por DNI.
	 */

	private String nombre;
	private String dni;

	public Estudiante() {
		super();
	}
	public Estudiante(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
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
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	@Override
	public int compareTo(Estudiante e) {
		return nombre.compareTo(e.nombre);
	}
	
}