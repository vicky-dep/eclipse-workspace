package ejercicio09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		/*
		 *  Crea un HashMap<Integer, String> que represente un registro de alumnos (ID y Nombre).
		 *  Obtén el Iterator del conjunto de entradas (entrySet()) del mapa. 
		 *  Recorre el diccionario y elimina todas las entradas cuya clave (ID) sea un número par.
		 */
		
		HashMap<Integer, String> alumnos = new HashMap<Integer, String>(); // Leticia lo llama mapaAlumnos
		
		alumnos.put(1, "Ana");
		alumnos.put(2, "Juan");
		alumnos.put(3, "Leticia");
		alumnos.put(4, "Daniel");
		alumnos.put(5, "Carlos");
		alumnos.put(6, "Maria");
		alumnos.put(7, "Lucia");
		
		System.out.println("Antes de eliminar ID pares: ");
		System.out.println(alumnos);
		System.out.println();
		
		// Obtenemos las claves del mapa para recorrerlo
		Set<Integer> claves = alumnos.keySet();
		// System.out.println(claves);
		// Recorremos el mapa con Iterator de claves
		Iterator<Integer> it = claves.iterator();
		while (it.hasNext()) {
			Integer c = (Integer) it.next();
			// Si la clave es par, se elimina del mapa
			if (c % 2 == 0) {
				it.remove(); // se debe usar el metodo de borrar con iterator
			}
		}
		System.out.println("Despues de eliminar ID pares: ");
		System.out.println(alumnos);
	}
}