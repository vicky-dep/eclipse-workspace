package ejerciciosNoEvaluables09_10;

public class Libro extends Publicacion implements PrestableInterfaz {
	/*
	 * Los libros tienen además un atributo prestado. Los libros, cuando se crean, no están prestados.
	 * Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() 
	 * que devuelve el valor de todos los atributos en una cadena de caracteres. 
	 * También tienen un método que devuelve el año de publicación, y otro que devuelve el código.
	 */
	
	private boolean estaPrestado = false;

	public Libro(String codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo, anioPublicacion);
	}
	
	public Libro(String codigo, String titulo, int anioPublicacion, boolean estaPrestado) {
		super(codigo, titulo, anioPublicacion);
		this.estaPrestado = estaPrestado;
	}

	/* Creo que los getters & setters NO serian necesarios, ya que implemento los metodos de la interfaz...
	public boolean isEstaPrestado() {
		return estaPrestado;
	}
	public void setEstaPrestado(boolean estaPrestado) {
		this.estaPrestado = estaPrestado;
	}
	*/

	@Override
	public String toString() {
		return "Libro [getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo() + ", getAnioPublicacion()=" + getAnioPublicacion()
		+ ", estaPrestado()=" + estaPrestado() + "]";
	}
	
	@Override
	public String getCodigo() {
		return super.getCodigo();
	}

	@Override
	public int getAnioPublicacion() {
		return super.getAnioPublicacion();
	}

	@Override
	public void prestar() {
		if (!estaPrestado) { // si el libro NO esta prestado
			estaPrestado = true; // ahora el libre ESTA prestado
		}
	}

	@Override
	public void devolver() {
		if (estaPrestado) { // si el libro ESTA prestado
			estaPrestado = false; // ahora el libro ya NO esta prestado
		}	
	}

	@Override
	public boolean estaPrestado() {
		return estaPrestado;
	}

}