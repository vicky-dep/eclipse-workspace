package ejercicio04;

import java.util.Arrays;

public class Cuenta implements ProductoInterfaz {

	/*
	 * Se desea gestionar el listado de cuentas de un banco. Cada cuenta tendrá un nombre usuario, un identificador único 
	 * y que no se puede modificar una vez creada la cuenta y el dinero que posee esa cuenta. 
	 * Dependiendo del dinero que posee en la cuenta el banco ofrece unos productos asociados a esa cuenta. 
	 */
	
	private String nombre;
	private String id;
	private long saldo;
	private String[] productos = new String[0]; 
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

	// Si en la cuenta hay menos de 10000€ se le puede ofrecer sólo el seguro de hogar, 
	// si tiene entre 10000€ y 20000€ se le ofrecerá el seguro de vida y 
	// a partir de 50000€ los fondos de inversión.
	@Override
	public String ofrecerProductos() {
		String productoAOfrecer = null;
		if (saldo < 10000) {
			productoAOfrecer = "Seguro de hogar";
		} else if (saldo >= 10000 && saldo <= 20000) {
			productoAOfrecer = "Seguro de vida";
		} else if (saldo > 50000) {
			productoAOfrecer = "Fondos de inversión";
		}
		return productoAOfrecer;
	}
	
}