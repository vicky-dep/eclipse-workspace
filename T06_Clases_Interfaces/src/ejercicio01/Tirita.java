package ejercicio01;

public class Tirita extends ProductosFarmaceuticos {

	private String marca;
	private int cantidad;
	private float precio;
	private boolean sePuedeMojar;
	private String color;

	public Tirita(String id) {
		super(id);
	}
	public Tirita(String marca, int cantidad, float precio, boolean sePuedeMojar, String color) {
		super();
		this.marca = marca;
		this.cantidad = cantidad;
		this.precio = precio;
		this.sePuedeMojar = sePuedeMojar;
		this.color = color;
	}
	public Tirita(String id, String marca, int cantidad, float precio, boolean sePuedeMojar, String color) {
		super(id);
		this.marca = marca;
		this.cantidad = cantidad;
		this.precio = precio;
		this.sePuedeMojar = sePuedeMojar;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isSePuedeMojar() {
		return sePuedeMojar;
	}
	public void setSePuedeMojar(boolean sePuedeMojar) {
		this.sePuedeMojar = sePuedeMojar;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Tirita [marca=" + marca + ", cantidad=" + cantidad + ", precio=" + precio + ", sePuedeMojar="
				+ sePuedeMojar + ", color=" + color + "]";
	}
	
}