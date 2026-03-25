package ejercicio12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		/*
		 * En un almacén logístico, los productos se organizan por "Pasillos". 
		 * Cada pasillo tiene una capacidad fija de 5 productos.
		 * Crea un HashMap<String, Producto[]>. La clave es el código del pasillo (ej: "A1", "B2") 
		 * y el valor es un array de 5 objetos Producto (atributos: nombre, codigoBarras y precio).
		 * Escribe una función de búsqueda que reciba el mapa y el nombre de un producto.
		 * El programa debe recorrer todas las entradas del mapa. Por cada pasillo, debe iterar 
		 * el array de productos usando un bucle for tradicional para encontrar coincidencias.
		 * Si lo encuentra, debe devolver la "ubicación exacta", que consiste en 
		 * la Clave del Mapa (Pasillo) y el Índice del Array (Estante).
		 */
		
		HashMap<String, Producto[]> mapaProductos = new HashMap<String, Producto[]>();
		
		anadirProductos("A1", new Producto("p1", "cod-124", 4.5f), mapaProductos);
		anadirProductos("A1", new Producto("p2", "cod-189", 2), mapaProductos);
		anadirProductos("A1", new Producto("p3", "cod-145", 6.5f), mapaProductos);
		anadirProductos("A1", new Producto("p4", "cod-694", 3), mapaProductos);
		anadirProductos("A1", new Producto("p5", "cod-458", 2.2f), mapaProductos);
		anadirProductos("B2", new Producto("p6", "cod-235", 3.5f), mapaProductos);
		anadirProductos("B2", new Producto("p7", "cod-965", 4), mapaProductos);
		anadirProductos("B2", new Producto("p8", "cod-784", 1), mapaProductos);
		anadirProductos("B2", new Producto("p9", "cod-989", 1.8f), mapaProductos);
		anadirProductos("B2", new Producto("p10", "cod-454", 2.3f), mapaProductos);
		
		System.out.println();
		System.out.println(Arrays.toString(mapaProductos.get("A1")));
		System.out.println(Arrays.toString(mapaProductos.get("B2")));
		System.out.println();
		
		buscarProducto(mapaProductos, "p6");

	}

	// Leticia lo resuelve redimensionando (otra forma de hacerlo)
	/*
	 * private static void anadirProductos(HashMap<String, Producto[]> supermercado, String pasillo, Producto producto) {
		if (supermercado.containsKey(pasillo)) {// añadimos al array el producto
			Producto[] productos = supermercado.get(pasillo);
			if (productos.length < 5) {
				// Se puede añadir un producto
				Producto[] aux=Arrays.copyOf(productos, productos.length+1);
				aux[aux.length-1]=producto;
				//Una vez añadido el producto al array, se actualiza el mapa
				supermercado.put(pasillo, aux);
			} else {
				System.out.println("Se ha alcanzado el máximo de productos por pasillo");
			}

		}else { //Creamos una nueva entrada en el mapa
			Producto[] nuevo= {producto};
			supermercado.put(pasillo, nuevo);
			
		}

	}
	 */
	private static void anadirProductos(String pasillo, Producto producto, HashMap<String, Producto[]> mapaProductos) {
		if (mapaProductos.containsKey(pasillo)) {
			int cont = 0;
			boolean encontrado = false;
			Producto[] productos = mapaProductos.get(pasillo);
			while (cont < productos.length && !encontrado) {
				if (productos[cont] == null) {
					productos[cont] = producto;
					mapaProductos.put(pasillo, productos);
					encontrado = true;
				}
				cont++;
			}
		} else {
			Producto [] p = new Producto[5];
			p[0] = producto;
			mapaProductos.put(pasillo, p);
		}
	}
	
	private static void buscarProducto(HashMap<String, Producto[]> mapaProductos, String producto) {
		// Recorremos el mapa a partir de sus claves
		Set<String> claves = mapaProductos.keySet();
		// Iterator sobre las claves
		Iterator<String> it = claves.iterator();
		while (it.hasNext()) {
			String clave = (String) it.next();
			// Obtenemos el array asociado a la clave
			Producto[] p = mapaProductos.get(clave);
			// Recorremos el array para buscar el producto
			for (int i = 0; i < p.length; i++) {
				if (p[i] != null && p[i].getNombre().equalsIgnoreCase(producto)) {
					System.out.println("El producto se encuentra en el pasillo " + clave + ", en el estante " + (i+1));
				}
			}	
			// Si quisieramos agregar el comentario, hay que crear una variable booleana
			// System.out.println("Lo siento, no he encontrado ese producto en el almacén");
		}
	}

}