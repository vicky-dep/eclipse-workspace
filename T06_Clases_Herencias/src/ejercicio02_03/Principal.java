package ejercicio02_03;

public class Principal {

	public static void main(String[] args) {
		
		CajaCarton cajacarton = new CajaCarton(30,40,40, "cm");
		
		System.out.println(cajacarton.calcularSuperficie());

	}

}