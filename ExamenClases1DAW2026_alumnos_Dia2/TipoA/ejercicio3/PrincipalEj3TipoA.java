package ejercicio3;

public class PrincipalEj3TipoA {

	public static void main(String[] args) {

		// Inscribo a 4 corredores
		Corredor c1 = new Corredor("Carlos");
		Corredor c2 = new Corredor("Martín");
		Corredor c3 = new Corredor("María");
		Corredor c4 = new Corredor("Claudia");
		
		// Imprimo el total de corredores que esta actualmente inicializado a 0
		System.out.println(c1.getTotalCorredores());
		System.out.println(c1);
		System.out.println(c2.getTotalCorredores());
		System.out.println(c2);
		
		// Ahora cambio ese valor a 4
		c3.setTotalCorredores(4);
		
		// Imprimo nuevamente con 2 corredores de ejemplo para demostrar que 
		// al ser un atributo estático, al cambiarlo, se modifica en todas las instancias.
		System.out.println(c1.getTotalCorredores());
		System.out.println(c1);
		System.out.println(c4.getTotalCorredores());
		System.out.println(c4);
		
	}
}