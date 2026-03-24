package ejercicio11;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Imagina que gestionas una escuela donde cada asignatura tiene un cupo máximo y fijo de 3 alumnos.
		 * Debes crear un HashMap<String, Alumno[]>. La clave es el nombre de la asignatura (String) y el valor 
		 * es un array de objetos de la clase Alumno (con atributos nombre y nota).
		 * 1. Implementa una clase CompararAlumnosPorNota que herede de Comparator<Alumno> para ordenar los arrays 
		 * manualmente (ya que Collections.sort solo funciona con listas ). 
		 * 2. Crea un método que recorra el mapa utilizando entrySet() y, para cada asignatura, ordene el array 
		 * de alumnos de mayor a menor nota antes de imprimirlo.
		 * Deberás manejar la lógica de que un array puede tener posiciones vacías (null) si el cupo no se llenó, 
		 * lo que requiere validaciones extra al comparar.
		 */

		Alumno a1 = new Alumno("Carlos", 8.5f);
		Alumno a2 = new Alumno("Pilar", 10);
		Alumno a3 = new Alumno("Clara", 9.5f);
		Alumno a4 = new Alumno("Lucia", 8f);
		Alumno a5 = new Alumno("Mario", 9.2f);
		Alumno a6 = new Alumno("Juan", 8.7f);
		Alumno a7 = new Alumno("Carmen", 7.9f);
		Alumno a8 = new Alumno("Lola", 7);
		
		Alumno[] alumnos = {a1, a2, a3, a4, a5, a6, a7, a8};
		
		HashMap<String, Alumno[]> mapaAlumnos = new HashMap<String, Alumno[]>();
		
		
		
	}

}