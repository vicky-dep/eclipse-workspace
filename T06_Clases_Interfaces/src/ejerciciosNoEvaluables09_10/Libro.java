package ejerciciosNoEvaluables09_10;

public class Libro extends Publicacion implements PrestableInterfaz {
	/*
	 * Los libros tienen además un atributo prestado. Los libros, cuando se crean, no están prestados.
	 * Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() 
	 * que devuelve el valor de todos los atributos en una cadena de caracteres. 
	 * También tienen un método que devuelve el año de publicación, y otro que devuelve el código.
	 */
	
	// Al ser una clase hija los atributos solo son private
		private boolean prestado;

		public Libro(String codigo, String titulo, int anioPublicacion) {
			super(codigo, titulo, anioPublicacion);
			this.prestado = false;
		}

		public boolean isPrestado() {
			return prestado;
		}

		public void setPrestado(boolean prestado) {
			this.prestado = prestado;
		}

		@Override
		public String toString() {
			return super.toString() + "Libro [prestado=" + prestado + "]";
		}

		@Override
		public void prestar() {
			if (prestado) {
				System.out.println("El libro ya lo tiene otra persona");
			} else {
				prestado();
			}

		}

		@Override
		public void devolver() {
			if (prestado) {
				prestado = false;
				System.out.println("Libro devuelto");
			} else {
				System.out.println("El libro no está prestado, no se puede devolver");
			}

		}

		@Override
		public void prestado() {
			prestado = true;
			System.out.println("Libro prestado");

		}
	
	/*
	// se puede poner aqui a "false" o tambien en el constructor
	// al ser una clase hija los atributos solo son private
	private boolean estaPrestado;

	public Libro(String codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo, anioPublicacion);
		this.estaPrestado = false;
	}

	// Creo que los getters & setters NO serian necesarios, ya que implemento los metodos de la interfaz...
	public boolean isEstaPrestado() {
		return estaPrestado;
	}
	public void setEstaPrestado(boolean estaPrestado) {
		this.estaPrestado = estaPrestado;
	}

	@Override
	public String toString() {
		// aqui podemos hacer lo mismo que en revista, return super.toString() + ...
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
		solucion Leticia:
		if(estaPrestado) {
			System.out.println("El libro ya lo tiene otra persona");
		} else {
			estaPrestado();
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
	*/
}