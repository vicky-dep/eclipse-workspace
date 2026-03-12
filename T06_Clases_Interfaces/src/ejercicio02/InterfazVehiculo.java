package ejercicio02;

public interface InterfazVehiculo {

	/*
	 * Diseña una interfaz que permita modificar la antigüedad y la matrícula de un vehículo (2 métodos).
	 */
	
	void modificarAntiguedad(Vehiculo v, int nuevaAnt);
	
	void modificarMatricula(Vehiculo v, String nuevaMatricula);
	
}