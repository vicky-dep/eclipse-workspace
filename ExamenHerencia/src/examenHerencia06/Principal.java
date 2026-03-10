package examenHerencia06;

public class Principal {

	public static void main(String[] args) {
		
		Discoteca discoteca = new Discoteca();
		
		Fisico df1 = new Fisico("Titulo1", "Artista1", 2016, "cod01", "CD", "Fuengirola", false);
		Fisico df2 = new Fisico("Titulo2", "Artista2", 2019, "cod02", "Vinilo", "Mijas", true, new Cliente ("Lola", "45123678F", 611000000));
		Digital dg1 = new Digital("Titulo3", "Artista3", 2000, "cod03", "Spotify", "MP3", 10);
		Fisico df3 = new Fisico("Titulo4", "Artista4", 1990, "cod04", "CD", "Fuengirola", false);
		
		discoteca.añadirDisco(df1);
		discoteca.añadirDisco(df2);
		discoteca.añadirDisco(dg1);
		discoteca.añadirDisco(dg1);
		
		discoteca.descargarDisco("Titulo1", "Artista1");
		discoteca.descargarDisco("Titulo3", "Artista3");
		
		System.out.println("Total descargas: " + discoteca.contarDescargas());
		
		discoteca.buscarDisco("Titulo1", "Artista1");
		discoteca.buscarDisco("Titulo2", "Artista2");
		discoteca.buscarDisco("TituloX", "ArtistaX");
		
		discoteca.eliminarDisco("Titulo1", "Artista1");
		discoteca.eliminarDisco("TituloX", "ArtistaX");
		discoteca.eliminarDisco("Titulo2", "Artista2");
		
		discoteca.añadirDisco(df1);
		discoteca.añadirDisco(df3);
		
		discoteca.alquilarDisco("Titulo2", "Artista2", new Cliente("Coco", "12345678M", 900111111));
		discoteca.alquilarDisco("Titulo3", "Artista3", new Cliente("Coco", "12345678M", 900111111));
		discoteca.alquilarDisco("Titulo1", "Artista1", new Cliente("Coco", "12345678M", 900111111));
		
		discoteca.devolverDisco("Titulo1", "Artista1", new Cliente("Coco", "12345678M", 900111111));
		discoteca.devolverDisco("Titulo2", "Artista2", new Cliente("Coco", "12345678M", 900111111));
		discoteca.devolverDisco("Titulo4", "Artista4", new Cliente("Coco", "12345678M", 900111111));
		
	}
}