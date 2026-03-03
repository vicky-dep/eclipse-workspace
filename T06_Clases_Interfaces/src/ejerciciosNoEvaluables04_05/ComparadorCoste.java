package ejerciciosNoEvaluables04_05;

import java.util.Comparator;

// Se usa cuando no es orden natural
public class ComparadorCoste implements Comparator<Llamada> {

	// ordenar array o colecciones por otro atributo que no sea el orden natural
	// devolvera un num +, - o 0 igual que compareTo
	@Override
	public int compare(Llamada arg0, Llamada arg1) {
		
		return (int) (arg0.calcularCoste("Zona 1") - arg1.calcularCoste("Zona 2"));
	}
	
}