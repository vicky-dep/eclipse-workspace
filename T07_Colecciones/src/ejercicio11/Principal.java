package ejercicio11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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
		
		HashMap<String, Alumno[]> mapaAlumnos = new HashMap<String, Alumno[]>();
		
		anadirAlumnos("Matematicas", new Alumno("Luis", 6.7f), mapaAlumnos);
		anadirAlumnos("Matematicas", new Alumno("Juan", 5), mapaAlumnos);
		anadirAlumnos("Lengua", new Alumno("Ana", 8), mapaAlumnos);
		anadirAlumnos("Lengua", new Alumno("Carmen", 9.5f), mapaAlumnos);
		anadirAlumnos("Lengua", new Alumno("Santi", 5), mapaAlumnos);
		
		System.out.println("Sin ordenar:");
		System.out.println(Arrays.toString(mapaAlumnos.get("Matematicas")));
		System.out.println(Arrays.toString(mapaAlumnos.get("Lengua")));
		System.out.println(mapaAlumnos);
		
		ordenarMapa(mapaAlumnos);
		System.out.println("Ordenado:");
		System.out.println(Arrays.toString(mapaAlumnos.get("Matematicas")));
		System.out.println(Arrays.toString(mapaAlumnos.get("Lengua")));
		
	}

	private static void ordenarMapa(HashMap<String, Alumno[]> mapaAlumnos) {
		Set<String> claves = mapaAlumnos.keySet();
		// Con el iterator recorreremos por las clases el mapa
		// obtenemos el array asociado a cada clave
		// Ordenamos y ponemos de nuevo a esa clave el array ordenado(...)
		
		Iterator<String> it = claves.iterator();
		CompararAlumnosPorNota comparador = new CompararAlumnosPorNota();
		while (it.hasNext()) {
			String clave = (String) it.next();
			Alumno [] alumnos = mapaAlumnos.get(clave);
			Arrays.sort(alumnos, comparador);
			mapaAlumnos.put(clave, alumnos); // Importante hacer put en el mapa para que se vean los cambios (en este caso la ordenacion del array)
		}
	}

	private static void anadirAlumnos(String asignatura, Alumno alumno, HashMap<String, Alumno[]> mapaAlumnos) {
		if (mapaAlumnos.containsKey(asignatura)) {
			// Ya esta dada de alta la asignatura en el mapa
			// Se añade el alumno si hay algun hueco nulo en el array
			int cont = 0;
			boolean encontrado = false;
			Alumno[] alumnos = mapaAlumnos.get(asignatura);
			while (cont < alumnos.length && !encontrado) {
				if (alumnos[cont] == null) {
					alumnos[cont] = alumno;
					mapaAlumnos.put(asignatura, alumnos);
					encontrado = true;
				}
				cont++;
			}
		} else { // No esta la asignatura dada de alta
			// Construimos el array asociado a la asignatura(clave)
			Alumno [] a = new Alumno[3]; // El ejercicio indica que son 3 posiciones
			a[0] = alumno; // Añadimos el alumno al array
			mapaAlumnos.put(asignatura, a); // Añadimos al mapa la asignatura que no estaba junto con su array de alumnos
		}
		
	}

}