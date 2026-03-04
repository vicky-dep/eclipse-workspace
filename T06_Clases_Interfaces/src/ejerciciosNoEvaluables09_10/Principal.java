package ejerciciosNoEvaluables09_10;

public class Principal {

	public static void main(String[] args) {
		/*
		 * En el método main(), crear un array de Publicaciones, con 2 libros y 2 revistas, 
		 * prestar uno de los libros, mostrar por pantalla los datos almacenados en el array 
		 * y mostrar por pantalla cuántas  hay prestadas y cuantas hay anteriores a 1990.
		 */
		Publicacion p = new Publicacion();
		
		Publicacion[] publicaciones = new Publicacion[4];
		publicaciones[0] = new Libro("L1", "El Quijote", 1985);
		publicaciones[1] = new Libro("L2", "Otro libro", 2001);
		publicaciones[2] = new Revista("R1", "National Geographic", 1995, 45);
		publicaciones[3] = new Revista("R2", "Muy interesante", 1980, 120);
		
		// prestar uno de los libros
		((Libro) publicaciones[0]).prestar();
		
		// mostrar todas las publicaciones
		for (int i = 0; i < publicaciones.length; i++) {
			System.out.println(publicaciones[i]);
		}
		
		// mostrar libros prestados
		System.out.println("Prestados: " + p.cuentaPrestados(publicaciones));
		
		// mostrar publicaciones anteriores a 1990
		System.out.println("Publicaciones anteriores a 1990: " + p.publicacionesAnterioresA(publicaciones, 1990));
	}
}