package ejercicio06;

import java.util.Comparator;

public class LibroComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		if (o1.getAutor().equalsIgnoreCase(o2.getAutor())) {
			return o1.getTitulo().compareTo(o2.getTitulo());
		}
		return o1.getAutor().compareTo(o2.getAutor());
	}
	
}