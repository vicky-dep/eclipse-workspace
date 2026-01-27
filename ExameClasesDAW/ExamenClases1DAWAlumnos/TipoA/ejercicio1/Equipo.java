package ejercicio1;

import java.util.Arrays;

public class Equipo {
	/**
	 * Crea una clase Equipo, que almacene una lista de empleados (representados por la clase Empleado, 
	 * que incluye nombre, edad, puesto y nivel de experiencia(principiante, intermedio, avanzado)). 
	 * Partirá de un array predefinido con empleados.La clase debe permitir agregar nuevos empleados.(Redimensionar el array)
	 * Dos empleados se consideran iguales si tienen el mismo nombre,edad y puesto.
	 * Implementa dos métodos:
	 * 1. Uno que forme un equipo aleatorio con n empleados. Se le avisará al usuario si no hay empleados suficientes.
	 * 2. Crea un método que permita generar una lista aleatoria de n Empleados del nivel que se le pase como parámetro.
	 * Se le avisará al usuario si no hay empleados de ese tipo suficientes.
	 */

	private Empleado e1 = new Empleado ("Clara", "Senior", 26, "avanzado");
	private Empleado[] empleados = { e1, new Empleado("Pilar", "Junior", 36, "intermedio")};
	
	public Empleado[] getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
	@Override
	public String toString() {
		return "Equipo [empleados=" + Arrays.toString(empleados) + "]";
	}

	public void anadirEmpleado(Empleado e) {
		// Comprobamos que el empleado no exista en el array original
		// Dos empleados se consideran iguales si tienen el mismo nombre,edad y puesto.
		int pos = 0;
		boolean repetido = false;
		while (pos < empleados.length && !repetido) {
			if (empleados[pos].getNombre().equalsIgnoreCase(e.getNombre()) &&
			    empleados[pos].getEdad() == e.getEdad() &&
			    empleados[pos].getPuesto().equalsIgnoreCase(e.getPuesto())) {
				repetido = true;
			}
			pos++;
		}
		if (!repetido) {
			// Añadimos al array el empleado nuevo
			Empleado[] copy = Arrays.copyOf(empleados, empleados.length + 1);
			copy[copy.length - 1] = e;
			empleados = copy;
			System.out.println("Empleado añadido correctamente");
		} else {
			System.out.println("Ese empleado ya existe");
		}
	}
	
	public Empleado[] generarLista(int cantidad) {
		Empleado[] resultado = new Empleado[0];
		resultado = obtenerEmpleadosAleatorios(cantidad, empleados);
		return resultado;
	}
	
	private Empleado[] obtenerEmpleadosAleatorios(int cantidad, Empleado[] empleados) {
		Empleado[] resultado = new Empleado[0];
		if (cantidad > empleados.length) {
			System.out.println("No hay empleados suficientes para formar el equipo");
			// resultado = empleados;
		} else {
			int contAux = 0;
			while (contAux < cantidad) {
				int pos = (int) (Math.random() * empleados.length);
				Empleado empleado = empleados[pos];
				int i = 0;
				boolean encontrado = false;
				while (i < resultado.length && !encontrado) {
					if (resultado[i].equals(empleado)) { // if (resultado[i] == empleado)
						encontrado = true;
					}
					i++;
				}
				if (!encontrado) {
					Empleado[] copy = Arrays.copyOf(resultado, resultado.length + 1);
					copy[copy.length - 1] = empleado;
					resultado = copy;
					contAux++;
				}
			}
		}
		return resultado;
	}
	
	public Empleado[] generarListaPorNivel(String experiencia, int cantidad) {
		Empleado[] resultado = new Empleado[0];
		Empleado[] empleadosFiltrados = new Empleado[0];
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i].getExperiencia().equalsIgnoreCase(experiencia)) {
				Empleado[] copy = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
				copy[copy.length - 1] = empleados[i];
				empleadosFiltrados = copy;
			}
			// Una vez que tengo el array con los empleados de la categoria elegida,
			// genero aleatoriamente el array resultado
		}
		resultado = obtenerEmpleadosAleatorios(cantidad, empleadosFiltrados);
		return resultado;
	}
	
}