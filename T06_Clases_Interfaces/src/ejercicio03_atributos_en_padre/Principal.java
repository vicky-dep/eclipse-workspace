package ejercicio03_atributos_en_padre;

public class Principal {

	public static void main(String[] args) {
		
		Gradas g1 = new Gradas("G1", "Lucas", "Prince", "20260505", 10, "A1");
		Gradas g2 = new Gradas("G2", "Ana", "Pablo Alboran", "20260405", 25, "C1");
		
		Pista p1 = new Pista("P3", "Pepe", "Maroon 5", "20260707");
		Pista p2 = new Pista("P2", "Maria", "CuentaCuentos", "20261101");
		
		Entradas[] e = {g1,g2,p1,p2};
		Ventas v = new Ventas(e);
		
		v.comprarEntrada("Pista");
		System.out.println("Entradas totales vendidas: "+ v.cuantasVendidas());
		System.out.println("Entradas de ACDC: " + v.entradasPorArtista("ACDC"));
		v.modificarAsiento(g1, 23);
		v.modificarEntrada(p2, "20260328");
		
	}

}