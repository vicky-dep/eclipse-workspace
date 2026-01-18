package ejercicio10;

import java.util.Arrays;

public class Biblioteca {

	private Libro[] libros = new Libro[20];

	// Constructor
	public Biblioteca() {
		super();
	}

	@Override
	public String toString() {
		return "Biblioteca [libros=" + Arrays.toString(libros) + "]";
	}
	
	public void anadirLibro(Libro l) {
        int pos = 0;
        boolean añadido = false;
        while (pos < libros.length && !añadido) {
            if (libros[pos] == null) {
                libros[pos] = l;
                añadido = true;
                System.out.println("Libro añadido correctamente");
            }
            pos++;
        }
        if (!añadido) {
            System.out.println("La biblioteca está llena");
        }
    }
	
    public void eliminarLibro(String titulo) {
        int pos = 0;
        boolean eliminado = false;
        while (pos < libros.length && !eliminado) {
            if (libros[pos] != null &&
                libros[pos].getTitulo().equalsIgnoreCase(titulo)) {
                libros[pos] = null;
                eliminado = true;
                System.out.println("Libro eliminado correctamente");
            }
            pos++;
        }
        if (!eliminado) {
            System.out.println("El libro no existe en la biblioteca");
        }
    }
    
    public void buscarPorAutor(String autor) {
        boolean encontrado = false;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null &&
                libros[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libros[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros de ese autor");
        }
    }
    
    public void mostrarLibros() {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                System.out.println(libros[i]);
            }
        }
    }
	
}