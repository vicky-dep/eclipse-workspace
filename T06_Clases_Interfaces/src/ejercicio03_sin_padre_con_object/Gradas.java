package ejercicio03_sin_padre_con_object;

public class Gradas {

	// número de asiento y la zona
	// nombre del comprador, del artista y de la fecha del concierto.
	private int asiento;
	private String zona;
	private String id;
	private String nombreComprador;
	private String artista;
	private String fecha;

	public Gradas() {
		super();
	}
	public Gradas(int asiento, String zona, String id, String nombreComprador, String artista, String fecha) {
		super();
		this.asiento = asiento;
		this.zona = zona;
		this.id = id;
		this.nombreComprador = nombreComprador;
		this.artista = artista;
		this.fecha = fecha;
	}

	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getId() {
		return id;
	}
	public String getNombreComprador() {
		return nombreComprador;
	}
	public void setNombreComprador(String nombreComprador) {
		this.nombreComprador = nombreComprador;
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
		return "Gradas [asiento=" + asiento + ", zona=" + zona + ", id=" + id + ", nombreComprador=" + nombreComprador
				+ ", artista=" + artista + ", fecha=" + fecha + "]";
	}
		
}