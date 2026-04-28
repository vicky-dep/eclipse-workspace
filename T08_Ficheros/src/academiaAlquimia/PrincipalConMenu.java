package academiaAlquimia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class PrincipalConMenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Alambique alambique = new Alambique();
		alambique = cargarJson();

		int opcion = 0;

		while (opcion != 3) {

			System.out.println("\n--- ACADEMIA DE ALQUIMIA ---");
			System.out.println("1. Practicar destilacion");
			System.out.println("2. Ver log");
			System.out.println("3. Salir");
			System.out.println("Elige una opcion:");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				jugar(sc, alambique);
				break;
			case 2:
				mostrarLog();
				break;
			case 3:
				guardarJson(alambique);
				System.out.println("Inventario guardado. Fin del programa.");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
		}
		sc.close();
	}

	private static void jugar(Scanner sc, Alambique alambique) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;

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

			bw = new BufferedWriter(new FileWriter("laboratorio_log.txt", true));
			bw.write(cadena);
			bw.newLine();
			System.out.println("Partida guardada en laboratorio_log.txt");
			
			if (acierto) {
				int potencia = (int) (Math.random() * 100) + 1;
				ArrayList<String> ingredientesPocima = new ArrayList<String>();
				ingredientesPocima.add(ingredienteAdivinar);
				Pocima p = new Pocima(potencia, ingredientesPocima);
				alambique.addPocima(p);
				System.out.println("Pocima creada con potencia: " + potencia);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura");
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.flush();
				bw.close();
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

	private static void mostrarLog() {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("laboratorio_log.txt"));

			String linea = br.readLine();

			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Todavia no existe el fichero laboratorio_log.txt");

		} catch (IOException e) {
			System.out.println("Error al leer el log");
			e.printStackTrace();

		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			}
		}
	}
	
	private static Alambique cargarJson() {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("inventario.json"));

			String json = "";
			String linea = br.readLine();

			while (linea != null) {
				json += linea;
				linea = br.readLine();
			}

			Gson gson = new Gson();
			Alambique a = gson.fromJson(json, Alambique.class);

			System.out.println("Inventario cargado correctamente");

			return a;

		} catch (FileNotFoundException e) {
			System.out.println("No existe inventario previo. Se crea uno nuevo");
			return new Alambique();

		} catch (IOException e) {
			System.out.println("Error al leer inventario");
			return new Alambique();

		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar");
			}
		}
	}

	private static void guardarJson(Alambique alambique) {
		BufferedWriter bw = null;
		try {
			Gson gson = new Gson();
			bw = new BufferedWriter(new FileWriter("inventario.json"));
			bw.write(gson.toJson(alambique));

		} catch (IOException e) {
			System.out.println("Error al guardar inventario.json");
			e.printStackTrace();

		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			}
		}
	}

}