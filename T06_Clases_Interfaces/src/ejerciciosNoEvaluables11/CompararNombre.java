package ejerciciosNoEvaluables11;

import java.util.Comparator;

public class CompararNombre implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista f1, Futbolista f2) {
		return f1.getNombre().compareTo(f2.getNombre());
	}	

}