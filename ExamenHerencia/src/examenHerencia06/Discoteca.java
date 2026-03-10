package examenHerencia06;

import java.util.Arrays;

public class Discoteca {

	/*
	 * Se pretende desarrollar una aplicación que gestione una Discoteca de Música, donde se pueden alquilar y comprar discos 
	 * en diferentes formatos. La discoteca dispondrá de un número ilimitado de discos no repetidos (almacenados en un array). 
	 * Cada disco tiene un título y un artista únicos.
	 * 
	 * La clase discoteca tendrá:
	 * alquilarDisco(String titulo, String artista, Cliente c):Permite alquilar un disco físico, 
	 * verificando que no esté ya alquilado.Asigna el disco al cliente.
	 * 
	 * devolverDisco(String titulo, String artista, Cliente c):Permite devolver un disco físico.
	 * Verifica que el disco esté alquilado a ese cliente (por DNI).
	 * Si el disco no está alquilado o no pertenece al cliente, se muestra un mensaje de error.
	 * 
	 * descargarDisco(String titulo, String artista):Permite descargar un disco digital, incrementando el contador de descargas.
	 * 
	 * añadirDisco(Disco d):Añade un nuevo disco al sistema si no está repetido. Redimensiona el array si es necesario.
	 * 
	 * eliminarDisco(String titulo, String artista):Elimina el disco indicado.Si es físico y está alquilado, no se podrá eliminar.
	 * Si no existe, se indicará al usuario.
	 * 
	 * buscarDisco(String titulo, String artista):Devuelve todos los datos de un disco específico.
	 * 
	 * contarDescargas():Devuelve el total de descargas de discos digitales en la discoteca.
	 */
	
	Disco[] discos = new Disco[0]; // se ira redimensionando...

	public Discoteca() {
		super();
	}
	public Discoteca(Disco[] discos) {
		super();
		this.discos = discos;
	}
	
	public Disco[] getDiscos() {
		return discos;
	}
	public void setDiscos(Disco[] discos) {
		this.discos = discos;
	}
	
	@Override
	public String toString() {
		return "Discoteca [discos=" + Arrays.toString(discos) + "]";
	}

	// Permite alquilar un disco físico, verificando que no esté ya alquilado.Asigna el disco al cliente.
	public void alquilarDisco(String titulo, String artista, Cliente c) {
		
	}
	
	// Permite devolver un disco físico. Verifica que el disco esté alquilado a ese cliente (por DNI)
	public void devolverDisco(String titulo, String artista, Cliente c) {
		
	}
	
	// Permite descargar un disco digital, incrementando el contador de descargas.
	public void descargarDisco(String titulo, String artista) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < discos.length) {
			if (discos[cont].getTitulo().equalsIgnoreCase(titulo) && discos[cont].getArtista().equalsIgnoreCase(artista)) {
				encontrado = true;
				if (discos[cont] instanceof Digital) {
					Digital d = (Digital) discos[cont];
					d.setNumDescargas(d.getNumDescargas()+1);
					System.out.println("Descarga realizada correctamente.");
				} else {
					System.out.println("Este disco no es digital, no se puede descargar.");
				}
			}
			cont++;
		}	
		if (!encontrado) {
			System.out.println("Disco no encontrado.");
		}
	}
	
	// Añade un nuevo disco al sistema si no está repetido. Redimensiona el array si es necesario.
	public void añadirDisco(Disco d) {
		boolean repetido = false;
		int cont = 0;
		while (!repetido && cont < discos.length) {
			if (discos[cont].getTitulo().equalsIgnoreCase(d.getTitulo()) && discos[cont].getArtista().equalsIgnoreCase(d.getArtista())) {
				repetido = true;
				System.out.println("No se puede añadir, disco repetido.");
			}
			cont++;
		}
		if(!repetido) {
			Disco[] copy = Arrays.copyOf(discos, discos.length + 1);
			copy[copy.length-1] = d;
			discos = copy;
			System.out.println("El disco se ha añadido correctamente.");
		}
	}
	
	// Elimina el disco indicado.Si es físico y está alquilado, no se podrá eliminar. Si no existe, se indicará al usuario.
	public void eliminarDisco(String titulo, String artista) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < discos.length) {
			if (discos[cont].getTitulo().equalsIgnoreCase(titulo) && discos[cont].getArtista().equalsIgnoreCase(artista)) {
				encontrado = true;
				boolean sePuedeEliminar = true;
				if (discos[cont] instanceof Fisico) {
					Fisico f = (Fisico) discos[cont];
					if (f.isEstaAlquilado()) {
						sePuedeEliminar = false;
						System.out.println("No se puede eliminar el disco porque está alquilado.");
					}
				} 
				if (sePuedeEliminar) {
					Disco[] aux = new Disco[discos.length -1];
					int contAux = 0;
					for (int i = 0; i < discos.length; i++) {
						if (i != cont) {
							aux[contAux] = discos[i];
							contAux++;
						}
					}
					discos = aux;
					System.out.println("Disco eliminado correctamente.");
				}
			}
			cont++;
		}
		if (!encontrado) {
			System.out.println("Lo siento, no existe ningún disco con ese título y artista.");
		}
	}
	
	// Devuelve todos los datos de un disco específico.
	public void buscarDisco(String titulo, String artista) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < discos.length) {
			if (discos[cont].getTitulo().equalsIgnoreCase(titulo) && discos[cont].getArtista().equalsIgnoreCase(artista)) {
				encontrado = true;
				Disco d = discos[cont];
				d.mostrarInformacion();
			}
			cont++;
		}
		if (!encontrado) {
			System.out.println("Lo siento, no existe ningún disco con ese título y artista.");
		}
	}
	
	// Devuelve el total de descargas de discos digitales en la discoteca.
	public int contarDescargas() {
		int total = 0;
		for (int i = 0; i < discos.length; i++) {
			if (discos[i] instanceof Digital) {
				Digital d = (Digital) discos[i];
				total += d.getNumDescargas();
			}
		}
		return total;
	}
	
}