package examenesAnteriores06;

import java.util.Comparator;

public class DniComparator implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante e1, Estudiante e2) {
		return e1.getDni().compareTo(e2.getDni());
	}

}