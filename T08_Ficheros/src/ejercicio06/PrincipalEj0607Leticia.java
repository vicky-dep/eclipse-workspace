package ejercicio06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PrincipalEj0607Leticia {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Scanner scName = new Scanner(System.in);
		
		int opcion = 0;
		List<Integer> edades = new ArrayList<Integer>();
		List<Double> pesos = new ArrayList<Double>();
		List<Double> alturas = new ArrayList<Double>();
		BufferedWriter bw = null;
		BufferedReader br = null;
		BufferedWriter bwEdad = null;
		BufferedWriter bwPeso = null;
		BufferedWriter bwAltura = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("FicheroDeportistas.txt"));
			while (opcion != -1) {
				System.out.println("Introduce nombre: ");
				String name = scName.nextLine();
				bw.write(name + ";");
				
				System.out.println("Introduce la edad: ");
				int edad = sc.nextInt();
				edades.add(edad);
				bw.write(String.valueOf(edad) + ";"); // si no le hacemos valueOf estaria poniendo el unicode

				System.out.println("Introduce el peso: ");
				double peso = sc.nextDouble();
				pesos.add(peso);
				bw.write(String.valueOf(peso) + ";");
				
				System.out.println("Introduce la altura: ");
				double altura = sc.nextDouble();
				alturas.add(altura);
				bw.write(String.valueOf(altura) + ";");
				bw.newLine();
				System.out.println("Pulse -1 para salir o cualquier otro numero para continuar");
				opcion = sc.nextInt();
			}
			
			Iterator<Integer> itEdad = edades.iterator();
			int totalEdades = 0;
			while (itEdad.hasNext()) {
				Integer e = itEdad.next();
				totalEdades += e;
			}
			System.out.println("Media de edad: " + (double)totalEdades/edades.size());
			
			Iterator<Double> itPeso = pesos.iterator();
			int totalPesos = 0;
			while (itPeso.hasNext()) {
				Double p = itPeso.next();
				totalPesos += p;
			}
			System.out.println("Media de peso: " + (double)totalPesos/pesos.size());
			
			Iterator<Double> itAltura = alturas.iterator();
			int totalAlturas = 0;
			while (itAltura.hasNext()) {
				Double a = itAltura.next();
				totalAlturas += a;
			}
			System.out.println("Media de altura: " + (double)totalAlturas/alturas.size());
			
			// Dividimos el fichero original en edad, peso y estatura
			
			//El fichero de escritura original hay que cerrarlo antes de leer para
			//que los datos recogidos con el scanner se vuelquen en el txt.
			bw.flush();
			bw.close();
			
			// Leemos el fichero
			br = new BufferedReader(new FileReader("FicheroDeportistas.txt"));
			
			// Creamos los bw de escritura, uno por fichero
			bwEdad = new BufferedWriter(new FileWriter("edades.txt"));
			bwPeso = new BufferedWriter(new FileWriter("pesos.txt"));
			bwAltura = new BufferedWriter(new FileWriter("alturas.txt"));
			String linea = br.readLine();
			
			while (linea != null) {
				String[] arrayLinea = linea.split(";");
				if (arrayLinea.length == 4) { // comprobamos que la longitud sea 4 para aseguramos que esten todos los valores
					
					bwEdad.write(arrayLinea[0] + " ");
					bwEdad.write(arrayLinea[1]);
					bwEdad.newLine();
					
					bwPeso.write(arrayLinea[0] + " ");
					bwPeso.write(arrayLinea[2]);
					bwPeso.newLine();
					
					bwAltura.write(arrayLinea[0] + " ");
					bwAltura.write(arrayLinea[3]);
					bwAltura.newLine();
				}
				linea = br.readLine();
			}
			System.out.println("Fin de lectura/escritura ficheros");
			
		} catch (IOException e) {
			System.out.println("Error al crear el fichero");
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bwEdad.flush();
				bwEdad.close();
				bwPeso.flush();
				bwPeso.close();
				bwAltura.flush();
				bwAltura.close();
			} catch (IOException e) {
				System.out.println("Erro al cerrar el fichero");
				e.printStackTrace();
			}
		}

	}

}