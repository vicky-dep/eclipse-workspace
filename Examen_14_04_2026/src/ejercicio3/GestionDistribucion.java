package ejercicio3;

import java.util.*;

public class GestionDistribucion {

	public static void main(String[] args) {
		// --- INICIALIZACIÓN ---
		// Mapa: Dígito de muelle (0-9) -> Lista de productos
	/*	Map<Integer, ArrayList<String>> muelles = new HashMap<>();

		// Inicializamos los 10 muelles para evitar errores de puntero nulo
		for (int i = 0; i <= 9; i++) {
			muelles.put(i, new ArrayList<String>());
		}

		// --- PRUEBA DEL MÉTODO: registrarEnvio ---
		registrarEnvio(muelles, 1029, "Monitor LED");
		registrarEnvio(muelles, 5549, "Teclado Mecánico");
		registrarEnvio(muelles, 3019, "Monitor LED"); // Duplicado
		registrarEnvio(muelles, 8829, "Ratón Óptico");
		registrarEnvio(muelles, 9999, "Teclado Mecánico"); // Duplicado

		System.out.println("Muelle 9 (Antes de optimizar): " + muelles.get(9));

		// --- PRUEBA DEL MÉTODO: optimizarMuelle ---
		optimizarMuelle(muelles, 9);

		System.out.println("Muelle 9 (Optimizado y Ordenado): " + muelles.get(9));*/
		
		
		Map<Integer, ArrayList<String>> muelles = new HashMap<>();

		// Inicializamos los 10 muelles para evitar errores de puntero nulo
		for (int i = 0; i <= 9; i++) {
			muelles.put(i, new ArrayList<String>());
		}

		// --- PRUEBA DEL MÉTODO: registrarEnvio ---
		registrarEnvio(muelles, 1029, "Monitor LED");
		registrarEnvio(muelles, 5549, "Teclado Mecánico");
		registrarEnvio(muelles, 3019, "Monitor LED"); // Duplicado
		registrarEnvio(muelles, 8829, "Ratón Óptico");
		registrarEnvio(muelles, 9999, "Teclado Mecánico"); // Duplicado

		System.out.println("Muelle 9 (Antes de optimizar): " + muelles.get(9));

		// --- PRUEBA DEL MÉTODO: optimizarMuelle ---
		optimizarMuelle(muelles, 9);

		System.out.println("Muelle 9 (Optimizado y Ordenado): " + muelles.get(9));
		
	}

	
	private static void registrarEnvio(Map<Integer, ArrayList<String>> muelles, int codigoSeguimiento, String nombreProducto) {
		int clave = codigoSeguimiento % 10;
		ArrayList<String> listaProductos = muelles.get(clave);
		listaProductos.add(nombreProducto);
		muelles.put(clave, listaProductos);
		System.out.println("Producto añadido correctamente");
	}

	private static void optimizarMuelle(Map<Integer, ArrayList<String>> muelles, int digito) {
		// obtengo la lista de productos asociados a la clave (digito)
		ArrayList<String> listaProductos = muelles.get(digito);
		
		// creo un conjunto para eliminar los productos duplicados
		// elijo TreeSet ya que es el que además utiliza orden natural
		TreeSet<String> conjuntoProductos = new TreeSet<String>();
		conjuntoProductos.addAll(listaProductos);
		
		// con clear vacío los elementos de la lista, pero la lista sigue existiendo
		listaProductos.clear();
		// por último a la lista le agrego los productos ordenados y sin duplicados
		listaProductos.addAll(conjuntoProductos);
	}

	/* 
	// este seria el metodo REGISTRAR si no se hubiesen inicializado todos los muelles anteriormente
	private static void registrarEnvio(Map<Integer, ArrayList<String>> muelles, int codigoSeguimiento, String nombreProducto) {
		int clave = codigoSeguimiento % 10;
		if(!muelles.containsKey(clave)) {
			ArrayList<String> nuevoArray = new ArrayList<String>();
			nuevoArray.add(nombreProducto);
			muelles.put(clave, nuevoArray);
			System.out.println("Se agregó una clave nueva con el nombre del producto");
		} else {
			ArrayList<String> arrayProductos = muelles.get(clave);
			arrayProductos.add(nombreProducto);
			muelles.put(clave, arrayProductos);
			System.out.println("Producto añadido correctamente");
		}
	}
	 */

}