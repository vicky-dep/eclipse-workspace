package ejercicio23;

public class CD {
	/**
	 * Desarrolla una clase CD con los siguientes atributos: 
	 * canciones: un array de objetos de la clase Cancion.
	 * contador: la siguiente posición libre del array canciones.
	 * y los siguientes métodos:
	 * CD(): constructor predeterminado (creará el array canciones).
	 * numeroCanciones(): devuelve el valor del contador de canciones.
	 * dameCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
	 * grabaCancion(int, Cancion): cambia la Cancion de la posición indicada por la
	 * nueva Cancion proporcionada.
	 * agrega(Cancion): agrega al final del array la Cancion proporcionada.
	 * elimina(int): elimina la Cancion que se encuentra en la posición indicada.
	 */
	
	// Atributos
	private Cancion[] canciones;
	private int contador;

	// Constructor
	public CD() {
		super();
		canciones = new Cancion[10]; // tamaño fijo
		contador = 0;
	}
	
	// Metodos de la clase
	public int numeroCanciones() {
		return contador;
	}

	public Cancion dameCancion(int pos) {
		if (pos >= 0 && pos < contador) {
			return canciones[pos];
		} else {
			return null;
		}
	}
	
	public void grabaCancion(int pos, Cancion nueva) {
		if (pos >= 0 && pos < contador) {
			canciones[pos] = nueva;
		} else {
			System.out.println("Posicion incorrecta");
		}
	}
	
	public void agrega(Cancion c) {
		if (contador < canciones.length) {
			canciones[contador] = c;
			contador++;
		} else {
			System.out.println("El CD esta lleno");
		}
	}
	
	public void elimina(int pos) {
		if (pos >= 0 && pos < contador) {
			for (int i = pos; i < contador-1; i++) {
				canciones[i] = canciones[i+1];
			}
			canciones[contador - 1] = null;
			contador--;
		} else {
			System.out.println("Posicion incorrecta");
		}
	}
	
}