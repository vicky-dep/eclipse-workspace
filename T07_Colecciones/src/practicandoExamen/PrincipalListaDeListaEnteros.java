package practicandoExamen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrincipalListaDeListaEnteros {

	public static void main(String[] args) {
		
		/*
		 * Partiendo de una lista de lista de enteros (ArrayList<ArrayList<Integer>>). 
		 * Implementa un método que elimine el número pedido al usuario que existen en cada lista. 
		 * No se puede hacer conversión entre tipos, se tiene que utilizar siempre ArrayList.
		 * Para recorrer las listas es necesario el uso de Iterator.
		 */

		ArrayList<ArrayList<Integer>> listaEnteros = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(0);
		l1.add(3);
		l1.add(0);
		l1.add(7);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(0);
		l2.add(0);
		l2.add(0);
		l2.add(0);
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(0);
		l3.add(6);
		l3.add(9);
		l3.add(8);
		l3.add(0);
		l3.add(9);
		l3.add(7);
		
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l4.add(0);
		l4.add(0);
		l4.add(0);
		l4.add(0);
		l4.add(7);
		l4.add(9);
		l4.add(0);
		l4.add(0);
		
		ArrayList<Integer> l5 = new ArrayList<Integer>();
		l5.add(0);
		l5.add(0);
		l5.add(0);
		l5.add(0);
		l5.add(0);

		ArrayList<Integer> l6 = new ArrayList<Integer>();
		l6.add(8);
		l6.add(7);
		l6.add(0);
		l6.add(8);
		l6.add(9);
		l6.add(0);
		l6.add(8);
		
		listaEnteros.add(l1);
		listaEnteros.add(l2);
		listaEnteros.add(l3);
		listaEnteros.add(l4);
		listaEnteros.add(l5);
		listaEnteros.add(l6);
		
		System.out.println("Lista antes de eliminar");
		System.out.println(listaEnteros);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero que deseas eliminar");
		int numAEliminar = sc.nextInt();
		
		Iterator<ArrayList<Integer>> it1 = listaEnteros.iterator();
		while (it1.hasNext()) {
			ArrayList<Integer> subLista = (ArrayList<Integer>) it1.next();
			Iterator<Integer> it2 = subLista.iterator();
			while (it2.hasNext()) {
				Integer numero = (Integer) it2.next();
				if (numero == numAEliminar) {
					it2.remove();
				}
			}
			if (subLista.isEmpty()) {
				it1.remove();
			}
		}
		
		System.out.println();
		System.out.println("Lista despues de eliminar");
		System.out.println(listaEnteros);
		
	}

}