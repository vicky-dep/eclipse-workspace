package ejercicio04;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("Pepe", "A001", 13000);
		Cuenta c2 = new Cuenta("Ana", "A015", 800);
		Cuenta c3 = new Cuenta("Esther", "A089", 55000);
		Cuenta c4 = new Cuenta("Javier", "A043", 22000);

		Cuenta[] cuentas = {c1,c2,c3,c4};
		
		System.out.println(Arrays.toString(cuentas));
		
		String[] productosC1 = c1.ofrecerProductos();
		System.out.println(Arrays.toString(productosC1));
		
		String[] productosC2 = c2.ofrecerProductos();
		System.out.println(Arrays.toString(productosC2));
		
		String[] productosC3 = c3.ofrecerProductos();
		System.out.println(Arrays.toString(productosC3));
		
		String[] productosC4 = c4.ofrecerProductos();
		System.out.println(Arrays.toString(productosC4));
		
	}
}