package ejercicio19;

public abstract class Nave implements Comparable<Nave> {

	/*
	 * Se requiere desarrollar un sistema para gestionar las naves de una agencia de exploración. 
	 * El sistema debe permitir el almacenamiento, la ordenación y el filtrado de naves según su tipo.
	 * 
	 * Las naves se caracterizan por los siguientes atributos:
	 * String codigoNave (único para cada nave).
	 * String nombre.
	 * int añoFabricación.
	 * boolean enMision (indica si la nave está actualmente ocupada).
	 * 
	 * Métodos obligatorios:
	 * void asignarAMision(boolean estado): Cambia el atributo enMision.
	 * boolean prepararLanzamiento(): Si la nave no está en misión, cambia su estado a true y devuelve true. Si ya está en misión, devuelve false.
	 * double calcularConsumoEnergia(): Cada tipo de nave tiene un cálculo diferente.Será responsabilidad de los hijos implementarlo
	 * Ordenación Natural: Las naves se ordenarán naturalmente por año de fabricación (de la más antigua a la más moderna).
	 */
	
	private String codigoNave;
	private String nombre;
	private int anioFabricacion;
	private boolean enMision;

	public Nave() {
		super();
	}
	public Nave(String codigoNave, String nombre, int anioFabricacion, boolean enMision) {
		super();
		this.codigoNave = codigoNave;
		this.nombre = nombre;
		this.anioFabricacion = anioFabricacion;
		this.enMision = enMision;
	}
	
	public String getCodigoNave() {
		return codigoNave;
	}
	public void setCodigoNave(String codigoNave) {
		this.codigoNave = codigoNave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public boolean isEnMision() {
		return enMision;
	}
	public void setEnMision(boolean enMision) {
		this.enMision = enMision;
	}
	
	@Override
	public String toString() {
		return "Nave [codigoNave=" + codigoNave + ", nombre=" + nombre + ", anioFabricacion=" + anioFabricacion
				+ ", enMision=" + enMision + "]";
	}
	
	public void asignarAMision(boolean estado) {
		enMision = estado;
	}
	
	public boolean prepararLanzamiento() {
		boolean preparada = false;
		if (!enMision) {
			enMision = true;
			preparada = true;
		}
		return preparada;
	}
	
	public abstract double calcularConsumoEnergia();
	
	@Override
	public int compareTo(Nave n) {
		return this.anioFabricacion - n.anioFabricacion;
	}
	
}