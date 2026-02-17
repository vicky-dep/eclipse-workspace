package examenHerencia02;

import java.util.Arrays;

public class Biblioteca {

	private Libro[] libros;
	private int capacidad;
	private int numLibros;
			
	// Constructor
	public Biblioteca(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.libros = new Libro[capacidad];
		this.numLibros = 0;
		// agregarLibro(new Enciclopedia("ISBN004", "Enciclopedia Universal Ilustrada", "Varios autores", 5000, false, 10));
		// agregarLibro(new Novela("ISBN001", "Don Quijote de la Mancha", "Miguel de Cervantes", 863, false, "ficcion"));
	}

	@Override
	public String toString() {
		return "Biblioteca [capacidad=" + capacidad + ", libros=" + Arrays.toString(libros) + "]";
	}
	
	// Metodo subido a classroom por Leticia, aunque el correcto seria el siguiente que verifica que no se agregue si ya esta registrado ISBN...
	public void agregarLibro(Libro libro) {
		if (numLibros < capacidad) {
			libros[numLibros++] = libro;
		} else {
			System.out.println("No hay espacio en la biblioteca para más libros.");
		}
	}
	/*
	public void agregarLibro(Libro libro) {
		// No puede haber dos libros con el mismo ISBN
		boolean repetido = false;
		int i = 0;
		while (!repetido && i < libros.length) {
			if (libros[i] != null && libros[i].getCodigoISBN().equalsIgnoreCase(libro.getCodigoISBN())) {
				repetido = true;
			}
			i++;
		}
		if (repetido) {
			System.out.println("No se puede agregar: ISBN repetido.");
		} else if (libros.length >= capacidad) {
			System.out.println("No se puede agregar: biblioteca llena.");
		} else {
			Libro[] copy = Arrays.copyOf(libros, libros.length + 1);
			copy[copy.length - 1] = libro;
			libros = copy;
			System.out.println("Libro agregado correctamente.");
		}
	}
	 */

	public void prestarLibro(String isbn) {
		for (int i = 0; i < numLibros; i++) {
			if (libros[i].getCodigoISBN().equals(isbn) && !libros[i].isEnPrestamo()) {
				libros[i].prestar();
				System.out.println("Libro prestado: " + libros[i].getTitulo());
				libros[i] = libros[numLibros - 1];
				libros[numLibros - 1] = null;
				numLibros--;
				return;
			}
		}
		System.out.println("Libro no disponible para préstamo.");
	}

	public void devolverLibro(Libro libro, int diasRetraso, boolean esSocioPremium) {
		if (numLibros >= capacidad) {
			System.out.println("No se puede devolver el libro, la biblioteca está llena.");
			return;
		}
		double multa = libro.calcularMulta(diasRetraso, esSocioPremium);
		libro.devolver();
		libros[numLibros++] = libro;
		System.out.println("Libro devuelto: " + libro.getTitulo() + " | Multa: " + multa + "€");
	}
	
	/* Prueba de clase con Juan (16/02 - faltó Leticia)
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		try {
			Libro novela = new Novela("700-123434-135476", "Novela1", "Autor1", 100, "No vale");
		} catch (NovelaGeneroException e) {
			System.out.println(e.getMessage());
		}
	}

	private Libro buscarLibro(String isbn) {
		Libro libro = null;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getCodigoISBN().equalsIgnoreCase(isbn)) {
				libro = libros[i];
				break;
			}
		}
		return libro;
	}

	public void prestarLibro(String isbn) {
		Libro libroEncontrado = buscarLibro(isbn);
		if(libroEncontrado != null && !libroEncontrado.isEnPrestamo()) {
			libroEncontrado.setEnPrestamo(true);
		}
	}
	
	public void devolverLibro(String isbn, int diasRetraso, boolean esSocioPremium) {
		
	}
	 * 
	 */
}