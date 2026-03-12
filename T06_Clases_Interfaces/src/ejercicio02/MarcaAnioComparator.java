package ejercicio02;

import java.util.Comparator;

//Se crea esta clase para poder ordenar por un parámetro que no es el de por defecto (matricula)

public class MarcaAnioComparator implements Comparator<Vehiculo> {

	/*
	 * Adicionalmente se necesita ordenar a los vehículos por su marca. 
	 * En caso de que haya dos vehículos con la misma marca se ordenará por año de antigüedad.
	 */
	
	@Override
	public int compare(Vehiculo arg0, Vehiculo arg1) {
		if (arg0.getMarca().compareTo(arg1.getMarca()) == 0) {
			return arg0.getAnioAnt() - arg1.getAnioAnt();
		}
		return arg0.getMarca().compareTo(arg1.getMarca());
	}
}