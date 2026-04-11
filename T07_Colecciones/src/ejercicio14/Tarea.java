package ejercicio14;

public class Tarea {
	/*
	 * Crea una clase Tarea (con descripcion y prioridad). 
	 * Usa un HashMap<String, Tarea[]> donde la clave es el nombre del proyecto.
	 * Cada proyecto comienza con un array de solo 2 posiciones. 
	 * Crea un método llamado añadirTarea(String proyecto, Tarea nuevaTarea).
	 */
	
	private String descripcion;
	private String prioridad;

	public Tarea() {
		super();
	}
	public Tarea(String descripcion, String prioridad) {
		super();
		this.descripcion = descripcion;
		this.prioridad = prioridad;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	@Override
	public String toString() {
		return "Tarea [descripcion=" + descripcion + ", prioridad=" + prioridad + "]";
	}

}