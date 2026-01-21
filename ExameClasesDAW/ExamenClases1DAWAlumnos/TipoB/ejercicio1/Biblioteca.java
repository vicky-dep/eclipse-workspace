package ejercicio1;

import java.util.Arrays;

public class Biblioteca {
	/**
	 * 1.Diseña la clase Biblioteca, que almacena una lista de libros disponibles (representados
	 * por objetos de la clase Libro, que incluye nombre, autor ,calificación (infantil, adolescente,
	 * adulto) y género).Partirá de un array de Libro por defecto.Además la clase debe permitir
	 * añadir más libros al menú.(Redimensionar el array)
	 * Implementa dos métodos:
	 * 1. Uno que genere una lista aleatoria con n libros. Si el número de libros es mayor que
	 * los que existen en la biblioteca se mostrarán todos y un mensaje diciendo que no
	 * hay suficientes libros.
	 * 2. Crea un método que permita filtrar por calificación y genere una lista aleatoria de esa calificación
	 */

	// Atributos
	private Libro[] libros;
	
	private int contador = 0;

	// Constructor
	public Biblioteca() {
		super();
		libros = new Libro[0];
	}

	@Override
	public String toString() {
		return "Biblioteca [libros=" + Arrays.toString(libros) + "]";
	}
	
	// Metodos de la clase
	public void anadirLibro(Libro l) {
		Libro[] copy = Arrays.copyOf(libros, libros.length+1);
		copy[copy.length-1] = l;
		libros = copy;
		contador++;
		System.out.println("Libro agregado correctamente");
	}
	
	public Libro[] generarLibrosAleatorios(int cant) {
	    Libro[] resultado = new Libro[0];
	    int anadidos = 0;
	    if (cant > contador) {
	        System.out.println("No hay suficientes libros, se mostrarán todos");
	        cant = contador; // para que devuelva todos
	    }
	    while (anadidos < cant) {
	        int pos = (int) (Math.random() * contador); // 0..contador-1
	        Libro libro = libros[pos];
	        // No puede haber libros repetidos en una lista aleatoria
	        boolean encontrado = false;
	        int i = 0;
	        while (i < resultado.length && !encontrado) {
	            if (resultado[i] == libro) {
	                encontrado = true;
	            }
	            i++;
	        }
	        if (!encontrado) {
	            Libro[] copy = java.util.Arrays.copyOf(resultado, resultado.length + 1);
	            copy[copy.length - 1] = libro;
	            resultado = copy;
	            anadidos++;
	        }
	    }
	    return resultado;
	}
	
	public Libro[] generarListaPorTipo(String calificacion, int cant) {
		Libro[] filtrados = new Libro[0];
		// TERMINAR!!!
		return filtrados;
	}
}