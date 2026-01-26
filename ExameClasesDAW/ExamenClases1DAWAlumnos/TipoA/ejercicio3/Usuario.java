package ejercicio3;

public class Usuario {

	public static void main(String[] args) {
		/**
		 * Crea una clase animales que tendrá un atributo estático (static) llamado totalVendidos y uno no estático llamado nombreanimales. 
		 * Demuestra que el atributo estático es igual para todos los objetos creados de la clase Usuario.
		 */
		
		Animales a1 = new Animales("Perro");
		Animales a2 = new Animales("Gato");
		
		// Mostramos los datos de ambos
		System.out.println(a1);
		System.out.println(a1.getTotalVendidos());
		System.out.println(a2);
		System.out.println(a2.getTotalVendidos());
		
		// Al cambiar el total vendido en uno, debe cambiarse en todos por ser estatico
		a1.setTotalVendidos(35);
		System.out.println(a1);
		System.out.println(a1.getTotalVendidos());
		System.out.println(a2);
		System.out.println(a2.getTotalVendidos());
		
	}

}