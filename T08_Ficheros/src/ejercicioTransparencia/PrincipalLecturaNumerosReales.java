package ejercicioTransparencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalLecturaNumerosReales {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("NumerosReales.txt"));
			String linea = br.readLine();
			int suma = 0;
			int cantidadNumeros = 0;
			while (linea != null) {
				// split nos permite trocear una cadena a partir del caracter pasado como parametro
				// devuelve un array de string
				String[] numeros = linea.split(" ");
				cantidadNumeros += numeros.length;
				for (int i = 0; i < numeros.length; i++) {
					suma += Integer.valueOf(numeros[i]);
				}
				linea = br.readLine();
			}
			System.out.println("La suma de los numeros es: " + suma);
			System.out.println("La media de los numeros es: " + ((float)(suma/(float)cantidadNumeros)));
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Error al leer la linea");
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