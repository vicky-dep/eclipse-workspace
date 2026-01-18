package ejercicio8;

public class Principal {

	public static void main(String[] args) {
		
		Colores c = new Colores();
		
		System.out.println("Array original (colores por defecto):");
		System.out.println(c);
		System.out.println();
		
		String c1 = "naranja";
		c.anadirColor(c1);
		
		String c2 = "rojo";
		c.anadirColor(c2);

		System.out.println("Array después de añadir más colores");
		System.out.println(c);

	}

}