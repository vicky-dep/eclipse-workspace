package examenesAnteriores02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GestionBibliotecaMusical implements GestionBibliotecaMusicalInterfaz {

	Map<String, Album[]> biblioteca = new HashMap<String, Album[]>();
	
	public Map<String, Album[]> getBiblioteca() {
		return biblioteca;
	}
	public void setBiblioteca(Map<String, Album[]> biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public void agregarAlbum(String genero, Album album) {
		if(!biblioteca.containsKey(genero)) {
			Album[] nuevoArray = {album};
			biblioteca.put(genero, nuevoArray);
			System.out.println("Nuevo genero agregado a la biblioteca");
		} else {
			Album[] albums = biblioteca.get(genero); // get nos da el valor asociado a la clave
			// Miramos si el album existe
			boolean encontrado = false;
			int cont = 0;
			while(!encontrado && cont<albums.length) {
				if(albums[cont].getCodigoAlbum().equalsIgnoreCase(album.getCodigoAlbum())) {
					encontrado = true;
					System.out.println("No se puede añadir el album, ya exisste");
				}
				cont++;
			}
			if(!encontrado) {
				// redimensionamos el array y se lo asignamos al mapa con el put
				Album[] aux = Arrays.copyOf(albums, albums.length+1);
				aux[aux.length-1] = album;
				biblioteca.put(genero, aux);
				System.out.println("Nuevo album añadido");
			}
		}
	}

	@Override
	public void eliminarAlbum(String genero, String codigoAlbum) {
		if(biblioteca.containsKey(genero)) {
			// buscamos el album para eliminarlo
			Album[] albums = biblioteca.get(genero);
			// buscamos el codigo en el array para eliminarlo
			boolean encontrado = false;
			int cont = 0;
			while(!encontrado && cont<albums.length) {
				if(albums[cont].getCodigoAlbum().equalsIgnoreCase(codigoAlbum)) {
					encontrado = true;
					// eliminamos
					Album[] aux = new Album[albums.length-1];
					int j = 0;
					for (int i = 0; i < albums.length; i++) {
						if(i!=cont) {
							aux[j] = albums[i];
							j++;
						}
					}
					if(aux.length > 0) {
						biblioteca.put(genero, aux);						
					} else {
						biblioteca.remove(genero); // se puede utilizar ya que no estamos utilizando el iterator
					}
				}
				cont++;
			}
		} else {
			System.out.println("El genero no existe, no se puede eliminar eel album");
		}
	}

	@Override
	public void actualizarAlbum(String genero, String codigoAlbum, String nuevoTitulo) {
		if(biblioteca.containsKey(genero)) {
			Album[] albums = biblioteca.get(genero);
			boolean encontrado = false;
			int cont = 0;
			while(!encontrado && cont<albums.length) {
				if(albums[cont].getCodigoAlbum().equals(codigoAlbum)) {
					encontrado = true;
					albums[cont].setTitulo(nuevoTitulo);
					biblioteca.put(genero, albums); // con esto nos aseguramos que el cambios va si o si al mapa
					System.out.println("Titulo cambiado correctamente");
				}
				cont++;
			}
		}	
	}

	@Override
	public void listarAlbumes(String genero) {
		if(biblioteca.containsKey(genero)) {
			Album[] albums = biblioteca.get(genero);
			System.out.println(Arrays.toString(albums));
		}
	}

	@Override
	public Album buscarAlbum(String genero, String codigoAlbum) {
		if(biblioteca.containsKey(genero)) {
			Album[] albums = biblioteca.get(genero);
			boolean encontrado = false;
			int cont = 0;
			while(!encontrado && cont<albums.length) {
				if(albums[cont].getCodigoAlbum().equals(codigoAlbum)) {
					encontrado = true;
					return albums[cont];
				}
				cont++;
			}
		}
		return null;
	}

}
