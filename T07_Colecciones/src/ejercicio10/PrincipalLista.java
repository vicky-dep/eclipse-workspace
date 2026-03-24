package ejercicio10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import ejercicio010203.Gato;

public class PrincipalLista {

	public static void main(String[] args) {
		/*
		 * Utilizando la clase Gato definida en el documento:
		 * Crea un ArrayList<Gato> con al menos 10 gatos de diferentes razas ("persa", "angora", "manx", etc.).
		 * Generar un HashMap<String, ArrayList<Gato>> donde la clave sea el nombre de la raza y el valor sea 
		 * una lista de todos los gatos que pertenecen a esa raza.
		 * Al recorrer la lista original, si la raza (clave) no existe en el mapa, debes crear un nuevo ArrayList, 
		 * añadir al gato y guardarlo en el mapa. Si la raza ya existe, simplemente recuperas la lista con get y añades al nuevo gato.
		 */
		
		ArrayList<Gato> gatos = new ArrayList<Gato>();
		
		Gato g1 = new Gato("Tom", "blanco", "angora");
		Gato g2 = new Gato("Bolita", "blanco", "comun");
		Gato g3 = new Gato("Toby", "manchas", "egipcio");
		Gato g4 = new Gato("Lila", "negro", "persa");
		Gato g5 = new Gato("Bella", "blanco", "persa");
		Gato g6 = new Gato("Brutus", "negro", "egipcio");
		Gato g7 = new Gato("Tommy", "marron", "egipcio");
		Gato g8 = new Gato("Pulguita", "negro", "persa");
		Gato g9 = new Gato("Carbon", "negro", "comun");
		Gato g10 = new Gato("Lilly", "marron", "persa");
		
		gatos.add(g1);
		gatos.add(g2);
		gatos.add(g3);
		gatos.add(g4);
		gatos.add(g5);
		gatos.add(g6);
		gatos.add(g7);
		gatos.add(g8);
		gatos.add(g9);
		gatos.add(g10);

		HashMap<String, ArrayList<Gato>> mapaGatos = new HashMap<String, ArrayList<Gato>>();
		
		// Recorremos con el iterator el listado de gatos
		Iterator<Gato> it = gatos.iterator();
		while (it.hasNext()) {
			Gato gato = (Gato) it.next();
			String raza = gato.getRaza(); // La raza sera la clave del mapa
			if (mapaGatos.containsKey(raza)) {
				// Ya hay gatos de esa raza almacenados en el mapa
				// Obtenemos el listado de gatos guardados en el mapa
				ArrayList<Gato> lista = mapaGatos.get(raza);
				lista.add(gato); // Añadimos el gato
				// La lista actualizada la añadimos al mapa
				mapaGatos.put(raza, lista); // put machaca lo que habia anteriormente (esta lista reemplaza a lo que ya hubiera antes)
			} else {
				// Al ser el valor un tipo compuesto de datos, hay que crearse el arraylist y añadir el gato
				ArrayList<Gato> nuevaLista = new ArrayList<Gato>();
				nuevaLista.add(gato);
				mapaGatos.put(raza, nuevaLista); // Creamos una nueva entrada en el mapa con la nueva raza y el listado de gatos
			}
		}
		
	}

}