package examenesAnteriores04;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> listasDeNumeros = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(0);
		lista1.add(3);
		lista1.add(0);
		lista1.add(7);
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(0);
		lista2.add(0);
		lista2.add(0);
		lista2.add(0);
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		lista3.add(0);
		lista3.add(6);
		lista3.add(9);
		lista3.add(8);
		lista3.add(0);
		lista3.add(9);
		lista3.add(7);
		ArrayList<Integer> lista4 = new ArrayList<Integer>();
		lista4.add(0);
		lista4.add(0);
		lista4.add(0);
		lista4.add(0);
		lista4.add(9);
		lista4.add(7);
		lista4.add(0);
		lista4.add(0);
		listasDeNumeros.add(lista1);
		listasDeNumeros.add(lista2);
		listasDeNumeros.add(lista3);
		listasDeNumeros.add(lista4);
		listasDeNumeros.add(lista2);
		listasDeNumeros.add(lista1);
		System.out.println("Antes de eliminar");
		System.out.println(listasDeNumeros);

	}

}