package practicandoExamen;

import java.util.Comparator;

public class AnioComparator implements Comparator<AlbumGestionMusical> {

	@Override
	public int compare(AlbumGestionMusical o1, AlbumGestionMusical o2) {
		return o1.getAnioLanzamiento() - o2.getAnioLanzamiento();
	}
	
}