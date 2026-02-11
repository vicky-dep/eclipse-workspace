package ejercicio04_05_06_07_08_09;

import java.util.Arrays;

public class ColaDoble extends Cola {
	
	// que encola un elemento al principio de la cola
	public void encolarPrincipio(int num) {
		int[] copy = Arrays.copyOf(super.getLista(), super.getLista().length + 1);
		for (int i = copy.length -1; i > 0; i--) {
			copy[i] = super.getLista()[i-1];
		}
		copy[0] = num;
		super.setLista(copy);
		System.out.println("El numero se ha insertado al principio de la lista");
	}

	// que desencola un elemento del final de la cola
	public int desencolarFinal () {
		int numFinal = super.getLista()[super.getLista().length-1];
		int[] copy = Arrays.copyOf(super.getLista(), super.getLista().length-1);
		super.setLista(copy);
		return numFinal;
	}
}