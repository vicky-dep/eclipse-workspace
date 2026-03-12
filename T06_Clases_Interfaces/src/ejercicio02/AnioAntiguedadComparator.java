package ejercicio02;

import java.util.Comparator;

public class AnioAntiguedadComparator implements Comparator<Vehiculo> {

	/*
	 * Por año de antigüedad también se necesita ordenar en orden inverso.
	 */
	
	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getAnioAnt() - o2.getAnioAnt();
	}

}