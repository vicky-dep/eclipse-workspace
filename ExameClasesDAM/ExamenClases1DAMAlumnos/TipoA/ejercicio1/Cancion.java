package ejercicio1;

public class Cancion {

	private String titulo;
	private String artista;

	// Constructor
	public Cancion() {
		super();
	}
	public Cancion(String titulo, String artista) {
		super();
		this.titulo = titulo;
		this.artista = artista;
	}
	
	// Setters & Getters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + "]";
	}
}