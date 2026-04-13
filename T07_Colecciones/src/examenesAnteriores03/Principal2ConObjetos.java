package examenesAnteriores03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal2ConObjetos {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Ciudad>> lista = new ArrayList<ArrayList<Ciudad>>();
		ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
		
		Ciudad c1 = new Ciudad ("Málaga", 20000);
		Ciudad c2 = new Ciudad ("Cádiz", 5000);
		Ciudad c4 = new Ciudad ("Madrid", 1000000);
		Ciudad c6 = new Ciudad ("Toledo", 8520);
		
		ciudades.add(c1	);
		ciudades.add(c2);
		ciudades.add(c4);
		ciudades.add(c6);
		
		ArrayList<Ciudad> ciudades2 = new ArrayList<Ciudad>();
		ciudades2.add(c4);
		ciudades2.add(c4);
		
		ArrayList<Ciudad> ciudades3 = new ArrayList<Ciudad>();
		ciudades3.add(c4);
		ciudades3.add(c6);
		ciudades3.add(c4);
		ciudades3.add(c1);
		
		ArrayList<Ciudad> ciudades4 = new ArrayList<Ciudad>();
		ciudades4.add(c4);
		ciudades4.add(c1); 
		ciudades4.add(c1);
		ciudades4.add(c2);
		
		lista.add(ciudades);
		lista.add(ciudades2);
		lista.add(ciudades3);
		lista.add(ciudades4);
		
		System.out.println("Antes de eliminar:");
		System.out.println(lista);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que ciudad quieres eliminar: ");
		String ciudadAEliminar = sc.next();
		
		Iterator<ArrayList<Ciudad>> it1 = lista.iterator();
		while (it1.hasNext()) {
            ArrayList<Ciudad> listaCiudades = (ArrayList<Ciudad>) it1.next();
            Iterator<Ciudad> it2 = listaCiudades.iterator();
            while (it2.hasNext()) {
                Ciudad ciudad = (Ciudad) it2.next();
                if (ciudad.getNombre().equalsIgnoreCase(ciudadAEliminar)) {
                    it2.remove();
                }
            }
            if (listaCiudades.isEmpty()) {
            	it1.remove();
            }
        }

        System.out.println("Después de eliminar:");
        System.out.println(lista);

	}
	
}