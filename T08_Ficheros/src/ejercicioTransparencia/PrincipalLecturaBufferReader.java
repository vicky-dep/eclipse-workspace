package ejercicioTransparencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalLecturaBufferReader {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			String resultado = "";
			br = new BufferedReader(new FileReader("Principal.java"));
			// readLine lee linea a linea, no hace falta hacer cast
			String linea = br.readLine();
			while (linea != null) {
				resultado += linea;
				// nos permite avanzar en el fichero para su lectura
				linea = br.readLine();
			}
			System.out.println(resultado);
			
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