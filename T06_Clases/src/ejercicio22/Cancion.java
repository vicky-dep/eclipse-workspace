package ejercicio22;

public class Cancion {
	/**
	 * Desarrolla una clase Cancion con los siguientes atributos:
	 * titulo: una variable String que guarda el título de la canción.
	 * autor: una variable String que guarda el autor de la canción. y los siguientes métodos:
	 * Cancion(String, String): constructor que recibe como parámetros el título y el
	 * autor de la canción (por este orden).
	 * Cancion(): constructor predeterminado que inicializa el título y el autor a cadenas vacías.
	 * dameTitulo(): devuelve el título de la canción.
	 * dameAutor(): devuelve el autor de la canción.
	 * ponTitulo(String): establece el título de la canción.
	 * ponAutor(String): establece el autor de la canción.
	 */
	
	// Para el ejercicio 23 se deberia haber utilizado esta clase en lugar de duplicarla
	
	// Atributos
	private String titulo;
	private String autor;
	
	// Constructor
	public Cancion() {
		super();
	}
	public Cancion(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + autor + "]";
	}

	// Metodos de la clase
	public String dameTitulo() {
		return titulo;
	}
	
	public String dameAutor() {
		return autor;
	}
	
	public void ponTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void ponAutor(String autor) {
		this.autor = autor;
	}
}