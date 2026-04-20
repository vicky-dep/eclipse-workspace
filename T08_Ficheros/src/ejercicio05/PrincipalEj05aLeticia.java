package ejercicio05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class PrincipalEj05aLeticia {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("ejercicio5.json"));
			String datosFichero = ""; // almacenamos todas las lineas del json a la libreria de gson
			String line = br.readLine();
			while (line != null) {
				datosFichero += line;
				line = br.readLine();
			}
			// Pasamos de String a objeto club
			Gson g = new Gson();
			Club c = g.fromJson(datosFichero, Club.class);
			System.out.println(c);
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
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