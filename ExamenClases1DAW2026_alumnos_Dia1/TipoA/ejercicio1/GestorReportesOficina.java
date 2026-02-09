package ejercicio1;

import java.util.Arrays;

public class GestorReportesOficina {
	// Atributos
	private final String logActividad = "OF123SedeCentralMantenimientoPiso04SectorAFecha21de01de2026StockBajoPapeleria";
	private String[] reportes = new String[0];

	// Constructor
	public GestorReportesOficina() {
		super();
	}
	public GestorReportesOficina(String[] reportes) {
		super();
		this.reportes = reportes;
	}
	// Getters & Setters
	public String[] getReportes() {
		return reportes;
	}
	public void setReportes(String[] reportes) {
		this.reportes = reportes;
	}
	public String getLogActividad() {
		return logActividad;
	}
	// toString
	@Override
	public String toString() {
		return "GestorReportesOficina [logActividad=" + logActividad + ", reportes=" + Arrays.toString(reportes) + "]";
	}

	// Metodos de la clase
	public void extraerReportes(int cantidad, int longitud) {
		int totalPalabras = logActividad.length() / cantidad;
		int contPalabras = 0;
		while (contPalabras < totalPalabras) {
			/*
			for (int i = 0; i < logActividad.length(); i++) {
				char c = (char) logActividad.charAt(i);
			}*/
			int contador = 0;
			while (contador < logActividad.length()) {
				String miPalabra = this.logActividad.substring(contador, longitud);
				contador += longitud;	
				String[] copy = Arrays.copyOf(reportes, reportes.length+1);
				copy[copy.length-1] = miPalabra;
				reportes = copy;	
			}
		contPalabras++;			
		}
		System.out.println(Arrays.toString(reportes));
		
	}
	
	public String[] buscarPalabras (char letra) {
		String[] resultado = new String [0];
		// aqui recorreria el array "reportes" y cuando encuentre coincidencia
		// lo guardaria en el array "resultado" que se iria redimensionando
		/*
		String[] copy = Arrays.copyOf(resultado, resultado.length+1);
		copy[copy.length-1] = palabraEncontrada;
		resultado = copy;
		*/
		return resultado;
	}
	
	public String[] clasificarReportes() {
		String[] resultado = new String [0];
		return resultado;
	}
}