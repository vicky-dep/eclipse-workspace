package barajaCartas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalEjBarajaCartas {

	public static void main(String[] args) {
		/*
		 * Implementa un programa que genere aleatoriamente números del 1 al 12. 
		 * Se le preguntará al usuario cuántos números quiere generar. 
		 * Se leerá de un fichero palos.txt los palos de la baraja y se generará 
		 * de forma aleatoria combinaciones números-palos. 
		 * Esta combinación se guardará en un fichero llamado cartas.txt. 
		 * El fichero de cartas debe conservar las creadas anteriormente.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres generar?");
		int cantidad = sc.nextInt();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("palos.txt"));
			String linea = br.readLine();
			ArrayList<String> arrayPalos = new ArrayList<String>();
			while (linea != null) {
				arrayPalos.add(linea);
				linea = br.readLine();
			}
			for (int i = 0; i < cantidad; i++) {
				int numAleatorio = (int) (Math.random() * 12) +1;
				int numPaloAleatorio = (int) (Math.random() * 4);
				String paloAleatorio = arrayPalos.get(numPaloAleatorio);
				String cartaAleatoria = numAleatorio+paloAleatorio;
				System.out.println(cartaAleatoria);
				
				// aqui el de escritura
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	}
}