package ejercicio06;

public class Libro implements Comparable<Libro> {

	/*
	 * Crea una clase Libro con los atributos titulo, autor e isbn.
	 * Implementa la interfaz Comparable en la clase Libro para que, de forma predeterminada, los libros se ordenen por su isbn.
	 * Crea una clase externa que implemente Comparator<Libro> para ordenar los libros alfabéticamente por autor. 
	 * Si dos libros son del mismo autor, el comparador debe decidir el orden según el titulo.
	 * Almacena los libros en un ArrayList y muestra cómo cambia el orden al usar Collections.sort(lista) 
	 * frente a Collections.sort(lista, nuevoComparador).
	 */
	
	private String titulo;
	private String autor;
	private String isbn;

	public Libro() {
		super();
	}
	public Libro(String titulo, String autor, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + "]";
	}
	
	@Override
	public int compareTo(Libro o) {
		return isbn.compareTo(o.isbn);
	}
	
}