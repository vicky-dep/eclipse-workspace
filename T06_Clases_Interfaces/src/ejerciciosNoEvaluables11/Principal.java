package ejerciciosNoEvaluables11;

import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {
		
		Futbolista f1 = new Futbolista("78451203V", "Abril", 15, 3);
		Futbolista f2 = new Futbolista("98451203R", "Lucia", 18, 2);
		Futbolista f3 = new Futbolista("85451203R", "Luis", 17, 1);
		Futbolista f4 = new Futbolista("45451203M", "Juan", 15, 2);
		Futbolista f5 = new Futbolista("23451203V", "Clara", 16, 5);
		
		Futbolista[] equipo = {f1,f2,f3,f4,f5};
		System.out.println("Array sin ordenar: ");
		System.out.println(Arrays.toString(equipo));
		System.out.println("Array ordenado por dni (orden natural): ");
		Arrays.sort(equipo);
		System.out.println(Arrays.toString(equipo));
		
		System.out.println("Array ordenado por nombre: ");
		// Utilizaremos las clases comparator
		CompararNombre comparadorNombre = new CompararNombre();
		Arrays.sort(equipo, comparadorNombre);
		System.out.println(Arrays.toString(equipo));
		
		System.out.println("Array ordenado por edad: ");
		// Utilizaremos las clases comparator
		CompararEdad comparadorEdad = new CompararEdad();
		Arrays.sort(equipo, comparadorEdad);
		System.out.println(Arrays.toString(equipo));
		
		System.out.println("Array ordenado por edad y nombre: ");
		// Utilizaremos las clases comparator
		ComparadorEdadNombre comparadorEdadNombre = new ComparadorEdadNombre();
		Arrays.sort(equipo, comparadorEdadNombre);
		System.out.println(Arrays.toString(equipo));
		
	}
}