package ejercicio04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PrincipalEj04 {

	public static void main(String[] args) {
		
		// Se utiliza un br para cada fichero
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		// Accedemos a la información de los ficheros
		try {
			br1 = new BufferedReader(new FileReader("texto1.txt"));
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
		//leer linea a linea y comparar los caracteres
		//Algunas opciones: 
		//- leer caracter a caracter (read). Recordar si lo haceis con
		//esto tenéis que hacer cast para decir que letra no es igual
		//- leer linea a linea y utilizar charAt en un bucle e ir comparando
		//cada caracter

	}

}