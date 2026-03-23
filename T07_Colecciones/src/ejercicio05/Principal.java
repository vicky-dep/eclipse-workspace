package ejercicio05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("hello", "hola");
		diccionario.put("car", "coche");
		diccionario.put("card", "tarjeta");
		diccionario.put("dog", "perro");
		
		// El entrySet genera un conjunto de mapa (es mas dificil, mejor utilizar keySet
		Set<Entry<String, String>> entrySet = diccionario.entrySet();
		
		// Recorremos la coleccion
		Iterator<Entry<String, String>> iterator = entrySet.iterator(); // alt + L
		while (iterator.hasNext()) {
			Entry<String, String> mapa = iterator.next();
			System.out.println(mapa);
		}
		
		// Para recorrer un mapa lo mas facil es utilizar keyset
		Set<String> claves = diccionario.keySet();
		Iterator<String> it = claves.iterator();
		while (it.hasNext()) {
			String c = it.next();
			String v = diccionario.get(c);
			System.out.println("Clave: " + c + " Valor: " + v);	
		}
	
	}

}