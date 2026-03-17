package ejercicio03_atributos_en_padre;

import java.util.Arrays;

public class Ventas implements VentasInterfaz {

	Entradas[] entradas = new Entradas[0];
	
	
	
	@Override
	public String toString() {
		return "Ventas [entradas=" + Arrays.toString(entradas) + "]";
	}

	public Entradas[] getEntradas() {
		return entradas;
	}

	public void setEntradas(Entradas[] entradas) {
		this.entradas = entradas;
	}

	public Ventas(Entradas[] entradas) {
		super();
		this.entradas = entradas;
	}

	@Override
	public int cuantasVendidas() {
		
		return 0;
	}

	@Override
	public int entradasPorArtista(String nombreArtista) {
		
		return 0;
	}

	@Override
	public void comprarEntrada(String tipoEntrada) {
		if (tipoEntrada.equalsIgnoreCase("Gradas")) {
			Gradas g = new Gradas("G1", "Juan", "ACDC", "20261010", 23, "B2");
			redimensionar(g);
			System.out.println("Entrada de grada comprada correctamente.");
		} else if (tipoEntrada.equalsIgnoreCase("Pista")) {
			Pista p = new Pista("P1", "Maria", "Metalica", "20261227");
			redimensionar(p);
			System.out.println("Entrada de pista comprada correctamente.");
		}
	}
	
	private void redimensionar(Entradas e) {
		// agregar que no este repetido el id
		Entradas[] aux = Arrays.copyOf(entradas, entradas.length+1);
		aux[aux.length-1] = e;
		entradas = aux;
	}

	@Override
	public boolean modificarEntrada(Entradas o, String fecha) {
		boolean encontrado = false;
		int cont = 0;
		while (cont < entradas.length && !encontrado) {
			if (entradas[cont].getId().equalsIgnoreCase(o.getId())) {
				encontrado = true;
				entradas[cont].setFecha(fecha);
				System.out.println("Se ha modificado la fecha correctamente.");
			}
		}
		return false;
	}

	@Override
	public boolean modificarAsiento(Entradas o, int nuevo) {
		boolean encontrado = false;
		int cont = 0;
		while (cont < entradas.length && !encontrado) {
			if (entradas[cont].getId().equalsIgnoreCase(o.getId())) {
				encontrado = true;
				if (entradas[cont] instanceof Gradas) {
					((Gradas)entradas[cont]).setNumAsiento(cont);
				}
				//entradas[cont].setFecha(nuevo);
				System.out.println("Se ha modificado la fecha correctamente.");
			}
		}
		return false;
	}

}