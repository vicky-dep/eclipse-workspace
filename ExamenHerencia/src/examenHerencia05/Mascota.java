package examenHerencia05;

public abstract class Mascota {
	/*
	 * Se pretende desarrollar una aplicación que gestione una guardería de mascotas, 
	 * donde los dueños pueden dejar a sus animales por un tiempo determinado. 
	 * Existen dos tipos de mascotas que pueden ser atendidas: perros y gatos. 
	 * De todas las mascotas hay que almacenar su nombre, raza, edad, minutos de estancia,
	 * numero de chip y si tienen un plan de membresía.
	 * La clase Mascota tendrá un método llamado calcularTarifa(int minutos) que implementarán 
	 * las clases hijas y que calculará el costo del tiempo de estancia según una fórmula.
	 * Si la mascota tiene un plan de membresía, se aplicará un descuento del 30% sobre la tarifa final.
	 */
	
	private String nombre;
	private String raza;
	private int edad;
	private int minutosEstancia;
	private int numChip;
	private boolean planMembresia;

	public Mascota() {
		super();
	}
	public Mascota(String nombre, String raza, int edad, int minutosEstancia, int numChip, boolean planMembresia) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.minutosEstancia = minutosEstancia;
		this.numChip = numChip;
		this.planMembresia = planMembresia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getMinutosEstancia() {
		return minutosEstancia;
	}
	public void setMinutosEstancia(int minutosEstancia) {
		this.minutosEstancia = minutosEstancia;
	}
	public int getNumChip() {
		return numChip;
	}
	public void setNumChip(int numChip) {
		this.numChip = numChip;
	}
	public boolean isPlanMembresia() {
		return planMembresia;
	}
	public void setPlanMembresia(boolean planMembresia) {
		this.planMembresia = planMembresia;
	}
	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", minutosEstancia="
				+ minutosEstancia + ", numChip=" + numChip + ", planMembresia=" + planMembresia + "]";
	}
	
	public abstract double calcularTarifa(int minutos);
	
}