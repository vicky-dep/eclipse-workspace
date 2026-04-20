package ejercicio05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrincipalEj05Leticia {

	public static void main(String[] args) {
		
		BufferedWriter bw = null; 
		
	    try {
			bw = new BufferedWriter(new FileWriter("deportistas.txt"));
			bw.write("Nombre						Edad		Peso		Estatura"); // permite escribir una linea del fichero
			bw.newLine(); // añadimos el salto de linea
			bw.write("Juan Pedro Pérez Gómez		25			70.5		1.80");
			bw.newLine();
			bw.write("Ana Ruiz del Val			23			60			1.75");
			
			
		} catch (IOException e) {
			System.out.println("Error al crear el fichero");
			e.printStackTrace();
		} finally {
			try {
				bw.close(); // si no se cierra el buffer no escribe el fichero
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			} 
		}

	}

}