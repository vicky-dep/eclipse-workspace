package ejerciciosNoEvaluables06;

import java.util.Comparator;

public class CartaLeticiaComparador implements Comparator<CartaLeticia> {

	@Override
	public int compare(CartaLeticia c1, CartaLeticia c2) {
		if (c1.getPalo().compareTo(c2.getPalo()) == 0) {
			return c1.getNumero() - c2.getNumero();
		}
		return c1.getNumero() - c2.getNumero();
	}
	
}