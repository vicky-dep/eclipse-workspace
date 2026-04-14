package ejercicio1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrincipalEjercicio1 {

	public static void main(String[] args) {
	/*	GestionVideoteca miStreaming = new GestionVideoteca();

		// Registro de datos
		miStreaming.registrarPelicula("Ciencia Ficción", new Pelicula("PEL-101", "Inception", "Nolan", 2010, 8.8));
		miStreaming.registrarPelicula("Ciencia Ficción", new Pelicula("PEL-102", "Interstellar", "Nolan", 2014, 8.6));
		miStreaming.registrarPelicula("Ciencia Ficción", new Pelicula("PEL-103", "2001: Odisea", "Kubrick", 1968, 8.3));

		// Probar actualización
		miStreaming.actualizarPuntuacion("Ciencia Ficción", "PEL-101", 9.5);
		System.out.println("\n--- Tras actualizar puntuación de Inception ---");
		System.out.println(miStreaming.buscarPorCodigo("Ciencia Ficción", "PEL-101"));

		// Añadir métodos para ordenar*/


		Map<String, Pelicula[]> mapa = new HashMap<String, Pelicula[]>();
		
		Pelicula p1 = new Pelicula("PEL-101", "Inception", "Nolan", 2010, 8.8);
		Pelicula p2 = new Pelicula("PEL-102", "Interstellar", "Nolan", 2014, 8.6);
		Pelicula p3 = new Pelicula("PEL-103", "2001: Odisea", "Kubrick", 1968, 8.3);
		
		Pelicula[] peliculas = {p1, p2, p3};
		
		mapa.put("Ciencia Ficción", peliculas);
		
		System.out.println("Antes de ordenar:");
		System.out.println(Arrays.toString(mapa.get("Ciencia Ficción")));
		
		System.out.println("Orden natural (título):");
		Arrays.sort(mapa.get("Ciencia Ficción"));
		System.out.println(Arrays.toString(mapa.get("Ciencia Ficción")));
		
		System.out.println("Orden con comparator (de más reciente a más antigua):");
		AnioComparator c = new AnioComparator();
		Arrays.sort(mapa.get("Ciencia Ficción"), c);
		System.out.println(Arrays.toString(mapa.get("Ciencia Ficción")));
	
	}
	
}