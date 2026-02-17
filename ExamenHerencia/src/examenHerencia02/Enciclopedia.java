package examenHerencia02;

public class Enciclopedia extends Libro {

	private int numVolumenes;

	// Constructor
	public Enciclopedia(String codigoISBN, String titulo, String autor, int numPaginas, int numVolumenes) {
		super(codigoISBN, titulo, autor, numPaginas);
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
		if (numVolumenes <= 5) { // haria falta this.numVolumenes ??
			multa = diasRetraso * 1.0;
		} else {
			multa = diasRetraso * 1.5;
		}
		if (esSocioPremium) {
			multa *= 0.5;
		}
		return multa;
		
		/*
		 * return (esSocioPremium ? 0.5 : 1) * this.numVolumenes <= 5 ? diasRetraso * 1 : diasRetraso * 1.5;
		 */
	}
	/*
	 * Otra forma:
	 * 	@Override
	public double calcularMulta(int diasRetraso, boolean esSocioPremium) {
		double multaBase = (numVolumenes <= 5) ? diasRetraso * 1.0 : diasRetraso * 1.5;
		return esSocioPremium ? multaBase / 2 : multaBase;
	}
	 */
	
}