package ejercicio18;

import java.util.Comparator;

public class CompararPorId implements Comparator<Profesor> {

	@Override
	public int compare(Profesor o1, Profesor o2) {
		return o1.getId().compareTo(o2.getId());
	}

}