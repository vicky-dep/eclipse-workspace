package ejerciciosNoEvaluables04_05;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Llamada l1 = new Llamada(985123000, 610456123, false, 2026030208, 2026030209);
		Llamada l2 = new Llamada(685123000, 810456123, true, 2026022110, 2026022112);
		Llamada l3 = new Llamada(285123000, 910456123, true, 2026030109, 2026030111);
		Llamada l4 = new Llamada(613456000, 410456123, false, 2026022507, 2026022509);
		Llamada l5 = new Llamada(111123000, 510456123, true, 2026030109, 2026030110);

		Llamada[] llamadas = {l1, l2, l3, l4, l5};
		// Probamos los metodos de la interfaz usuario
		for (int i = 0; i < llamadas.length; i++) {
			Llamada llamada = llamadas[i];
			System.out.println("Duracion de la llamada: " + llamada.duracionLLamada());
			System.out.println("Coste de la llamada: " + llamada.calcularCoste("Zona 1"));
		}
		
		// Probamos interfaces propias de Java
		// Orden natural
		Arrays.sort(llamadas);
		System.out.println("Array ordenado por orden natural: " + Arrays.toString(llamadas));
		
		// Utilizando clase comparadora
		ComparadorCoste c = new ComparadorCoste();
		Arrays.sort(llamadas, c);
		System.out.println("Array ordenado por coste: " + Arrays.toString(llamadas));
		
		// Orden decreciente
		Arrays.sort(llamadas, c.reversed());
		System.out.println("Array ordenado decreciente por coste: " + Arrays.toString(llamadas));
		
	}

}