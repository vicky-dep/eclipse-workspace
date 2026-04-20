package ejercicio05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class PrincipalEj05 {

	public static void main(String[] args) {
		/*
		 * Crea con un editor de texto el fichero deportistas.txt, donde se recogen los datos de un 
		 * grupo de deportistas, uno en cada línea. Aparecerá el nombre completo, seguido de la
		 * edad, el peso y la estatura. La primera línea será el encabezamiento con los nombres
		 * de los campos. El documento tendrá la siguiente forma:
			Nombre			 Edad 		Peso 		Estatura
			Juan Pedro Pérez Gómez 	25 		70,5 		1,80
			Ana Ruiz del Val		 23 		60 		1,75
		 */
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("deportistas.txt", true)); // Se le añade true para que no borre ...
			br = new BufferedReader(new FileReader("ejercicio5.json"));
			
			String linea = br.readLine();
			String resultado = "";
			while (linea != null) {
				resultado += linea;
				linea = br.readLine();
			}
			
			Gson g = new Gson();
			Club c = g.fromJson(resultado, Club.class);
			
			// ArrayList<Atleta>
			String cad1 = "Nombre			 Edad 		Peso 		Estatura";
			String cad2 = "";
			String cad3 = "";
			
			bw.write(cad1);
			bw.newLine();
			bw.write(cad2);
			bw.newLine();
			bw.write(cad3);
			bw.newLine();
			System.out.println("Fin de escritura");
	

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al crear el fichero para escribir");
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar buffer");
				e.printStackTrace();
			}
			
		}
	}
}