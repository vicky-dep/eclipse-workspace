package examenHerencia03;

import examenHerencia03.BibliotecaException;

public abstract class Libro {

	protected String isbn;
	protected String titulo;
	protected String autor;
	protected int numPaginas;
	protected boolean enPrestamo;

	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.enPrestamo = false;
	}

	public String getIsbn() {
		return isbn;
	}

	public boolean isEnPrestamo() {
		return enPrestamo;
	}

	public void prestar() {
		enPrestamo = true;
	}

	public void devolver() throws BibliotecaException {
		if(enPrestamo==false) {
			throw new BibliotecaException(BibliotecaException.LIBRO_DEVUELTO);
		}else {
		enPrestamo = false;
		}
	}

	public abstract double calcularMulta(int diasRetraso, boolean esSocioPremium);

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

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setEnPrestamo(boolean enPrestamo) {
		this.enPrestamo = enPrestamo;
	}
}
