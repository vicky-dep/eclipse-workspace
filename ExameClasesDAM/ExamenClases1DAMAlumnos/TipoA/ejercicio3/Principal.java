package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Crea una clase Contador, esta clase tendrá un atributo estático (static) cuenta global y
		 * un atributo no estático cuenta individual. Demuestra que el atributo estático es igual para
		 * todos los objetos creados de la clase Contador.
		 */
		
		Contador c1 = new Contador(5);
		Contador c2 = new Contador(10);
		Contador c3 = new Contador(15);
		Contador c4 = new Contador(20);
		
		System.out.println(c1);
		System.out.println(c1.getCuentaGlobal());
		System.out.println(c2);
		System.out.println(c2.getCuentaGlobal());
		System.out.println(c3);
		System.out.println(c3.getCuentaGlobal());
		System.out.println(c4);
		System.out.println(c4.getCuentaGlobal());
		
		// Modifico el valor de cuentaGlobal y demuestro que cambia en todas las instancias
		c1.setCuentaGlobal(18);
		System.out.println(c1);
		System.out.println(c1.getCuentaGlobal());
		System.out.println(c2);
		System.out.println(c2.getCuentaGlobal());
		System.out.println(c3);
		System.out.println(c3.getCuentaGlobal());
		System.out.println(c4);
		System.out.println(c4.getCuentaGlobal());
		
	}
}