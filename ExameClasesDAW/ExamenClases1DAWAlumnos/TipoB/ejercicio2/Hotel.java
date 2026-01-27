package ejercicio2;

import java.util.Arrays;

public class Hotel {
	/**
	 * 2.Diseña una clase llamada Hotel que permita gestionar las reservas de habitaciones en un hotel. 
	 * El sistema debe ser capaz de administrar hasta un máximo de 100 habitaciones.
	 * Cada reserva estará identificada por el nombre del huésped. La clase debe implementar los siguientes métodos:
	 * 1. Registrar reserva: Permite registrar una reserva en el hotel, asignando el nombre del huésped a una habitación. 
	 * Si el nombre ya tiene una reserva activa, muestra un mensaje indicando que no se puede registrar más de una reserva 
	 * para el mismo huésped. Si todas las habitaciones están ocupadas, muestra un mensaje indicando que el hotel está lleno.
	 * 2. Cancelar reserva: Permite cancelar una reserva activa, dado el nombre del huésped. Si el huésped no tiene una 
	 * reserva activa, muestra un mensaje de error.
	 * 3. Consultar habitaciones disponibles: Devuelve la cantidad de habitaciones libres en el hotel.
	 * 4. Mostrar huéspedes registrados: Muestra una lista con los nombres de todos los huéspedes que tienen reservas activas 
	 * en el hotel. Si no hay reservas, muestra un mensaje indicando que el hotel está vacío. 
	 * 5. Buscar reserva: Recibe el nombre de un huésped y verifica si tiene una reserva activa en el hotel, devolviendo un 
	 * mensaje adecuado dependiendo de si está o no registrado.
	 */

	// private final int CAPACIDAD = 100;
	// private String[] reservas = new String[CAPACIDAD];
	private String[] reservas = new String[100];

	// Constructor
	public Hotel() {
		super();
	}
	public Hotel(String[] reservas) {
		super();
		this.reservas = reservas;
	}
	
	// Getters & Setters
	public String[] getReservas() {
		return reservas;
	}
	public void setReservas(String[] reservas) {
		this.reservas = reservas;
	}
	
	@Override
	public String toString() {
		return "Hotel [reservas=" + Arrays.toString(reservas) + "]";
	}
	
	// Metodos de la clase
	public void registrarReserva(String nombre) {
		// Primero compruebo si ya tiene una reserva
		int pos = 0;
		boolean tieneReserva = false;
		while (pos < reservas.length && !tieneReserva) {
			if (reservas[pos] != null && reservas[pos].equalsIgnoreCase(nombre)) {
				tieneReserva = true;
			}
			pos++;
		}
		if (tieneReserva) {
			System.out.println("No se puede registrar mas de una reserva para el mismo huesped");
		} else {
			pos = 0;
			boolean asignada = false;
			while (pos < reservas.length && !asignada) {
				if (reservas[pos] == null) {
					reservas[pos] = nombre;
					asignada = true;
					System.out.println("Reserva registrada correctamente");
				}
				pos++;
			}
			if (!asignada) {
				System.out.println("El hotel esta lleno");
			}			
		}
	}
	
	public void  eliminarReserva(String nombre) {
		int pos = 0;
		boolean cancelada = false;
		while (pos < reservas.length && !cancelada) {
			if (reservas[pos] != null && reservas[pos].equalsIgnoreCase(nombre)) {
				reservas[pos] = null;
				cancelada = true;
			}
			pos++;
		}
		if (cancelada) {
			System.out.println("Reserva cancelada correctamente");
		} else {
			System.out.println("Error: el huesped no tiene una reserva activa");
		}
	}
	
	public int consultarEspacio() {
		int libres = 0;
		for (int i = 0; i < reservas.length; i++) {
			if (reservas[i] == null) {
				libres++;
			}
		}
		return libres;
	}
	
	public void mostrarHuespedHospedados() {
		// Primero compruebo si hay reservas
		boolean hayReserva = false;
		for (int i = 0; i < reservas.length; i++) {
			if (reservas[i] != null) {
				System.out.println("Habitacion " + (i+1) + ": " + reservas[i]);
				hayReserva = true;
			}
		}
		if (!hayReserva) {
			System.out.println("El hotel esta vacio");
		}
	}
	
	public String buscarReserva(String nombre) {
		int pos = 0;
		boolean encontrado = false;
		String mensaje = "";
		while (pos < reservas.length && !encontrado) {
			if (reservas[pos] != null && reservas[pos].equalsIgnoreCase(nombre)) {
				encontrado = true;
				mensaje = "El huesped " + nombre + " tiene una reserva activa en la habitacion " + (pos + 1); // al empezar en 0, pongo pos+1
			}
			pos++;
		}
		if (!encontrado) {
			mensaje = "El huesped " + nombre + " no tiene una reserva activa";
		}
		return mensaje;
	}
}