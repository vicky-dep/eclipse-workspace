package repasoHerencia01;

import java.util.Arrays;

public class Concesionario {
	/*
	 * Crea una clase que gestione un array de objetos tipo Vehiculo con la siguiente estructura:
	 * Atributo: private Vehiculo[] lista = new Vehiculo[5];
	 * Método añadir(Vehiculo v): Recorre el array y coloca el vehículo en la primera posición que sea null.
	 * Método eliminar(int indice): Pone en null la posición indicada y confirma la eliminación.
	 * Método listarTodo(): Recorre el array y llama al método mostrarDetalles() de cada objeto que no sea nulo.
	 */

	private Vehiculo[] lista = new Vehiculo[0]; // Leticia lo creo a 0 para practicar redimension...

	public Concesionario() {
		super();
	}
	public Concesionario(Vehiculo[] lista) {
		super();
		this.lista = lista;
	}
	
	public Vehiculo[] getLista() {
		return lista;
	}
	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "Concesionario [lista=" + Arrays.toString(lista) + "]";
	}

	public void anadir(Vehiculo v) {
		if (lista.length < 5) {
			Vehiculo[] aux = Arrays.copyOf(lista, lista.length+1);
			aux[aux.length-1] = v;
			lista = aux;
			System.out.println("Vehiculo añadido correctamente.");
		} else {
			System.out.println("No se pueden añadir mas vehiculos.");
		}
		
		/* mi version:
		boolean anadido = false;
		int pos = 0;
		while (!anadido && pos < lista.length) {
			if(lista[pos] == null) {
				lista[pos] = v;
				anadido = true;
				System.out.println("Vehiculo añadido correctamente.");				
			}
			pos++;
		}
		if(!anadido) {
			System.out.println("No hay espacio en el concesionario.");			
		}*/
	}
	
	public void eliminar(int indice) {
		if (indice >= 0 && indice < lista.length) {
			Vehiculo[] aux = new Vehiculo[lista.length-1];
			int cont = 0;
			for (int i = 0; i < lista.length; i++) {
				if (i != indice) {
					Vehiculo vehiculo = lista[i];
					aux[cont] = vehiculo;
					cont++;
				}
			}
			lista = aux;
			System.out.println("Eliminado correctamente.");
		} else {
			System.out.println("Indice no valido.");
		}
		
		/* mi version:
		if(indice < 0 || indice >= lista.length) {
			System.out.println("No es posible eliminar, el indice se encuentra fuera de rango.");
		} else if (lista[indice] == null) {
			System.out.println("No hay ningun vehiculo en esa posicion.");
		} else {
			lista[indice] = null;
			System.out.println("Vehiculo eliminado correctamente.");
		}*/
	}
	
	public void listarTodo() {
		for (int i = 0; i < lista.length; i++) {
			Vehiculo vehiculo = lista[i];
			if(vehiculo != null) {
				vehiculo.mostrarDetalles();
			}
		}
		
		/* mi version:
		boolean hayVehiculos = false;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null) {
				lista[i].mostrarDetalles();
				hayVehiculos = true;
				System.out.println("---------------------");
			}
		}
		if(!hayVehiculos) {
			System.out.println("No hay vehiculos en el concesionario.");
		}*/
	}
	
}