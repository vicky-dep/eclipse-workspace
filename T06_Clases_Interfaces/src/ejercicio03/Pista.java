package ejercicio03;

public class Pista extends Entradas {

	/*
	 * Las entradas de pista disponen del nombre del comprador, del artista y de la fecha del concierto.
	 */
	
	private String nombre;
	private String artista;
	private String fecha; // formato yyyymmdd

	public Pista() {
		super();
	}
	public Pista(String nombre, String artista, String fecha) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.fecha = fecha;
	}
	public Pista(int id, String nombre, String artista, String fecha) {
		super(id);
		this.nombre = nombre;
		this.artista = artista;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Pista [nombre=" + nombre + ", artista=" + artista + ", fecha=" + fecha + "]";
	}
	
}