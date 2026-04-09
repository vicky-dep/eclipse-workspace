package examenesAnteriores02;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		GestionBibliotecaMusical g = new GestionBibliotecaMusical();
		Album a = new Album("titulo 1", "Artista 1", "COD2", 1999);
		Album a1 = new Album("titulo 2", "Artista 2", "COD4", 2000);
		Album a2 = new Album("titulo 3", "Artista 3", "COD3", 1975);
		Album a3 = new Album("titulo 4", "Artista 4", "COD1", 2025);

		g.agregarAlbum("rock", a);
		g.agregarAlbum("rock", a3);
		g.agregarAlbum("pop", a1);
		g.agregarAlbum("pop", a2);
		g.listarAlbumes("rock");
		g.listarAlbumes("pop");
		g.actualizarAlbum("pop", "COD3", "nuevo titulo");
		
		// Ordenación
		System.out.println("Orden natural rock:");
		Arrays.sort(g.getBiblioteca().get("rock"));
		System.out.println(Arrays.toString(g.getBiblioteca().get("rock")));
		AnioLanzamientoComparator c = new AnioLanzamientoComparator();
		Arrays.sort(g.getBiblioteca().get("pop"), c);
		System.out.println("Orden por año pop:");
		System.out.println(Arrays.toString(g.getBiblioteca().get("pop")));
		g.buscarAlbum("pop","AS1");
		g.eliminarAlbum("rock","COD2");

	}

}
