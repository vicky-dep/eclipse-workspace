package examenHerencia02;

import java.util.Arrays;

public class Biblioteca {

	private int capacidad;
	private Libro[] libros;
			
	// Constructor
	public Biblioteca() {
		super();
	}
	public Biblioteca(int capacidad, Libro[] libros) {
		super();
		this.capacidad = capacidad;
		this.libros = libros;
	}

	public Biblioteca(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.libros = new Libro[0];
		agregarLibro(new Enciclopedia("ISBN004", "Enciclopedia Universal Ilustrada", "Varios autores", 5000, false, 10));
		agregarLibro(new Novela("ISBN001", "Don Quijote de la Mancha", "Miguel de Cervantes", 863, false, "ficcion"));
	}
	
	// Getters & Setters
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public Libro[] getLibros() {
		return libros;
	}
	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}
	@Override
	public String toString() {
		return "Biblioteca [capacidad=" + capacidad + ", libros=" + Arrays.toString(libros) + "]";
	}
		
	// Metodos de la clase
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
	
}