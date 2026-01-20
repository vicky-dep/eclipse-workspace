package ejercicio21;

public class Cafetera {
	/**
	 * Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad máxima 
	 * de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café
	 * que hay en la cafetera). Implementa, al menos, los siguientes métodos:
	 * Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.)
	 * y la actual en cero (cafetera vacía).
	 * Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
	 * café igual a la capacidad máxima.
	 * Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
	 * mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
	 * llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
	 * servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
	 * Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
	 * vaciarCafetera(): pone la cantidad de café actual en cero.
	 * agregarCafe(int): añade a la cafetera la cantidad de café indicada
	 */
	
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