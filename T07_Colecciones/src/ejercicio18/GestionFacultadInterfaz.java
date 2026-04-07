package ejercicio18;

public interface GestionFacultadInterfaz {

	void asignarProfesor(String asignatura, Profesor prof);
	void darDeBajaProfesor(String asignatura, String idEmpleado);
	void cambiarEspecialidad(String asignatura, String idEmpleado, String nuevaEspecialidad);
	void listarProfesores(String asignatura, boolean porNombre);
	Profesor buscarProfesor(String asignatura, String idEmpleado);
	
}