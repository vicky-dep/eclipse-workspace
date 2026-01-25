package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Una empresa de logística dispone de cuatro tipos de contenedores para sus envíos:
		 * Palés: Capacidad para 500 unidades.
		 * Cajas Grandes: Capacidad para 100 unidades.
		 * Cajas Medianas: Capacidad para 25 unidades.
		 * Estuches: Capacidad para 1 unidad.
		 * Crea un programa en Java que, dada una cantidad total de artículos, calcule cuántos 
		 * palés, cajas grandes, medianas y estuches se necesitan para optimizar el espacio.
		 */

		Contenedores c = new Contenedores();
		
		c.calcularContenedores(1234);
		System.out.println("------------------------");
		c.calcularContenedores(599);
		System.out.println("------------------------");
		c.calcularContenedores(416);
		System.out.println("------------------------");
		c.calcularContenedores(76);
		
	}

}