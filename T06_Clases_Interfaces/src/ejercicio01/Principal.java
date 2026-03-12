package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		Jarabe j1 = new Jarabe("J1", 10, 2, "20250101");
		Jarabe j2 = new Jarabe("J2", 8.5f, 1, "20270101");
		Tirita t1 = new Tirita("T1", "Bayer", 25, 1.5f, true, "Transparente");
		Tirita t2 = new Tirita("T2", "Jonhson", 10, 2.5f, false, "Dibujos");

		ProductosFarmaceuticos[] productos = {j1, j2, t1, t2};
		
		Farmacia f = new Farmacia(productos);
		
		// Probamos los metodos
		System.out.println("Se ha podido comprar:" + f.comprarTiritas(t1));
		// Añadimos una tirita nueva
		Tirita t3 = new Tirita("T3", "Jonhson", 36, 5, false, "Brillos");
		System.out.println("Se ha podido comprar:" + f.comprarTiritas(t3));
		System.out.println("Jarabes caducados:" + f.cuantosJarabesCaducados("20260312"));
		System.out.println("Se ha podido modificar la cantidad:" + f.modificarCantidad(t2, 15));
		System.out.println(t2);
		System.out.println("Se ha podido modificar la cantidad:" + f.modificarPrecio(j1, 7.25f));
		System.out.println(j1);
		
	}

}