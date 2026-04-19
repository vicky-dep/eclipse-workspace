package ejercicio04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalEj04 {

	public static void main(String[] args) {
		//leer linea a linea y comparar los caracteres
		//Algunas opciones: 
		//- leer caracter a caracter (read). Recordar si lo haceis con
		//esto tenéis que hacer cast para decir que letra no es igual
		//- leer linea a linea y utilizar charAt en un bucle e ir comparando
		//cada caracter
		
		// Se utiliza un br para cada fichero
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		
		try {
			
			// Accedemos a la información de los ficheros
			br1 = new BufferedReader(new FileReader("texto1.txt"));
			br2 = new BufferedReader(new FileReader("texto2.txt"));

			int c1;
			int c2;
			int posicion = 0;
			boolean iguales = true;

			do {
				c1 = br1.read();
				c2 = br2.read();

				if (c1 != c2) {
					iguales = false;

					System.out.println("Diferencia en la posición: " + posicion);

					if (c1 != -1) {
						System.out.println("Fichero1: '" + (char) c1 + "'");
					} else {
						System.out.println("Fichero1: FIN DE FICHERO");
					}

					if (c2 != -1) {
						System.out.println("Fichero2: '" + (char) c2 + "'");
					} else {
						System.out.println("Fichero2: FIN DE FICHERO");
					}
				}

				posicion++;

			} while (c1 != -1 && c2 != -1 && iguales);

			// Si ambos terminaron y no hubo diferencias
			if (iguales && c1 == -1 && c2 == -1) {
				System.out.println("Los ficheros son iguales");
			} else if (iguales) {
				// Uno terminó antes que el otro
				System.out.println("Los ficheros tienen distinta longitud");
			}

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			System.out.println("Error de lectura");
		} finally {
			try {
				if (br1 != null) br1.close();
				if (br2 != null) br2.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar los ficheros");
			}
		}

	}

}