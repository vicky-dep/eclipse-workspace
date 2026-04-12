package practicandoExamen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PrincipalAlbumCantante {

	public static void main(String[] args) {
		
		// Partiendo de un mapa que tiene como clave el nombre de un cantante y como valor una lista de álbumes. 
		HashMap<String, ArrayList<Album>> mapaCantanteAlbum = new HashMap<String, ArrayList<Album>>();
		//   nombreCantante    <nombreAlbum, anioPublicacion>
		
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
		mapaCantanteAlbum.put("Extremoduro", album1);
		
		ArrayList<Album> album2 = new ArrayList<Album>();
		album2.add(a1);
		album2.add(a6);
		mapaCantanteAlbum.put("Metallica", album2);
		
		ArrayList<Album> album3 = new ArrayList<Album>();
		album3.add(a2);
		album3.add(a3);
		album3.add(a4);
		album3.add(a7);
		mapaCantanteAlbum.put("Muse", album3);
		
		// Pasar ese mapa a un mapa donde la clave sea el año y el valor una lista de cantantes.
		HashMap<Integer, ArrayList<Cantante>> mapaAnioCantantes = new HashMap<Integer, ArrayList<Cantante>>();
		//       anio   <nombre, tituloAlbum>
		
		Set<String> clavesArtista = mapaCantanteAlbum.keySet();
		Iterator<String> it = clavesArtista.iterator();
		while (it.hasNext()) {
			String artista = (String) it.next();
			ArrayList<Album> albumes = mapaCantanteAlbum.get(artista);
			Iterator<Album> itAlbum = albumes.iterator();
			while (itAlbum.hasNext()) {
				Album album = (Album) itAlbum.next();
				if (mapaAnioCantantes.containsKey(album.getAnioPublicacion())) {
					ArrayList<Cantante> listaCantantes = mapaAnioCantantes.get(album.getAnioPublicacion());
					Cantante nuevo = new Cantante(artista, album.getnombreAlbum());
					listaCantantes.add(nuevo);
					mapaAnioCantantes.put(album.getAnioPublicacion(), listaCantantes);
				} else {
					ArrayList<Cantante> listaNueva = new ArrayList<Cantante>();
					Cantante nuevo = new Cantante(artista, album.getnombreAlbum());
					listaNueva.add(nuevo);
					mapaAnioCantantes.put(album.getAnioPublicacion(), listaNueva);
				}
			}
		}
		System.out.println("Mapa original");
		System.out.println(mapaCantanteAlbum);
		System.out.println("Mapa nuevo");
		System.out.println(mapaAnioCantantes);
	}

}
