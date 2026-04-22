package barajaCartas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalLeticia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		BufferedWriter bw = null;
		ArrayList<String> listaPalos = new ArrayList<String>();
		int cantidadCartas = 0;
		System.out.println("¿Cuántas cartas quieres generar?");
		cantidadCartas = sc.nextInt();
		try {
			br = new BufferedReader(new FileReader("palos.txt"));
			String line = br.readLine();
			while (line != null) {
				listaPalos.add(line);
				line = br.readLine();
			}
			bw = new BufferedWriter(new FileWriter("cartas.txt",true));
			for (int i = 0; i < cantidadCartas; i++) {
				int num = (int) (Math.random() * 12 + 1);
				int palo = (int) (Math.random() * 4);
				String paloSt = listaPalos.get(palo);
				bw.write(String.valueOf(num) + " " + paloSt);
				bw.newLine();

			}
			System.out.println("Fin del programa");
			//Añadir escritura json de la clase Baraja
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer la linea");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			}
		}

	}

}
