package examenHerencia02;

public class Novela extends Libro {

	private String genero; // ficcion, historica o misterio

	//Constructor
	public Novela(String codigoISBN, String titulo, String autor, int numPaginas, boolean enPrestamo, String genero) 
				  throws NovelaGeneroException {
		
		super(codigoISBN, titulo, autor, numPaginas, enPrestamo);
		
		// esto se haria en excepciones:
		if ("Ficcion".equalsIgnoreCase(genero) || 
			"Historica".equalsIgnoreCase(genero) ||
			"Misterio".equalsIgnoreCase(genero)) {
			this.genero = genero;
		} else { 
			String mensaje = "El genero: " + genero + " no es un genero valido. Usa: ficcion, historica o misterio.";
			throw new NovelaGeneroException(mensaje);
		}
		
		// this.genero = genero;
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
		if(genero.equalsIgnoreCase("ficcion")) { // this.genero ?? 
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
		
		/*
		 * return 
		 *     ("Ficcion".equals(genero) ? diasRetraso * 0.5 :
		 *     "Historica".equals(genero) ? diasRetraso * 0.7 :
		 *     diasRetraso * 0.6) * 
		 *     (esSocioPremium ? 0.5 : 1); 
		 */
	}

}