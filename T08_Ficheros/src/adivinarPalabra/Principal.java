package adivinarPalabra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class Principal {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> palabras = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader("palabras.txt"));
			String linea = br.readLine();
			while (linea != null) {
				palabras.add(linea);
				linea = br.readLine();
			}
			int posicion = (int) (Math.random() * palabras.size());
			String palabra = palabras.get(posicion);
			char[] palabraOculta = new char[palabra.length()];
			for (int i = 0; i < palabraOculta.length; i++) {
				palabraOculta[i] = '_';
			}
			System.out.println("Introduce tu nombre:");
			String nombre = sc.nextLine();
			System.out.println("La palabra tiene " + palabra.length() + " letras");
			int errores = 0;
			int puntos = 0;
			boolean acertada = false;
			while (errores < 5 && !acertada) {
				System.out.println("Palabra: " + String.valueOf(palabraOculta));
				System.out.println("Introduce una letra:");
				char letra = sc.nextLine().charAt(0);
				boolean encontrada = false;
				for (int i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == letra && palabraOculta[i] == '_') {
						palabraOculta[i] = letra;
						encontrada = true;
						puntos += 5;
					}
				}
				if (!encontrada) {
					errores++;
					puntos -= 2;
					System.out.println("Fallo. Errores: " + errores);
				} else {
					System.out.println("Letra acertada");
				}
				if (String.valueOf(palabraOculta).equals(palabra)) {
					acertada = true;
				}
			}
			if (acertada) {
				System.out.println("Has adivinado la palabra: " + palabra);
				System.out.println("Puntos obtenidos: " + puntos);
			} else {
				System.out.println("Has perdido. La palabra era: " + palabra);
				puntos = 0;
				System.out.println("Puntos obtenidos: " + puntos);
			}

			Partida partida = new Partida(nombre, puntos);
			Gson gson = new Gson();
			String json = gson.toJson(partida);
			bw = new BufferedWriter(new FileWriter("partida.json"));
			bw.write(json);

		} catch (IOException e) {
			System.out.println("Error al leer o escribir ficheros");
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar los buffers");
				e.printStackTrace();
			}
		}
	}
}