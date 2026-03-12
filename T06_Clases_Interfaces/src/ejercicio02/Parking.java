package ejercicio02;

import java.util.Arrays;

public class Parking implements InterfazVehiculo {

	private Vehiculo[] vehiculos = new Vehiculo[0];

	public Parking() {
		super();
	}
	public Parking(Vehiculo[] vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}
	
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	@Override
	public String toString() {
		return "Parking [vehiculos=" + Arrays.toString(vehiculos) + "]";
	}
	
	@Override
	public void modificarAntiguedad(Vehiculo v, int nuevaAnt) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < vehiculos.length) {
			if (vehiculos[cont].getMatricula().equalsIgnoreCase(v.getMatricula())) {
				encontrado = true;
				vehiculos[cont].setAnioAnt(nuevaAnt);
				System.out.println("Año de antiguedad modificado correctamente.");
			}
			cont++;
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado el vehículo, no se puede realizar la modificación.");
		}	
	}
	
	@Override
	public void modificarMatricula(Vehiculo v, String nuevaMatricula) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < vehiculos.length) {
			if (vehiculos[cont].getMatricula().equalsIgnoreCase(v.getMatricula())) {
				encontrado = true;
				vehiculos[cont].setMatricula(nuevaMatricula);
				System.out.println("Matrícula modificada correctamente.");
			}
			cont++;
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado el vehículo, no se puede realizar la modificación.");
		}
	}
	
}