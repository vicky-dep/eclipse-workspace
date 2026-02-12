package examenHerencia01;

public class Principal {

	public static void main(String[] args) {
		
		TiendaVideojuegos tienda = new TiendaVideojuegos();
		Fisico f1 = new Fisico("Fisico 1", "Desarrollador 1", 1980, "F80");
		Fisico f2 = new Fisico("Fisico 2", "Desarrollador 1", 2020, "F20");
		Fisico f3 = new Fisico("Fisico 3", "Desarrollador 3", 2000, "F00");
		Fisico f4 = new Fisico("Fisico 4", "Desarrollador 2", 1998, "F98");
		Digital d1 = new Digital("Dig1", "Desarrollador 1", 2001, "cod1", "Platform1", 10, 10);
		Digital d2 = new Digital("Dig2", "Desarrollador 4", 2021, "cod2", "Platform2", 10, 5);
		Digital d3 = new Digital("Dig3", "Desarrollador 3", 2026, "cod3", "Platform3", 10, 2);
		Digital d4 = new Digital("Dig4", "Desarrollador 1", 2004, "cod4", "Platform4", 10, 0);
		
		// Probamos los métodos
		tienda.añadirJuego(f1);
		tienda.añadirJuego(f2);
		tienda.añadirJuego(f3);
		tienda.añadirJuego(f4);
		tienda.añadirJuego(d1);
		tienda.añadirJuego(d2);
		tienda.añadirJuego(d3);
		tienda.añadirJuego(d4);
		tienda.añadirJuego(f1);
		System.out.println(tienda);
		tienda.alquilarJuego("Fisico 4", "Desarrollador 2", new Cliente("Juan", "7845120V", 78654120));
		tienda.alquilarJuego("Fisico 4", "Desarrollador 2", new Cliente("Juan", "7845120V", 78654120));
		tienda.buscarJuego("Dig4", "Desarrollador 1");
		tienda.buscarJuego("Dig4", "Desarrollador 2");
		System.out.println("Descargas totales:" + tienda.contarDescargas());
		tienda.descargarJuego("Dig1", "Desarrollador 1");
		System.out.println(d1);
		tienda.devolverJuego("Fisico 4", "Desarrollador 2", new Cliente("Juan", "7845120V", 78654120));
		System.out.println(f4);
		tienda.eliminarJuego("Fisico 3", "Desarrollador 3");
		System.out.println(tienda);
		
	}
}