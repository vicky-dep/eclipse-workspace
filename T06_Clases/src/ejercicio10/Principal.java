package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca();

		Libro l1 = new Libro("El Quijote", "Cervantes", 1605);
		Libro l2 = new Libro("La sombra del viento", "Zafón", 2001);
		Libro l3 = new Libro("1984", "Orwell", 1949);
		Libro l4 = new Libro("Rebelión en la granja", "Orwell", 1945);

		b.anadirLibro(l1);
		b.anadirLibro(l2);
		b.anadirLibro(l3);
		b.anadirLibro(l4);

		System.out.println("\nLibros disponibles:");
		b.mostrarLibros();

		System.out.println("\nLibros de Orwell:");
		b.buscarPorAutor("Orwell");

		System.out.println("\nEliminando 1984:");
		b.eliminarLibro("1984");

		System.out.println("\nLibros disponibles:");
		b.mostrarLibros();

	}

}