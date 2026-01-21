package ejercicio23;

import java.util.Arrays;

public class CD {
	/**
	 * Desarrolla una clase CD con los siguientes atributos: 
	 * canciones: un array de objetos de la clase Cancion.
	 * contador: la siguiente posición libre del array canciones.
	 * y los siguientes métodos:
	 * CD(): constructor predeterminado (creará el array canciones).
	 * numeroCanciones(): devuelve el valor del contador de canciones.
	 * dameCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
	 * grabaCancion(int, Cancion): cambia la Cancion de la posición indicada por la
	 * nueva Cancion proporcionada.
	 * agrega(Cancion): agrega al final del array la Cancion proporcionada.
	 * elimina(int): elimina la Cancion que se encuentra en la posición indicada.
	 */
	
	// Atributos
	private Cancion[] canciones;
	private int contador;

	// Constructor
	/*
	public CD() {
		super();
		canciones = new Cancion[10]; // tamaño fijo
		contador = 0;
	}*/
	public CD() {
		super();
		canciones = new Cancion[0];
	}
	
	@Override
	public String toString() {
		return "CD [canciones=" + Arrays.toString(canciones) + ", contador=" + contador + "]";
	}

	// Metodos de la clase
	public int numeroCanciones() {
		return contador;
	}

	// que haya un solo return !!
	public Cancion dameCancion(int pos) { 
		// suponemos que el usuario usa desde la posicion 0
		Cancion c = null;
		if (pos < canciones.length) {
			c = canciones[pos];
			System.out.println("Cancion encontrada");
		}
		return c;
		/*
		if (pos >= 0 && pos < contador) {
			return canciones[pos];
		} else {
			return null;
		}*/
	}
	
	public void grabaCancion(int pos, Cancion nueva) {
		// suponemos que el usuario usa desde la posicion 0
		if (pos < canciones.length) {
			canciones[pos] = nueva;
			System.out.println("Posicion cambiada correctamente");
		} else {
			System.out.println("Posicion no valida");
		}
		/*
		if (pos >= 0 && pos < contador) {
			canciones[pos] = nueva;
		} else {
			System.out.println("Posicion incorrecta");
		}*/
	}
	
	public void agregarCancion(Cancion c) {
		Cancion[] copy = Arrays.copyOf(canciones, canciones.length+1);
		copy[copy.length-1] = c;
		canciones = copy;
		contador++;
		System.out.println("Cancion agregada correctamente");
		/*
		if (contador < canciones.length) {
			canciones[contador] = c;
			contador++;
		} else {
			System.out.println("El CD esta lleno");
		}*/
	}
	
	public void eliminarCancion(int pos) {
		// redimensionar con uno menos
		Cancion[] aux = new Cancion[canciones.length-1];
		if (pos < canciones.length) {
			int cont = 0;
			for (int i = 0; i < canciones.length; i++) {
				if (pos != i) {
					aux[cont] = canciones[i];
					cont++;
				}
			}
			canciones = aux;
			contador--;
			System.out.println("Cancion eliminada correctamente");
		} else {
			System.out.println("Posicion no valida");
		}
		/*
		if (pos >= 0 && pos < contador) {
			for (int i = pos; i < contador-1; i++) {
				canciones[i] = canciones[i+1];
			}
			canciones[contador - 1] = null;
			contador--;
		} else {
			System.out.println("Posicion incorrecta");
		}*/
	}
	
}