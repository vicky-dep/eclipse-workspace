package ejercicio1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Cancion c= new Cancion("Help!", "Beatles");
		Cancion c1= new Cancion("Entre dos tierras", "Heroes del silencio");
		Cancion c2= new Cancion("Sirena varada",  "Heroes del silencio");
		Playlist p = new Playlist();
		p.anadirCancion(c);
		p.anadirCancion(c1);
		p.anadirCancion(c2);
		p.anadirCancion(c);
		System.out.println(p);
		System.out.println("Lista aleatoria:");
		System.out.println(Arrays.toString(p.generarLista(4)));
		System.out.println("Lista aleatoria Beatles:");
		System.out.println(Arrays.toString(p.generarListaPorArtista("Beatles", 3)));
		System.out.println("Lista aleatoria Pearl Jam:");
		System.out.println(Arrays.toString(p.generarListaPorArtista("Pearl Jam", 3)));
	}
}