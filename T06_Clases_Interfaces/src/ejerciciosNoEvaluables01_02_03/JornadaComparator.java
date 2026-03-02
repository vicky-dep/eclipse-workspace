package ejerciciosNoEvaluables01_02_03;

import java.util.Comparator;

public class JornadaComparator implements Comparator<Jornada> {
	/*
	 * Implementar una clase comparadora para ordenar las jornadas de trabajo  por orden de número de minutos trabajados. 
	 * Ordenar la lista anterior por dicho orden y mostrarla por pantalla.
	 */

	@Override
	public int compare(Jornada arg0, Jornada arg1) {
		// la comparacion para numeros se hace restando y no con el compareTo
		return arg0.calcularMinutosJornada() - arg1.calcularMinutosJornada();
		// si lo quisieras decreciente: (o tambien * -1)
		// return arg1.calcularMinutosJornada() - arg0.calcularMinutosJornada();
	}
	
}