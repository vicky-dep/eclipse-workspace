package ejercicio23;

public class Cancion {
	private String titulo;
	private String autor;

	// Constructor
	public Cancion(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
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

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + autor + "]";
	}
}