package ejercicio1TipoA;

public class Paneles {

	// Atributos
	private String frase;
	private String pista;
	private int puntuacionBase;

	// Constructor
	public Paneles() {
		super();
	}
	public Paneles(String frase, String pista, int puntuacionBase) {
		super();
		this.frase = frase;
		this.pista = pista;
		this.puntuacionBase = puntuacionBase;
	}
	
	// Getters & Setters
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public String getPista() {
		return pista;
	}
	public void setPista(String pista) {
		this.pista = pista;
	}
	public int getPuntuacionBase() {
		return puntuacionBase;
	}
	public void setPuntuacionBase(int puntuacionBase) {
		this.puntuacionBase = puntuacionBase;
	}
	@Override
	public String toString() {
		return "Paneles [frase=" + frase + ", pista=" + pista + ", puntuacionBase=" + puntuacionBase + "]";
	}
}