package examenesAnteriores02;

import java.util.Arrays;
import java.util.HashMap;

public class GestionBibliotecaMusical {
	
	public static void main(String[] args) {

		/*
		 * Ejercicio1.(Mapa e interfaces propias de Java).Se requiere implementar un sistema de gestión de una biblioteca musical, 
		 * donde cada género musical tenga un conjunto de álbumes almacenados en un array[ ].Para ello, se usará un Mapa donde:
		 * Clave (String): Representa el género musical (Ej: "Rock", "Pop", "Jazz").
		 * Valor ([]): Un array que almacena los álbumes de ese género.El array es dinámico, lo que significa que se tiene que ir redimensionando.
		 */

		HashMap<String, Album[]> mapaAlbumes = new HashMap<String, Album[]>();
		
		agregarAlbum("Rock", new Album("titulo1", "artista1", "cod1", 2010), mapaAlbumes);
		agregarAlbum("Pop", new Album("titulo2", "artista2", "cod2", 2000), mapaAlbumes);
		agregarAlbum("Pop", new Album("titulo3", "artista3", "cod3", 1990), mapaAlbumes);
		agregarAlbum("Rock", new Album("titulo4", "artista4", "cod4", 1981), mapaAlbumes);
		agregarAlbum("Rock", new Album("titulo5", "artista5", "cod5", 2019), mapaAlbumes);
		agregarAlbum("Jazz", new Album("titulo6", "artista6", "cod6", 2016), mapaAlbumes);
		
		System.out.println(Arrays.toString(mapaAlbumes.get("Rock")));
		System.out.println(Arrays.toString(mapaAlbumes.get("Pop")));
		System.out.println(Arrays.toString(mapaAlbumes.get("Jazz")));
		System.out.println(Arrays.toString(mapaAlbumes.get("Otro")));
	
	}
		
		public static void agregarAlbum(String genero, Album album, HashMap<String, Album[]> mapaAlbumes) {
			if (mapaAlbumes.containsKey(genero)) {
				Album[] albumes = mapaAlbumes.get(genero);
				Album[] aux = Arrays.copyOf(albumes, albumes.length+1);
				aux[aux.length-1] = album;
				mapaAlbumes.put(genero, aux);
				
				/* sin redimensionar:
				int cont = 0;
				boolean encontrado = false;
				Album[] albumes = mapaAlbumes.get(genero);
				while (cont < albumes.length && !encontrado) {
					if (albumes[cont] == null) {
						albumes[cont] = album;
						mapaAlbumes.put(genero, albumes);
						encontrado = true;
					}
					cont++;
				}*/
				
			} else {
				Album [] a = {album};
				mapaAlbumes.put(genero, a);
			}
		}
		
}