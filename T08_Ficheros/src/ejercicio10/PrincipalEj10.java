package ejercicio10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalEj10 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea un fichero de texto llamado carta.txt. Tenemos que contar los caracteres, las líneas y las palabras. 
		 * Para simplificar supondremos que cada palabra está separada de otra por un único espacio en blanco o por un cambio de línea.
		 */
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("carta.txt"));
			String linea = br.readLine();
			String resultado = "";
			int contLineas = 0;
			
			while (linea != null) {
				resultado += linea;
				String[] arrayString = linea.split(" ");
				linea = br.readLine();
				contLineas++;
			}
			
			int totalCaracteres = resultado.length();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			e.printStackTrace();
		}
		

	}

}