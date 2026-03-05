package ejerciciosNoEvaluables11;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {
	/*
	 * Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad y número de goles. Implementar:
	 * Un constructor y los métodos toString() y equals () (este último basado en el DNI).
	 * La interfaz Comparable con un criterio de ordenación basado también en el DNI.
	 * Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la edad.
	 * Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.
	 * Añadir un comparador que ordene los futbolistas por edades y, para aquellos que tienen la misma edad, por nombres.
	 */
	
	private String dni;
	private String nombre;
	private int edad;
	private int numGoles;
	
	public Futbolista() {
		super();
	}
	public Futbolista(String dni, String nombre, int edad, int numGoles) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumGoles() {
		return numGoles;
	}
	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}
	
	@Override
	public String toString() {
		return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numGoles=" + numGoles + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		return Objects.equals(dni, other.dni);
	}
	
	@Override
	public int compareTo(Futbolista f) {
		// Para String se compara con compareTo, para numeros se realiza la resta. Ambos devuelve un valor negativo, cero (si son iguales) o positivo
		return dni.compareTo(f.dni);
	}
	
}