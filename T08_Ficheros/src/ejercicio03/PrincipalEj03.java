package ejercicio03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PrincipalEj03 {

	public static void main(String[] args) {
		/*
		 * Escribe la función Integer[] leerEnteros (String nombreFichero), al que se le pasa un fichero que contiene una cadena 
		 * y devuelve una tabla con todos los enteros que aparecen en ella.
		 */
		
		Integer[] numeros = leerEnteros("cadena.txt");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " ");
		}
		
		System.out.println(Arrays.toString(numeros));
		
	}
	
	public static Integer[] leerEnteros(String nombreFichero) {
		
		BufferedReader br = null;
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		try {
			br = new BufferedReader(new FileReader(nombreFichero));
			String linea = br.readLine();
			while (linea != null) {
				for (int i = 0; i < linea.length(); i++) {
					char c = linea.charAt(i);
					if (c >= '0' && c <= '9') {
						lista.add(c - '0'); // convertir de char a numero 
					}
				}
				linea = br.readLine();
			}
			
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
				System.out.println("Error al cerrar");
				e.printStackTrace();
			}
		}
		
		// convertir arraylist a array
		Integer[] resultado = new Integer[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			resultado[i] = lista.get(i);
		}
		
		return resultado;
		
	}
}