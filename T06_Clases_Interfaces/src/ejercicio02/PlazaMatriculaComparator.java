package ejercicio02;

import java.util.Comparator;

public class PlazaMatriculaComparator implements Comparator<Vehiculo> {

	/*
	 * También se necesita ordenar por número de plazas.
	 * En caso de que haya dos número de plazas igual se ordenará por matrícula.
	 */
	
	@Override
	public int compare(Vehiculo arg0, Vehiculo arg1) {
		if (arg0.getPlazas() - arg1.getPlazas() == 0) {
			return arg0.getMatricula().compareTo(arg1.getMatricula());
		}
		return arg0.getPlazas() - arg1.getPlazas();
	}
	
}