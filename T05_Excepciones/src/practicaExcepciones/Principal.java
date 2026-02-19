package practicaExcepciones;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Biblioteca b = new Biblioteca();
		
		/*
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
		
		// 2. Voltea
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
		
		// 3. Digito -- VERIFICAR!
		try {
			System.out.println("Dime un número entero");
			int num = sc.nextInt();
			System.out.println("Dime la posición");
			int pos = sc.nextInt();
			System.out.println(b.digitoN(num, pos));
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, no es un número");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no está disponible");
		} catch (IllegalStateException e) {
			System.out.println("El método ha sido llamado cuando no le corresponde");
		}
		
		// 4. Quita detrás
		try {
			System.out.println("Dime un número");
			int num = sc.nextInt();
			System.out.println("Dime la cantidad de digitos");
			int cant = sc.nextInt();
			System.out.println(b.quitaPorDetras(num, cant));
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
			System.out.println(b.quitaPorDelante(num, cant));			
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
		System.out.println("Dime un número");
		int num = sc.nextInt();
		System.out.println("Dime el dígito que quieres agregar");
		int digito = sc.nextInt();
		System.out.println(b.pegaPorDetras(num, digito));
			
		// 7. Pega delante
		System.out.println("Dime un número");
		int num = sc.nextInt();
		System.out.println("Dime el dígito que quieres agregar");
		int digito = sc.nextInt();
		System.out.println(b.pegaPorDelante(num, digito));
		*/
		
	}
}