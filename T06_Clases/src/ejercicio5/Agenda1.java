package ejercicio5;

import java.util.Arrays;

public class Agenda1 {
	// aqui crearemos un array vacio y lo iremos redimensionando
	private Contacto[] agenda = new Contacto[0];

	// Constructor
	public Agenda1() {
		super();
	}
	public Agenda1(Contacto[] agenda) {
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
		return "Agenda1 [agenda=" + Arrays.toString(agenda) + "]";
	}

	// Metodos
	public void anadirContacto(Contacto c) {
		if (agenda.length < 10) {
			Contacto[] copy = Arrays.copyOf(agenda, agenda.length + 1);
			copy[copy.length-1] = c;
			agenda = copy;
			System.out.println("contacto añadido correctamente");			
		} else {
			System.out.println("agenda completa");
		}
	}
	
	public void buscarContacto(String nombre) {
		int pos = 0;
		boolean encontrada = false;
		while (pos < agenda.length && !encontrada) {
			if(agenda[pos].getNombre().equals(nombre)) {
				encontrada = true;
				System.out.println("Se ha encontrado el contacto");
			}
			pos++;
		}
		if (!encontrada) {
			System.out.println("El nombre no esta almacenado en la agenda");
		}
	}
	
	public void mostrarContactos() {
		for (int i=0; i < agenda.length; i++) {
			if (agenda[i] != null) {
				System.out.println(agenda[i]);
			}
		}
	}
	
}