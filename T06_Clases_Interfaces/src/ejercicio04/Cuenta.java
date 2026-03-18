package ejercicio04;

import java.util.Arrays;

public class Cuenta implements ProductoInterfaz, Comparable<Cuenta> {

	/*
	 * Se desea gestionar el listado de cuentas de un banco. Cada cuenta tendrá un nombre usuario, un identificador único 
	 * y que no se puede modificar una vez creada la cuenta y el dinero que posee esa cuenta. 
	 * Dependiendo del dinero que posee en la cuenta el banco ofrece unos productos asociados a esa cuenta. 
	 */
	
	private String nombre;
	private String id;
	private long saldo; // Leticia ha puesto float
	private String[] productos = new String[0]; // Leticia: new String[3]; 
	// Los productos se almacenan en un array. Estos productos pueden ser: seguro de hogar, seguro de vida, fondos de inversión.
	
	public Cuenta() {
		super();
	}
	public Cuenta(String nombre, String id, long saldo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public long getSaldo() {
		return saldo;
	}
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	public String[] getProductos() {
		return productos;
	}
	public void setProductos(String[] productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", id=" + id + ", saldo=" + saldo + ", productos="
				+ Arrays.toString(productos) + "]";
	}

	/* Si en la cuenta hay menos de 10000€ se le puede ofrecer sólo el seguro de hogar, 
	   si tiene entre 10000€ y 20000€ se le ofrecerá el seguro de vida y 
	   a partir de 50000€ los fondos de inversión. 
	*/
	@Override
	public String[] ofrecerProductos() {
		String[] resultado = new String[0];
		if (saldo < 10000) {
			resultado = redimensionarArray("Seguro de hogar");
		} else if (saldo >= 10000 && saldo <= 20000) {
			resultado = redimensionarArray("Seguro de vida");
		} else if (saldo > 50000) {
			resultado = redimensionarArray("Fondos de inversión");
		}
		return resultado;
	}
	
	private String[] redimensionarArray(String producto) {
		String[] copy = Arrays.copyOf(productos, productos.length+1);
		copy[copy.length-1] = producto;
		productos = copy;
		return productos;
	}
	
	// este metodo viene de la interfaz propia le faltaria el override
	public void contratarProductos() {
		String producto = "";
		if (saldo < 10000) {
			producto = "Seguro hogar";
		} else if (saldo >= 10000 && saldo <= 20000) {
			producto = "Seguro de vida";
		} else if (saldo > 50000) {
			producto = "Fondos inversión";
		}
		if (!producto.trim().equals("")) {
			int cont = 0;
			boolean anadido = false;
			while (cont < productos.length && ! anadido) {
				if (productos[cont] == null || productos[cont].trim().equals("")) {
					productos[cont] = producto;
					anadido = true;
					System.out.println("Producto añadido correctamente.");
				}
				cont++;
			}
			if (!anadido) {
				System.out.println("Tienes todos los productos contratados, no se pueden añadir más");
			}
		}
	}
	
	// Además se necesita ordenar las cuentas por orden natural de identificador.
	@Override
	public int compareTo(Cuenta o) {
		return id.compareTo(o.getId());
	}
	
}