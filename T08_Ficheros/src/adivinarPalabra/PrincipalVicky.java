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

public class PrincipalVicky {

	public static void main(String[] args) {
		/*
		 * Dado un fichero con una palabra por línea, se necesita leer ese fichero para extraer una palabra al azar, 
		 * se creará un número aleatorio entre 1 y el número de líneas.
		 * Se mostrará al usuario el número de letras que tiene. El usuario irá introduciendo caracteres hasta adivinar la palabra. 
		 * Si comete 5 errores se terminará el juego.Por cada letra acertada se sumarán 5 puntos y por cada fallo se restarán 2 puntos. 
		 * Si adivina la palabra se guardarán esos puntos sino será una partida cuya puntuación es 0
		 * Al finalizar el juego, se escribirá en un fichero partida.json el nombre del jugador y los puntos obtenidos.
		 */
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("palabras.txt"));
			String linea = br.readLine();
			ArrayList<String> palabras = new ArrayList<String>();
			
			while (linea != null) {
				palabras.add(linea);
				linea = br.readLine();
			}
			
			int pos = (int) Math.random() * palabras.size();
			String palabraAdivinar = palabras.get(pos);
			System.out.println("La palabra que tienes que adivinar tiene " + palabraAdivinar.length() + " letras");
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
				if (palabraAdivinar.contains(letra)) {
					huecos = reemplazarLetra(palabraAdivinar, letra, huecos);
					System.out.println(huecos);
					puntos += 5;
					if (!huecos.contains("_")) {
						acierto = true;
					}
				} else {
					puntos += -2;
					errores++;
					System.out.println("Errores: " + errores + " de 5");
					System.out.println(huecos);
				}
			}
			
			System.out.println("Dime tu nombre para guardar la partida");
			String nombre = sc.next();
			
			if (!acierto) {
				puntos = 0;
			}
			
			Jugador j = new Jugador(nombre, puntos);
			Gson g = new Gson();
			String cadena = g.toJson(j);
			bw = new BufferedWriter(new FileWriter("partida2.json"));
			bw.write(cadena);
			System.out.println("Fin de escritura json");
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			e.printStackTrace();
		} finally {
			try {
				br.close();
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
			if (String.valueOf(palabraAdivinar.charAt(i)).equalsIgnoreCase(letra)) {
				aux += letra;
			} else {
				aux += String.valueOf(huecos.charAt(i));
			}
		}
		huecos = aux;
		return huecos;
	}

}