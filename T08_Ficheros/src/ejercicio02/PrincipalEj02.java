package ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PrincipalEj02 {

	public static void main(String[] args) {
		
		/*
		 * En el archivo numeros.txt disponemos de una serie de números (uno por cada línea). 
		 * Diseña un programa que procese el fichero y nos muestre el menor y el mayor.
		 */

		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("numeros.txt"));
			String numeroSt = br.readLine();
			ArrayList<Integer> lista = new ArrayList<Integer>();
			while (numeroSt != null) {
				lista.add(Integer.valueOf(numeroSt.trim()));
				numeroSt = br.readLine();
			}
			// Ordeno el arraylist para sacar el maximo y el minimo
			Collections.sort(lista);
			System.out.println("Minimo: " + lista.get(0));
			System.out.println("Maximo: " + lista.getLast());
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
			
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			}
		}
	}

}