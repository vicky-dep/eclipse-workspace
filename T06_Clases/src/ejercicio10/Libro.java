package ejercicio10;

public class Libro {
	/**
	 * Crea una clase Libro con atributos titulo, autor y año.
	 * Luego, crea una clase Biblioteca que tenga un array de hasta 20 libros.
	 * Incluye métodos para:
	 * Añadir libros a la biblioteca.
	 * Eliminar libros de la biblioteca
	 * Buscar libros por autor.
	 * Mostrar todos los libros disponibles.
	 */
	
	private String titulo;
	private String autor;
	private int anio;

	// Constructor
	public Libro() {
		super();
	}
	public Libro(String titulo, String autor, int anio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
	}
	
	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + "]";
	}
	
}