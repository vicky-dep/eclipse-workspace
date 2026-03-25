package ejercicio11;

import java.util.Comparator;

public class CompararAlumnosPorNota implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// El array a comparar puede tener posiciones vacias
		if (o1 != null && o2 != null) {
			return (int)(o1.getNota() - o2.getNota());			
		}
		return 0;
	}

}