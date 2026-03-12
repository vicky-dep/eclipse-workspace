package ejercicio02;

import java.util.Comparator;

public class AnioAntiguedadComparatorInverso implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// Para ordenar de forma decreciente, se comparan los años al revés
		return o2.getAnioAnt() - o1.getAnioAnt();
	}

}