package ejercicio04_05_06_07_08_09;

import java.util.Arrays;

public class Conjunto extends Lista {

	@Override
	public void insertarAlfinal(int num) {
		boolean repetido = comprobarNumero(num);
		if (!repetido) {
			super.insertarAlfinal(num);
		}
	}

	// Metodo privado
	private boolean comprobarNumero(int num) {
		boolean repetido = false;
		int i = 0;
		while (!repetido && i < super.getLista().length) {
			if (super.getLista()[i] == num) {
				repetido = true;
				System.out.println("Ese número está repetido, no lo puedes insertar.");
			}
			i++;
		}
		return repetido;
	}

	@Override
	public void insertarAlprincipio(int num) {
		boolean repetido = comprobarNumero(num);
		if (!repetido) {			
			super.insertarAlprincipio(num);
		}
	}

	@Override
	public void insertarEnPosicion(int pos, int numero) {
		boolean repetido = comprobarNumero(numero);
		if (!repetido) {
			super.insertarEnPosicion(pos, numero);
		}
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = true;
		
		int[] lista = super.getLista();
		Lista l = (Lista) obj;
		int[] lista2 = l.getLista();
		
		if (lista.length != lista2.length) {
			System.out.println("No tienen la misma longitud, las listas NO son iguales.");
			iguales = false;
		} else {
			// bucle exterior: recorre lista
			for (int i = 0; i < lista.length && iguales; i++) {
				boolean encontrado = false;
				// bucle interior: busca lista[i] en lista2
				for (int j = 0; j < lista2.length && !encontrado; j++) {
					if(lista[i] == lista2[j]) {
						encontrado = true;
					}
				}
				if (!encontrado) {
					iguales = false;
				}
			}
		}
		return iguales;
	}

	public static boolean esNumero(Object obj) {
		boolean res = false;
		if (obj instanceof Integer || obj instanceof Double || obj instanceof Long || obj instanceof Float) {
			res = true;
		}
		return res;
	}
	
	public void sumar(Object obj1, Object obj2) {
		if (obj1 instanceof String && obj2 instanceof String) {
			String cadena = obj1.toString() +obj2.toString();
			System.out.println(cadena);
		} else if (esNumero(obj1) && esNumero(obj2)) {
			Double suma = (Double) obj1 + (Double) obj2;
			System.out.println("La suma es: " + suma);
		} else {
			System.out.println("Error: no son sumables.");
		}
	}
}