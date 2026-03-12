package ejercicio01;

import java.util.Arrays;

public class Farmacia implements FarmaciaInterfaz {

	private ProductosFarmaceuticos[] productos = new ProductosFarmaceuticos[0];

	public Farmacia(ProductosFarmaceuticos[] productos) {
		super();
		this.productos = productos;
	}

	public ProductosFarmaceuticos[] getProductos() {
		return productos;
	}
	public void setProductos(ProductosFarmaceuticos[] productos) {
		this.productos = productos;
	}
	
	@Override
	public String toString() {
		return "Farmacia [productos=" + Arrays.toString(productos) + "]";
	}

	@Override
	public int cuantosJarabesCaducados(String fechaActual) {
		int cont = 0;
		for (int i = 0; i < productos.length; i++) {
			ProductosFarmaceuticos p = productos[i];
			if (p instanceof Jarabe) {
				// Transformamos las fechas para compararlas
				int fecha = Integer.valueOf(((Jarabe)p).getFecha());
				int fechaAc = Integer.valueOf(fechaActual);
				if (fecha < fechaAc) { // el jarabe esta caducado
					cont++;
				}
			}
		}
		return cont;
	}

	@Override
	public boolean comprarTiritas(ProductosFarmaceuticos e) {
		// Recorremos el array para ver si el producto esta, sino esta se inserta
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < productos.length) {
			if (productos[cont] instanceof Tirita) {
				if (((Tirita)productos[cont]).getId().equals(((Tirita)e).getId())) {
					encontrado = true;
					System.out.println("Ya existe el producto");
				}
			}
			cont++;
		}
		if (!encontrado) {
			ProductosFarmaceuticos[] aux = Arrays.copyOf(productos, productos.length + 1);
			aux[aux.length - 1] = e;
			productos = aux;
			System.out.println("Tirita insertada correctamente");
		}
		return !encontrado;
	}

	@Override
	public boolean modificarPrecio(ProductosFarmaceuticos o, float precio) {
		boolean modificado = false;
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < productos.length) {
			if (productos[cont].getId().equals(o.getId())) {
				encontrado = true;
				// objeto encontrado se puede modificar su precio
				if (productos[cont] instanceof Tirita) {
					((Tirita) productos[cont]).setPrecio(precio);
				}
				if (productos[cont] instanceof Jarabe) {
					((Jarabe) productos[cont]).setPrecio(precio);
				}
				modificado = true;
			}
			cont++;
		}
		return modificado;
	}

	@Override
	public boolean modificarCantidad(ProductosFarmaceuticos o, int cantidadNueva) {
		boolean modificado = false;
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < productos.length) {
			if (productos[cont].getId().equals(o.getId())) {
				encontrado = true;
				// objeto encontrado se puede modificar su precio
				if (productos[cont] instanceof Tirita) {
					((Tirita) productos[cont]).setCantidad(cantidadNueva);
				}
				if (productos[cont] instanceof Jarabe) {
					((Jarabe) productos[cont]).setCantidad(cantidadNueva);
				}
				modificado = true;
			}
			cont++;
		}
		return modificado;
	}
		
}