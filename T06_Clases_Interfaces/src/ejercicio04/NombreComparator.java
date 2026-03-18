package ejercicio04;

import java.util.Comparator;

public class NombreComparator  implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}