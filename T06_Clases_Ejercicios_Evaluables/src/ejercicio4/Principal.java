package ejercicio4;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Diseña una clase llamada Sorteo que almacena una lista de nombres de participantes. 
		 * La clase debe permitir añadir nuevos nombres al sorteo y evitar duplicados. 
		 * También debe ofrecer la funcionalidad de seleccionar al azar un número específico 
		 * de participantes sin repeticiones.
		 * Ofrecerá métodos para:
		 * Añadir nombres al arreglo, redimensionándolo si es necesario.
		 * Comprobar si un nombre ya existe en el sorteo.
		 * Seleccionar un número específico de nombres al azar sin repeticiones.
		 * Permitirá listar los nombres actualmente almacenados.
		 */
		
		Sorteo s = new Sorteo();
		s.anadirNombre("Carlos"); // añado un nombre nuevo
		s.anadirNombre("Pilar"); // añado un nombre repetido
		s.mostrarNombres();
		
		System.out.println();
		System.out.println("Existe Clara?: " + s.existeNombre("Clara")); // pruebo con un nombre que esta
		System.out.println("Existe Vicky?: " + s.existeNombre("Vicky")); // y tambien con uno que no
		
		System.out.println();
		System.out.println("Primer sorteo:");
		String[] sorteo = s.nombresAlAzar(3); // pruebo que funcione con 3 nombres
		System.out.println(Arrays.toString(sorteo));
		
		System.out.println();
		System.out.println("Segundo sorteo:");
		String[] sorteo2 = s.nombresAlAzar(5); // verifico que ordene aleatoriamente con todos los nombres
		System.out.println(Arrays.toString(sorteo2));
		
		System.out.println();
		System.out.println("Tercer sorteo:");
		String[] sorteo3 = s.nombresAlAzar(8); // compruebo el mensaje de que no hay nombres suficientes
		System.out.println(Arrays.toString(sorteo3));
	}

}