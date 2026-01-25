package ejercicio5;

import java.util.Arrays;

public class Inventario {
	/**
	 * Crea una clase llamada Inventario que almacene productos y sus cantidades en dos arrays paralelos: 
	 * uno para los nombres de los productos y otro para la cantidad disponible de cada producto. 
	 * Implementa los siguientes métodos:
	 * 
	 * Registrar productos: Permite agregar productos al inventario, especificando su nombre y cantidad inicial. 
	 * Si el producto ya existe, simplemente suma la cantidad al inventario existente.
	 * 
	 * Consultar cantidad: Recibe el nombre de un producto y devuelve la cantidad disponible en el inventario. 
	 * Si el producto no existe, devuelve un mensaje indicando que no está registrado.
	 * 
	 * Reducir inventario (vender productos): Recibe el nombre del producto y la cantidad que se desea vender.
	 * Verifica si el producto existe y si hay suficiente cantidad disponible para realizar la venta.
	 * Si es posible, actualiza el inventario restando la cantidad vendida.
	 * Si no es posible, muestra un mensaje indicando el problema.
	 * 
	 * Mostrar inventario: Devuelve una lista de todos los productos registrados junto con su cantidad actual.
	 * 
	 * Calcular valor total del inventario: Recibe un array adicional con los precios unitarios de cada producto (alineado 
	 * por índice con el de los productos) y calcula el valor total del inventario considerando las cantidades y precios.
	 */
	
	private String[] productos = {"camiseta", "sudadera", "pantalon"};
	private int[] cantidades = {15, 12, 8};
		
	// Constructor
	public Inventario() {
		super();
	}
	public Inventario(String[] productos, int[] cantidades) {
		super();
		this.productos = productos;
		this.cantidades = cantidades;
	}
	// Getters & Setters
	public String[] getProductos() {
		return productos;
	}
	public void setProductos(String[] productos) {
		this.productos = productos;
	}
	public int[] getCantidades() {
		return cantidades;
	}
	public void setCantidades(int[] cantidades) {
		this.cantidades = cantidades;
	}
	@Override
	public String toString() {
		return "Inventario [productos=" + Arrays.toString(productos) + ", cantidades=" + Arrays.toString(cantidades)
				+ "]";
	}
	
	// Metodos de la clase
	public void registrarProductos(String producto, int cantidad) {
		// Si el producto existe se deben sumar las cantidades
		int pos = 0;
		boolean encontrado = false;
		
		while (pos < productos.length && !encontrado) {
			if (productos[pos].equalsIgnoreCase(producto)) {
				cantidades[pos] += cantidad;
				encontrado = true;
			}
			pos ++;
		}
		if (!encontrado) {
			String[] copyProd = Arrays.copyOf(productos, productos.length + 1);
			copyProd[copyProd.length-1] = producto;
			productos = copyProd;
			System.out.println("Producto añadido correctamente");
			
			int[] copyCant = Arrays.copyOf(cantidades, cantidades.length + 1);
			copyCant[copyCant.length-1] = cantidad;
			cantidades = copyCant;
			System.out.println("Cantidad añadida correctamente");
		} else {
			System.out.println("Ese producto ya esta en el inventario, se actualizan cantidades");
		}
	}
	
	public void consultarCantidad(String producto) {
        int pos = 0;
        boolean encontrado = false;
        while (pos < productos.length && !encontrado) {
            if (productos[pos].equalsIgnoreCase(producto)) {
                encontrado = true;
                System.out.println("Cantidad de " + producto + ": " +
                					cantidades[pos]);
            }
            pos++;
        }
        if (!encontrado) {
            System.out.println("El producto " + producto + " no esta registrado");
        }
	}
	
	public void reducirInventario(String producto, int cantidad) {
		// Se comprueba que el producto exista y que haya cantidad suficiente
        int pos = 0;
        boolean encontrado = false;
        while (pos < productos.length && !encontrado) {
            if (productos[pos].equalsIgnoreCase(producto)) {
            	if (cantidades[pos] >= cantidad) {
            		cantidades[pos] -= cantidad;
            		System.out.println("Se vendieron " + cantidad + " unidades del producto " + producto);
            	} else {
            		System.out.println("No hay suficiente unidades disponibles para realizar la venta");
            	}
            	encontrado = true;
            }
            pos++;
        }
        if (!encontrado) {	    	System.out.println("Producto    Cantidad");
            System.out.println("El producto que deseas comprar no se encuentra en el inventario");
        }
	}
	
	public void mostrarInventario() {
	    if (productos.length == 0) {
	        System.out.println("El inventario está vacío");
	    } else {
	        for (int i = 0; i < productos.length; i++) {
	            System.out.println("Producto: " + productos[i] + " - Cantidad: " + cantidades[i]);
	        }
	    }
	}
	
	public double calcularValorTotalInventario(double[] precios) {
		double total = 0;
		for (int i = 0; i < productos.length; i++) {
			total += precios[i] * cantidades[i]; 
		}
		return total;
	}
}