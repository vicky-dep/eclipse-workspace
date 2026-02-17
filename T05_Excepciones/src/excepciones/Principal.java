package excepciones;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero entero");
		try {
			int num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Se ha introducido un caracter no valido");
		} catch (NoSuchElementException e) {
			System.out.println("No existe elemento para leer");
		} catch (IllegalStateException e) {
			System.out.println("Se ha accedido de forma incorrecta al metodo");
		} finally {
			// sc.close();
		}
		
		// Otra operacion
		System.out.println("Dame tu nombre");
		String nombre = sc.nextLine();

	}

}