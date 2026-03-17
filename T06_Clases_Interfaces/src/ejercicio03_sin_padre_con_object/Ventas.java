package ejercicio03_sin_padre_con_object;

import java.util.Arrays;

public class Ventas implements VentasInterfaz {
	
	private Object[] entradas = new Object[0];

	public Ventas(Object[] entradas) {
		super();
		this.entradas = entradas;
	}

	public Object[] getEntradas() {
		return entradas;
	}
	public void setEntradas(Object[] entradas) {
		this.entradas = entradas;
	}

	@Override
	public String toString() {
		return "Ventas [entradas=" + Arrays.toString(entradas) + "]";
	}

	@Override
	public int cuantasVendidas() {
		int vendidas = 0;
		for (int i = 0; i < entradas.length; i++) {
			Object e = entradas[i];
			if (e instanceof Gradas) {
				if (((Gradas) e).getNombreComprador() != null
						&& !((Gradas) e).getNombreComprador().trim().equalsIgnoreCase("")) {
					vendidas++;
				}
			}
			if (e instanceof Pista) {
				if (((Pista) e).getNombreComprador() != null
						&& !((Pista) e).getNombreComprador().trim().equalsIgnoreCase("")) {
					vendidas++;
				}
			}

		}
		return vendidas;
	}

	@Override
	public int entradasPorArtista(String nombreArtista) {
		int entradasArtistas = 0;
		for (int i = 0; i < entradas.length; i++) {
			Object e = entradas[i];
			if (e instanceof Gradas) {

				if (((Gradas) e).getArtista() != null && ((Gradas) e).getArtista().equalsIgnoreCase(nombreArtista)) {
					entradasArtistas++;
				}
			}
			if (e instanceof Pista) {

				if (((Pista) e).getArtista() != null && ((Pista) e).getArtista().equalsIgnoreCase(nombreArtista)) {
					entradasArtistas++;
				}
			}

		}
		return entradasArtistas;
	}

	@Override
	public void comprarEntrada(String tipoEntrada) {
		if (tipoEntrada.equalsIgnoreCase("Gradas")) {
			Gradas g = new Gradas(25, "A1", "G1", "Juan", "ACDC", "20261010");
			// Comprobamos que el id sea único
			redimensionar(g);
			System.out.println("Entrada de grada comprada correctamente");
		} else if (tipoEntrada.equalsIgnoreCase("Pista")) {
			Pista p = new Pista("P1", "María", "Metallica", "20261227");
			redimensionar(p);
			System.out.println("Entrada de pista comprada correctamente");
		}

	}

	private void redimensionar(Object g) {
		boolean encontrado = false;
		int contador = 0;
		while (contador < entradas.length && !encontrado) {
			Object e = entradas[contador];
			if (e instanceof Gradas && g instanceof Gradas) {
				if (((Gradas) e).getId().equalsIgnoreCase(((Gradas) g).getId())) {
					encontrado = true;
				}
			}
			if (e instanceof Pista && g instanceof Pista) {
				if (((Pista) e).getId().equalsIgnoreCase(((Pista) g).getId())) {
					encontrado = true;
				}
			}
			contador++;
		}
		if (!encontrado) {
			Object[] aux = Arrays.copyOf(entradas, entradas.length + 1);
			aux[aux.length - 1] = g;
			entradas = aux;
		}
	}

	@Override
	public boolean modificarEntrada(Object o, String fecha) {
		boolean encontrado = false;
		int contador = 0;
		while (contador < entradas.length && !encontrado) {
			Object e = entradas[contador];
			if (e instanceof Gradas && o instanceof Gradas) {
				if (((Gradas) e).getId().equalsIgnoreCase(((Gradas) o).getId())) {
					encontrado = true;
					((Gradas) entradas[contador]).setFecha(fecha);
					System.out.println("Fecha cambiada correctamente");
				}
			}
			if (e instanceof Pista && o instanceof Pista) {
				if (((Pista) e).getId().equalsIgnoreCase(((Pista) o).getId())) {
					encontrado = true;
					((Pista) entradas[contador]).setFecha(fecha);
					System.out.println("Fecha cambiada correctamente");
				}
			}
			contador++;
		}
		return encontrado;
	}

	@Override
	public boolean modificarAsiento(Object o, int nuevo) {
		boolean encontrado = false;
		int contador = 0;
		while (contador < entradas.length && !encontrado) {
			Object e = entradas[contador];
			if (e instanceof Gradas && o instanceof Gradas) {
				if (((Gradas) e).getId().equalsIgnoreCase(((Gradas) o).getId())) {
					encontrado = true;
					((Gradas) entradas[contador]).setAsiento(nuevo);
					System.out.println("Asiento modificado correctamente");
				}
			}

			contador++;
		}
		return encontrado;
	}

}