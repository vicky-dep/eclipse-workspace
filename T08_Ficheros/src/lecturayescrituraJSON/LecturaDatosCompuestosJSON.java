package lecturayescrituraJSON;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class LecturaDatosCompuestosJSON {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("datos_ej4.json"));
			String linea = br.readLine();
			String resultado = "";
			while (linea != null) {
				resultado += linea;
				linea = br.readLine();
			}
			
			Gson g = new Gson();
			PersonaAsignatura pa = g.fromJson(resultado, PersonaAsignatura.class);
			System.out.println(pa);
			
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