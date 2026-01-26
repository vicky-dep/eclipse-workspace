package ejercicio1;

public class Empleado {

	private String nombre;
	private String puesto;
	private int edad;
	private String experiencia;
	
	// tambien podria utilizar constantes para los 3 niveles posibles de experiencia (principiante, intermedio, avanzado) 
	
	// Constructor
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String puesto, int edad, String experiencia) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.edad = edad;
		this.experiencia = experiencia;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", puesto=" + puesto + ", edad=" + edad + ", experiencia=" + experiencia
				+ "]";
	}
}