package examenesAnteriores05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		Map<String, List<Traduccion>> mapa = new HashMap<String, List<Traduccion>>();
		Traduccion t1 = new Traduccion("house", "ingles");
		Traduccion t2 = new Traduccion("maison", "frances");
		Traduccion t3 = new Traduccion("casa", "italiano");
		List<Traduccion> list1 = new ArrayList<Traduccion>();
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		mapa.put("casa", list1);
		Traduccion t4 = new Traduccion("car", "ingles");
		Traduccion t5 = new Traduccion("voiture", "frances");
		Traduccion t6 = new Traduccion("auto", "italiano");
		List<Traduccion> list2 = new ArrayList<Traduccion>();
		list2.add(t4);
		list2.add(t5);
		list2.add(t6);
		mapa.put("coche", list2);
		Traduccion t7 = new Traduccion("dog", "ingles");
		Traduccion t8 = new Traduccion("chien", "frances");
		Traduccion t9 = new Traduccion("cane", "italiano");
		List<Traduccion> list3 = new ArrayList<Traduccion>();
		list3.add(t7);
		list3.add(t8);
		list3.add(t9);
		mapa.put("perro", list3);

		HashMap<String, List<Palabra>> salida = convertirMapa(mapa);
		System.out.println("Resultado:");
		System.out.println(salida);

	}

	private static HashMap<String, List<Palabra>> convertirMapa(Map<String, List<Traduccion>> mapa) {
		HashMap<String, List<Palabra>> resultado = new HashMap<String, List<Palabra>>();
		Set<String> claves = mapa.keySet();
		Iterator<String> iterator = claves.iterator();
		while (iterator.hasNext()) {
			String clave = (String) iterator.next();
			List<Traduccion> list = mapa.get(clave);
			Iterator<Traduccion> iterator2 = list.iterator();
			while (iterator2.hasNext()) {
				Traduccion traduccion = (Traduccion) iterator2.next();
				if (resultado.containsKey(traduccion.getIdioma())) {
					List<Palabra> list2 = resultado.get(traduccion.getIdioma());
					Palabra palabraNueva = new Palabra(clave, traduccion.getPalabra());
					list2.add(palabraNueva);
					resultado.put(traduccion.getIdioma(), list2);
				} else {
					// Creamos una nueva entrada con el nuevo idioma
					List<Palabra> listaNueva = new ArrayList<Palabra>();
					Palabra p = new Palabra(clave, traduccion.getPalabra());
					listaNueva.add(p);
					resultado.put(traduccion.getIdioma(), listaNueva);
				}
			}

		}
		return resultado;
	}

}