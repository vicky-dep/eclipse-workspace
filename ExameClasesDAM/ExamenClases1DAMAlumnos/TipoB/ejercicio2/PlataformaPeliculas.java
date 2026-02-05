package ejercicio2;

import java.util.Arrays;

public class PlataformaPeliculas {
	
	/**
	 * Diseña una clase llamada PlataformaPeliculas que permita gestionar las películas online registradas en una plataforma. 
	 * El sistema debe ser capaz de almacenar hasta un máximo de 100 películas en un array, donde se almacena el título. 
	 * La clase debe implementar los siguientes métodos: 
	 * 1. Registrar película: Permite agregar una película a la plataforma, dado su título. Si el título ya está registrado, 
	 * muestra un mensaje indicando que no se puede registrar el mismo título dos veces. Si la plataforma está llena, 
	 * muestra un mensaje indicando que no se pueden registrar más películas.
	 * 2. Eliminar película: Permite eliminar una película registrada, dado su título. Si el título no se encuentra en la lista 
	 * de películas, muestra un mensaje de error. 
	 * 3. Consultar espacio disponible: Devuelve la cantidad de espacios disponibles para registrar más películas. 
	 * 4. Mostrar películas registradas: Muestra una lista de los títulos de todos las películas registradas en la biblioteca. 
	 * Si no hay películas registradas, muestra un mensaje indicando que la plataforma está vacía.
	 * 5. Buscar película: Recibe un título y verifica si ese título está registrado en la plataforma, devolviendo un mensaje 
	 * adecuado dependiendo de si está o no registrado.
	 */
	
	private final int MAXIMO = 100;
	private String[] peliculas = new String[MAXIMO];
	
	// Constructor
	public PlataformaPeliculas() {
		super();
	}
	public PlataformaPeliculas(String[] peliculas) {
		super();
		this.peliculas = peliculas;
	}
	// Getters & Setters
	public String[] getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(String[] peliculas) {
		this.peliculas = peliculas;
	}
	public int getMAXIMO() {
		return MAXIMO;
	}
	@Override
	public String toString() {
		return "PlataformaPeliculas [MAXIMO=" + MAXIMO + ", peliculas=" + Arrays.toString(peliculas) + "]";
	}
	
	// Metodos de la clase
	public void registrarPelicula(String titulo) {
		boolean repetida = false;
		int i = 0;
		while (!repetida && i < peliculas.length) {
			if (peliculas[i] != null && peliculas[i].equalsIgnoreCase(titulo)) {
				repetida = true;
			}
			i++;
		}
		if (repetida) {
			System.out.println("No se puede registrar el mismo titulo dos veces");
		} else {
			boolean agregada = false;
			int pos = 0;
			while (!agregada && pos < peliculas.length) {
				if (peliculas[pos] == null) {
					peliculas[pos] = titulo;
					agregada = true;
					System.out.println("Pelicula agregada correctamente");
				}
				pos++;
			}
			if (!agregada) {
				System.out.println("La plataforma esta llena, no se pueden agregar mas peliculas");
			}	
		}
	}
	
	public void eliminarPelicula(String titulo) {
		boolean eliminada = false;
		int i = 0;
		while (!eliminada && i < peliculas.length) {
			if (peliculas[i] != null && peliculas[i].equalsIgnoreCase(titulo)) {
				peliculas[i] = null;
				System.out.println("Pelicula eliminada correctamente");
				eliminada = true;
			}
			i++;
		}
		if (!eliminada) {
			System.out.println("Error: no se puede eliminar una pelicula que no se encuentra en la plataforma");
		}
		
	}
	
	public int consultarEspacio() {
		int vacio = 0;
		for (int i = 0; i < peliculas.length; i++) {
			if (peliculas[i] == null) {
				vacio++;
			}
		}
		return vacio;
	}
	
	public void mostrarPeliculasAlmacenadas() {
		String[] peliculasAlmacenadas = new String[0];
		for (int i = 0; i < peliculas.length; i++) {
			if (peliculas[i] != null) {
				String[] copy = Arrays.copyOf(peliculasAlmacenadas, peliculasAlmacenadas.length +1);
				copy[copy.length -1] = peliculas[i];
				peliculasAlmacenadas = copy;
			}
		}
		if (peliculasAlmacenadas.length == 0) {
			System.out.println("La plataforma esta vacia, no hay peliculas para mostrar");
		} else {
			System.out.println(Arrays.toString(peliculasAlmacenadas));			
		}
	}
	
	public String buscarPelicula(String titulo) {
		String mensaje = "";
		boolean encontrada = false;
		int i = 0;
		while (!encontrada && i < peliculas.length) {
			if (peliculas[i] != null && peliculas[i].equalsIgnoreCase(titulo)) {
				encontrada = true;
			}
			i++;
		}
		if (encontrada) {
			mensaje = "Ese titulo esta registrado en la plataforma";
		} else {
			mensaje = "Ese titulo NO esta registrado en la plataforma";
		}
		return mensaje;
	}
	
}