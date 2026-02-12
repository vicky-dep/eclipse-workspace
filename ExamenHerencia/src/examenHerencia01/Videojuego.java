package examenHerencia01;

public class Videojuego {

	private String titulo;
	private String desarrollador;
	private int anioLanzamiento;
	private String codId;

	
	public Videojuego() {
		super();
	}
	public Videojuego(String titulo, String desarrollador, int anioLanzamiento, String codId) {
		super();
		this.titulo = titulo;
		this.desarrollador = desarrollador;
		this.anioLanzamiento = anioLanzamiento;
		this.codId = codId;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDesarrollador() {
		return desarrollador;
	}
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}
	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}
	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}
	public String getCodId() {
		return codId;
	}
	public void setCodId(String codId) {
		this.codId = codId;
	}
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", desarrollador=" + desarrollador + ", anioLanzamiento="
				+ anioLanzamiento + ", codId=" + codId + "]";
	}
	
	public void mostrarInformacion() {
		System.out.println("Título: " + titulo);
		System.out.println("Desarrollador: " + desarrollador);
		System.out.println("Año de lanzamiento: " + anioLanzamiento);
		System.out.println("Código id: " + codId);
	}
	
}