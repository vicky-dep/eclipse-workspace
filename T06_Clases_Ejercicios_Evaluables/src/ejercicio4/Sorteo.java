package ejercicio4;

import java.util.Arrays;

public class Sorteo {

	private String[] nombres = {"Clara", "Pilar", "Vera", "Mia"};

	// Constructor
	public Sorteo() {
		super();
	}
	public Sorteo(String[] nombres) {
		super();
		this.nombres = nombres;
	}

	// Getters & Setters
	public String[] getNombres() {
		return nombres;
	}
	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}
	@Override
	public String toString() {
		return "Sorteo [nombres=" + Arrays.toString(nombres) + "]";
	}
	
	// Metodos de la clase
	public void anadirNombre(String n) {
		// Llamo a existeNombre() para que no este repetido
		if (!existeNombre(n)) {
			String[] copy = Arrays.copyOf(nombres, nombres.length + 1);
			copy[copy.length-1] = n;
			nombres = copy;
			System.out.println("Nombre añadido correctamente");										
		} else {
			System.out.println("Ese nombre ya esta participando del sorteo");
		}
	}
	
	public boolean existeNombre(String n) {
		int pos = 0;
		boolean encontrado = false;
		
		while (pos < nombres.length && !encontrado) {
			if (nombres[pos].equalsIgnoreCase(n)) {
				encontrado = true;
			}
			pos ++;
		}
		return encontrado;
	}
	
	public String[] nombresAlAzar(int numero) {
		String[] resultado = new String[0];
		int nombresAñadidos = 0;
		if (numero <= nombres.length) {
			while (nombresAñadidos < numero) {
				int pos = (int) (Math.random() * nombres.length);
				String nombre = nombres[pos];
				// No puede haber nombres repetidos
				boolean encontrado = false;
				int i = 0;
				while (i < resultado.length && !encontrado) {
					if (resultado[i].equalsIgnoreCase(nombre)) {
						encontrado = true;
					}
					i++;
				}
				if (!encontrado) {
					String[] copy = Arrays.copyOf(resultado, resultado.length + 1);
					copy[copy.length - 1] = nombre;
					resultado = copy;
					System.out.println("Seleccionado : " + nombre);
					nombresAñadidos++;
				}
			}
		} else {
			System.out.println("No hay nombres suficientes");
		}
		return resultado;
	}
	
	// Nunca estoy segura si debo agregar este metodo o con toString que esta mas arriba seria suficiente
	public void mostrarNombres() {
		System.out.println(Arrays.toString(nombres));
	}
}