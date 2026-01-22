package ejercicio1;

public class Libro {
	
	// Atributos
	private String nombre;
	private String autor;
	private String calificacion;
	private String genero;
	
	public static final String CALIF_INFANTIL = "infantil";
	public static final String CALIF_ADOLESCENTE = "adolescente";
	public static final String CALIF_ADULTO = "adulto";
		
	// Constructor
	public Libro() {
		super();
	}
	public Libro(String nombre, String autor, String calificacion, String genero) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.calificacion = calificacion;
		this.genero = genero;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
		
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", calificacion=" + calificacion + ", genero=" + genero
				+ "]";
	}
	
}