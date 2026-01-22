package ejercicio1;

import java.util.Arrays;

public class BibliotecaLeticia {
	
	private LibroLeticia l1 = new LibroLeticia("Orgullo y prejuicio", "Jane Austen", "novela", "adulto");
	private LibroLeticia[] estanteria = { l1, new LibroLeticia("Peppa pig", "desconocido", "acción", "infantil") };

	public LibroLeticia[] getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(LibroLeticia[] estanteria) {
		this.estanteria = estanteria;
	}

	@Override
	public String toString() {
		return "Biblioteca [estanteria=" + Arrays.toString(estanteria) + "]";
	}

	public void anadirLibro(LibroLeticia l) {
		// Comprobamos que el libro no exista en el array original
		int cont = 0;
		boolean encontrado = false;
		while (!encontrado && cont < estanteria.length) {
			if (l.equals(estanteria[cont])) {
				encontrado = true;
			}
			cont++;
		}
		if (!encontrado) {
			// Añadimos al array el libro nuevo
			LibroLeticia[] copy = Arrays.copyOf(estanteria, estanteria.length + 1);
			copy[copy.length - 1] = l;
			estanteria = copy;
			System.out.println("Libro añadido correctamente");
		} else {
			System.out.println("El libro está repetido, no se ha añadido");
		}
	}

	public LibroLeticia[] generarLibrosAleatorios(int cantidad) {
		LibroLeticia[] resultado = new LibroLeticia[0];
		resultado = obtenerLibrosAleatorios(cantidad, estanteria);
		return resultado;
	}

	private LibroLeticia[] obtenerLibrosAleatorios(int cantidad, LibroLeticia[] estanteria) {
		LibroLeticia[] resultado = new LibroLeticia[0];
		if (cantidad > estanteria.length) {
			System.out.println("No hay libros suficientes,te muestro los que tengo");
			resultado = estanteria;
		} else {
			int contAux = 0;
			while (contAux < cantidad) { // Nos permite crear el array resultado con los libros pedidos
				int pos = (int) (Math.random() * estanteria.length);
				LibroLeticia libro = estanteria[pos];
				int i = 0;
				boolean encontrado = false;
				while (i < resultado.length && !encontrado) {
					if (resultado[i].equals(libro)) {
						encontrado = true;
					}
					i++;
				}
				if (!encontrado) {
					LibroLeticia[] copy = Arrays.copyOf(resultado, resultado.length + 1);
					copy[copy.length - 1] = libro;
					resultado = copy;
					contAux++;
				} else {
					System.out.println("El libro ya existe");
				}
			}

		}
		return resultado;
	}

	public LibroLeticia[] generarListaPorTipo(String calificacion, int cantidad) {
		LibroLeticia[] resultado = new LibroLeticia[0];
		LibroLeticia[] librosFiltrados = new LibroLeticia[0];
		for (int i = 0; i < estanteria.length; i++) {
			if (estanteria[i].getCalificacion().equals(calificacion)) {
				LibroLeticia[] copy = Arrays.copyOf(librosFiltrados, librosFiltrados.length + 1);
				copy[copy.length - 1] = estanteria[i];
				librosFiltrados = copy;
			}
			// Una vez que tengo el array con los libros de la categoria elegida,
			// genero aleatoriamente el array resultado
			resultado = obtenerLibrosAleatorios(cantidad, librosFiltrados);
		}
		return resultado;
	}
}