package ejercicio04;

import java.util.Comparator;

public class DineroComparatorInverso implements Comparator<Cuenta> {
	
	/*
	 * Por dinero en la cuenta también se necesita ordenar en orden inverso.
	 */

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return (int) (o2.getSaldo() - o1.getSaldo());
	}
	
}