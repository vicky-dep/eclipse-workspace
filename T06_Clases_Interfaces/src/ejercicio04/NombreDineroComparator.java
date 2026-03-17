package ejercicio04;

import java.util.Comparator;

public class NombreDineroComparator implements Comparator<Cuenta> {

	/*
	 * Adicionalmente se necesita ordenar a los clientes por su nombre y dinero en la cuenta. 
	 */
	
	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		if (o1.getNombre().compareTo(o2.getNombre()) == 0) {
			return (int) (o1.getSaldo() - o2.getSaldo());
		}
		return o1.getNombre().compareTo(o2.getNombre());
	}

}