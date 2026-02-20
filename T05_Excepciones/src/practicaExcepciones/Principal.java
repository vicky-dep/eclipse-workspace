package practicaExcepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Biblioteca b = new Biblioteca();
		
		// 1. Es primo
		System.out.println("Introduce un número");
		try {
			int num = sc.nextInt();
			System.out.println("Es primo: " + b.esPrimo(num));
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		} catch (BibliotecaException e) {
			e.printStackTrace();
		}
		
		// 2. Voltea número
		System.out.println("Dame un número para darle la vuelta");
		try {
			int num = sc.nextInt();
			System.out.println("Número volteado: " + b.voltea(num));
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		}
		
		// 3. Digito
		try {
			System.out.println("Dime un número entero");
			int num = sc.nextInt();
			System.out.println("Dime la posición");
			int pos = sc.nextInt();
			System.out.println("El número que se encuentra en la posición " + pos + " es: "+ b.digitoN(num, pos));
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		} catch (IllegalArgumentException e) {
			System.out.println("La posición no puede ser negativa ni superior a la longitud del número");
		}
		
		// 4. Quita detrás
		try {
			System.out.println("Dime un número");
			int num = sc.nextInt();
			System.out.println("Dime la cantidad de digitos");
			int cant = sc.nextInt();
			System.out.println("El número " + num + " tras quitar " + cant + " dígito/s por detrás da: " + b.quitaPorDetras(num, cant));
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		} catch (IllegalArgumentException e) {
			System.out.println("No puedes quitar un numero negativo ni superior a la cantidad de dígitos del número");
		}
		
		// 5. Quita delante
		try {
			System.out.println("Dime un número");
			int num = sc.nextInt();
			System.out.println("Dime la cantidad de digitos");
			int cant = sc.nextInt();
			System.out.println("El número " + num + " tras quitar " + cant + " dígito/s por delante da: " + b.quitaPorDelante(num, cant));			
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		} catch (IllegalArgumentException e) {
			System.out.println("No puedes quitar un numero negativo ni superior a la cantidad de dígitos del número");
		}
		
		// 6. Pega detrás
		try {
			System.out.println("Dime un número");
			int num = sc.nextInt();
			System.out.println("Dime el dígito que quieres agregar");
			int digito = sc.nextInt();
			System.out.println("Después de agregar al final el resultado es: " + b.pegaPorDetras(num, digito));			
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		} catch (IllegalArgumentException e) {
			System.out.println("No puedes agregar un numero negativo ni de dos cifras");
		}
			
		// 7. Pega delante
		try {
			System.out.println("Dime un número");
			int num = sc.nextInt();
			System.out.println("Dime el dígito que quieres agregar");
			int digito = sc.nextInt();
			System.out.println("Después de agregar adelante el resultado es: " + b.pegaPorDelante(num, digito));			
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		} catch (IllegalArgumentException e) {
			System.out.println("No puedes agregar un numero negativo ni de dos cifras");
		}
		
		// 8. Array números
		// Si pones un tamaño de array negativo, aunque tambien pongas un valor minimo mayor al valor maximo, 
		// nunca se imprime ese mensaje. Sin embargo, si pones un tamaño de array positivo y luego el valor minimo
		// es mayor al maximo, si lanza el mensaje. No se si me explico y si eso debería haberlo solucionado :)
		try {
			System.out.println("Dime el tamaño que quieras que tenga el array numérico");
			int n = sc.nextInt();
			System.out.println("Dime el valor mínimo del rango");
			int minimo = sc.nextInt();
			System.out.println("Dime el valor máximo del rango");
			int maximo = sc.nextInt();
			System.out.println("Array aleatorio: " + Arrays.toString(b.generaArrayInt(n, minimo, maximo)));
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		} catch (IllegalArgumentException e) {
			System.out.println("El valor mínimo no puede ser mayor al valor máximo");
		} catch (BibliotecaException e) {
			e.printStackTrace();
		}
		
		// 9. Array mínimo y máximo
		int[] datos = {4, 8, 12, 3, 15};
		int[] datos2 = null;
		int[] datos3 = new int[0];
		try {
			System.out.println("Valor mínimo y máximo del array pasado: " + Arrays.toString(b.minimoYMaximoArrayInt(datos)));
			// Con el siguiente print, se comprueba el mensaje "El array es nulo"
			System.out.println("Valor mínimo y máximo del array pasado: " + Arrays.toString(b.minimoYMaximoArrayInt(datos2)));
			// Si se comentan la linea anterior, funciona la excecion "array vacío"
			// No entiendo si deberia mejorar algo o separarlo en distintos try/catch, 
			// para que funciones ambas (array nulo y vacío)
			System.out.println("Valor mínimo y máximo del array pasado: " + Arrays.toString(b.minimoYMaximoArrayInt(datos3)));
		} catch (NullPointerException e) {
			System.out.println("El array es null");
		} catch (BibliotecaException e) {
			e.printStackTrace();
		}
		
		// 10. Media 
		int[] calcularMedia = {7, 8, 6, 9, 10, 8, 7};
		int[] calcularMedia2 = new int[0];
		int[] calcularMedia3 = null;
		try {
			System.out.println("La media aritmética de los números contenidos en el array es: " + b.mediaArrayInt(calcularMedia));
			System.out.println("La media aritmética de los números contenidos en el array es: " + b.mediaArrayInt(calcularMedia2));
			// aquí igual que antes, para que imprima el mensaje de array null, se debe comentar el print anterior
			System.out.println("La media aritmética de los números contenidos en el array es: " + b.mediaArrayInt(calcularMedia3));
		} catch (NullPointerException e) {
			System.out.println("El array es null");
		} catch (ArithmeticException e) {
			System.out.println("No se puede calcular la media, array vacío");
		}
		
		// 11. Voltea array
		int[] voltear = {1,2,3,4,5,6,7,8,9};
		int[] voltear2 = null;
		try {
			System.out.println("Array al revés: " + Arrays.toString(b.volteaArrayInt(voltear)));
			System.out.println("Array al revés: " + Arrays.toString(b.volteaArrayInt(voltear2)));
		} catch (NullPointerException e) {
			System.out.println("El array es null");
		}
		
		// 12. Filtra primos
		int[] primos = {1,2,3,4,5,9,11,12,13,17,24,36};
		int[] primos2 = null;
		try {
			System.out.println("Solo primos: " + Arrays.toString(b.filtraPrimos(primos)));
			System.out.println("Solo primos: " + Arrays.toString(b.filtraPrimos(primos2)));
		} catch (NullPointerException e) {
			System.out.println("El array es null");
		}
		
	}
}