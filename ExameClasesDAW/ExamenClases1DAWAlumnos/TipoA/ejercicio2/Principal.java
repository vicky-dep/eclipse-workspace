package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Zoo e=new Zoo();
		e.mostrarAnimales(); // lo pruebo tambien al comienzo para que me de el mensaje de inventario vacio
		e.registrarAnimal("perro");
		e.registrarAnimal("gato");
		e.registrarAnimal("jirafa");
		e.registrarAnimal("jirafa");
		System.out.println(e);
		int consultarEspacio = e.consultarEspacio();
		System.out.println("Hay "+consultarEspacio+ " vacios");
		e.mostrarAnimales();
		String buscarAnimal = e.buscarAnimal("tigre");
		System.out.println(buscarAnimal);
		String buscarAnimal1 = e.buscarAnimal("gato");
		System.out.println(buscarAnimal1);
		e.eliminarAnimal("perro");
		System.out.println(e);

	}

}