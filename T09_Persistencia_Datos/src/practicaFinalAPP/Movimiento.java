package practicaFinalAPP;

//en Android Studio esta clase iría en el package modelo

import java.time.LocalDate;

public class Movimiento {

    private int id;
    private String descripcion;
    private double cantidad;
    private LocalDate fecha;
    private String tipo;
    private int categoriaId;

    public Movimiento() {
    	super();
    }
    // constructor sin id creado para test
    public Movimiento(String descripcion, double cantidad, LocalDate fecha, String tipo, int categoriaId) {
    	super();
    	this.descripcion = descripcion;
    	this.cantidad = cantidad;
    	this.fecha = fecha;
    	this.tipo = tipo;
    	this.categoriaId = categoriaId;
    }
	public Movimiento(int id, String descripcion, double cantidad, LocalDate fecha, String tipo, int categoriaId) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
		this.categoriaId = categoriaId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}
	
	@Override
	public String toString() {
		return "Movimiento [id=" + id + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", fecha=" + fecha
				+ ", tipo=" + tipo + ", categoriaId=" + categoriaId + "]";
	}
    
}