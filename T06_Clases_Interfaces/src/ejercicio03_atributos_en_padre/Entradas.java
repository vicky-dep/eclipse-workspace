package ejercicio03_atributos_en_padre;

public class Entradas {

	private String id;
	private String nombre;
	private String artista;
	private String fecha; // formato yyyymmdd
	public Entradas(String id, String nombre, String artista, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.artista = artista;
		this.fecha = fecha;
	}
	public Entradas() {
		super();
	}
	public String getId() {
		return id;
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
		return "Entradas [id=" + id + ", nombre=" + nombre + ", artista=" + artista + ", fecha=" + fecha + "]";
	}
	
	
}
