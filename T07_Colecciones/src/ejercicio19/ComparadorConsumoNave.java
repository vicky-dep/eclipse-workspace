package ejercicio19;

import java.util.Comparator;

public class ComparadorConsumoNave implements Comparator<Nave> {

	@Override
	public int compare(Nave n1, Nave n2) {
		// return Double.compare(n1.calcularConsumoEnergia(), n2.calcularConsumoEnergia());
		return (int) (n1.calcularConsumoEnergia() - n2.calcularConsumoEnergia());
	}
	
}