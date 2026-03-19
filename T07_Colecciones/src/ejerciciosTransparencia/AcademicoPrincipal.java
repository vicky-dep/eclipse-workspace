package ejerciciosTransparencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AcademicoPrincipal {

	public static void main(String[] args) {
		Academico a1 = new Academico("Juan", 1990);
		Academico a2 = new Academico("Luisa", 2000);
		Academico a3 = new Academico("Ramón", 1985);
		Academico a4 = new Academico("David", 1980);
		Academico a5 = new Academico("María", 1970);
		
		Map<Character,Academico> academia = new HashMap<Character,Academico>();
		
		nuevoAcademico(academia, a1, 'A');
		nuevoAcademico(academia, a2, 'v');
		nuevoAcademico(academia, a3, 'F');
		nuevoAcademico(academia, a4, 'a');
		nuevoAcademico(academia, a5, 'S');
		System.out.println(academia);
		// Obtenemos en un listado los academicos
		ArrayList<Academico> listaAcademicos = new ArrayList<Academico>();
		// Para obtener el academico de cada clave, necesito obtener la clave
		Set<Character> claves = academia.keySet(); // Permite obtener todas las claves de ...
		// Recorremos las claves utilizando Iterator
		Iterator<Character> it = claves.iterator();
		while (it.hasNext()) {
			Character c = it.next();
			Academico academico = academia.get(c); // Permite obtener el academico que tenga ese valor
			listaAcademicos.add(academico);
		}
		
		// Orden natural
		System.out.println("Orden natural:");
		Collections.sort(listaAcademicos);
		System.out.println(listaAcademicos);
		// Orden con comparator
		System.out.println("Año de ingreso:");
		
		
		// Para ordenar por letra, antes de añadir los academicos
		TreeSet<Character> ts = new TreeSet<Character>();
		ts.addAll(claves); // Lo paso a treeset para tener el conjunto ordenado. No funciona con sort
		Iterator<Character> it2 = ts.iterator();
		ArrayList<Academico> ordenadoPorClave = new ArrayList<Academico>();
		while (it2.hasNext()) {
			Character c1 = it2.next();
			Academico academico = academia.get(c1); // Permite obtener el academico que tenga ese valor
			ordenadoPorClave.add(academico);
		}
		System.out.println("Ordenado por clave");
		System.out.println(ordenadoPorClave);
		
		
	}
	
	private static boolean nuevoAcademico(Map<Character, Academico> academia, Academico a, char c) {
		boolean anadido = false;
		if (academia == null) {
			// Necesitamos instanciar el mapa para añadirle valores
			academia = new HashMap<Character, Academico>();
		}
		// Comprobar que la letra este en el abecedario
		if ((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			// put reemplaza el valor asociado 
			academia.put(c, a); // Permite añadir un elemento al mapa
			anadido = true;
		}
		return anadido;
	}
	
	/* PRINCIPAL LETICIA
	 * 		Academico a1 = new Academico("Juan", 1990);
		Academico a2 = new Academico("Luisa", 2000);
		Academico a3 = new Academico("Ramón", 2025);
		Academico a4 = new Academico("David", 1985);
		Academico a5 = new Academico("María", 1970);
		Map<Character, Academico> academia = new HashMap<Character, Academico>();
		nuevoAcademico(academia, a1, 'A');
		nuevoAcademico(academia, a2, 'v');
		nuevoAcademico(academia, a3, 'F');
		nuevoAcademico(academia, a4, 'a');
		nuevoAcademico(academia, a5, 'S');
		System.out.println(academia);
		// Obtenemos en un listado los académicos
		ArrayList<Academico> listaAcademicos = new ArrayList<Academico>();
		// Para obtener el académico de cada clave, necesito obtener la clave y ver si
		// valor
		Set<Character> claves = academia.keySet();// Permite obtener todas las claves de un mapa
		// Recorremos las claves utilizando Iterator

		Iterator<Character> it = claves.iterator();
		while (it.hasNext()) {
			Character c = it.next();
			Academico academico = academia.get(c); // get nos permite obtener el valor asociado a la clave
			listaAcademicos.add(academico);
		}
		// Orden natural
		System.out.println("Orden natural:");
		Collections.sort(listaAcademicos);
		System.out.println(listaAcademicos);
		// Orden con comparator
		System.out.println("Año de ingreso:");
		AnioIngresoComparador c = new AnioIngresoComparador();
		Collections.sort(listaAcademicos, c);
		System.out.println(listaAcademicos);
		// Para ordenar por letra, antes de añadir los academicos al listado,
		// ordenamos las claves
		TreeSet<Character> ts = new TreeSet<Character>();
		ts.addAll(claves); // Lo paso a treeset para tener
		// el conjunto ordenado. No funciona con sort
		Iterator<Character> it2 = ts.iterator();
		ArrayList<Academico> ordenadoPorClave = new ArrayList<Academico>();
		while (it2.hasNext()) {
			Character c1 = it2.next();
			Academico academico = academia.get(c1); // get nos permite obtener el valor asociado a la clave
			ordenadoPorClave.add(academico);
		}
		System.out.println("Ordenado por clave");
		System.out.println(ordenadoPorClave);

	}

	private static boolean nuevoAcademico(Map<Character, Academico> academia, Academico a, char c) {
		boolean anadido = false;
		if (academia == null) {
			// Necesitamos instanciar el mapa para añadirle valores
			academia = new HashMap<Character, Academico>();
		}
		// Comprobar que la letra esté en el abecedario
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			// Put reemplaza el valor asociado a la clave
			academia.put(c, a); // Permite añadir un elemento al mapa

			anadido = true;
		}
		return anadido;
	}
	 * 
	 */
}