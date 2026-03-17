package ejercicio03_sin_padre_con_object;

public class Principal {

	public static void main(String[] args) {
		Gradas g1 = new Gradas(32, "A1", "G1", "Lucas", "Prince", "20260505");

		Gradas g2 = new Gradas(25, "C1", "G2", "Ana", "Pablo Alborán", "20260405");
		Pista p1 = new Pista("P3", "Pepe", "Maroon 5", "20260707");
		Pista p2 = new Pista("P2", "María", "Cuentacuentos", "20261101");

		Object[] e = { g1, g2, p1, p2};
		Ventas v = new Ventas(e);
		// Probamos los métodos
		v.comprarEntrada("Pista");
		System.out.println("Entradas totales vendidas:" + v.cuantasVendidas());
		System.out.println("Entradas de Metallica:" + v.entradasPorArtista("Metallica"));
		v.modificarAsiento(g1, 23);
		v.modificarEntrada(p2, "20260328");
		System.out.println(v);

	}
}