package ejercicio1;

// si quisieramos introducir por teclado:
// import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/**
		 * El cifrado César es una forma sencilla de modificar un texto para que no sea entendible 
		 * a quienes no conocen el código. Este cifrado consiste en modificar cada letra de un texto 
		 * por otra que se encuentra en el alfabeto n posiciones detrás.
		 * Por ejemplo, para un valor de n igual a 3, la letra a se codifica con la d, y la letra q 
		 * se codifica con la t. En el caso de que una letra exceda a la z, seguiremos de forma circular 
		 * utilizando la a. Solo se cifrarán las letras, mayúsculas o minúsculas.
		 * Realiza una clase que  devuelva cifrado el texto que se le pasa con un paso de n letras.
		 */

		CifradoCesar cc = new CifradoCesar();
		
        String texto = "Hola Mundo!";
        int n = 3;

        String cifrado = cc.cifrarTexto(texto, n);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto cifrado: " + cifrado);
        
        System.out.println();
        System.out.println("Probando con xYz para verificar que de la vuelta...");
        
        String texto2 = "Probando xYz";
        int n2 = 3;

        String cifrado2 = cc.cifrarTexto(texto2, n2);

        System.out.println("Texto original: " + texto2);
        System.out.println("Texto cifrado: " + cifrado2);
		
        // aqui podriamos podir que se ingrese el texto y las posiciones por teclado
        /*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el texto que deseas cifrar: ");
		String texto = sc.nextLine();

		System.out.println("Introduce el número de posiciones: ");
		int n = sc.nextInt();
         */
	}

}