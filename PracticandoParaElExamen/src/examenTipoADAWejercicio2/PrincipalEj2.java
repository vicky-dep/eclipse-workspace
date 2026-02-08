package examenTipoADAWejercicio2;

import java.util.Arrays;

public class PrincipalEj2 {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		// para comprobar mensaje cuando no hay animales
		System.out.println();
		z.mostrarAnimales();
		
		System.out.println();
		z.registrarAnimales("perro");
		z.registrarAnimales("gato");
		z.registrarAnimales("ganso");
		z.registrarAnimales("gallina");
		z.registrarAnimales("gato");
		System.out.println(z);
		
		System.out.println();
		z.eliminarAnimal("gallo");
		z.eliminarAnimal("perro");
		System.out.println(z);
		
		int espacios = z.consultarEspacio(z.getAnimales());
		System.out.println("Hay " + espacios + " espacios libres");
		
		// si hacia el metodo con return String[]:
		// System.out.println(Arrays.toString(z.mostrarAnimales(z.getAnimales())));
		
		System.out.println();
		z.mostrarAnimales();
		
		System.out.println();
		String buscado1 = z.buscarAnimal("gato");
		String buscado2 = z.buscarAnimal("vaca");
		System.out.println(buscado1);
		System.out.println(buscado2);
		
	}
}