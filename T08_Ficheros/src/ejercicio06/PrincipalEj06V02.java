package ejercicio06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalEj06V02 {

	public static void main(String[] args) {

		BufferedReader br = null;

		int totalEdad = 0;
		double totalPeso = 0;
		double totalEstatura = 0;
		int contador = 0;
		
		try {
			br = new BufferedReader(new FileReader("deportistas.txt"));
			// Leer cabecera
			String linea = br.readLine();
			
			// Leer primera línea de datos
			linea = br.readLine();

			while (linea != null) {

				// Separar datos
				String[] datos = linea.split("\\s+");

				// Extraer números desde el final
				int edad = Integer.parseInt(datos[datos.length - 3]);
				double peso = Double.parseDouble(datos[datos.length - 2]);
				double estatura = Double.parseDouble(datos[datos.length - 1]);

				// Reconstruir nombre
				String nombre = "";
				for (int i = 0; i < datos.length - 3; i++) {
					nombre += datos[i] + " ";
				}
				nombre = nombre.trim();

				// Mostrar deportista
				System.out.println("Nombre: " + nombre +
								   " | Edad: " + edad +
								   " | Peso: " + peso +
								   " | Estatura: " + estatura);

				// Acumular valores
				totalEdad += edad;
				totalPeso += peso;
				totalEstatura += estatura;
				contador++;

				// Leer siguiente línea
				linea = br.readLine();
			}

			// Calcular medias
			if (contador > 0) {
				System.out.println("\n--- MEDIAS ---");
				System.out.println("Edad media: " + (totalEdad / contador));
				System.out.println("Peso medio: " + (totalPeso / contador));
				System.out.println("Estatura media: " + (totalEstatura / contador));
			}
			
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
				System.out.println("Error al cerrar buffer");
				e.printStackTrace();
			}
		}

	}

}