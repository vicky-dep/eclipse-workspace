package ejercicio04_05_06_07_08;

import java.util.Arrays;

public class Lista {

	private int[] lista = new int[0];

	public Lista() {
		super();
	}

	public Lista(int[] lista) {
		super();
		this.lista = lista;
	}

	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Lista [lista=" + Arrays.toString(lista) + "]";
	}

	public int numElementos() {
		return lista.length;
	}

	public void insertarAlfinal(int num) {
		int[] copy = Arrays.copyOf(lista, lista.length + 1);
		copy[copy.length -1] = num;
		lista = copy;
		System.out.println("El numero se ha insertado al final de la lista");
	}

	public void insertarAlprincipio(int num) {
		int[] copy = Arrays.copyOf(lista, lista.length + 1);
		for (int i = copy.length -1; i > 0; i--) {
			copy[i] = lista[i-1];
		}
		copy[0] = num;
		lista = copy;
		System.out.println("El numero se ha insertado al principio de la lista");
		/*
		 * otra forma:
		 * int[] copy = Arrays.copyOf(lista, lista.length + 1);
		 * int cont = 1;
		 * copy[o] = numero;
		 * for (int insertar : lista) {
		 * copy[cont] = lista[cont-1];
		 * cont++;
		 * }
		 * lista=copy;
		 * contador++;
		 */
	}

	public void insertarEnPosicion(int pos, int numero) {
		if (pos < 0 || pos >= lista.length) {
			System.out.println("Posicion no valida");
		} else {
			int[] copy = Arrays.copyOf(lista, lista.length + 1);
			for (int i = copy.length -1; i > pos; i--) {
				copy[i] = lista[i-1];
			}
			copy[pos] = numero;
			lista = copy;
			System.out.println("El numero se ha insertado en la posicion deseada");			
		}
	}

	public void insertarAlFinalLista(int[] nuevaLista) {
		if (nuevaLista == null || nuevaLista.length == 0) {
			System.out.println("La lista a añadir esta vacia");
		} else {
			int[] copy = Arrays.copyOf(lista, lista.length + nuevaLista.length);
			for (int i = 0; i < nuevaLista.length; i++) {
				copy[lista.length + i] = nuevaLista[i];
			}
			lista = copy;
			System.out.println("Se han añadido los elementos de la nueva lista al final");
		}
	}

	public void eliminarPosicion(int pos) {
		if (pos < 0 || pos >= lista.length) {
			System.out.println("Posicion no valida");
		} else {
			for (int i = pos; i < lista.length -1; i++) {
				lista[i] = lista[i+1];
			}
			lista = Arrays.copyOf(lista, lista.length-1);
			System.out.println("Elemento eliminado correctamente");
		}
	}

	public int obtenerElemento(int pos) {
		int valor = -1;
		if (pos < 0 || pos >= lista.length) {
			System.out.println("Posicion no valida");
		} else {
			valor = lista[pos];
		}
		return valor;
	}

	public int buscarLista(int numero) {
		int pos = 0;
		boolean encontrado = false;
		int indice = -1;
		while (pos < lista.length && !encontrado) {
			if (lista[pos] == numero) {
				encontrado = true;
				indice = pos;
			}
			pos++;
		}
		return indice;
	}
	
	@Override // lo tenemos que sobreescribir porque existe un metodo equals en el padre
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		Lista l = (Lista) obj; // se puede hacer un casteo
		if(l.getLista().length == lista.length) {
			int cont = 0;
			while(sonIguales && cont < lista.length) {
				if(lista[cont] == l.getLista()[cont]) {
					sonIguales = true;
				} else {
					sonIguales = false;
				}
				cont++;
			}
		} else {
			System.out.println("Longitudes diferentes, no pueden ser iguales");
		}
		return sonIguales;
	}
}