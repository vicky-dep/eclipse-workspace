package examenHerencia02;

public class Enciclopedia extends Libro {

	private int numVolumenes;

	// Constructor
	public Enciclopedia(int numVolumenes) {
		super();
		this.numVolumenes = numVolumenes;
	}
	public Enciclopedia() {
		super();
	}
	public Enciclopedia(String codigoISBN, String titulo, String autor, int numPaginas, boolean enPrestamo) {
		super(codigoISBN, titulo, autor, numPaginas, enPrestamo);
	}
	public Enciclopedia(String codigoISBN, String titulo, String autor, int numPaginas, boolean enPrestamo, int numVolumenes) {
		super(codigoISBN, titulo, autor, numPaginas, enPrestamo);
		this.numVolumenes = numVolumenes;
	}
	
	// Getters & Setters
	public int getNumVolumenes() {
		return numVolumenes;
	}
	public void setNumVolumenes(int numVolumenes) {
		this.numVolumenes = numVolumenes;
	}
	
	@Override
	public String toString() {
		return "Enciclopedia [numVolumenes=" + numVolumenes + "]";
	}
	
	// Implemento el metodo abstracto del padre
	/* Volúmenes ≤ 5 → días de retraso * 1.0 €
	 * Volúmenes > 5 → días de retraso * 1.5 €
	 * Si el usuario es socio premium, se le aplicará un descuento del 50% sobre la multa final.
	 */
	@Override
	public double calcularMulta(int diasRetraso, boolean esSocioPremium) {
		double multa = 0;
		if (numVolumenes <= 5) {
			multa = diasRetraso * 1.0;
		} else {
			multa = diasRetraso * 1.5;
		}
		if (esSocioPremium) {
			multa *= 0.5;
		}
		return multa;
	}	
	
}