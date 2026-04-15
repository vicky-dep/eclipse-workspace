package ejercicioTransparencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrincipalEscrituraFichero {

	public static void main(String[] args) {
		
		// sin añadir datos al fichero, cada vez que se crea elimina ...
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("fichero1.txt", true)); // Se le añade true para que no borre ...
			String cad1 = "En un lugar de la Mancha";
			String cad2 = "De cuyo nombre no me acuerdo";
			bw.write(cad1);
			// para añadir salto de linea se utiliza el siguiente metodo:
			bw.newLine();
			bw.write(cad2);
			bw.newLine();
			System.out.println("Fin de escritura");
			
			// lectura del fichero
			BufferedReader br = new BufferedReader(new FileReader("fichero1.txt"));
			br.readLine();
			String line = br.readLine();
			String resultado = "";
			while (line != null) {
				resultado += line;
				line = br.readLine();
			}
			System.out.println(resultado);
			
		} catch (IOException e) {
			System.out.println("Error al crear el fichero para escribir");
			e.printStackTrace();
			
		} finally {
			try {
				bw.flush(); // opcional, vuelca lo que queda en el buffer al fichero
				// si no se cierra no escribe nada en el fichero
				bw.close();
			} catch (IOException e) {
				System.out.println();
				e.printStackTrace();
			}
		}

	}

}