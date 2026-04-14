package ejercicio1;

public class Pelicula implements Comparable<Pelicula> {

	// Atributos de la clase
	private String codigoPelicula; // identificacor único
	private String titulo;
	private String director;
	private int anioEstreno;
	private double puntuacion;
	
	// Constructor
	public Pelicula() {
		super();
	}
	public Pelicula(String codigoPelicula, String titulo, String director, int anioEstreno, double puntuacion) {
		super();
		this.codigoPelicula = codigoPelicula;
		this.titulo = titulo;
		this.director = director;
		this.anioEstreno = anioEstreno;
		this.puntuacion = puntuacion;
	}

	// Getters & Setters
	public String getCodigoPelicula() {
		return codigoPelicula;
	}
	public void setCodigoPelicula(String codigoPelicula) {
		this.codigoPelicula = codigoPelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	@Override
	public String toString() {
		return "Pelicula [codigoPelicula=" + codigoPelicula + ", titulo=" + titulo + ", director=" + director
				+ ", anioEstreno=" + anioEstreno + ", puntuacion=" + puntuacion + "]";
	}

	@Override
	public int compareTo(Pelicula o) {
		return titulo.compareTo(o.titulo);
	}
	
}