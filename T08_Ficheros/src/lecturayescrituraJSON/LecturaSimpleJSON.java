package lecturayescrituraJSON;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson; /* borrar module info */

public class LecturaSimpleJSON {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("datos.json"));
			String line = br.readLine();
			String resultado = "";
			while (line != null) {
				resultado += line;
				line = br.readLine();
			}
			
			Gson gson = new Gson();
			// para pasar de String a Clase se utiliza siempre fromJSON
			Persona p = gson.fromJson(resultado, Persona.class);
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura");
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