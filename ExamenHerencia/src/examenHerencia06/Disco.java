package examenHerencia06;

public class Disco {

	/*
	 * Se pretende desarrollar una aplicación que gestione una Discoteca de Música, donde se pueden alquilar y comprar discos en diferentes formatos. 
	 * La discoteca dispondrá de un número ilimitado de discos no repetidos (almacenados en un array). Cada disco tiene un título y un artista únicos.
	 * Los discos estarán representados por los siguientes atributos:
	 * Título
	 * Artista
	 * Año de lanzamiento
	 * Código de identificación (ID)
	 * También dispone de un método denominado mostrarInformacion(), que mostrará la información de la que dispone. Las hijas también tendrán que 
	 * implementar este método con las opciones de cada una de ellas. Los discos pueden ser de dos tipos: físicos o digitales.
	 */
	
	private String titulo;
	private String artista;
	private int anioLanzamiento;
	private String id;

	public Disco() {
		super();
	}
	public Disco(String titulo, String artista, int anioLanzamiento, String id) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.anioLanzamiento = anioLanzamiento;
		this.id = id;
	}
	
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
	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}
	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Disco [titulo=" + titulo + ", artista=" + artista + ", anioLanzamiento=" + anioLanzamiento + ", id="
				+ id + "]";
	}
	
	public void mostrarInformacion() {
		System.out.println("Artista: " + artista);
		System.out.println("Título: " + titulo);
		System.out.println("Año de lanzamiento: " + anioLanzamiento);
		System.out.println("Código de identificación: " + id);
	}
	
}