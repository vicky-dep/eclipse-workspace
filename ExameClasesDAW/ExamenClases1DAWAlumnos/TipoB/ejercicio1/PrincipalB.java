package ejercicio1;

import java.util.Arrays;



public class PrincipalB {

	public static void main(String[] args) {
		/* esto seria si utilizo tipo enum:
		Libro c = new Libro("Harry Potter 2", Calificacion.adulto,"JKL" ,"fantasia");
		Libro c1 = new Libro("Todo Arde", Calificacion.adulto,"Juan Gómez Jurado" ,"novela");
		Libro c2 = new Libro("Paco y sus instrumentos", Calificacion.infantil,"Peter John" ,"fantasia");*/
		
		Libro c = new Libro("Harry Potter 2","JKL", "adulto", "fantasia");
		Libro c1 = new Libro("Todo Arde", "Juan Gómez Jurado" , "adulto", "novela");
		Libro c2 = new Libro("Paco y sus instrumentos", "Peter John", "infantil", "fantasia");
		Biblioteca p = new Biblioteca();
		
		p.anadirLibro(c);
		p.anadirLibro(c1);
		p.anadirLibro(c2);
		p.anadirLibro(c);
		System.out.println(p);
		
		/*
		System.out.println(Arrays.toString(p.generarLibrosAleatorios(4)));
		System.out.println(Arrays.toString(p.generarListaPorTipo(Calificacion.adulto, 3)));
		System.out.println(Arrays.toString(p.generarListaPorTipo(Calificacion.adolescente, 5)));
*/
	}

}