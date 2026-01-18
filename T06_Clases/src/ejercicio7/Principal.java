package ejercicio7;

public class Principal {

	public static void main(String[] args) {
		
        Tienda t = new Tienda();

        Producto p1 = new Producto("Pan", 1.2, 10);
        Producto p2 = new Producto("Leche", 0.9, 20);
        Producto p3 = new Producto("Huevos", 2.5, 12);

        t.anadirProducto(p1);
        t.anadirProducto(p2);
        t.anadirProducto(p3);

        System.out.println();
        t.buscarProducto("Leche");

        System.out.println();
        t.venderProducto("Leche", 5);

        System.out.println();
        t.buscarProducto("Leche");
    }

}