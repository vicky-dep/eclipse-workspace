package ejercicio3;

public class ObraDeArte {
	// Esta clase representa la unidad básica del inventario.

	// Atributos
	private String titulo;
	private String autor;
	private double precio;
		
	// Constructor con todos los parametros
	public ObraDeArte(String titulo, String autor, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// Sobrescribir el método toString() para mostrar la información de la obra de forma legible.
	@Override
	public String toString() {
		return "ObraDeArte [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
}