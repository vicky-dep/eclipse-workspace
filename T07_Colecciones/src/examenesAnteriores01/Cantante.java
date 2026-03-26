package examenesAnteriores01;

public class Cantante {

	private String nombre;
	private String tituloAlbum;

	public Cantante() {
		super();
	}
	public Cantante(String nombre, String tituloAlbum) {
		super();
		this.nombre = nombre;
		this.tituloAlbum = tituloAlbum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTituloAlbum() {
		return tituloAlbum;
	}

	public void setTituloAlbum(String tituloAlbum) {
		this.tituloAlbum = tituloAlbum;
	}

	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", tituloAlbum=" + tituloAlbum + "]";
	}
	
}