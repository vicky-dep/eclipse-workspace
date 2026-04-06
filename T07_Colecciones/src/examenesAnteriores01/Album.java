package examenesAnteriores01;

public class Album {

	private String nombreAlbum;
	private int anio;

	public Album() {
		super();
	}	
	public Album(String nombreAlbum, int anio) {
		super();
		this.nombreAlbum = nombreAlbum;
		this.anio = anio;
	}
	
	public String getNombreAlbum() {
		return nombreAlbum;
	}
	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Album [nombreAlbum=" + nombreAlbum + ", anio=" + anio + "]";
	}
	
}