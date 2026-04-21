package ejercicio09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalEj09 {

	public static void main(String[] args) {
		/*
		 * Implementa un programa que lea dos listas de números enteros no ordenados de sendos archivos con un número por línea, 
		 * los reúna en una lista única y los guarde en orden creciente en un tercer archivo, de nuevo uno por línea.
		 */
		
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		
		try {
			br1 = new BufferedReader(new FileReader("listaEnteros1.txt"));
			br2 = new BufferedReader(new FileReader("listaEnteros2.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Ficheros no encontrados");
			e.printStackTrace();
		}
		
		try {
			String lineaTexto1 = br1.readLine();
			String lineaTexto2 = br2.readLine();
				
		} catch (IOException e) {
			System.out.println("Error al leer los ficheros");
			e.printStackTrace();
		}

	}

}