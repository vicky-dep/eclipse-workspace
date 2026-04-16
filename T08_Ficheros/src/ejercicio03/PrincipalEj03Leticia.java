package ejercicio03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PrincipalEj03Leticia {

	public static void main(String[] args) {
		
		Integer[] resultado = leerEnteros("NumerosReales.txt");
		System.out.println(Arrays.toString(resultado));
		
	}

	private static Integer[] leerEnteros(String nombreFichero) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(nombreFichero));
			String line = br.readLine();
			String[] arrayString = line.split(" ");
			Integer[] resultado = new Integer[arrayString.length];
			for (int i = 0; i < arrayString.length; i++) {
				String st = arrayString[i].trim();
				resultado[i] = Integer.valueOf(st);
			}
			return resultado;
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
				System.out.println("Error al cerrar buffer");
				e.printStackTrace();
			}
		}
		return null;
	}

}