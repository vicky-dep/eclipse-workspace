package repasoHerencia01;

public class Vehiculo {
	/*
	 * Se desea gestionar un concesionario. Para ello tendremos una Clase Vehículo con los siguientes datos:
	 * Atributos: marca y modelo.
	 * Método: 
	 * public void mostrarDetalles(). Debe imprimir la marca y el modelo.
	 * public void conducir(). Imprime: "Conduciendo un vehículo"
	 * Tendremos dos clases hijas: Moto y Coche con los siguientes parámetros: ...
	 */
	
	private String marca;
	private String modelo;
	
	public Vehiculo() {
		super();
	}
	public Vehiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public void mostrarDetalles() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
	}
	
	public void conducir() {
		System.out.println("Conduciendo un vehiculo.");
	}
	
}