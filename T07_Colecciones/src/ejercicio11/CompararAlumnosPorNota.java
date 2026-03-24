package ejercicio11;

import java.util.Comparator;

public class CompararAlumnosPorNota implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return (int)(o1.getNota() - o2.getNota());
	}

}
