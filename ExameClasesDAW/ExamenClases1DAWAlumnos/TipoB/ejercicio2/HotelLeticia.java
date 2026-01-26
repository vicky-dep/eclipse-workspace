package ejercicio2;

import java.util.Arrays;

public class HotelLeticia {
	private final int CAPACIDAD = 100;
	private String[] huespedes = new String[CAPACIDAD];
	// Constructores

	public HotelLeticia(String[] huespedes) {
		super();
		this.huespedes = huespedes;
	}

	public HotelLeticia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] getHuespedes() {
		return huespedes;
	}

	public void setHuespedes(String[] huespedes) {
		this.huespedes = huespedes;
	}

	@Override
	public String toString() {
		return "HotelLeticia [CAPACIDAD=" + CAPACIDAD + ", huespedes=" + Arrays.toString(huespedes) + "]";
	}

	// Métodos de la clase
	public void registrarReserva(String nombre) {
		boolean hayHueco = true;
		int i = 0;
		while (hayHueco && i < huespedes.length) {
			if (huespedes[i] != null && huespedes[i].equalsIgnoreCase(nombre)) {
				System.out.println("Ya tienes una reserva");
				hayHueco = false;
			}
			i++;

		}
		if (hayHueco) {
			boolean encontrado = false;
			int cont = 0;
			while (!encontrado && cont < huespedes.length) {
				if (huespedes[cont] == null) {
					huespedes[cont] = nombre;
					System.out.println("Usuario registrado correctamente");
					encontrado = true;
				}
				cont++;

			}

		} else {
			System.out.println("Hotel completo");
		}
	}

	public int consultarEspacio() {
		int espacios = 0;
		for (int i = 0; i < huespedes.length; i++) {
			if (huespedes[i] == null) {
				espacios++;
			}

		}
		return espacios;
	}

	public void mostrarHuespedHospedados() {
		for (int i = 0; i < huespedes.length; i++) {
			if (huespedes[i] != null) {
				System.out.println(huespedes[i]);
			}

		}

	}

	public String buscarReserva(String nombre) {
		boolean hayHueco = true;
		String resultado = "No hay reserva a ese nombre";
		int i = 0;
		while (hayHueco && i < huespedes.length) {
			if (huespedes[i] != null && huespedes[i].equalsIgnoreCase(nombre)) {
				resultado = "Ya tienes una reserva";
				hayHueco = false;
			}
			i++;

		}
		return resultado;
	}

	public void eliminarReserva(String nombre) {
		boolean encontrado = false;

		int i = 0;
		while (!encontrado && i < huespedes.length) {
			if (huespedes[i] != null && huespedes[i].equalsIgnoreCase(nombre)) {
				System.out.println("Huesped eliminado");
				huespedes[i] = null;
				encontrado = true;
			}
			i++;

		}
		if (!encontrado) {
			System.out.println("No hay nadie registrado con ese nombre");
		}

	}
}