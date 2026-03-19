package ejerciciosTransparencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero mayor que 0, -1 para salir");
		int num = sc.nextInt();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		while (num != -1 && num >= 0) {
			lista.add(num);
			System.out.println("Introduce un numero mayor que 0, -1 para salir");
			num = sc.nextInt();
		}
		System.out.println(lista);
		// Mostramos los numeros pares
		// Para recorrer una lista usamos Iterator
		// Creamos un objeto Iterator del tipo de la lista
		// y le asignamos el iterator() que tienen las list
		Iterator<Integer> it = lista.iterator();
		// Para recorrer la lista, usamos 2 metodos del iterator
		while (it.hasNext()) { // hasNext comprueba que hay elementos que recorrer en la lista
			// Devuelve true si tiene elementos, sino false y termina el bucle
			Integer variable = it.next(); // el valor de la lista en la que este posicionado el puntero del iterator
			if (variable % 2 == 0) {
				System.out.println("Numero par: " + variable);
			}
		}
		////////////////////////////////
		Iterator<Integer> it2 = lista.iterator();
		// Recorremos la lista y eliminamos los multiplos de 3
		while (it2.hasNext()) {
			Integer variable = it2.next();
			if (variable % 3 == 0) {
				it2.remove(); // Al estar dentro del bucle, se usa remove() del iterator
			}
		}
		System.out.println("Lista sin múltiplos de 3: " + lista);
	}
}