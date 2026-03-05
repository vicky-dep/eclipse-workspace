package ejerciciosNoEvaluables09_10;

public class Revista extends Publicacion {
	/*
	 * Las revistas tienen un número. En el momento de crear. En el momento de crear las revistas se pasa el número por parámetro.
	 * Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() que devuelve el valor de 
	 * todos los atributos en una cadena de caracteres. 
	 * También tienen un método que devuelve el año de publicación, y otro que devuelve el código.
	 */
	
	private int numero;

	public Revista(String codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo, anioPublicacion);
		this.numero = 1;
	}

	public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
		super(codigo, titulo, anioPublicacion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		// Para que muestre los datos del padre, llamamos al toString del padre
		return super.toString() + "Revista [numero=" + numero + "]";
	}
	
	/*
	private int numero;

	public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
		super(codigo, titulo, anioPublicacion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		// Para que muestre los datos del padre ...
		return super.toString() + "Revista [numero=" + numero + "]";
				
		// return "Revista [numero=" + numero + ", getCodigo()=" + getCodigo()
						 // + ", getTitulo()=" + getTitulo() + ", getAnioPublicacion()=" + getAnioPublicacion() + "]";
	}

	@Override
	public String getCodigo() {
		return super.getCodigo();
	}

	@Override
	public int getAnioPublicacion() {
		return super.getAnioPublicacion();
	}
	*/
}