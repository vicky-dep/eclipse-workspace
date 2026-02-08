package examenTipoADAWejercicio3;

public class PrincipalEj3 {
	
	public static void main(String[] args) {

		Animales a1 = new Animales("perro");
		Animales a2 = new Animales("gato");
		Animales a3 = new Animales("gallo");
		Animales a4 = new Animales("gallina");
		
		System.out.println(a1);
		System.out.println(a1.getTotalVendidos());
		System.out.println();
		System.out.println(a2);
		System.out.println(a2.getTotalVendidos());
		System.out.println();
		a3.setTotalVendidos(200);
		System.out.println(a4);
		System.out.println(a4.getTotalVendidos());
		
	}
}