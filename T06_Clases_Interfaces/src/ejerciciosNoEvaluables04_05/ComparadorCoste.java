package ejerciciosNoEvaluables04_05;

import java.util.Comparator;

// Se usa cuando no es orden natural
public class ComparadorCoste implements Comparator<Llamada> {

	@Override
	public int compare(Llamada arg0, Llamada arg1) {
		// TODO Auto-generated method stub
		return (int) arg0.calcularCoste("Zona 1");
	}

	
}