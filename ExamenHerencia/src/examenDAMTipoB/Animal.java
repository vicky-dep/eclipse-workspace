package examenDAMTipoB;

public abstract class Animal {

	private String nombre;
	private double peso;
	private double cantidadAlimentoDisponible;

	public Animal() {
		super();
	}
	public Animal(String nombre, double peso, double cantidadAlimentoDisponible) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.cantidadAlimentoDisponible = cantidadAlimentoDisponible;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getCantidadAlimentoDisponible() {
		return cantidadAlimentoDisponible;
	}
	public void setCantidadAlimentoDisponible(double cantidadAlimentoDisponible) {
		this.cantidadAlimentoDisponible = cantidadAlimentoDisponible;
	}
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", cantidadAlimentoDisponible="
				+ cantidadAlimentoDisponible + "]";
	}
	
	public abstract void alimentar(double raciones);
	
	public void anadirAlimento(double cantidad) {
		cantidadAlimentoDisponible += cantidad;
		System.out.println("Se ha aumentado la cantidad correctamente.");
	}
	
	public void comprobarSalud(double pesoActual) {
		if(peso > 0 && peso <= 50) {
			System.out.println("El peso se encuentra dentro del peso máximo permitido (50kg).");
		} else {
			System.out.println("Sobrepasa el peso máximo permitido.");
		}
	}
	
}