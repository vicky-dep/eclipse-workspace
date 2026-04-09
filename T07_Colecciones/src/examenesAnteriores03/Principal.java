package examenesAnteriores03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 * Partiendo de una lista de lista de cadenas de texto (ArrayList<ArrayList<String>> ). Implementa un método que elimine la palabra pedida al
		 * usuario que existen en cada lista. No se puede hacer conversión entre tipos, se tiene
		 * que utilizar siempre ArrayList.Para recorrer las listas es necesario el uso de Iterator.
		 * En este ejemplo la palabra a eliminar es Granada.
		 */
		
		ArrayList<ArrayList<String>> lista = new ArrayList<ArrayList<String>>();
		ArrayList<String> ciudades = new ArrayList<String>();
		ciudades.add("Málaga");
		ciudades.add("Cádiz");
		ciudades.add("Madrid");
		ciudades.add("Málaga");
		ArrayList<String> ciudades2 = new ArrayList<String>();
		ciudades2.add("Roma");
		ciudades2.add("Granada");
		ciudades2.add("Cádiz");
		ciudades2.add("León");
		ArrayList<String> ciudades3 = new ArrayList<String>();
		ciudades3.add("Granada");
		ciudades3.add("Huelva");
		ciudades3.add("Madrid");
		ciudades3.add("Murcia");
		ArrayList<String> ciudades4 = new ArrayList<String>();
		ciudades4.add("Huelva");
		ciudades4.add("Toledo");
		ciudades4.add("Granada");
		ciudades4.add("Sevilla");
		lista.add(ciudades);
		lista.add(ciudades2);
		lista.add(ciudades3);
		lista.add(ciudades4);
		System.out.println("Antes de eliminar:");
		System.out.println(lista);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que ciudad quieres eliminar: ");
		String ciudadAEliminar = sc.next();
		
        Iterator<ArrayList<String>> it1 = lista.iterator();
        while (it1.hasNext()) {
            ArrayList<String> listaCiudades = it1.next();
            Iterator<String> it2 = listaCiudades.iterator();
            while (it2.hasNext()) {
                String ciudad = (String) it2.next();
                if (ciudad.equalsIgnoreCase(ciudadAEliminar)) {
                    it2.remove();
                }
            }
        }

        System.out.println("Después de eliminar:");
        System.out.println(lista);

	}
	
}