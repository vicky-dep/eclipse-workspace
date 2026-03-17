package ejercicio03_sin_padre_con_object;

public class Pista {
	
	//del comprador, del artista y de la fecha del concierto.
	private String id;
	private String nombreComprador;
	private String artista;
	private String fecha;

	public Pista() {
		super();
	}
	public Pista(String id, String nombreComprador, String artista, String fecha) {
		super();
		this.id = id;
		this.nombreComprador = nombreComprador;
		this.artista = artista;
		this.fecha = fecha;
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
		return "Pista [id=" + id + ", nombreComprador=" + nombreComprador + ", artista=" + artista + ", fecha=" + fecha
				+ "]";
	}
	
}