package ejercicio1;

import java.util.Arrays;

public class PrincipalLeticia {
	
	public static void main(String[] args) {
		
		LibroLeticia c = new LibroLeticia("Harry Potter 2", "adulto", "JKL", "fantasia");
		LibroLeticia c1 = new LibroLeticia("Todo Arde", "adulto", "Juan Gómez Jurado", "novela");
		LibroLeticia c2 = new LibroLeticia("Paco y sus instrumentos", "infantil", "Peter John", "fantasia");
		BibliotecaLeticia p = new BibliotecaLeticia();
		
		p.anadirLibro(c);
		p.anadirLibro(c1);
		p.anadirLibro(c2);
		p.anadirLibro(c);
		System.out.println(p);
		
		System.out.println(Arrays.toString(p.generarLibrosAleatorios(4)));
		System.out.println(Arrays.toString(p.generarListaPorTipo("adulto", 3)));
		System.out.println(Arrays.toString(p.generarListaPorTipo("adolescente", 5)));

	}
}