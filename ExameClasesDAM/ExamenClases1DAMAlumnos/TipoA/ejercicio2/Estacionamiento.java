package ejercicio2;

import java.util.Arrays;

public class Estacionamiento {
	/**
	 * 2.Crea una clase llamada Estacionamiento que gestione el estacionamiento de vehículos.
	 * Para ello, utiliza un array que almacene los números de placas de los vehículos estacionados, 
	 * con un límite máximo de 50 vehículos permitidos en el estacionamiento.
	 * Implementa los siguientes métodos:
	 * 1. Registrar vehículo: Permite registrar un vehículo en el estacionamiento, asignando su número 
	 * de placa a una posición en el array. Si el estacionamiento ya está lleno, debe mostrar un mensaje 
	 * indicando que no se puede registrar el vehículo. No se permiten matrículas repetidas
	 * 2. Eliminar vehículo: Permite eliminar un vehículo del estacionamiento, dado su número de placa. 
	 * Si el vehículo no está en el estacionamiento, muestra un mensaje de error. 
	 * 3. Consultar espacio disponible: Devuelve la cantidad de espacios disponibles en el estacionamiento 
	 * (espacios vacíos en el array).
	 * 4. Mostrar vehículos estacionados: Muestra los números de placa de todos los vehículos estacionados 
	 * actualmente en el estacionamiento.
	 * 5. Buscar vehículo: Recibe un número de placa y verifica si ese vehículo está estacionado en el sistema, 
	 * devolviendo un mensaje adecuado dependiendo de si está o no registrado.
	 */
	
	private final int CAPACIDAD = 50;
	private String[] matriculas = new String[CAPACIDAD];
	
	// Constructor
	public Estacionamiento() {
		super();
	}
	public Estacionamiento(String[] matriculas) {
		super();
		this.matriculas = matriculas;
	}
	// Getters & Setters
	public String[] getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(String[] matriculas) {
		this.matriculas = matriculas;
	}
	@Override
	public String toString() {
		return "Estacionamiento [CAPACIDAD=" + CAPACIDAD + ", matriculas=" + Arrays.toString(matriculas) + "]";
	}
	
	public void registrarVehiculo(String matricula) {
		boolean repetida = false;
		int i = 0;
		while (!repetida && i < matriculas.length) {
			if (matriculas[i] != null && matriculas[i].equalsIgnoreCase(matricula)) {
				repetida = true;
			}
			i++;
		}
		if (repetida) {
			System.out.println("Esa matricula ya esta registrada");
		} else {
			boolean agregado = false;
			int pos = 0;
			while (!agregado && pos < matriculas.length) {
				if (matriculas[pos] == null) {
					matriculas[pos] = matricula;
					agregado = true;
					System.out.println("Vehiculo registrado correctamente");
				}
				pos++;
			}
			if (!agregado) {
				System.out.println("El estacionamiento esta lleno");
			}
		}
	}
	
	
}