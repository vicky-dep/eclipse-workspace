package ejercicio5;

public class Principal {

	public static void main(String[] args) {

		Inventario i = new Inventario();
		
		i.registrarProductos("chaqueta", 15); // agrego un producto que no existe
		i.registrarProductos("gorro", 20); // agrego un producto que no existe
		i.registrarProductos("camiseta", 12); // agrego un producto que existe para verificar que funcione el aumento en las cantidades
		System.out.println(i);
	
		i.consultarCantidad("chaqueta"); // consulto sobre un producto existente
		i.consultarCantidad("CAMISETA"); // verifico que funciona el .equalsIgnoreCase
		i.consultarCantidad("algo"); // consulto sobre un producto que no esta en el inventario
		
		i.reducirInventario("gorro", 2);
		System.out.println(i); // verifico la reduccion en la cantidad del producto vendido anteriormente
		
		i.mostrarInventario();
		
		double[] precios = {15.99, 22.90, 18.99, 34.98, 9.99}; // array adicional alineado por indice con el de los productos
		System.out.println("Valor total inventario: " + i.calcularValorTotalInventario(precios));
	}

}