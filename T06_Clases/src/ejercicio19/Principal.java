package ejercicio19;

import java.util.Scanner; 

public class Principal {

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