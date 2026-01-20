package ejercicio03;

public class Persona {
	/*
	 * Crea una clase Persona que tenga los atributos nombre y edad. 
	 * Incluye un método para mostrar la información de la persona.
	 * Añade un método en la clase Persona que determine si la persona es mayor de edad (18 años o más).
	 */
	
	// Atributos
	private String nombre;
	private int edad;
	
	// Constructor
	public Persona() {
		super();
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Metodos
	// (con toString seria suficiente)
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}

	public boolean mayorEdad() {
		boolean esMayor = false;
		if (edad >= 18) {
			esMayor = true;
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");	
		}
		return esMayor;
	}	

	// Getter and Setter
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

	// ToString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}