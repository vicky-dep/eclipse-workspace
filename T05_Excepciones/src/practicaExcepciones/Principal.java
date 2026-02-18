package practicaExcepciones;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Biblioteca b = new Biblioteca();
		
		// 1. Es primo
		System.out.println("Introduce un numero");
		try {
			int num = sc.nextInt();
			System.out.println("Es primo: " + b.esPrimo(num));
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no valido, no es un numero");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no esta disponible");
		} catch (IllegalStateException e) {
			System.out.println("El metodo ha sido llamado cuando no le corresponde");
		} catch (BibliotecaException e) {
			e.printStackTrace();
		}
	
		// 2. Voltea
		System.out.println("Dame un numero para voltearlo");
		try {
			int num = sc.nextInt();
			System.out.println("Numero volteado: " + b.voltea(num));
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no valido, no es un numero");
		} catch (NoSuchElementException e) {
			System.out.println("El valor no esta disponible");
		} catch (IllegalStateException e) {
			System.out.println("El metodo ha sido llamado cuando no le corresponde");
		}
		

	}
}