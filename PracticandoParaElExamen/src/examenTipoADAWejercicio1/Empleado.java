package examenTipoADAWejercicio1;

public class Empleado {

	private String nombre;
	private int edad;
	private String puesto;
	private String experiencia;

	// Constructor
	public Empleado() {
		super();
	}
	public Empleado(String nombre, int edad, String puesto, String experiencia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.puesto = puesto;
		this.experiencia = experiencia;
	}

	// Getters & Setters
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
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", puesto=" + puesto + ", experiencia=" + experiencia
				+ "]";
	}
}