package ejercicio04;

import java.util.Comparator;

public class DineroComparator implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return (int) (o1.getSaldo() - o2.getSaldo());
	}
	// por orden inverso tambien se podria utilizar el reverse en la principal

}
