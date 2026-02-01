package ejercicio1;

import java.util.Arrays;

public class Playlist {

	/**
	 * 1.Diseña la clase Playlist, que almacena por defecto una lista de canciones (con título y 
	 * artista, representadas como objetos de una clase Canción).La clase tendrá una lista de 
	 * canciones por defecto.Además la clase debe permitir añadir más canciones que no estén
	 * repetidas(el array se debe ir redimensionando). Además, tendrá un método que genere
	 * una playlist aleatoria con n canciones sin repeticiones. Si n es mayor que el número de
	 * canciones disponibles, se incluirán todas las canciones y se le avisará al usuario de que ha
	 * añadido solo las que dispone. Finalmente, crea otro método que filtre canciones por artista y
	 * genere una playlist aleatoria de ese artista, con la cantidad indicada de canciones o todas si
	 * no hay suficientes.
	 */
	
	private Cancion[] canciones = {new Cancion("One Love", "Bob Marley"), new Cancion("Tu sin mi", "Dread Mar I")};

	@Override
	public String toString() {
		return "Playlist [canciones=" + Arrays.toString(canciones) + "]";
	}

	public void anadirCancion(Cancion c) {
		// solo se agregaran canciones que no esten repetidas
		boolean repetida = false;
		int pos = 0;
		while(!repetida && pos < canciones.length) {
			if (canciones[pos].equals(c)) {
				System.out.println("No se puede agregar la cancion, ya se encuentra en la playlist");
				repetida = true;
			}
			pos++;			
		}
		// redimensiono el array
		if (!repetida) {
			Cancion[] copy = Arrays.copyOf(canciones, canciones.length +1);
			copy[copy.length -1] = c;
			canciones = copy;
			System.out.println("Cancion agregada correctamente");			
		}
	}

	public Cancion[] generarLista(int n) {
		Cancion[] resultado = new Cancion[0];
		resultado = obtenerCancionesAleatorias(n, canciones);
		return resultado;
	}
	
	private Cancion[] obtenerCancionesAleatorias(int n, Cancion[] canciones) {
		Cancion[] resultado = new Cancion[0];
		if (n > canciones.length) {
			System.out.println("No hay suficientes canciones, te enseño las que tengo");
			resultado = canciones;
		} else {
			int contAux = 0;
			while(contAux < n) {
				int pos = (int) (Math.random() * canciones.length);
				Cancion cancion = canciones[pos];
				int i =0;
				boolean encontrado = false;
				while (!encontrado && i < resultado.length) {
					if (resultado[i].equals(cancion)) {
						encontrado = true;
					}
					i++;
				}
				if (!encontrado) {
					Cancion[] copy = Arrays.copyOf(resultado, resultado.length +1);
					copy[copy.length -1] = cancion;
					resultado = copy;
					contAux++;
				} else {
					System.out.println("Esa cancion ya se encuentra en la lista aleatoria");
				}
			}
		}
		return resultado;
	}

	public Cancion[] generarListaPorArtista(String artista, int n) {
		Cancion[] resultado = new Cancion[0];
		Cancion[] filtrados = new Cancion[0];
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].getArtista().equalsIgnoreCase(artista)) {
				Cancion[] copy = Arrays.copyOf(filtrados, filtrados.length +1);
				copy[copy.length -1] = canciones[i];
				filtrados = copy;
			}
		}
	    if (filtrados.length == 0) {
	        System.out.println("No hay canciones de ese artista");
	    } else {
	    	resultado = obtenerCancionesAleatorias(n, filtrados);	    	
	    }
		return resultado;
	}
}