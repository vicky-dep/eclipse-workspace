package ejercicio21;

public class Cafetera {
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	// Constructor
	public Cafetera() {
		super();
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	public Cafetera(int capacidadMaxima) {
		super();
		this.cantidadActual = capacidadMaxima;
	}
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		if (this.cantidadActual > capacidadMaxima) {
			this.cantidadActual = capacidadMaxima;
		} else {
			this.cantidadActual = cantidadActual;			
		}
	}
	
	// Getters & Setters
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	
	// Metodos de la clase
	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
		System.out.println("La cafetera se ha llenado correctamente.");
	}
	
	public void servirTaza(int cantidadServida) {
		if (cantidadServida < cantidadActual) {
			System.out.println("Cafe servido.");
			cantidadActual -= cantidadServida;
		} else {
			System.out.println("No hay cafe suficiente, te sirvo " + cantidadActual + " de cafe.");
			cantidadActual = 0;
		}
	}
	
	public void vaciarCafetera() {
		cantidadActual = 0;
		System.out.println("La cafetera se ha vaciado correctamente.");
	}
	
	public void agregarCafe(int cantidad) {
		if (cantidadActual + cantidad <= capacidadMaxima) {
			cantidadActual += cantidad;
			System.out.println("La cafetera se ha recargado.");
		} else {
			System.out.println("No se puede introducir la cantidad indicada.");
			cantidadActual = capacidadMaxima;
		}
	}
}