package ejercicio04;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("Pepe", "A001", 13000);
		Cuenta c2 = new Cuenta("Ana", "A015", 800);
		Cuenta c3 = new Cuenta("Esther", "A089", 55000);
		Cuenta c4 = new Cuenta("Javier", "A043", 22000);

		Cuenta[] cuentas = {c1,c2,c3,c4};
		Banco b = new Banco(cuentas); // no hacia falta la clase Banco
		
		System.out.println(Arrays.toString(cuentas));
		
		String[] productosC1 = c1.ofrecerProductos();
		System.out.println(Arrays.toString(productosC1));
		
		String[] productosC2 = c2.ofrecerProductos();
		System.out.println(Arrays.toString(productosC2));
		
		String[] productosC3 = c3.ofrecerProductos();
		System.out.println(Arrays.toString(productosC3));
		
		String[] productosC4 = c4.ofrecerProductos();
		System.out.println(Arrays.toString(productosC4));
		
		// probamos orden natural:
		Arrays.sort(b.getCuentas());
		System.out.println(Arrays.toString(b.getCuentas()));
		
		// me faltó terminar de hacer pruebas...
		
		System.out.println("Orden natural: ");
		Arrays.sort(cuentas);
		System.out.println(Arrays.toString(cuentas));
		
		
		/*
		 * Principal de Leticia: 
		Cuenta c1 = new Cuenta("C1", "Ana", 850f);
		Cuenta c2 = new Cuenta("A6", "Lucía", 150000);
		Cuenta c3 = new Cuenta("R2", "Carmen", 20500);
		Cuenta[] cuentas = { c1, c2, c3 };
		// Probamos la ordenación
		System.out.println("Sin ordenar");
		System.out.println(Arrays.toString(cuentas));
		System.out.println("Orden natural");
		Arrays.sort(cuentas);
		System.out.println(Arrays.toString(cuentas));
		System.out.println("Ordenar por nombre");
		NombreComparator nc = new NombreComparator();
		// Para ordenar con los comparators hace falta crearse
		// un objeto y pasarlo al sort
		Arrays.sort(cuentas, nc);
		System.out.println(Arrays.toString(cuentas));
		System.out.println("Ordenar por dinero");
		DineroComparator dc = new DineroComparator();
		Arrays.sort(cuentas, dc);
		System.out.println(Arrays.toString(cuentas));
		System.out.println("Dinero inverso");
		Arrays.sort(cuentas, dc.reversed());// Permite invertir el orden
		System.out.println(Arrays.toString(cuentas));
		System.out.println("Ordenar por dinero inverso con comparator");
		DineroInversoComparator dci = new DineroInversoComparator();
		Arrays.sort(cuentas, dci);
		System.out.println(Arrays.toString(cuentas));
		 */
		
	}
}