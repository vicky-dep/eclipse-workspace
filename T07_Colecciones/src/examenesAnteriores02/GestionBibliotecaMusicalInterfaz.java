package examenesAnteriores02;

public interface GestionBibliotecaMusicalInterfaz {

	void agregarAlbum(String genero, Album album);

	void eliminarAlbum(String genero, String codigoAlbum);

	void actualizarAlbum(String genero, String codigoAlbum, String nuevoTitulo);

	void listarAlbumes(String genero);

	Album buscarAlbum(String genero, String codigoAlbum);

}