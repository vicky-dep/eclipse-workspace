package examenesAnteriores02;

import java.util.Comparator;

public class AnioLanzamientoComparator implements Comparator<Album> {

	@Override
	public int compare(Album o1, Album o2) {
		return o1.getAnioLanzamiento() - o2.getAnioLanzamiento();
	}
	
}