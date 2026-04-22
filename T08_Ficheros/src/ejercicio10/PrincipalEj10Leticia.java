package ejercicio10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalEj10Leticia {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		int caracteres = 0;
		int lineas = 0;
		int palabras = 0;
		
		try {
			br = new BufferedReader(new FileReader("carta.txt"));
			// antes del bucle ya leo lineas, por eso lo inicializo a 1
			String linea = br.readLine();
			
			while (linea != null) {
				caracteres += linea.length(); // lalongitud de la linea me dice el numero de caracteres que tiene
				String[] split = linea.split(" ");
				palabras += split.length;
				linea = br.readLine();
				lineas++; // la aumento despues de leerla
			}
			
			System.out.println("Numero de caracteres: " + caracteres);
			System.out.println("Numero de palabras: " + palabras);
			System.out.println("Numero de lineas: " + lineas);
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
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