package ejercicio02;

// El comparable siempre lo implementa la clase objeto de comparacion

public class Vehiculo implements Comparable<Vehiculo> {

	/*
	 * Se desea gestionar un listado de vehículos. 
	 * Cada vehículo queda identificado por la matrícula, valor único dentro del array. 
	 * También dispone del año de antigüedad, color, número de plazas y marca.
	 */
	
	private String matricula;
	private int anioAnt;
	private String color;
	private int plazas;
	private String marca;
	
	public Vehiculo() {
		super();
	}
	public Vehiculo(String matricula, int anioAnt, String color, int plazas, String marca) {
		super();
		this.matricula = matricula;
		this.anioAnt = anioAnt;
		this.color = color;
		this.plazas = plazas;
		this.marca = marca;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnioAnt() {
		return anioAnt;
	}
	public void setAnioAnt(int anioAnt) {
		this.anioAnt = anioAnt;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", anioAnt=" + anioAnt + ", color=" + color + ", plazas=" + plazas
				+ ", marca=" + marca + "]";
	}
	
	// Además se necesita ordenar los vehículos por orden natural de matrícula.
	@Override
	public int compareTo(Vehiculo o) {
		// Las strings se comparan con compareTo
		return matricula.compareTo(o.getMatricula());
	}

}