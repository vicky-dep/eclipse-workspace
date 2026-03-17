package ejercicio03_atributos_en_padre;

public class Object {

	private String id;
	private String nombreComprador;
	private String artista;
	private String fecha;

	public Object(String id) {
		super();
		this.id = id;
	}
	public Object(String id, String nombreComprador, String artista, String fecha) {
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
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Entradas [id=" + id + ", nombreComprador=" + nombreComprador + ", artista=" + artista + ", fecha="
				+ fecha + "]";
	}

}