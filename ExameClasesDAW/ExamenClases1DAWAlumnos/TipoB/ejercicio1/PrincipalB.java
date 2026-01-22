package ejercicio1;

import java.util.Arrays;

public class PrincipalB {

	public static void main(String[] args) {
		/* esto seria si utilizo tipo enum:
		Libro c = new Libro("Harry Potter 2", Calificacion.adulto,"JKL" ,"fantasia");
		Libro c1 = new Libro("Todo Arde", Calificacion.adulto,"Juan Gómez Jurado" ,"novela");
		Libro c2 = new Libro("Paco y sus instrumentos", Calificacion.infantil,"Peter John" ,"fantasia");*/
		
		Libro c = new Libro("Harry Potter 2","JKL", Libro.CALIF_ADULTO, "fantasia");
		Libro c1 = new Libro("Todo Arde", "Juan Gómez Jurado" , Libro.CALIF_ADULTO, "novela");
		Libro c2 = new Libro("Paco y sus instrumentos", "Peter John", Libro.CALIF_INFANTIL, "fantasia");
		Biblioteca p = new Biblioteca();
		
		p.anadirLibro(c);
		p.anadirLibro(c1);
		p.anadirLibro(c2);
		p.anadirLibro(c);
		System.out.println();
		System.out.println(p);
		
		System.out.println();
		System.out.println("Lista aleatoria de libros:");
		System.out.println(Arrays.toString(p.generarLibrosAleatorios(2)));
		
		/* descomentar luego de terminar el metodo en la clase biblioteca:
		System.out.println();
		System.out.println(Arrays.toString(p.generarListaPorTipo(Libro.CALIF_ADULTO, 3)));
		System.out.println(Arrays.toString(p.generarListaPorTipo(Libro.CALIF_ADOLESCENTE, 5)));
		*/
		
		/* asi seria si hubiese utilizado enum:
		System.out.println(Arrays.toString(p.generarListaPorTipo(Calificacion.adulto, 3)));
		System.out.println(Arrays.toString(p.generarListaPorTipo(Calificacion.adolescente, 5)));
		*/
	}
}