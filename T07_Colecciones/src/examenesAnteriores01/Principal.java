package examenesAnteriores01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Principal {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Album>> mapa = new HashMap<String, ArrayList<Album>>();
		Album a1 = new Album("And Justice for all", 1989);
		Album a2 = new Album("Muscle museum", 1989);
		Album a3 = new Album("Death Magnetic", 2008);
		Album a4 = new Album("HAARP", 2008);
		Album a5 = new Album("Ley innata", 2008);
		Album a6 = new Album("S&M", 1999);
		Album a7 = new Album("Showbiz", 1999);
		Album a8 = new Album("Canciones Prohibidas", 1999);
		ArrayList<Album> album1 = new ArrayList<Album>();
		album1.add(a5);
		album1.add(a8);
		mapa.put("Extremoduro", album1);
		ArrayList<Album> album2 = new ArrayList<Album>();
		album2.add(a1);
		album2.add(a6);
		mapa.put("Metallica", album2);
		ArrayList<Album> album3 = new ArrayList<Album>();
		album3.add(a2);
		album3.add(a3);
		album3.add(a4);
		album3.add(a7);
		mapa.put("Muse", album3);
		// Tenemos que construir un mapa cuya clave sea el año y el valor una lista de
		// cantantes
		HashMap<Integer, ArrayList<Cantante>> mapaPorAnio = new HashMap<Integer, ArrayList<Cantante>>();
		// Para obtener la nueva clave recorremos el mapa anterior y obtenemos el año
		// del album
		Set<String> clavesArtista = mapa.keySet();
		Iterator<String> it = clavesArtista.iterator();
		while (it.hasNext()) {
			String artista = (String) it.next();
			ArrayList<Album> albumes = mapa.get(artista);
			// Iteramos sobre los albumes
			Iterator<Album> itAlbum = albumes.iterator();
			while (itAlbum.hasNext()) {
				Album album = (Album) itAlbum.next();
				if (mapaPorAnio.containsKey(album.getAnio())) {
					// Ya se ha creado una entrada con ese año, hay que
					// añadir al listado un nuevo cantante
					ArrayList<Cantante> listaCantantes = mapaPorAnio.get(album.getAnio());
					// Creamos el nuevo cantante a añadir
					Cantante nuevo = new Cantante(artista, album.getNombreAlbum());
					listaCantantes.add(nuevo);
					mapaPorAnio.put(album.getAnio(), listaCantantes);
				} else {
					// Creamos un arrayList vacio, le añadimos el cantante y
					// creamos en el mapa la dupla nueva
					ArrayList<Cantante> listaNueva = new ArrayList<Cantante>();
					Cantante nuevo = new Cantante(artista, album.getNombreAlbum());
					listaNueva.add(nuevo);
					mapaPorAnio.put(album.getAnio(), listaNueva);
				}

			}

		}
		System.out.println("Mapa original");
		System.out.println(mapa);
		System.out.println("Resultado");
		System.out.println(mapaPorAnio);
	}

}