package ejercicio03;

public class Gradas extends Entradas {

	/*
	 * Las entradas de gradas tienen el número de asiento y la zona. 
	 * Estas entradas quedan identificadas por el id y el número de asiento. 
	 * También dispone del nombre del comprador, del artista y de la fecha del concierto.
	 */
	
	private int numAsiento;
	private String zona;
	private String nombre;
	private String artista;
	private String fecha; // formato yyyymmdd

	public Gradas() {
		super();
	}
	public Gradas(int numAsiento, String zona, String nombre, String artista, String fecha) {
		super();
		this.numAsiento = numAsiento;
		this.zona = zona;
		this.nombre = nombre;
		this.artista = artista;
		this.fecha = fecha;
	}
	public Gradas(int id, int numAsiento, String zona, String nombre, String artista, String fecha) {
		super(id);
		this.numAsiento = numAsiento;
		this.zona = zona;
		this.nombre = nombre;
		this.artista = artista;
		this.fecha = fecha;
	}
	
	public int getNumAsiento() {
		return numAsiento;
	}
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
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
		return super.toString() + "Gradas [numAsiento=" + numAsiento + ", zona=" + zona + ", nombre=" + nombre + ", artista=" + artista
				+ ", fecha=" + fecha + "]";
	}
	
}