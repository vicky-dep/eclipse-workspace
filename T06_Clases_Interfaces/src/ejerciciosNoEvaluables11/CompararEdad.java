package ejerciciosNoEvaluables11;

import java.util.Comparator;

public class CompararEdad implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista f1, Futbolista f2) {
		return f1.getEdad() - f2.getEdad();
	}

}