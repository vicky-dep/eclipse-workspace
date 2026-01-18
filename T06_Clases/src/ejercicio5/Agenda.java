package ejercicio5;

import java.util.Arrays;

public class Agenda {

	private Contacto[] agenda = new Contacto[10]; // este array al principio tendra 10 posiciones nulas
	// esto se usa en la otra forma del metodo añadir contacto
	// private int cont=0;

	// Constructor
	public Agenda() {
		super();
	}

	public Agenda(Contacto[] agenda) {
		super();
		this.agenda = agenda;
	}

	// Getters & Setters
	public Contacto[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Contacto[] agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Agenda [agenda=" + Arrays.toString(agenda) + "]";
	}

	// Metodos
	public void anadirContacto(Contacto c) {
		int pos = 0;
		boolean encontrada = false;
		while (pos < agenda.length && !encontrada) {
			if(agenda[pos]==null) {
				encontrada = true;
				agenda[pos] = c;
				System.out.println("Contacto añadido correctamente");
			}
			pos++;
		}
		/* otra forma
		if(cont < agenda.length) {
			agenda[cont] = c;
			cont++;
			System.out.println("Contacto añadido correctamente");
		} else {
			System.out.println("Has superado el maximo almacenado");
		}
		*/
	}
	
	public void buscarContacto(String nombre) {
		int pos = 0;
		boolean encontrada = false;
		while (pos < agenda.length && !encontrada) {
			if(agenda[pos]!=null && agenda[pos].getNombre().equals(nombre)) {
				encontrada = true;
				System.out.println("Se ha encontrado el contacto");
			}
			pos++;
		}
		if (!encontrada) {
			System.out.println("El nombre no esta almacenado en la agenda");
		}
		
		/* mi intento:
		for (int i=0; i<agenda.length; i++) {
			if (agenda[i].equals(nombre)) {
				System.out.println(agenda[i]);
			} else {
				System.out.println("No existe ese contacto");
			}
		}*/
	}
	
	public void mostrarContactos() {
		for (int i=0; i < agenda.length; i++) {
			if (agenda[i] != null) {
				System.out.println(agenda[i]);
			}
		}
	}
		
}