package ejercicio2;

import java.util.Arrays;

public class Zoo {
	/**
	 * Diseña una clase llamada Zoo que permita gestionar los animales disponibles en un zoo. 
	 * El sistema debe ser capaz de almacenar hasta un máximo de 200 animales en una lista.
	 * Cada animal estará identificado por un nombre único. La clase debe implementar los siguientes métodos:
	 * 1. Registrar animales: Permite agregar un animales al zoo, dado su nombre. Si el nombre ya está registrado, 
	 * muestra un mensaje indicando que no se puede registrar el mismo animal dos veces. Si el inventario está lleno, 
	 * muestra un mensaje indicando que no se pueden registrar más animales.
	 * 2. Eliminar animales: Permite eliminar un animal del zoo, dado su nombre. 
	 * Si el animal no se encuentra en el inventario, muestra un mensaje de error. 
	 * 3. Consultar espacio disponible: Devuelve la cantidad de espacios disponibles en el zoo. 
	 * 4. Mostrar animales registrados: Muestra una lista de los nombres de todos los animales registrados en el zoo. 
	 * Si no hay animales registrados, muestra un mensaje indicando que el inventario está vacío. 
	 * 5. Buscar animales: Recibe un nombre de animales y verifica si ese animales está registrado en el zoo, 
	 * devolviendo un mensaje adecuado dependiendo de si está o no registrado.
	 */

	private final int CAPACIDAD = 200;
	private String[] animales = new String[CAPACIDAD];

	// Constructor
	public Zoo() {
		super();
	}
	public Zoo(String[] animales) {
		super();
		this.animales = animales;
	}
	
	// Getters & Setters
	public String[] getAnimales() {
		return animales;
	}
	public void setAnimales(String[] animales) {
		this.animales = animales;
	}
	@Override
	public String toString() {
		return "Zoo [CAPACIDAD=" + CAPACIDAD + ", animales=" + Arrays.toString(animales) + "]";
	}
	
	// Metodos de la clase
	public void registrarAnimal(String animal) {
		boolean hayHueco = true;
		int i = 0;
		while (hayHueco && i < animales.length) {
			if (animales[i] != null && animales[i].equalsIgnoreCase(animal)) {
				System.out.println("No se puede registrar el mismo animal dos veces");
				hayHueco = false;
			}
			i++;
		}
		if (hayHueco) {
			boolean encontrado = false;
			int cont = 0;
			while (!encontrado && cont < animales.length) {
				if (animales[cont] == null) {
					animales[cont] = animal;
					System.out.println("Animal registrado correctamente");
					encontrado = true;
				}
				cont++;
			} if (!encontrado) {
				System.out.println("No se pueden registrar mas animales, el inventario esta lleno");				
			}
		}
	}
	
	public void eliminarAnimal(String animal) {
		boolean encontrado = false;
		int pos = 0;
		while (!encontrado && pos < animales.length) {
			if (animales[pos] != null && animales[pos].equalsIgnoreCase(animal)) {
				System.out.println("Animal eliminado correctamente"); 
				animales[pos] = null;
				encontrado = true;
			}
			pos++;
		}
		if (!encontrado) {
			System.out.println("Error: no se puede eliminar un animal que no existe en el inventario");
		}
	}
	
	public int consultarEspacio() {
		int espacios = 0;
		for (int i = 0; i < animales.length; i++) {
			if (animales[i] == null) {
				espacios++;
			}
		}
		return espacios;
	}
	
	public void mostrarAnimales() {
		boolean hayAnimales = false;
		for (int i = 0; i < animales.length; i++) {
			if (animales[i] != null) {
				System.out.println(animales[i]);
				hayAnimales = true;
			}
		}
		if (!hayAnimales) {
			System.out.println("No hay animales registrados, el inventario esta vacio");
		}
	}
	
	public String buscarAnimal(String animal) {
		boolean encontrado = false;
		String mensaje = "";
		int pos = 0;
		while (!encontrado && pos < animales.length) {
			if(animales[pos] != null && animales[pos].equalsIgnoreCase(animal)) {
				mensaje = "Ese animal esta registrado";
				encontrado = true;
			}
			pos++;
		}
		if (!encontrado) {
			mensaje = "Ese animal NO esta registrado";
		}
		return mensaje;
	}
}