package ejercicio23;

public class Principal {

	public static void main(String[] args) {
		
		CD cd = new CD();

        cd.agrega(new Cancion("Nunca quise", "Intoxicados"));
        cd.agrega(new Cancion("La vuelta al mundo", "Calle 13"));
        cd.agrega(new Cancion("Si tu supieras", "Little Pepe"));

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

        cd.elimina(0);

        System.out.println("Después de eliminar:");
        for (int i = 0; i < cd.numeroCanciones(); i++) {
            System.out.println(cd.dameCancion(i));
        }

	}
}