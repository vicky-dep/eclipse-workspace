package examenHerencia04;

public class Principal {

	public static void main(String[] args) {	

	Biblioteca biblioteca = new Biblioteca();
	
	Fisico f1 = new Fisico("Titulo1", "Autor1", 2002, "ISBN-1");
	Fisico f2 = new Fisico("Titulo2", "Autor2", 2013, "ISBN-2");
	Fisico f3 = new Fisico("Titulo3", "Autor3", 1990, "ISBN-3");
	Fisico f4 = new Fisico("Titulo1", "Autor1", 2002, "ISBN-1");
	Digital d1 = new Digital("Digital1", "Autor4", 2019, "ISBN-4", "f1", 10, 25);
	Digital d2 = new Digital("Digital2", "Autor5", 2016, "ISBN-5", "f2", 20, 8);

	biblioteca.anadirLibro(f1);
	biblioteca.anadirLibro(f2);
	biblioteca.anadirLibro(f3);
	biblioteca.anadirLibro(d1);
	biblioteca.anadirLibro(d2);
	biblioteca.anadirLibro(f4);
	System.out.println(biblioteca);
	
	biblioteca.prestarLibro("Titulo1", "Autor1", new Persona("Lupe", "35123456X", 900123123));
	biblioteca.prestarLibro("Titulo1", "Autor1", new Persona("Pepe", "12123456A", 678123123));
	biblioteca.prestarLibro("TituloX", "AutorX", new Persona("Lupe", "35123456X", 900123123));
	
	biblioteca.buscarLibro("Digital1", "Autor4");
	biblioteca.buscarLibro("Titulo2", "Autor2");
	
	System.out.println("Descargas totales: " + biblioteca.contarDescargas());
	
	biblioteca.eliminarLibro("Titulo3", "Autor3");
	biblioteca.eliminarLibro("Titulo1", "Autor1");
	
	biblioteca.descargarLibro("Digital1", "Autor4");
	biblioteca.descargarLibro("DigitalX", "AutorX");
	
	biblioteca.devolverLibro("Titulo1", "Autor1", new Persona("Pepe", "12123456A", 678123123));
	biblioteca.devolverLibro("Titulo1", "Autor1", new Persona("Lupe", "35123456X", 900123123));
	biblioteca.devolverLibro("Titulo1", "Autor1", new Persona("Pepe", "12123456A", 678123123));
	
	}
}