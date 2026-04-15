package ejercicioTransparencia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalLecturaFileReader {

	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("Principal.java"); // si el fichero esta en la raiz, no hace falta rutas, solo el nombre "fichero"
			// read lee caracter a caracter hasta llegar al final del fichero (-1)
			int caracterInt = in.read();
			// almacenamos los caracteres en un String
			String resultado = "";
			// leemos el fichero, haciendo cast al entero hasta -1
			while (caracterInt != -1) {
				char c = (char) caracterInt;
				resultado += c;
				// read actua como un puntero, que avanza posicion a posicion
				caracterInt = in.read(); // si no ponemos esto, el bucle se convierte en bucle infinito
			}
			System.out.println(resultado);
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Error en la lectura de caracteres");
			e.printStackTrace();
			
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el fileReader");
				e.printStackTrace();
			}
		}
		
	}

}