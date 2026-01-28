package ejercicio1;

import java.util.Arrays;

public class Menu {
	/**
	 * 1.Diseña la clase Menu, que almacena una lista de platos disponibles (representados por objetos de la clase Plato, 
	 * que incluye nombre, tipo de plato (entrada, principal, postre) y precio).Partirá de un array de Platos por defecto.
	 * Además la clase debe permitir añadir más platos al menú.(Redimensionar el array)
	 * Implementa dos métodos:
	 * 1. Uno que genere un menú aleatorio con n platos. Si el número de platos es mayor que los que existen en el menú se
	 *  mostrarán todos y un mensaje diciendo que no hay suficientes platos.
	 *  2. Crea un método que permita filtrar por tipo de plato y genere un menú aleatorio de ese tipo de plato.
	 */
	
	Plato[] platos = {new Plato("porra", "entrada", 2.5f), new Plato("paella", "principal", 9.99f), new Plato("arroz con leche", "postre", 2)};

	public Plato[] getPlatos() {
		return platos;
	}
	
	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}
	@Override
	public String toString() {
		return "Menu [platos=" + Arrays.toString(platos) + "]";
	}

	// Metodos de la clase
	public void anadirPlato (Plato p) {
		// Primero verificar si el plato se encuentra en el menu
		int pos = 0;
		boolean repetido = false;
		while (!repetido && pos < platos.length) {
			if (platos[pos].equals(p)) {
				System.out.println("Ese plato ya se encuentra en el menu, NO se añade");
				repetido = true;
			}
			pos++;
		}
		// si no estaba, lo agrego redimensionando el array
		if (!repetido) {
			Plato[] copy = Arrays.copyOf(platos, platos.length + 1);
			copy[copy.length - 1] = p;
			platos = copy;
			System.out.println("Plato añadido correctamente");
		}
	}

	public Plato[] generarPlatosAleatorios(int n) {
		Plato[] resultado = new Plato[0];
		resultado = obtenerPlatosAleatorios(n, platos);
		return resultado;
	}
	
	private Plato[] obtenerPlatosAleatorios (int n, Plato[] platos) {
		Plato[] resultado = new Plato[0];
		if (n > platos.length) {
			System.out.println("No hay suficientes platos, te muestro los que tengo");
			resultado = platos;
		} else {
			int contAux = 0;
			while (contAux < n) {
				int pos = (int) (Math.random() * platos.length);
				Plato plato = platos[pos];
				int i = 0;
				boolean repetido = false;
				while (!repetido && i < resultado.length) {
					if (resultado[i].equals(plato)) { // if (resultado[i] == plato) ??
						repetido = true;
						System.out.println("Ese plato esta repetido");
					}
					i++;
				}
				if (!repetido) {
					Plato[] copy = Arrays.copyOf(resultado, resultado.length + 1);
					copy[copy.length - 1] = plato;
					resultado = copy;
					contAux++;
				}
			}
		}
		return resultado;
	}

	public Plato[] generarListaPorTipo(String tipo, int n) {
		
		return null;
	}
	
}