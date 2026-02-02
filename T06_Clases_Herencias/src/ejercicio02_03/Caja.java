package ejercicio02_03;

public class Caja {
	
	private String etiqueta = "";
	private int ancho;
	private int alto;
	private int fondo;
	private String unidad;
	
	// Constructor
	public Caja(int ancho, int alto, int fondo, String unidad) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
	}
	
	public double getVolumen() {
		double volumen = ancho*alto*fondo;
		if (this.unidad.equals("cm")) {
			volumen *= 0.000001;
		}
		return volumen;
	}

	// Getters & Setters
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		if (etiqueta.length() > 30) {
			etiqueta = etiqueta.substring(0,29); // substring: corta la longitud del array si se pasa de 30
		}
		this.etiqueta = etiqueta;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getFondo() {
		return fondo;
	}
	public void setFondo(int fondo) {
		this.fondo = fondo;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	@Override
	public String toString() {
		return "Caja [etiqueta=" + etiqueta + ", ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad="
				+ unidad + "]";
	}
	
}