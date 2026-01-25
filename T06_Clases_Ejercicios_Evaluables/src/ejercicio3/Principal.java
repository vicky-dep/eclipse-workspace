package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Se desea desarrollar una aplicación en Java para gestionar las obras de arte repartidas en 
		 * diferentes exposiciones dentro de una gran Galería. El sistema debe permitir organizar las 
		 * obras, realizar búsquedas cruzadas y obtener estadísticas financieras. 
		 * Dispondrá de tres clases: ObraDeArte, Exposicion y Galeria.
		 */
		
		// ANTES DE CORREGIR !!!
		// Este es el ejercicio que más tiempo me llevó (creo que unas 3 o 4 hs). 
		// La clase que me costó fue Galería y fui teniendo varios errores en sus métodos. 
		// Los corregí con ayuda de chatgpt y le pedí ideas para completar los nombres de las obras y exposiciones. 
		
		// -----------------------------------------------
		// PRUEBO TODOS LOS METODOS DE LA CLASE EXPOSICION
		
        // Crear obras
        ObraDeArte o1 = new ObraDeArte("Guernica", "Picasso", 1000000);
        ObraDeArte o2 = new ObraDeArte("La noche estrellada", "Van Gogh", 2000000);
        ObraDeArte o3 = new ObraDeArte("El grito", "Munch", 1500000);

        // Crear exposición
        Exposicion expo = new Exposicion("Obras maestras");

        // Agregar obras
        expo.agregarObra(o1);
        expo.agregarObra(o2);
        expo.agregarObra(o3);

        // Mostrar obras
        System.out.println();
        System.out.println("Obras en la exposición:");
        expo.mostrarObras();

        // Buscar obra
        System.out.println();
        System.out.println("Buscando 'Guernica':");
        ObraDeArte buscada = expo.buscarObra("Guernica");
        if (buscada != null) {
            System.out.println("Encontrada: " + buscada);
        } else {
            System.out.println("No encontrada");
        }

        // Calcular valor total
        System.out.println();
        System.out.println("Valor total de la exposición: " + expo.calcularValorTotal());

        // Eliminar obra
        System.out.println();
        System.out.println("Eliminando 'Guernica':");
        boolean eliminada = expo.eliminarObra("Guernica");
        System.out.println("¿Eliminada?: " + eliminada);

        // Mostrar obras otra vez
        System.out.println();
        System.out.println("Obras después de eliminar:");
        expo.mostrarObras();

        // Volver a calcular valor
        System.out.println();
        System.out.println("Valor total actualizado: " + expo.calcularValorTotal());
        
        // --------------------------------------------
        // PRUEBO TODOS LOS METODOS DE LA CLASE GALERIA
        
        System.out.println("---------------------------");
        
        // Crear galería
        Galeria g = new Galeria("Gran Galería");

        // Crear exposiciones
        Exposicion e1 = new Exposicion("Impresionismo");
        Exposicion e2 = new Exposicion("Vanguardias");
        Exposicion e3 = new Exposicion("Renacimiento");
        Exposicion e4 = new Exposicion("Arte Moderno");
        Exposicion e5 = new Exposicion("Arte Contemporáneo");
        Exposicion e6 = new Exposicion("Extra"); // para probar el límite

        // Agregar obras a exposiciones
        e1.agregarObra(new ObraDeArte("Impresión, sol naciente", "Monet", 1200));
        e1.agregarObra(new ObraDeArte("Nenúfares", "Monet", 1500));

        e2.agregarObra(new ObraDeArte("Guernica", "Picasso", 1000000));
        e2.agregarObra(new ObraDeArte("La persistencia de la memoria", "Dalí", 800000));

        e3.agregarObra(new ObraDeArte("La Gioconda", "Da Vinci", 2000000));

        // Agregar exposiciones a la galería (máximo 5)
        g.agregarExposicion(e1);
        g.agregarExposicion(e2);
        g.agregarExposicion(e3);
        g.agregarExposicion(e4);
        g.agregarExposicion(e5);
        g.agregarExposicion(e6); // debe mostrar "galería completa"

        // Buscar exposición
        System.out.println();
        System.out.println("Buscando exposición 'Vanguardias':");
        Exposicion encontrada = g.buscarExposicion("Vanguardias");
        if (encontrada != null) {
            System.out.println("Exposición encontrada: " + encontrada.getNombreExposicion());
        } else {
            System.out.println("Exposición no encontrada");
        }

        // Buscar obra en toda la galería
        System.out.println();
        System.out.println("Buscando obra 'Guernica' en toda la galería:");
        ObraDeArte obra = g.buscarObraEnTodaLaGaleria("Guernica");
        if (obra != null) {
            System.out.println("Obra encontrada: " + obra);
        } else {
            System.out.println("No se encontró la obra");
        }

        System.out.println();
        System.out.println("Buscando obra 'NoExiste' en toda la galería:");
        ObraDeArte obra2 = g.buscarObraEnTodaLaGaleria("NoExiste");
        if (obra2 != null) {
            System.out.println("Obra encontrada: " + obra2);
        } else {
            System.out.println("No se encontró la obra");
        }

        // Mostrar estadísticas
        System.out.println();
        System.out.println("Estadísticas por exposición:");
        g.mostrarEstadisticasPorExposicion();
        
	}
}