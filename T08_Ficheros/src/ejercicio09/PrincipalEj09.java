package ejercicio09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PrincipalEj09 {

	public static void main(String[] args) {
		/*
		 * Implementa un programa que lea dos listas de números enteros no ordenados de sendos archivos con un número por línea, 
		 * los reúna en una lista única y los guarde en orden creciente en un tercer archivo, de nuevo uno por línea.
		 */
		
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		BufferedWriter bw = null;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		try {
			br1 = new BufferedReader(new FileReader("listaEnteros1.txt"));
			br2 = new BufferedReader(new FileReader("listaEnteros2.txt"));
			
			String linea;
			
			linea = br1.readLine();
			while (linea != null) {
				numeros.add(Integer.parseInt(linea));
				linea = br1.readLine();
			}
			
			linea = br2.readLine();
			while (linea != null) {
				numeros.add(Integer.parseInt(linea));
				linea = br2.readLine();
			}
			
			Collections.sort(numeros);
			
			bw = new BufferedWriter(new FileWriter("resultado.txt"));
			
			for (int n : numeros) {
				bw.write(String.valueOf(n));
				bw.newLine();
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Ficheros no encontrados");
			e.printStackTrace();
				
		} catch (IOException e) {
			System.out.println("Error al leer los ficheros");
			e.printStackTrace();
		} finally {
			try {
				br1.close();
				br2.close();
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar los buffers");
				e.printStackTrace();
			}
			
		}

	}

}