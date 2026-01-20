package ejercicio07;

import java.util.Arrays;

public class Tienda {
	/**
	 * Crea una clase Tienda que contenga un array de 5 productos.
	 * Cada producto tiene nombre, precio y cantidad en stock.
	 * Incluye métodos para:
	 * Añadir productos al inventario.
	 * Buscar un producto por su nombre y mostrar su precio y cantidad.
	 * Vender un producto (disminuir la cantidad en stock).
	 */
	
	private Producto [] productos = new Producto [5];

	// Constructor
	public Tienda() {
		super();
	}

	@Override
	public String toString() {
		return "Tienda [productos=" + Arrays.toString(productos) + "]";
	}
	
	// Metodos
	public void anadirProducto(Producto p) {
        int pos = 0;
        boolean añadido = false;
        while (pos < productos.length && !añadido) {
            if (productos[pos] == null) {
                productos[pos] = p;
                añadido = true;
                System.out.println("Producto añadido correctamente");
            }
            pos++;
        }
        if (!añadido) {
            System.out.println("Inventario lleno");
        }
	}
	
	public void buscarProducto(String nombre) {
        int pos = 0;
        boolean encontrado = false;
        while (pos < productos.length && !encontrado) {
            if (productos[pos] != null &&
                productos[pos].getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println("Producto encontrado");
                System.out.println("Precio: " + productos[pos].getPrecio());
                System.out.println("Stock: " + productos[pos].getStock());
            }
            pos++;
        }
        if (!encontrado) {
            System.out.println("El producto no existe");
        }
    }
	
	public void venderProducto(String nombre, int cantidad) {
        int pos = 0;
        boolean vendido = false;
        while (pos < productos.length && !vendido) {
            if (productos[pos] != null &&
                productos[pos].getNombre().equalsIgnoreCase(nombre)) {
                if (productos[pos].getStock() >= cantidad) {
                    productos[pos].setStock(
                        productos[pos].getStock() - cantidad
                    );
                    System.out.println("Venta realizada correctamente");
                } else {
                    System.out.println("Stock insuficiente");
                }
                vendido = true;
            }
            pos++;
        }
        if (!vendido) {
            System.out.println("Producto no encontrado");
        }
    }
	
}