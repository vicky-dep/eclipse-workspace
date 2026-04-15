package ejercicio010203;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Gato> gatos = new ArrayList<Gato>();
		
		Gato g1 = new Gato("Tom", "blanco", "angora");
		Gato g2 = new Gato("Bolita", "blanco", "comun");
		Gato g3 = new Gato("Toby", "manchas", "egipcio");
		Gato g4 = new Gato("Lila", "negro", "persa");
		
		gatos.add(g1);
		gatos.add(g2);
		gatos.add(g3);
		gatos.add(g4);
		gatos.add(g2); // añade aunque este repetido, porque es un array list (un conjunto no acepta repetidos)
		
		// Creamos un iterador del mismo tipo de la lista
		Iterator<Gato> it = gatos.iterator();
		while (it.hasNext()) { // Nos indica si hay elementos en la lista por recorrer
			Gato gato = (Gato) it.next(); // Obtiene el elemento actual
			System.out.println(gato);
		}
		
		// Probamos que la ordenacion se hace correctamente
		System.out.println("Sin ordenar: ");
		System.out.println(gatos);
		System.out.println("Orden por defecto (nombre): ");
		Collections.sort(gatos);
		System.out.println(gatos);
		
		// conversiones !!
		// Para eliminar elementos repetidos de una lista
		// Pasamos de lista->conjunto y de conjunto a lista
		
		HashSet<Gato> conjuntoGatos = new HashSet<Gato>();
		conjuntoGatos.addAll(gatos); // internamente, mete solo los NO repetidos
		gatos.clear(); // la deja nueva
		gatos.addAll(conjuntoGatos); // una vez que dejamos limpia la lista, le agregamos el conjunto
		
		
	}
}