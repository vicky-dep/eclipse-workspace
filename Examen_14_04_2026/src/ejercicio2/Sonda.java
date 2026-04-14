package ejercicio2;

public class Sonda {

	// Atributos de la clase
	private String modelo;
	private double consumoEnergia;
	private int nivelRiesgo;

	// Constructor
	public Sonda() {
		super();
	}
	public Sonda(String modelo, double consumoEnergia, int nivelRiesgo) {
		super();
		this.modelo = modelo;
		this.consumoEnergia = consumoEnergia;
		this.nivelRiesgo = nivelRiesgo;
	}
	
	// Getters & Setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getConsumoEnergia() {
		return consumoEnergia;
	}
	public void setConsumoEnergia(double consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}
	public int getNivelRiesgo() {
		return nivelRiesgo;
	}
	public void setNivelRiesgo(int nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}
	
	@Override
	public String toString() {
		return "Sonda [modelo=" + modelo + ", consumoEnergia=" + consumoEnergia + ", nivelRiesgo=" + nivelRiesgo + "]";
	}
	
}