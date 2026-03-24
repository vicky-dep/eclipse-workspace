package ejercicio11;

public class Alumno {

	private String nombre;
	private float nota;

	public Alumno() {
		super();
	}
	public Alumno(String nombre, float nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}
		
}