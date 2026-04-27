package adivinarPalabra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class PrincipalLeticiaDAM {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("palabras.txt"));
			ArrayList<String> palabras = new ArrayList<String>();
			String linea = br.readLine();
			while (linea != null) {
				palabras.add(linea);
				linea = br.readLine();
			}
			// Obtenemos una palabra al azar para adivinar
			int num = (int) Math.random() * palabras.size();
			String palabraAdivinar = palabras.get(num);
			System.out.println("Tienes que adivinar una palabra de " + palabraAdivinar.length() + " letras");
			String huecos = "";
			for (int i = 0; i < palabraAdivinar.length(); i++) {
				huecos += "_";
			}
			System.out.println(huecos);
			int errores = 0;
			boolean acierto = false;
			int puntos = 0;
			Scanner sc = new Scanner(System.in);
			while (errores < 5 && !acierto) {
				System.out.println("Dime una letra");
				String letra = sc.next();
				// Miramos que la letra existe
				if (palabraAdivinar.contains(letra)) {
					// Mostramos al usuario el avance de la palabra
					huecos = reemplazarLetra(palabraAdivinar, letra, huecos);
					System.out.println(huecos);
					puntos += 5;
					if (!huecos.contains("_")) { // Comprobamos que ya están dichas todas las letras
						acierto = true;
					}
				} else {
					puntos -= 2;
					errores++;
					System.out.println("Errores: "+errores+" de 5");
					System.out.println(huecos);
				}
			}
			// Guardamos los datos en un json
			System.out.println("Dime tu nombre para guardar la partida");
			String nombre = sc.next();
			if (acierto == false) {
				puntos = 0;
			}
			Jugador j = new Jugador(nombre, puntos);
			Gson g = new Gson();
			String cadena = g.toJson(j);
			bw = new BufferedWriter(new FileWriter("partida.json"));
			bw.write(cadena);
			System.out.println("Fin escritura Json");

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				e.printStackTrace();
			}
		}
	}
	
	private static String reemplazarLetra(String palabraAdivinar, String letra, String huecos) {
		String aux = "";
		for (int i = 0; i < palabraAdivinar.length(); i++) {
			if (String.valueOf(palabraAdivinar.charAt(i)).equals(letra)) {
				aux += letra;
			} else {
				aux += String.valueOf(huecos.charAt(i));
			}
		}
		huecos = aux; // Asigno el string auxiliar para actualizar la palabra que ve el usuario
		return huecos;
	}

}