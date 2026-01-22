package ejercicio1;

public class LibroLeticia {
	
	private String nombre;
	private String autor;
	private String genero;
	private String calificacion;
	
	//Constructores
	public LibroLeticia(String nombre, String autor, String genero, String calificacion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.calificacion = calificacion;
	}
	public LibroLeticia() {
		super();
	}
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", genero=" + genero + ", calificacion=" + calificacion
				+ "]";
	}
	
}