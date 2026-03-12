package ejercicio01;

public class Jarabe  extends ProductosFarmaceuticos {

	private float precio;
	private int cantidad;
	private String fecha; // formato yyyymmdd

	public Jarabe() {
		super();
	}
	public Jarabe(float precio, int cantidad, String fecha) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}
	
	public Jarabe(String id, float precio, int cantidad, String fecha) {
		super(id);
		this.precio = precio;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Jarabe [precio=" + precio + ", cantidad=" + cantidad + ", fecha=" + fecha + "]";
	}
	
}