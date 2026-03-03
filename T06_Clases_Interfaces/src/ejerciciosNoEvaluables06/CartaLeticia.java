package ejerciciosNoEvaluables06;

public class CartaLeticia implements CartaLeticiaInterfaz, Comparable<CartaLeticia> {

	private String palo;
	private int numero;
	
	public CartaLeticia(String palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}
	public CartaLeticia() {
		super();
	}
	
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "CartaLeticia [palo=" + palo + ", numero=" + numero + "]";
	}
	
	@Override
	public CartaLeticia construirCarta() {
		CartaLeticia resultado = new CartaLeticia();
		// Generamos numero aleatorio para el numero de la carta entre 1 y 13
		int numero = (int) (Math.random() * 13 + 1);
		// Palo
		int numPalo = (int) (Math.random() * 4);
		String palo = "";
		if (numPalo == 0) {
			palo = "Diamantes";
		} else if (numPalo == 1) {
			palo = "Corazones";
		} else if (numPalo == 2) {
			palo = "Picas";
		} else {
			palo = "Treboles";
		}
		resultado.setNumero(numero);
		resultado.setPalo(palo);
		return resultado;
	}
	@Override
	public int compareTo(CartaLeticia c) {
		// Orden natural: solo por el numero
		return numero - c.numero;
	}
	
}