package practicandoExamen;

public class Album {

	/*
	 * Partiendo de un mapa que tiene como clave el nombre de un cantante y como valor una lista de álbumes . 
	 * Los álbumes tendrán el nombre del album y el año de publicación
	 * Pasar ese mapa a un mapa donde la clave sea el año y el valor una lista de cantantes. 
	 * La clase cantante tendrá un nombre y el título del álbum.
	 */
	
	private String nombreAlbum;
	private int anioPublicacion;

	public Album() {
		super();
	}
	public Album(String nombreAlbum, int anioPublicacion) {
		super();
		this.nombreAlbum = nombreAlbum;
		this.anioPublicacion = anioPublicacion;
	}
	
	public String getnombreAlbum() {
		return nombreAlbum;
	}
	public void setnombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	@Override
	public String toString() {
		return "Album [nombreAlbum=" + nombreAlbum + ", anioPublicacion=" + anioPublicacion + "]";
	}
	
}