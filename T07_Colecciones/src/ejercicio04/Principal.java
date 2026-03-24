package ejercicio04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Asociación Clave-Valor: Crea un HashMap donde la clave sea un código de empleado (Integer) 
		 * y el valor sea su nombre (String). Inserta cinco entradas y recupera el nombre de un empleado específico mediante su código.
		 */
		
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(2, "Luis"); // Permite rellenar un mapa con valores
		mapa.put(34, "Ana");
		mapa.put(3, "Maria");
		mapa.put(6, "Juan");
		mapa.put(50, "Carlos");
		
		// Para recorrer el mapa utilizamos sus claves
		Set<Integer> claves = mapa.keySet(); // Este permite obtener ...
		// Para recorrer las claves se usa iterator
		Iterator<Integer> iterator = claves.iterator();
		while (iterator.hasNext()) {
			Integer c = (Integer) iterator.next();
			String nombre = mapa.get(c); // con get obtenemos el valor ...
			System.out.println(nombre);
		}

	}

}