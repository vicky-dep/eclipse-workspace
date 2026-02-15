package examenHerencia02;

public class Novela extends Libro {

	private String genero; // ficcion, historica o misterio

	//Constructor
	public Novela() {
		super();
	}
	public Novela(String codigoISBN, String titulo, String autor, int numPaginas, boolean enPrestamo) {
		super(codigoISBN, titulo, autor, numPaginas, enPrestamo);
	}
	public Novela(String codigoISBN, String titulo, String autor, int numPaginas, boolean enPrestamo, String genero) {
		super(codigoISBN, titulo, autor, numPaginas, enPrestamo);
		this.genero = genero;
	}
	public Novela(String genero) {
		super();
		this.genero = genero;
	}
	
	// Getters & Setters
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Novela [genero=" + genero + "]";
	}
	
	// Implemento el metodo abstracto del padre
	/* Ficción → días de retraso * 0.5 €
	 * Histórica → días de retraso * 0.7 €
	 * Misterio → días de retraso * 0.6 €
	 * Si el usuario es socio premium, se le aplicará un descuento del 50% sobre la multa final.
	 */
	@Override
	public double calcularMulta(int diasRetraso, boolean esSocioPremium) {
		double multa = 0;
		if(genero.equalsIgnoreCase("ficcion")) {
			multa = diasRetraso * 0.5;
		} else if (genero.equalsIgnoreCase("historica")) {
			multa = diasRetraso * 0.7;
		} else {
			multa = diasRetraso * 0.6;
		}
		if (esSocioPremium) {
			multa *= 0.5;
		}
		return multa;
	}

}