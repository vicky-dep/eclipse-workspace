package ejercicio010203;

public class Gato implements Comparable<Gato> {

	/*
	 * Define una clase Gato con atributos nombre, color y raza; 
	 * luego crea un ArrayList que almacene cuatro objetos de esta clase y muéstralos usando iterator.
	 * Implementación de Comparable: Modifica la clase Gato para que implemente la interfaz Comparable<Gato> 
	 * y añade el método compareTo necesario para permitir su ordenación.
	 * Criterio de ordenación: Implementa la lógica en el método compareTo para que los objetos Gato de una 
	 * lista se ordenen alfabéticamente por su nombre.
	 */
	
	private String nombre;
	private String color;
	private String raza;

	public Gato() {
		super();
	}
	public Gato(String nombre, String color, String raza) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + "]";
	}
	
	@Override
	public int compareTo(Gato o) {
		return nombre.compareTo(o.nombre);
	}
	
}