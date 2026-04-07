package ejercicio18;

public class Profesor implements Comparable<Profesor>{

	/*
	 * Se requiere implementar un programa para gestionar los Profesores asignados a diferentes Asignaturas en una universidad.
	 * La clase debe tener los siguientes atributos (todos String):
	 * nombre
	 * idEmpleado (Este atributo es único dentro de cada asignatura).
	 * especialidad (ej. "IA", "Cálculo", "Sistemas Operativos").
	 * Requerimientos de ordenación:
	 * Orden Natural: La clase debe implementar Comparable para ordenarse alfabéticamente por el nombre.
	 * Orden Alternativo: Crear una clase CompararPorId que implemente Comparator<Profesor> para ordenar por el idEmpleado.
	 */
	
	private String nombre;
	private String id;
	private String especialidad;

	public Profesor() {
		super();
	}
	public Profesor(String nombre, String id, String especialidad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.especialidad = especialidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", id=" + id + ", especialidad=" + especialidad + "]";
	}
	@Override
	public int compareTo(Profesor o) {
		return nombre.compareTo(o.nombre);
	}

}