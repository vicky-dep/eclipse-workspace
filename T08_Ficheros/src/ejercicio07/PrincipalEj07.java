package ejercicio07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrincipalEj07 {

	public static void main(String[] args) {
		/*
		 * Con el fichero deportistas.txt de la Actividad anterior, implementa una aplicación que lea los datos de los deportistas 
		 * y los guarde en otros tres ficheros, uno con los nombres y las edades, otro con los nombres y los pesos y el tercero con los nombres y las estaturas.
		 */

		BufferedReader br = null;
		BufferedWriter bwEdad = null;
		BufferedWriter bwPeso = null;
		BufferedWriter bwEstatura = null;
		
		try {
			// fichero de entrada
			br = new BufferedReader(new FileReader("deportistas.txt"));
			
			// ficheros de salida
			bwEdad = new BufferedWriter(new FileWriter("nombres_edades.txt"));
			bwPeso = new BufferedWriter(new FileWriter("nombres_pesos.txt"));
			bwEstatura = new BufferedWriter(new FileWriter("nombres_estaturas.txt"));
			
			// cabeceras
			bwEdad.write("Nombre    Edad");
			bwEdad.newLine();
			
			bwPeso.write("Nombre    Peso");
			bwPeso.newLine();
			
			bwEstatura.write("Nombre    Estatura");
			bwEstatura.newLine();
			
			// leer cabecera
			String linea = br.readLine();
			
			// leer primera linea de datos
			linea = br.readLine();
			
			while (linea != null) {
				
				// separar por espacios/tabulaciones
				String[] datos = linea.split("\\s+");
				
				// extraer datos desde el final
				int edad = Integer.parseInt(datos[datos.length - 3]);
				double peso = Double.parseDouble(datos[datos.length - 2]);
				double estatura = Double.parseDouble(datos[datos.length - 1]);
				
				// reconstruir el nombre
				String nombre = "";
				for (int i = 0; i < datos.length - 3; i++) {
					nombre += datos[i] + " ";
				}
				nombre = nombre.trim();
				
				// escribir en cada fichero
				bwEdad.write(nombre + " " + edad);
				bwEdad.newLine();
				
				bwPeso.write(nombre + " " + peso);
				bwPeso.newLine();
				
				bwEstatura.write(nombre + " " + estatura);
				bwEstatura.newLine();
				
				// leer la siguiente linea
				linea = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al crear los ficheros");
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bwEdad.close();
				bwPeso.close();
				bwEstatura.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar los buffers");
				e.printStackTrace();
			}
			
		}
		
	}

}