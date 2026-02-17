package excepciones;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrincipalRellenarArray {

	public static void main(String[] args) {
		int cont = 0;
		CompletarArray ca = new CompletarArray();
		while (cont < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dame un numero");
			try {
				ca.rellenarArray(sc.nextDouble());
				cont++;				
			} catch (CompletarArrayException e) {
				cont--;
				e.printStackTrace();
			} catch (InputMismatchException e) {
				System.out.println("Se ha introducido un caracter no valido");
				cont--;
			} catch (NoSuchElementException e) {
				System.out.println("No existe elemento para leer");
				cont--;
			} catch (IllegalStateException e) {
				System.out.println("Se ha accedido de forma incorrecta al metodo");
				cont--;
			} finally {
				
			}
		}
		
		// Una vez relleno el array con 5 elementos, probamos a introducir un elemento mas para probar la excepción propia
		try {
			ca.rellenarArray(6.6);
		} catch (CompletarArrayException e) {
			e.printStackTrace();
		}
		System.out.println(ca);
	}
}
