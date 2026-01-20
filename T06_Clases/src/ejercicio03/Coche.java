package ejercicio03;

public class Coche {
	/*
	 * Crea una clase Coche con atributos como marca, modelo y propietario (de tipo Persona). 
	 * Asocia una instancia de Persona como propietario del coche.
	 */
	
	// Atributos
	private String marca;
	private String modelo;
	private Persona propietario;
		
	// Constructor
	public Coche() {
		super();
	}
	public Coche(String marca, String modelo, Persona propietario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
	}
	
	// Getter & Setter
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
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + "]";
	}	
	
}