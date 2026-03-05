package ejerciciosNoEvaluables11;

import java.util.Comparator;

public class ComparadorEdadNombre implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista f1, Futbolista f2) {
		if((f1.getEdad() - f2.getEdad()) == 0) {
			return f1.getNombre().compareTo(f2.getNombre());
		}
		return f1.getEdad() - f2.getEdad();
	}

}