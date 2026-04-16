package lecturayescrituraJSON;

import java.util.ArrayList;

public class PersonaAsignatura {

	private String nombre;
	private String apellidos;
	private int edad;
	private ArrayList<Asignatura> asignaturas;

	public PersonaAsignatura() {
		super();
	}
	public PersonaAsignatura(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public PersonaAsignatura(String nombre, String apellidos, int edad, ArrayList<Asignatura> asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.asignaturas = asignaturas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	@Override
	public String toString() {
		return "PersonaAsignatura [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", asignaturas="
				+ asignaturas + "]";
	}

}