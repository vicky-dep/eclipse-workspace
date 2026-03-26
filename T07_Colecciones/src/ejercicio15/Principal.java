package ejercicio15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
	/*
	 * Implementa una aplicación que gestione un club donde se identifica a los socios por un apodo personal y único. 
	 * De cada socio, además del apodo, se guarda el nombre y su fecha de ingreso en el club. 
	 * Utiliza un mapa donde las claves serán los apodos y los valores, objetos de la clase Socio. 
	 * Las operaciones se mostrarán en un menú que tendrá las siguientes opciones:
	 * Alta socio.
	 * Baja socio.
	 * Modificación socio.
	 * Listar socios por apodo.
	 * Listar socios por antigüedad
	 * Listar los socios con alta anterior a un año determinado,
	 * Salir
	 */
		
		HashMap<String, Socio> mapaSocios = new HashMap<String, Socio>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Pulse una de estas opciones (0 para salir");
		System.out.println("1. Alta socio");
		System.out.println("2. Baja socio");
		System.out.println("3. Modificación socio");
		System.out.println("4. Listar Socio por apodo");
		System.out.println("5. Listar Socio por antiguedad");
		System.out.println("6. Listar Socio anterior a un año");
		System.out.println("0. Salir");
		
		int opcion = sc.nextInt();
		while (opcion > 0 && opcion <= 6) {
			switch (opcion) {
			case 1: {
				System.out.println("Apodo del socio");
				String apodo = sc.next();
				System.out.println("Nombre");
				String nombre = sc.next();
				System.out.println("Año antiguedad");
				int anio = sc.nextInt();
				Socio s = new Socio(apodo, nombre, anio);
				mapaSocios.put(apodo, s);
				System.out.println("Dado de alta correctamente");
				break;
			}
			case 2: {
				System.out.println("Apodo del socio");
				String apodoBaja = sc.next();
				mapaSocios.remove(apodoBaja); // Como no se utiliza iterator...
				System.out.println("Dado de baja correctamente");	
				break;
			}
			case 3: {
				System.out.println("Apodo del socio a modificar");
				String apodoMod = sc.next();
				System.out.println("Nuevo nombre");
				String nuevoNombre = sc.next();
				if (mapaSocios.containsKey(apodoMod)) {
					// Si existe el socio, se modifica
					Socio socio = mapaSocios.get(apodoMod);
					socio.setNombre(nuevoNombre);
					// Despues de cualquier cambio hay que volver a hacer put
					mapaSocios.put(apodoMod, socio);
					System.out.println("Socio modificaco correctamente");
				} else {
					System.out.println("No existe el socio");
				}
				break;
			}
			case 4: {
				System.out.println("Dame el apodo del socio que quieres saber su informacion");
				String apodoListado = sc.next();
				if (mapaSocios.containsKey(apodoListado)) {
					System.out.println(mapaSocios.get(apodoListado));
				} else {
					System.out.println("No existe socio con ese apodo");
				}
				break;
			}
			case 5: {
				System.out.println("Dime el año para listar los socios dados de alta ese año");
				int anio = sc.nextInt();
				ArrayList<Socio> lista = new ArrayList<Socio>();
				// Recorremos el mapa a traves de sus claves con el iterator
				Set<String> claves = mapaSocios.keySet();
				Iterator<String> it = claves.iterator();
				while (it.hasNext()) {
					String c = (String) it.next();
					Socio socio = mapaSocios.get(c);
					if (socio.getFechaIngreso() == anio) {
						lista.add(socio);
					}
				}
				break;
			}
			case 6: {
				System.out.println("Dime el año para listar los socios dados de alta ese año");
				int anio = sc.nextInt();
				ArrayList<Socio> lista = new ArrayList<Socio>();
				// Recorremos el mapa a traves de sus claves con el iterator
				Set<String> claves = mapaSocios.keySet();
				Iterator<String> it2 = claves.iterator();
				while (it2.hasNext()) {
					String c = (String) it2.next();
					Socio socio = mapaSocios.get(c);
					if (socio.getFechaIngreso() < anio) {
						lista.add(socio);
					}
				}
				break;
			}			
			}
		}
	}
	
}