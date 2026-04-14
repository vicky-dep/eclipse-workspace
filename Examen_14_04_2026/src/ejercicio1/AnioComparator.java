package ejercicio1;

import java.util.Comparator;

public class AnioComparator implements Comparator<Pelicula> {

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		// ordeno de forma decreciente, de más reciente a más antigua
		return o2.getAnioEstreno() - o1.getAnioEstreno();
	}

}