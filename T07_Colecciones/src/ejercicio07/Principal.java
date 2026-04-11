package ejercicio07;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Imagina que tienes un diccionario Inglés-Español representado por un HashMap<String, String>.
		 * Crea un método que reciba este mapa y devuelva un nuevo HashMap<String, String> que sea el 
		 * "traductor inverso" (donde las claves sean las palabras en español y los valores las palabras en inglés).
		 * Debes recorrer el mapa original utilizando entrySet() y los métodos getKey() y getValue() para realizar la inversión.
		 * Se puede utilizar cualquier método de HashMap  
		 * Ten en cuenta que, mientras en el mapa original las claves no se repiten, en el proceso de inversión podrías encontrar 
		 * valores duplicados que ahora intentarían ser claves.
		 */

		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("hello", "hola");
		diccionario.put("house", "casa");
		diccionario.put("dog", "perro");
		diccionario.put("home", "casa");
		diccionario.put("bye", "chau");
		diccionario.put("cat", "gato");
		diccionario.put("car", "auto");
		diccionario.put("water", "agua");
		
		System.out.println("Diccionario original: ");
		System.out.println(diccionario);
		System.out.println("Despues de invertir (se borran claves duplicadas, quedando la ultima insercion)");
		System.out.println(invertirDiccionario(diccionario));
		
	}

	private static HashMap<String, String> invertirDiccionario(HashMap<String, String> mapa) {

	    HashMap<String, String> inverso = new HashMap<>();

	    for (Map.Entry<String, String> entrada : mapa.entrySet()) {

	        String claveIngles = entrada.getKey();
	        String valorEspanol = entrada.getValue();

	        inverso.put(valorEspanol, claveIngles);

	    }

	    return inverso;
	}
}