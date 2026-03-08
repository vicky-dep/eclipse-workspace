package examenHerencia01;

import java.util.Arrays;

public class TiendaVideojuegos {

	private Videojuego[] videojuegos = new Videojuego[0]; // un solo array con el padre, y se podran almacenar tanto videojuegos fisicos como digitales

	public TiendaVideojuegos() {
		super();
	}
	public TiendaVideojuegos(Videojuego[] videojuegos) {
		super();
		this.videojuegos = videojuegos;
	}

	public Videojuego[] getVideojuegos() {
		return videojuegos;
	}
	public void setVideojuegos(Videojuego[] videojuegos) {
		this.videojuegos = videojuegos;
	}

	@Override
	public String toString() {
		return "TiendaVideojuegos [videojuegos=" + Arrays.toString(videojuegos) + "]";
	}
	
	// Implementación de los métodos
	public void alquilarJuego(String titulo, String desarrollador, Cliente c) {
		// si el videojuego esta alquilado es porque cliento NO esta a nulo
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < videojuegos.length) {
			// Comprobamos que en la posicion del array haya un videojuego fisico
			if (videojuegos[cont] instanceof Fisico) {
				Fisico vf = (Fisico) videojuegos[cont];
				if (vf.getTitulo().equalsIgnoreCase(titulo) && vf.getDesarrollador().equalsIgnoreCase(desarrollador)) {
					encontrado = true;
					if (vf.isEstadoAlquiler()) {
						System.out.println("No se puede alquilar el juego, lo tiene otro cliente.");
					} else {
						vf.setEstadoAlquiler(true);
						vf.setCliente(c);
						System.out.println("Has alquilado correctamente el videojuego.");
					}
				}
			}
			cont++;
		}
	}
	
	public void devolverJuego(String titulo, String desarrollador, Cliente c) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < videojuegos.length) {
			// Comprobamos que en la posicion del array haya un videojuego fisico
			if (videojuegos[cont] instanceof Fisico) { // miro que esa posicion del array sea una instancia de fisico
				Fisico vf = (Fisico) videojuegos[cont];
				if (vf.getTitulo().equalsIgnoreCase(titulo) && vf.getDesarrollador().equalsIgnoreCase(desarrollador)) {
					encontrado = true;
					Cliente clienteVid = vf.getCliente();
					if (clienteVid != null && clienteVid.getDni().equalsIgnoreCase(c.getDni())) {
						vf.setEstadoAlquiler(false);
						vf.setCliente(null);
					} else if (clienteVid == null) {
						System.out.println("El videojuego no esta alquilado.");
					} else {
						System.out.println("No coincide el cliente.");
					}
				}
			}
			cont++;
		}
	}
	
	public void descargarJuego(String titulo, String desarrollador) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < videojuegos.length) {
			if (videojuegos[cont] instanceof Digital) {
				// Si es digital comoprobamos que sea el titulo buscado
				Digital d = (Digital) videojuegos[cont];
				if (d.getTitulo().equalsIgnoreCase(titulo) && d.getDesarrollador().equalsIgnoreCase(desarrollador)) {
					encontrado = true;
					// El cambio hay que hacerlo sobre el objeto digital del array y no sobre la variable auxiliar d que se ha creado
					((Digital) videojuegos[cont]).setNumDescargas(d.getNumDescargas()+1);
					System.out.println("Se ha aumentado en una la descarga.");
				}
			}
			cont++;
		}
	}
	
	// Metodo generico (se le puede pasar desde el main tanto fisico como general)
	public void añadirJuego(Videojuego v) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < videojuegos.length) {
			if (videojuegos[cont] != null && videojuegos[cont].getDesarrollador().equalsIgnoreCase(v.getDesarrollador()) && videojuegos[cont].getTitulo().equalsIgnoreCase(v.getTitulo())) {
				encontrado = true;
				System.out.println("No se puede añadir, ya existe.");
			}
			cont++;
		}
		if (!encontrado) {
			Videojuego[] copy = Arrays.copyOf(videojuegos, videojuegos.length + 1);
			copy[copy.length - 1] = v;
			videojuegos = copy;
			System.out.println("Videojuego añadido correctamente.");
		}
	}
	
	public void eliminarJuego(String titulo, String desarrollador) {
		boolean encontrado = false;
		boolean alquilado = false;
		int cont = 0;
		while (!encontrado && cont < videojuegos.length) {
			if (videojuegos[cont].getTitulo().equalsIgnoreCase(titulo) && videojuegos[cont].getDesarrollador().equalsIgnoreCase(desarrollador)) {
				encontrado = true;
				if (videojuegos[cont] instanceof Fisico) {
					Fisico fisico = (Fisico) videojuegos[cont];
					if (fisico.isEstadoAlquiler()) {
						System.out.println("Esta alquilado no se puede eliminar.");
						alquilado = true;
					}
				}
			}
			cont++;
		}
		if (!encontrado) {
			System.out.println("El videojuego no existe, no se puede eliminar.");
		} else {
			// Eliminamos el videojuego
			Videojuego[] aux = new Videojuego[videojuegos.length -1];
			if (!alquilado) {
				int j = 0;
				for (int i = 0; i < videojuegos.length; i++) {
					if (i != (cont-1)) {
						aux[j] = videojuegos[i];
						j++;
					}
				}
				videojuegos = aux;
			}
		}
	}

	public void buscarJuego(String titulo, String desarrollador) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < videojuegos.length) {
			if (videojuegos[cont].getTitulo().equalsIgnoreCase(titulo) && videojuegos[cont].getDesarrollador().equalsIgnoreCase(desarrollador)) {
				encontrado = true;
				if (videojuegos[cont] instanceof Fisico) {
					Fisico f = (Fisico) videojuegos[cont];
					f.mostrarInformacion();
				} else if (videojuegos[cont] instanceof Digital) {
					Digital d = (Digital) videojuegos[cont];
					d.mostrarInformacion();
				}
			}
			cont++;
		}
	}
	
	public int contarDescargas() {
		int descargas = 0;
		for (int i = 0; i < videojuegos.length; i++) {
			Videojuego videojuego = videojuegos[i];
			if (videojuego instanceof Digital) {
				descargas += ((Digital) videojuego).getNumDescargas();
			}
		}
		return descargas;
	}
	
}