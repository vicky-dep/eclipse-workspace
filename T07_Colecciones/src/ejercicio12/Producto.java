package ejercicio12;

public class Producto {

	private String nombre;
	private String codigoBarras;
	private float precio;

	public Producto() {
		super();
	}
	public Producto(String nombre, String codigoBarras, float precio) {
		super();
		this.nombre = nombre;
		this.codigoBarras = codigoBarras;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigoBarras=" + codigoBarras + ", precio=" + precio + "]";
	}
	
}