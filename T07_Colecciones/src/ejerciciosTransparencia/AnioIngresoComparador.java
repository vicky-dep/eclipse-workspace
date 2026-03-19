package ejerciciosTransparencia;

import java.util.Comparator;

public class AnioIngresoComparador implements Comparator<Academico> {

	@Override
	public int compare(Academico o1, Academico o2) {
		return o1.getAnioIngreso() - o2.getAnioIngreso();
	}
	
}