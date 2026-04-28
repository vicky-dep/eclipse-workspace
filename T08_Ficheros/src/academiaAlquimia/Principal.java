package academiaAlquimia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		BufferedWriter bw1 = null;
		BufferedWriter bw2 = null;
		
		try {
			br = new BufferedReader(new FileReader("ingredientes.txt"));
			String linea = br.readLine();
			ArrayList<String> ingredientes = new ArrayList<String>();
			while (linea != null) {
				ingredientes.add(linea);
				linea = br.readLine();
			}
			
			int pos = (int) (Math.random() * ingredientes.size());
			String ingredienteAdivinar = ingredientes.get(pos);
			
			String huecos = "";
			for (int i = 0; i < ingredienteAdivinar.length(); i++) {
				huecos += "_";
			}
			
			System.out.println("El ingrediente que tienes que adivinar tiene " + ingredienteAdivinar.length() + " letras");
			System.out.println(huecos);
			int fallos = 0;
			boolean acierto = false;
			String mensaje = "";
			
			Scanner sc = new Scanner(System.in);
			while (fallos < 5 && !acierto) {
				System.out.println("Dime una letra");
				String letra = sc.next();
				if (ingredienteAdivinar.contains(letra)) {
					huecos = reemplazarLetra(ingredienteAdivinar, letra, huecos);
					System.out.println(huecos);
					if (!huecos.contains("_")) {
						acierto = true;
						System.out.println("Enhorabuena! Frase completada");
						mensaje = "Ganado";
					}
				} else {
					fallos++;
					System.out.println("Fallos: " + fallos + " de 5");
					System.out.println(huecos);
				}
			}
			if (!acierto) {
				mensaje = "Perdido";
				System.out.println("Has perdido. El ingrediente era: " + ingredienteAdivinar);
			}
			
			System.out.println("Dime tu nombre para guardar la partida");
			String nombre = sc.next();
			
			String cadena = nombre + " - " + ingredienteAdivinar + " - " + mensaje;
			
			bw1 = new BufferedWriter(new FileWriter("laboratorio_log.txt", true));
			bw1.write(cadena);
			bw1.newLine();
			System.out.println("Partida guardada en laboratorio_log.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura");
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw1.flush();
				bw1.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			}
		}
		
	}

	private static String reemplazarLetra(String ingredienteAdivinar, String letra, String huecos) {
		String aux = "";
		for (int i = 0; i < ingredienteAdivinar.length(); i++) {
			if (String.valueOf(ingredienteAdivinar.charAt(i)).equalsIgnoreCase(letra)) {
				aux += letra;
			} else {
				aux += String.valueOf(huecos.charAt(i));
			}
		}
		huecos = aux;
		return huecos;
	}

}