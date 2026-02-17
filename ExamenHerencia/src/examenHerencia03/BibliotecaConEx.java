package examenHerencia03;

import examenHerencia02.Libro;

public class BibliotecaConEx {

	private Libro[] libros;
	private int capacidad;
	private int numLibros;

	public BibliotecaConEx(int capacidad) {
		this.capacidad = capacidad;
		this.libros = new Libro[capacidad];
		this.numLibros = 0;
	}

	public void agregarLibro(Libro libro) throws BibliotecaException {
		if (numLibros < capacidad) {
			libros[numLibros++] = libro;
		} else {
			System.out.println("No hay espacio en la biblioteca para más libros.");
			throw new BibliotecaException(BibliotecaException.BIBLIOTECA_LLENA);
		}
	}

	public void prestarLibro(String isbn) throws BibliotecaException {
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
		throw new BibliotecaException(BibliotecaException.LIBRO_PRESTADO);
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
}