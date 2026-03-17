package ejercicio03;

import java.util.Arrays;

public class Ventas implements VentasInterfaz {

	/*
	 * La clase Ventas tiene un array que almacena entradas de gradas y entradas de pista.
	 * Esta clase implementará la siguiente interfaz:
	 * int cuantasVendidas(): Dice cuántas entradas en total se han vendido. Una entrada tendrá nombre del comprador si está vendida
	 * int entradasPorArtista( String nombreArtista): Devuelve el número de entradas totales por artista
	 * void comprarEntrada(String tipoEntrada): Añadirá una entrada de pista o de gradas al array
	 * boolean modificarEntrada(Entradas o, String fecha): Antes de modificar comprueba que existe en el array y modifica la fecha del concierto
	 * boolean modificarAsiento(Entradas o, int nuevo):Antes de modificar comprueba que existe en el array, se modifica el asiento.
	 */
	
	Entradas[] entradas = new Entradas[0];
	
	public Ventas() {
		super();
	}
	public Ventas(Entradas[] entradas) {
		super();
		this.entradas = entradas;
	}

	public Entradas[] getEntradas() {
		return entradas;
	}
	public void setEntradas(Entradas[] entradas) {
		this.entradas = entradas;
	}
	
	@Override
	public String toString() {
		return "Ventas [entradas=" + Arrays.toString(entradas) + "]";
	}
	
	@Override
	public int cuantasVendidas() {
		int entradasVendidas = 0;
		for (int i = 0; i < entradas.length; i++) {
			if (entradas[i] instanceof Pista) {
				Pista p = (Pista) entradas[i];
				if (p.getNombre() != null) {
					entradasVendidas++;
				}
			} else if (entradas[i] instanceof Gradas) {
				Gradas g = (Gradas) entradas[i];
				if (g.getNombre() != null && !g.getNombre().trim().equalsIgnoreCase("") ) {
					entradasVendidas++;
				}
			}
		}
		return entradasVendidas;
	}

	@Override
	public int entradasPorArtista(String nombreArtista) {
		int entradasPorArtista = 0;
		for (int i = 0; i < entradas.length; i++) {
			if (entradas[i] instanceof Pista) {
				Pista p = (Pista) entradas[i];
				if (p.getArtista().equalsIgnoreCase(nombreArtista)) {
					entradasPorArtista++;
				}
			} else if (entradas[i] instanceof Gradas) {
				Gradas g = (Gradas) entradas[i];
				if (g.getArtista().equalsIgnoreCase(nombreArtista)) {
					entradasPorArtista++;
				}
			}
		}
		return entradasPorArtista;
	}

	@Override
	public void comprarEntrada(String tipoEntrada) {
		Entradas [] copy = Arrays.copyOf(entradas, entradas.length+1);
		if (tipoEntrada.equalsIgnoreCase("gradas")) {
			Gradas g = new Gradas();
			copy[copy.length-1] = g;
		} else if (tipoEntrada.equalsIgnoreCase("pista")) {
			Pista p = new Pista();
			copy[copy.length-1] = p;
		}
		entradas = copy;
	}

	@Override
	public boolean modificarEntrada(Entradas o, String fecha) {
		boolean encontrada = false;
		boolean modificaFecha = false;
		int cont = 0;
		while (!encontrada && cont < entradas.length) {
			if (entradas[cont].getId() == o.getId()) {
				encontrada = true;
				if (entradas[cont] instanceof Pista) {
					Pista p = (Pista) entradas[cont];
					p.setFecha(fecha);
					modificaFecha = true;
				} else if (entradas[cont] instanceof Gradas) {
					Gradas g = (Gradas) entradas[cont];
					g.setFecha(fecha);
					modificaFecha = true;
				}
			}
		}
		cont++;
		return modificaFecha;
	}

	@Override
	public boolean modificarAsiento(Entradas o, int nuevo) {
		boolean encontrada = false;
		boolean modificaAsiento = false;
		int cont = 0;
		while (!encontrada && cont < entradas.length) {
			if (entradas[cont].getId() == o.getId() && entradas[cont] instanceof Gradas) {
				encontrada = true;
				Gradas g = (Gradas) entradas[cont];
				g.setNumAsiento(nuevo);
				modificaAsiento = true;
			}
		}
		cont++;
		return modificaAsiento;
	}
	
}