package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Crea una clase Banco que tendrá un atributo estático (static) llamado cif y uno no estático llamado numeroEmpleados.
		 * Demuestra que el atributo estático es igual para todos los objetos creados de la clase Banco.
		 */
		
		Banco b1 = new Banco(25);
		Banco b2 = new Banco(50);
		// Mostramos los datos de ambos bancos
		System.out.println(b1);
		System.out.println(b1.getCif());
		System.out.println(b2);
		System.out.println(b2.getCif());
		
		// Al cambiar el cif en uno de los bancos debe de cambiarse en todos ya que es estatico
		b1.setCif("R5678985A");
		System.out.println(b1);
		System.out.println(b1.getCif());
		System.out.println(b2);
		System.out.println(b2.getCif());
		
	}

}