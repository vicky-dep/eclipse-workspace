package ejercicio09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PrincipalEj09Leticia {

	public static void main(String[] args) {

		BufferedReader br1 = null;
		BufferedReader br2 = null;
		ArrayList<Integer> listaTotal = new ArrayList<Integer>();
		try {
			br1 = new BufferedReader(new FileReader("listaEnteros1.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el primer fichero");
			e.printStackTrace();
		}
		try {
			br2 = new BufferedReader(new FileReader("listaEnteros2.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el segundo fichero");
			e.printStackTrace();
		}
		// Leemos los dos ficheros y almacenamos en ArrayList
		// lectura Fichero 1
		try {
			String lineaF1 = br1.readLine();
			while (lineaF1 != null) {
				listaTotal.add(Integer.valueOf(lineaF1.trim()));
				lineaF1 = br1.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error al leer linea del fichero 1");
			e.printStackTrace();
		} finally {
			try {
				br1.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar f1");
				e.printStackTrace();
			}
		}
		// Lectura F2
		try {
			String lineaF2 = br2.readLine();
			while (lineaF2 != null) {
				listaTotal.add(Integer.valueOf(lineaF2.trim()));
				lineaF2 = br2.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error al leer linea del fichero 2");
			e.printStackTrace();
		} finally {
			try {
				br2.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar f2");
				e.printStackTrace();
			}
		}
		// Ordenamos la lista y guardamos en un tercer fichero
		Collections.sort(listaTotal);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("FicheroListaOrdenada.txt"));
		Iterator<Integer> it = listaTotal.iterator();
		while(it.hasNext()) {
			Integer numero = it.next();
			bw.write(String.valueOf(numero));
			bw.newLine();
		}
		System.out.println("Fin de escritura del fichero final");
		}  catch (IOException e) {
			System.out.println("Error al crear el fichero");
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				e.printStackTrace();
			}
		}
	}
	
}