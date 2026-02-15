package examenHerencia02;

public abstract class Libro {

	private String codigoISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	private boolean enPrestamo;

	// Constructor
	public Libro() {
		super();
	}
	public Libro(String codigoISBN, String titulo, String autor, int numPaginas, boolean enPrestamo) {
		super();
		this.codigoISBN = codigoISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.enPrestamo = enPrestamo;
	}
	
	// Getters & Setters
	public String getCodigoISBN() {
		return codigoISBN;
	}
	public void setCodigoISBN(String codigoISBN) {
		this.codigoISBN = codigoISBN;
	}
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
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public boolean isEnPrestamo() {
		return enPrestamo;
	}
	public void setEnPrestamo(boolean enPrestamo) {
		this.enPrestamo = enPrestamo;
	}
	
	@Override
	public String toString() {
		return "Libro [codigoISBN=" + codigoISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas="
				+ numPaginas + ", enPrestamo=" + enPrestamo + "]";
	}
	
	// Metodo abstracto, obliga a las hijas a implementarlo
	public abstract double calcularMulta(int diasRetraso, boolean esSocioPremium);
}