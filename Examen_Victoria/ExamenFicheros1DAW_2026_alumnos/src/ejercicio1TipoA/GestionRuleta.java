package ejercicio1TipoA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class GestionRuleta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JuegoRuleta datosJuego = cargarConfiguracion();

		if (datosJuego == null) {
			return;
		}

		System.out.println("1. Jugar Partida");
		System.out.println("2. Consultar Récords");
		int opcion = Integer.parseInt(sc.nextLine());

		if (opcion == 1) {
			jugar(datosJuego, sc);
		} else {
			leerHistorico();
		}
	}

	
	private static JuegoRuleta cargarConfiguracion() {
		
		BufferedReader br = null;
		JuegoRuleta jr = new JuegoRuleta();
		
		try {
			br = new BufferedReader(new FileReader("paneles.json"));
			String json = "";
			String linea = br.readLine();
			
			while (linea != null) {
				json += linea;
				linea = br.readLine();
			}
			
			Gson gson = new Gson();
			jr = gson.fromJson(json, JuegoRuleta.class);
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			}
		}
		
		return jr;
	}

	private static void jugar(JuegoRuleta datos, Scanner sc) {
		
		// Le he quitado los espacios a las frases del json
		
		int pos = (int) (Math.random() * datos.listaPaneles.size());
		Paneles panelAleatorio = datos.listaPaneles.get(pos);
		String fraseAdivinar = panelAleatorio.getFrase();
		String huecos = "";
		for (int i = 0; i < fraseAdivinar.length(); i++) {
			huecos += "_";
		}
		
		int intentos = 0;
		boolean acierto = false;
		int puntos = 0; // si adivina letra sumará 2 puntos, en caso contrario, restará 1 punto
		
		System.out.println("Dime tu nombre para empezar el juego");
		String nombre = sc.next();
		System.out.println("Introduce la fecha de hoy (ddmmyyyy)");
		String fecha = sc.next();
		
		while (intentos < 5 && !acierto) {
			
			System.out.println("Intenta adivinar la frase");
			System.out.println(huecos);
			
			System.out.println("Dime una letra");
			String letra = sc.next();
			
			if (fraseAdivinar.contains(letra)) {
				huecos = reemplazarLetra(fraseAdivinar, letra, huecos);
				System.out.println(huecos);
				puntos += 2;
				if (!huecos.contains("_")) {
					System.out.println("Enhorabuena! Has adivinado la frase.");
					acierto = true;
				}
			} else {
				intentos++;
				puntos += -1;
				System.out.println("Intento: " + intentos + " de 5.");
				// System.out.println(huecos);
			}
		}
		if (!acierto) {
			System.out.println("Has agotado el número de intentos. La frase a adivinar era: " + fraseAdivinar);
		}
		
		System.out.println("¿Deseas guardar la puntuación obtenida?");
		System.out.println("1. Sí");
		System.out.println("2. No");
		int opcion = sc.nextInt();
		
		if (opcion == 1) {
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("historico_partidas.txt", true)); // true para que no sobreescriba el fichero
				String cadena = nombre + ", " + fraseAdivinar + ", " + puntos + ", " + fecha;
				bw.write(cadena);
				bw.newLine(); // al abrir el fichero, escribe cada partida en una linea, pero por consola se ve seguido
				
			} catch (IOException e) {
				System.out.println("Error al crear el fichero");
				e.printStackTrace();
			} finally {
				try {
					bw.flush();
					bw.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el fichero");
					e.printStackTrace();
				}
			}
			System.out.println("Partida guardada.");
		} else {
			System.out.println("La partida no se guardará. Game over.");
		}	
	}

	private static String reemplazarLetra(String fraseAdivinar, String letra, String huecos) {
		String aux = "";
		for (int i = 0; i < fraseAdivinar.length(); i++) {
			String caracter = String.valueOf(fraseAdivinar.charAt(i));
			if (caracter.equalsIgnoreCase(letra)) {
				aux += letra;
			} else {
				aux += String.valueOf(huecos.charAt(i));
			}
		}
		huecos = aux;
		return huecos;
	}
	
	private static void leerHistorico() {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("historico_partidas.txt"));
			String resultado = "";
			String linea = br.readLine();
			
			while (linea != null) {
				resultado += linea;
				linea = br.readLine();
			}
			
			System.out.println(resultado);
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el buffer");
				e.printStackTrace();
			}
		}
	}

}


/* ORIGINAL POR SI ROMPO...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JuegoRuleta datosJuego = cargarConfiguracion();

		if (datosJuego == null) {
			return;
		}

		System.out.println("1. Jugar Partida");
		System.out.println("2. Consultar Récords");
		int opcion = Integer.parseInt(sc.nextLine());

		if (opcion == 1) {
			jugar(datosJuego, sc);
		} else {
			leerHistorico();
		}
}
	
	/*private static JuegoRuleta cargarConfiguracion() {
		
	}

	private static void jugar(JuegoRuleta datos, Scanner sc) {
		
	}

	

	
	private static void leerHistorico() {

	}
}*/