package practicandoExamen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrincipalListaDeListaCiudades2 {

	public static void main(String[] args) {
		
		/*
		 * Partiendo de una lista de lista de cadenas de texto (ArrayList<ArrayList<String>>). 
		 * Implementa un método que elimine la palabra pedida al usuario que existen en cada lista. 
		 * No se puede hacer conversión entre tipos, se tiene que utilizar siempre ArrayList.
		 * Para recorrer las listas es necesario el uso de Iterator.
		 */

		ArrayList<ArrayList<String>> listaDeLista = new ArrayList<ArrayList<String>>();
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Granada");
		l1.add("Granada");
		l1.add("Sevilla");
		l1.add("Cordoba");
		l1.add("Malaga");
		l1.add("Huelva");
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Granada");
		l2.add("Granada");
		l2.add("Granada");
		l2.add("Granada");
		ArrayList<String> l3 = new ArrayList<String>();
		l3.add("Cuenca");
		l3.add("Cadiz");
		l3.add("Toledo");
		l3.add("Sevilla");
		l3.add("Granada");
		l3.add("Madrid");
		l3.add("Sevilla");
		ArrayList<String> l4 = new ArrayList<String>();
		l4.add("Sevilla");
		l4.add("Sevilla");
		l4.add("Sevilla");
		l4.add("Sevilla");
		l4.add("Jerez");
		l4.add("Alicante");
		l4.add("Sevilla");
		l4.add("Sevilla");
		ArrayList<String> l5 = new ArrayList<String>();
		l5.add("Granada");
		l5.add("Granada");
		l5.add("Granada");
		l5.add("Granada");
		l5.add("Granada");
		ArrayList<String> l6 = new ArrayList<String>();
		l6.add("Barcelona");
		l6.add("Bilbao");
		l6.add("Santiago");
		l6.add("Vigo");
		l6.add("Teruel");
		l6.add("Zaragoza");
		l6.add("Malaga");
		
		listaDeLista.add(l1);
		listaDeLista.add(l2);
		listaDeLista.add(l3);
		listaDeLista.add(l4);
		listaDeLista.add(l5);
		listaDeLista.add(l6);
		
		System.out.println("Antes de eliminar");
		System.out.println(listaDeLista);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la ciudad que quieres eliminar");
		String ciudadAEliminar = sc.next();
		
		Iterator<ArrayList<String>> it1 = listaDeLista.iterator();
		while (it1.hasNext()) {
			ArrayList<String> subLista = (ArrayList<String>) it1.next();
			Iterator<String> it2 = subLista.iterator();
			while (it2.hasNext()) {
				String ciudad = (String) it2.next();
				if (ciudad.equalsIgnoreCase(ciudadAEliminar)) {
					it2.remove();
				}
			}	
			if (subLista.isEmpty()) {
				it1.remove();
			}
		}
		
		System.out.println();
		System.out.println("Despues de eliminar");
		System.out.println(listaDeLista);
	}

}