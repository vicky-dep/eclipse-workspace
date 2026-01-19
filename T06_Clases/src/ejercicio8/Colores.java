package ejercicio8;

import java.util.Arrays;

import ejercicio5.Contacto;

public class Colores {
	/*
	 * En el momento de decorar una casa, una habitación o cualquier objeto, se plantea el problema de elegir la paleta de colores 
	 * que vamos a utilizar en nuestra decoración. Existe una solución, algo atrevida, que consiste en utilizar colores al azar.
	 * Diseña la clase Colores, que alberga por defecto una serie de colores (mediante una cadena), aunque es posible añadir tantos 
	 * como necesitemos. La clase tendrá un método que devuelve una tabla con los n colores que necesitemos elegidos al azar sin repeticiones.
	 */
	
	private String[] colores = {"blanco", "negro", "azul", "rojo", "amarillo", "verde", "rosa", "morado"};

	// Constructor
	public Colores() {
		super();
	}
	public Colores(String[] colores) {
		super();
		this.colores = colores;
	}

	// Getters & Setters
	public String[] getColores() {
		return colores;
	}
	public void setColores(String[] colores) {
		this.colores = colores;
	}
	@Override
	public String toString() {
		return "Colores [colores=" + Arrays.toString(colores) + "]";
	}

	// Metodos
	public void anadirColor(String c) {
		// No puede haber colores repetidos
		int pos = 0;
		boolean encontrado = false;
		
		while (pos < colores.length && !encontrado) {
			if (colores[pos].equalsIgnoreCase(c)) {
				encontrado = true;
			}
			pos ++;
		}
		if (!encontrado) {
			String[] copy = Arrays.copyOf(colores, colores.length + 1);
			copy[copy.length-1] = c;
			colores = copy;
			System.out.println("Color añadido correctamente");										
		} else {
			System.out.println("Ese color ya esta en la paleta");
		}
		
	}
	
	public String[] paletaAlAzar(int numColores) {
		String[] resultado = new String[0];
		int coloresAñadidos = 0;
		if (numColores <= colores.length) {
			while (coloresAñadidos < numColores) {
				int pos = (int) (Math.random() * colores.length - 1);
				String color = colores[pos];
				// No puede haber colores repetidos
				boolean encontrado = false;
				int i = 0;
				while (i < resultado.length && !encontrado) {
					if (resultado[i].equalsIgnoreCase(color)) {
						encontrado = true;
					}
					i++;
				}
				if (!encontrado) {
					String[] copy = Arrays.copyOf(resultado, resultado.length + 1);
					copy[copy.length - 1] = color;
					resultado = copy;
					System.out.println("Color añadido correctamente");
					coloresAñadidos++;
				}
			}
		} else {
			System.out.println("No hay colores suficientes");
		}
		return resultado;
	}
}