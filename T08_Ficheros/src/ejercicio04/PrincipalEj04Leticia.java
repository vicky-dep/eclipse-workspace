package ejercicio04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalEj04Leticia {

	public static void main(String[] args) {

		BufferedReader br1 = null; // Se utiliza un br para cada fichero
		BufferedReader br2 = null;		
		try {
			br1 = new BufferedReader(new FileReader("texto1.txt")); // Accedemos a la información de los ficheros
		} catch (FileNotFoundException e) {
			System.out.println("Fichero texto1 no encontrado");
			e.printStackTrace();
		}
		try {
			br2 = new BufferedReader(new FileReader("texto2.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Fichero texto2 no encontrado");
			e.printStackTrace();
		}
		//leer linea a linea y comparar los caracteres//Algunas opciones: 
		//- leer caracter a caracter (read). Recordar si lo haceis con esto tenéis que hacer cast para decir que letra no es igual
		//- leer linea a linea y utilizar charAt en un bucle e ir comparando cada caracter
		try {
			String lineaF1 = br1.readLine();
			String lineaF2 = br2.readLine();
			boolean encontrado = false;
			int contLinea = 1;
			while (lineaF1 != null && lineaF2 != null && !encontrado) {
				if (lineaF1.length() != lineaF2.length()) {
					System.out.println("Longitudes distintas, los ficheros NO son iguales");
					encontrado = true;
				} else {
					for (int i = 0; i < lineaF1.length(); i++) {
						// comparamos caracter a caracter
						if (lineaF1.charAt(i) != lineaF2.charAt(i)) {
							System.out.println("Se ha encontrado un caracter que no es igual en los dos ficheros, en la posicion " 
												+ i+1 + " en la linea " + contLinea);
							encontrado = true;
						}
					}
				}
				lineaF1 = br1.readLine();
				lineaF2 = br2.readLine();
				contLinea++;
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}