package examenHerencia04;

public class Libro {

	/*
	 * Queremos gestionar el sistema de una Biblioteca. Esta Biblioteca dispondrá de un número ilimitado de libros 
	 * no repetidos (array). Los títulos y los autores de los libros son únicos.No puede haber dos libros con el 
	 * mismo título y autor en el array. 
	 * Los libros quedan representados por: 
	 * titulo
	 * autor
	 * anioPublicacion
	 * isbn
	 * También dispone de un método denominado mostrarInformacion(), que mostrará la información de la que dispone. 
	 * Las hijas también tendrán que implementar este método con las opciones de cada una de ellas
	 * Los libros pueden ser digitales o físicos.
	 */
	
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private String isbn;
	
	public Libro() {
		super();
	}
	public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.isbn = isbn;
	}

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
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", isbn="
				+ isbn + "]";
	}
	
	public void mostrarInformacion() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Año de publicación: " + anioPublicacion);
		System.out.println("ISBN: " + isbn);
	}
	
}