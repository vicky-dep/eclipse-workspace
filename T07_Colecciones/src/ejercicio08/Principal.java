package ejercicio08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Utiliza el ejemplo de los colores del manual. Crea un ArrayList<String> que contenga una lista larga de colores, 
		 * donde muchos de ellos estén repetidos (por ejemplo: "rojo", "azul", "rojo", "verde", "azul", "azul").
		 * Crea un programa que procese esa lista y genere un HashMap<String, Integer>.
		 * La clave será el nombre del color y el valor será la cantidad de veces que aparece en la lista original.
		 * Deberás recorrer la lista con un bucle Iterator , usar containsKey para verificar si el color ya está en 
		 * el mapa y put para actualizar el contador.
		 */
		
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Rosa");
		colores.add("Azul");
		colores.add("Verde");
		colores.add("Rojo");
		colores.add("Rosa");
		colores.add("Rojo");
		colores.add("Amarillo");
		colores.add("Blanco");
		colores.add("Azul");
		colores.add("Rosa");
		
		// Creamos el mapa cuya clave sera el color y el valor las repeticiones dentro del listado
		HashMap<String, Integer> mapaColores = new HashMap<String, Integer>();
		// Recorremos la lista con Iterator (tiene que ser del tipo de la lista, en este caso String)
		Iterator<String> it = colores.iterator();
		while (it.hasNext()) { // HasNext comprueba que haya valores en la lista sin recorrer
			String color = (String) it.next(); // Obtiene el valor de la ...
			if (mapaColores.containsKey(color)) { // si en el mapa contiene una clave que es el color que se pasa como parametro devuelve true
				// Si ya hay una clave de ese color, aumentamos en 1...
				mapaColores.put(color, mapaColores.get(color) + 1); // get permite obtener el valor que tuviera esa clave, y como queremos almacenar repetidos, se suma 1
			} else {
				mapaColores.put(color, 1); // como es la primera vez que se almacena ese color en el mapa, se pone a 1 (creamos una dupla, clave-valor)
			}
		}
		System.out.println(mapaColores);
	}
}