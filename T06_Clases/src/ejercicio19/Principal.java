package ejercicio19;

import java.util.Scanner; 

public class Principal {
	/**
	 * Ahora, crea una clase ejecutable:
	 * Crea un array de Passwords con el tamaño que tu le indiques por teclado.
	 * Crea un bucle que cree un objeto para cada posición del array.
	 * Indica también por teclado la longitud de los Passwords (antes de bucle).
	 * Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
	 * Al final, muestra la contraseña y si es o no fuerte
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamaño del array");
		int tamanio = sc.nextInt();
		Password[] a = new Password[tamanio];
		boolean[] contFuertes = new boolean[tamanio];
		System.out.println("Introduce el tamaño de la contraseña");
		int longContr = sc.nextInt();
		
		for (int i = 0; i < tamanio; i++) {
			a[i] = new Password(longContr); // antes de utilizar los metodos hay que generar un objeto vacio en esa posicion
			a[i].generarContrasenia();
			contFuertes[i] = a[i].esFuerte();
			System.out.println("Contraseña: " + a[i].getContrasenia() + " es Fuerte? " + contFuertes[i]);
		}

	}

}