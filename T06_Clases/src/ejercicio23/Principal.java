package ejercicio23;

public class Principal {

	public static void main(String[] args) {
		Cancion c1 = new Cancion("Titulo 1", "Autor 1");
		Cancion c2 = new Cancion("Titulo 2", "Autor 2");
		Cancion c3 = new Cancion("Titulo 3", "Autor 3");
		Cancion c4 = new Cancion("Titulo 4", "Autor 4");
		Cancion c5 = new Cancion("Titulo 5", "Autor 5");
		CD cd = new CD();
		cd.agregarCancion(c1);
		cd.agregarCancion(c2);
		cd.agregarCancion(c3);
		cd.agregarCancion(c4);
		cd.agregarCancion(c5);
		System.out.println(cd);
		Cancion canc = cd.dameCancion(3);
		System.out.println(canc);
		cd.grabaCancion(2, new Cancion("Titulo cambiado", "Autor nuevo"));
		System.out.println(cd);
		System.out.println("El numero de canciones almacenadas son: " + cd.numeroCanciones());
		cd.eliminarCancion(4);
		System.out.println(cd);
		
		/*
		CD cd = new CD();

        cd.agregarCancion(new Cancion("Nunca quise", "Intoxicados"));
        cd.agregarCancion(new Cancion("La vuelta al mundo", "Calle 13"));
        cd.agregarCancion(new Cancion("Si tu supieras", "Little Pepe"));

        System.out.println("Número de canciones: " + cd.numeroCanciones());
        for (int i = 0; i < cd.numeroCanciones(); i++) {
            System.out.println(cd.dameCancion(i));
        }
        System.out.println();

        System.out.println(cd.dameCancion(1));
        
        System.out.println();

        cd.grabaCancion(1, new Cancion("One love", "Bob Marley"));

        //System.out.println(cd.dameCancion(1));
        for (int i = 0; i < cd.numeroCanciones(); i++) {
            System.out.println(cd.dameCancion(i));
        }
        
        System.out.println();

        cd.eliminarCancion(0);

        System.out.println("Después de eliminar:");
        for (int i = 0; i < cd.numeroCanciones(); i++) {
            System.out.println(cd.dameCancion(i));
        }*/

	}
}