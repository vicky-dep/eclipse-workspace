package ejerciciosNoEvaluables09_10;

public class Publicacion {
	/*
	 * Escribe un programa para una biblioteca que contenga libros y revistas.
	 * Las características comunes que se almacenan tanto para las revistas 
	 * como para los libros son el código, el título, y el año de publicación. 
	 * Estas tres características se pasan por parámetro en el momento de crear los objetos.
	 * 
	 * Partiendo del ejercicio anterior escribe una aplicación en la que se implementen dos métodos:
	 * cuentaPrestados(): recibe por parámetro un array de objetos, y devuelve cuántos de ellos están prestados.
	 * publicacionesAnterioresA(): recibe por parámetro un array de Publicaciones y un año, y devuelve cuántas 
	 * publicaciones tienen fecha anterior al año recibido por parámetro.
	 */
	
	// código, el título, y el año de publicación.
		//La clase padre también podría tener los atributos como protected
		private String codigo;
		private String titulo;
		private int anioPublicacion;
		public Publicacion(String codigo, String titulo, int anioPublicacion) {
			super();
			this.codigo = codigo;
			this.titulo = titulo;
			this.anioPublicacion = anioPublicacion;
		}
		public Publicacion() {
			super();
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getAnioPublicacion() {
			return anioPublicacion;
		}
		public void setAnioPublicacion(int anioPublicacion) {
			this.anioPublicacion = anioPublicacion;
		}
		@Override
		public String toString() {
			return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + "]";
		}
	
	/*
	// La clase padre podria tener los atributos como protected
	private String codigo;
	private String titulo;
	private int anioPublicacion;
		
	public Publicacion() {
		super();
	}
	public Publicacion(String codigo, String titulo, int anioPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + "]";
	}
	
	// estos metodos ellas los crea en una clase nueva llamada "GestionBiblioteca"
	public int cuentaPrestados(Publicacion[] publicaciones) {
		int contador = 0;
		for (int i = 0; i < publicaciones.length; i++) {
			if (publicaciones[i] instanceof PrestableInterfaz) { // cuidado, aqui Leticia instancia a Libro no a Interfaz...
				PrestableInterfaz p = (PrestableInterfaz) publicaciones[i];
				if(p.estaPrestado()) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public int publicacionesAnterioresA(Publicacion[] publicaciones, int anio) {
		int contador = 0;
		for (int i = 0; i < publicaciones.length; i++) {
			if (publicaciones[i].getAnioPublicacion() < anio) {
				contador++;
			}
		}
		return contador;
	}
	*/
}