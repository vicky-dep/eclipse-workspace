package examenTipoADAWejercicio2;

import java.util.Arrays;

public class Zoo {
	
	private final int MAXIMO = 200;
	private String[] animales = new String[MAXIMO];
	
	// Constructor
	public Zoo() {
		super();
	}
	public Zoo(String[] animales) {
		super();
		this.animales = animales;
	}
	// Getters & Setters
	public String[] getAnimales() {
		return animales;
	}
	public void setAnimales(String[] animales) {
		this.animales = animales;
	}
	public int getMAXIMO() {
		return MAXIMO;
	}
	@Override
	public String toString() {
		return "Zoo [MAXIMO=" + MAXIMO + ", animales=" + Arrays.toString(animales) + "]";
	}
	
	// Metodos de la clase
	public void registrarAnimales(String animal) {
		boolean repetido = false;
		int i = 0;
		while (!repetido && i < animales.length) {
			if (animales[i] != null && animales[i].equalsIgnoreCase(animal)) {
				repetido = true;
			}
			i++;
		}
		if(repetido) {
			System.out.println("Ese animal ya esta registrado");			
		} else {
			boolean agregado = false;
			int pos = 0;
			while (!agregado && pos < animales.length) {
				if(animales[pos] == null) {
					animales[pos] = animal;
					agregado = true;
					System.out.println("Animal registrado correctamente");
				}
				pos++;
			}
			if(!agregado) {
				System.out.println("No se pueden registrar mas animales, el inventario esta lleno");
			}
		}
	}
	
	public void eliminarAnimal(String animal) {
		boolean eliminado = false;
		int i = 0;
		while (!eliminado && i < animales.length) {
			if (animales[i] != null && animales[i].equalsIgnoreCase(animal)) {
				animales[i] = null;
				eliminado = true;
				System.out.println("Animal elimado correctamente");
			}
			i++;
		}
		if (!eliminado) {
			System.out.println("Error: no se puede eliminar ya que ese animal no esta registrado");
		}
	}
	
	public int consultarEspacio(String[] animales) {
		int contador = 0;
		for (int i = 0; i < animales.length; i++) {
			if(animales[i] == null) {
				contador++;
			}
		}
		return contador;
	}

	public void mostrarAnimales() {
		String[] resultado = new String[0];
		for (int i = 0; i < animales.length; i++) {
			if (animales[i] != null) {
				String[] copy = Arrays.copyOf(resultado, resultado.length+1);
				copy[copy.length -1] = animales[i];
				resultado = copy;
			}
		}
		if (resultado.length == 0) {
			System.out.println("No hay animales registrados, el inventario esta vacio");			
		} else {
			System.out.println(Arrays.toString(resultado));
		}
	}
	
	public String buscarAnimal(String animal) {
		String mensaje = "";
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < animales.length) {
			if (animales[i] != null && animales[i].equalsIgnoreCase(animal)) {
				mensaje = "Ese animal esta registrado en el Zoo";			
				encontrado = true;
			}
			i++;
		}
		if (!encontrado) {
			mensaje = "Ese animal NO esta registrado en el Zoo";
		}
		return mensaje;
	}
	
}