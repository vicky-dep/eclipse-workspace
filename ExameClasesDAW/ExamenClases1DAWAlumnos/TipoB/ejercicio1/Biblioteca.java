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
	
	// otra forma:
	// private Libro l1 = new Libro("Orgullo y prejuicio", "Jane Austen", "adultos", "novela");
	// private LIbro[] estanteria = {l1, new Libro("Peppa pig", "desconocido", "infantil", "cuento"};
	
	private int contador = 0;

	// Constructor
	/*public Biblioteca() {
		super();
	}*/
	
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
		// Comprobamos que el libro no exista en el array original
		/*
		int cont = 0;
		boolean encontrado = false;
		while (!encontrado && cont<estanteria.length) {
			if (l.equals(estanteria[cont])) {
				encntrado = true;
			}
			cont++;
		}
		if (!encontrado) {
			Libro[] copy = Arrays.copyOf(estanteria, estanteria.length+1);
			copy[copy.length-1] = l;
			estanteria = copy;
			contador++;
			System.out.println("Libro agregado correctamente");
		} else {
			System.out.println("El libro esta repetido, no se ha agregado");
		}
		*/
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
	            Libro[] copy = Arrays.copyOf(resultado, resultado.length + 1);
	            copy[copy.length - 1] = libro;
	            resultado = copy;
	            anadidos++;
	        }
	    }
	    return resultado;
	}
	
	// TERMINAR!!!
	/*public Libro[] generarListaPorTipo(String calificacion, int cant) {
		Libro[] filtrados = new Libro[0];
		if (calificacion == Libro.CALIF_ADULTO) {
			for (int i = 0; i < contador; i++) {
				libros[i] = filtrados[i];
			}
		}
		return filtrados;
	}*/
	
	// si hubiese tiempo en el examen, intentar sacar codigo que se repite y generar un metodo privado
	
	/*
	public Libro[] generarListaPorTipo(String calificacion, int cant) {
		Libro[] resultado = new Libro[0];
		Libro[] librosFiltrados = new Libro [0];
		for (int i = 0; i < estanteria.length; i++) {
			if (estanteria[i].getCalificacion().equals(calificacion)) {
				Libro[] copy = Arrays.copyOf(librosFiltrados, librosFiltrados.length);
				copy[copy.length-1] = estanteria[i];
				librosFiltrados = copy;
			}
			// Una vez que tengo el array con los libros de la categoria elegida
			
		}
		return resultado;
	}
	*/
	
}