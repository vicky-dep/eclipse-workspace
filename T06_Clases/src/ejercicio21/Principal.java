package ejercicio21;

public class Principal {
	public static void main(String[] args) {
		
		Cafetera c = new Cafetera(2500,100);
		c.agregarCafe(250);
		System.out.println(c);
		c.servirTaza(125);
		System.out.println(c);
		c.llenarCafetera();
		System.out.println(c);
		c.vaciarCafetera();
		System.out.println(c);
	}
}