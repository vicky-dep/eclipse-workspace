package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		Libro l1 = new Libro("Don Quijote de la Mancha", "Cervantes", "isbn-r");
		Libro l2 = new Libro("Drácula", "Bram Stoker", "isbn-v");
		Libro l3 = new Libro("Moby Dick", "Herman Melville", "isbn-a");
		Libro l4 = new Libro("La Galatea", "Cervantes", "isbn-b");

		libros.add(l1);
		libros.add(l2);
		libros.add(l3);
		libros.add(l4);
		
		// Algo asi de ordenacion podria caer en el examen de interfaces!
		
		System.out.println("Lista sin ordenar: ");
		System.out.println(libros);
		
		System.out.println("Orden natural (isbn): ");
		Collections.sort(libros);
		System.out.println(libros);
		
		System.out.println("Orden con comparator: ");
		// LibroComparator lc = new LibroComparator();
		// Si voy a utilizar mas de una vez el comparator es mejor crear el objeto solo una vez
		// Collections.sort(libros, lc);
		Collections.sort(libros, new LibroComparator());
		System.out.println(libros);
		
	}

}