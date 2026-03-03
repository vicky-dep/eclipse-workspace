package ejerciciosNoEvaluables06;

import java.util.Arrays;

public class PrincipalLeticia {

	public static void main(String[] args) {
		CartaLeticia c = new CartaLeticia();
		CartaLeticia c1 = new CartaLeticia();
		CartaLeticia c2 = new CartaLeticia();
		CartaLeticia c3 = new CartaLeticia();
		CartaLeticia c4 = new CartaLeticia();
		
		// Creamos array para probar la ordenacion
		CartaLeticia[] cartas = {c.construirCarta(), c1.construirCarta(), c2.construirCarta(), c3.construirCarta(), c4.construirCarta()};
		System.out.println("Cartas: " + Arrays.toString(cartas));
		// Ordenamos natural (comparable)
		Arrays.sort(cartas);
		System.out.println("Array ordenado por orden natural: " + Arrays.toString(cartas));
		// Ordenamos con el comparador 
		CartaLeticiaComparador comparador = new CartaLeticiaComparador();
		Arrays.sort(cartas, comparador);
		System.out.println("Array ordenado por palo y número: " + Arrays.toString(cartas));
		
	}
}