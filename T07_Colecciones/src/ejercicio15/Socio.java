package ejercicio15;

public class Socio {

	private String apodo;
	private String nombre;
	private int fechaIngreso; // ddmmyyyy

	public Socio() {
		super();
	}
	public Socio(String apodo, String nombre, int fechaIngreso) {
		super();
		this.apodo = apodo;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
	}
	
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(int fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String toString() {
		return "Socio [apodo=" + apodo + ", nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
}