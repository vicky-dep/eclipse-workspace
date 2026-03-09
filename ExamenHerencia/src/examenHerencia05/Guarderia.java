package examenHerencia05;

import java.util.Arrays;

public class Guarderia {
	/*
	 * Se debe desarrollar una clase Guarderia que gestionará las mascotas en cuidado, almacenándolas en un array. 
	 * Este array aumentará o disminuirá su tamaño según se ingresen o retiren mascotas.
	 * La guardería tiene un número limitado de espacios determinado por un atributo capacidad (int). 
	 * La clase contará con los siguientes métodos:
	 * ingresarMascota(Mascota m): Se encargará de añadir una mascota a la guardería, comprobando que no esté ya 
	 * dentro y que haya espacio disponible. 
	 * retirarMascota(String nombre): Se encargará de retirar una mascota de la guardería, verificando que esté 
	 * dentro y calculando el costo de la estancia . 
	 */
	
	private Mascota[] mascotas = new Mascota[0];
	private int capacidad;
	
	public Guarderia() {
		super();
	}
	
	public Guarderia(int capacidad) {
		super();
		this.capacidad = capacidad;
	}
	
	public Guarderia(Mascota[] mascotas, int capacidad) {
		super();
		this.mascotas = mascotas;
		this.capacidad = capacidad;
	}
	
	public Mascota[] getMascotas() {
		return mascotas;
	}
	public void setMascotas(Mascota[] mascotas) {
		this.mascotas = mascotas;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	@Override
	public String toString() {
		return "Guarderia [mascotas=" + Arrays.toString(mascotas) + ", capacidad=" + capacidad + "]";
	}

	public void ingresarMascota(Mascota m) throws GuarderiaException {
		boolean repetida = false;
		int cont = 0;
		while (!repetida && cont < mascotas.length) {
			if (mascotas[cont].getNombre().equalsIgnoreCase(m.getNombre())) {
				repetida = true;
			}
			cont++;
		}
		if (repetida) {
			throw new GuarderiaException(GuarderiaException.ANIMAL_EXISTENTE);
			// este mensaje se imprimia antes de incluir la excepcion propia
			// System.out.println("La mascota ya esta en la guarderia.");
		} else if (mascotas.length >= capacidad) {
			throw new GuarderiaException(GuarderiaException.GUARDERIA_LLENA);
			// este mensaje se imprimia antes de incluir la excepcion propia
			// System.out.println("No hay espacio disponible en la guarderia.");
		} else {
			Mascota[] copy = Arrays.copyOf(mascotas, mascotas.length + 1);
			copy[copy.length -1] = m;
			mascotas = copy;
			System.out.println("Mascota ingresada correctamente.");
		}
	}
	
	public void retirarMascota(String nombre) throws GuarderiaException {
		boolean encontrada = false;
		int cont = 0;
		while (!encontrada && cont < mascotas.length) {
			if (mascotas[cont].getNombre().equalsIgnoreCase(nombre)) {
				encontrada = true;
			} else {
				cont++;
			}
		}
		if (!encontrada) {
			System.out.println("La mascota no se encuentra en la guarderia.");
		} else {
			Mascota m = mascotas[cont];
			double coste = m.calcularTarifa(m.getMinutosEstancia());
			System.out.println("Costo de la estancia: " + coste + " euros.");
			Mascota[] aux = new Mascota[mascotas.length -1];
			int j = 0;
			for (int i = 0; i < mascotas.length; i++) {
				if (i != (cont)) {
					aux[j] = mascotas[i];
					j++;
				}
			}
			mascotas = aux;
			throw new GuarderiaException(GuarderiaException.ANIMAL_RETIRADO);
			// este mensaje se imprimia antes de incluir la excepcion propia
			// System.out.println("Mascota retirada correctamente.");
		}
	}
	
}