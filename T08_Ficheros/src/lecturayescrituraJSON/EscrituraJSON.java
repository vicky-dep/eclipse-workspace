package lecturayescrituraJSON;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class EscrituraJSON {

	public static void main(String[] args) {
		
		// Pasos a seguir:
		// 1. Paso de Objeto --> String con la libreria GSON
		// 2. String la escribo en el fichero con BufferedWriter
		// 3. El nombre del fichero siempre tiene que tener la extension JSON
		// 4. Importante, cerrar el bw sino no escribe en el fichero la informacion

		Gson gson = new Gson();
		Persona persona = new Persona("Luisa", "Martinez Gonzalez", 23);
		String cadena = gson.toJson(persona);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("persona.json"));
			bw.write(cadena);
			System.out.println("Escritura terminada");
		} catch (IOException e) {
			System.out.println("Error al crear el fichero");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			}
		}
		
	}

}