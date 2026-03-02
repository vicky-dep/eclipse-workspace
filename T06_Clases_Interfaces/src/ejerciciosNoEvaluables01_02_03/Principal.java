package ejerciciosNoEvaluables01_02_03;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Usar la clase Lista de elementos Object para almacenar una serie de jornadas de empleados. 
		 * Una vez insertadas, ordenar la lista y mostrar por pantalla sus elementos.
		 */
		
		Jornada j1 = new Jornada("90123456V", "10022026", 8, 15);
		Jornada j2 = new Jornada("12345678L", "08012026", 9, 17);
		Jornada j3 = new Jornada("45678912V", "22022026", 10, 13);
		Jornada j4 = new Jornada("78945612L", "18022026", 8, 16);
		
		Jornada[] jornadas = {j1, j2, j3, j4};
		
		for (int i = 0; i < jornadas.length; i++) {
			System.out.println("Minutos de la jornada " + i + ": " + jornadas[i].calcularMinutosJornada());
		}
		
		System.out.println("Array de jornadas: " + Arrays.toString(jornadas));
		// Para utilizar las interfaces propias de Java, se utiliza el ordenar de arrays o colecciones
		// Orden natural:
		Arrays.sort(jornadas);
		System.out.println("Array ordenado natural: " + Arrays.toString(jornadas));
		// Utilizacion del comparator
		JornadaComparator c = new JornadaComparator();
		Arrays.sort(jornadas, c);
		System.out.println("Array ordenado con Comparator: " + Arrays.toString(jornadas));
		// Ordena de forma decreciente:
		Arrays.sort(jornadas, c.reversed());
		System.out.println("Array ordenado decreciente: " + Arrays.toString(jornadas));
	}

}