package examenHerencia04;

public class Digital extends Libro {

	/*
	 * Los libros digitales tienen además los siguientes atributos: 
	 * formato
	 * tamañoMB
	 * numDescargas
	 */
	
	private String formato;
	private float tamanioMB;
	private int numDescargas;
	
	public Digital() {
		super();
	}

	public Digital(String titulo, String autor, int anioPublicacion, String isbn) {
		super(titulo, autor, anioPublicacion, isbn);
	}

	public Digital(String formato, float tamanioMB, int numDescargas) {
		super();
		this.formato = formato;
		this.tamanioMB = tamanioMB;
		this.numDescargas = numDescargas;
	}

	public Digital(String titulo, String autor, int anioPublicacion, String isbn, String formato, float tamanioMB,
			int numDescargas) {
		super(titulo, autor, anioPublicacion, isbn);
		this.formato = formato;
		this.tamanioMB = tamanioMB;
		this.numDescargas = numDescargas;
	}
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public float getTamanioMB() {
		return tamanioMB;
	}
	public void setTamanioMB(float tamanioMB) {
		this.tamanioMB = tamanioMB;
	}
	public int getNumDescargas() {
		return numDescargas;
	}
	public void setNumDescargas(int numDescargas) {
		this.numDescargas = numDescargas;
	}

	@Override
	public String toString() {
		return "Digital [formato=" + formato + ", tamanioMB=" + tamanioMB + ", numDescargas=" + numDescargas
				+ ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getAnioPublicacion()="
				+ getAnioPublicacion() + ", getIsbn()=" + getIsbn() + "]";
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Formato: " + formato);
		System.out.println("Tamaño (MB): " + tamanioMB);
		System.out.println("Número de descargas: " + numDescargas);
	}

}