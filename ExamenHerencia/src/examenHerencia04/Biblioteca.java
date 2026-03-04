package examenHerencia04;

import java.util.Arrays;

public class Biblioteca {
	/*
	 * Esta Biblioteca dispondrá de un número ilimitado de libros no repetidos (array). 
	 * Los títulos y los autores de los libros son únicos.No puede haber dos libros con el mismo título y autor en el array. 
	 * 
	 * La clase Biblioteca tendrá los siguientes métodos:
	 * 
	 * prestarLibro(String titulo,String autor, Persona p): Te indica si se puede prestar el libro físico 
	 * indicado por el título y autor. Para ello debe comprobar que no esté prestado. Cuando se preste el 
	 * libro se le debe asignar a la persona que lo pide prestado. 
	 * 
	 * devolverLibro(String titulo,String autor, Persona p): Te indica si puedes devolver un libro físico. 
	 * Para ello debe comprobar que ese libro está prestado a la persona que se pasa por parámetro. Una 
	 * persona queda identificada por el DNI. Si ese libro no está prestado o no coincide la persona se 
	 * debe de avisar al usuario. 
	 * 
	 * descargarLibro(String titulo, String autor): Permite descargar un libro digital. Aumentará el 
	 * número de descargas en 1.
	 * 
	 * añadirLibro(Libro l): Se añade un libro no repetido en el array (redimensión del array)
	 * 
	 * eliminarLibro(String titulo, String autor): Elimina el libro pasado como parámetro.Si el libro es físico 
	 * y está prestado no se puede eliminar. Si no existe o no se puede eliminar se le indicará al usuario.
	 * 
	 * buscarLibro(String titulo, String autor): Devuelve todos los datos del libro buscado.
	 * 
	 * contarDescargas(): Devuelve el número de descargas totales que ha tenido la biblioteca.
	 */
	
	private Libro[] libros = new Libro[0]; // un solo array con el padre, se podrán almacenar tanto físicos como digitales
	
	public Biblioteca() {
		super();
	}
	public Biblioteca(Libro[] libros) {
		super();
		this.libros = libros;
	}

	public Libro[] getLibros() {
		return libros;
	}
	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}
	
	@Override
	public String toString() {
		return "Biblioteca [libros=" + Arrays.toString(libros) + "]";
	}
	
	public void prestarLibro(String titulo, String autor, Persona p) {
		// si el libro esta prestado es porque persona NO esta a nulo
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < libros.length) {
			// Comprobamos que en la posicion del array haya un libro fisico
			if (libros[cont] instanceof Fisico) {
				Fisico lf = (Fisico) libros[cont];
				if (lf.getTitulo().equalsIgnoreCase(titulo) && lf.getAutor().equalsIgnoreCase(autor)) {
					encontrado = true;
					if (lf.isPrestado()) {
						System.out.println("No se puede prestar el libro, lo tiene otro cliente.");
					} else {
						lf.setPrestado(true);
						lf.setPersona(p);
						System.out.println("Has tomado en préstamo el libro correctamente.");
					}
				}
			}
			cont++;
		}
		if (!encontrado) {
		    System.out.println("No existe un libro físico con ese título y autor.");
		}
	}
	
}