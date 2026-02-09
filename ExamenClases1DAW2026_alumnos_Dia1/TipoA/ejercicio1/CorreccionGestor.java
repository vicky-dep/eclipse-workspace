package ejercicio1;

import java.util.Arrays;

public class CorreccionGestor {

	private final String logActividad = "OF123SedeCentralMantenimientoPiso04SectorAFecha21de01de2026StockBajoPapeleria";
	private String[] reportesGenerados;
	
	
	public CorreccionGestor() {
		super();
		reportesGenerados = new String[0];
	}
	public CorreccionGestor(String[] reportesGenerados) {
		super();
		this.reportesGenerados = reportesGenerados;
	}
	
	public String[] getReportesGenerados() {
		return reportesGenerados;
	}
	public void setReportesGenerados(String[] reportesGenerados) {
		this.reportesGenerados = reportesGenerados;
	}
	public String getLogActividad() {
		return logActividad;
	}
	@Override
	public String toString() {
		return "CorreccionGestor [logActividad=" + logActividad + ", reportesGenerados="
				+ Arrays.toString(reportesGenerados) + "]";
	}
	
	public void extraerReportes(int cantidad, int longitud) {
		
		//reportesGenerados = new String[0];
		int inicio = 0;
		int generados = 0;
		
		while (generados < cantidad && (inicio + longitud) <= logActividad.length()) {
			String palabra = logActividad.substring(inicio, inicio+longitud);
			String[] copy = Arrays.copyOf(reportesGenerados, reportesGenerados.length +1);
			copy[copy.length -1] = palabra;
			reportesGenerados = copy;
			inicio += longitud;
			generados++;
		}
		if (generados < cantidad) {
			System.out.println("No hay suficientes caracteres para generar " + cantidad + " reportes. Se generaron solo " + generados + ".");
		}
	}
	
	public String[] buscarPalabras(char letra) {
		String[] resultado = new String[0];
		char objetivo = Character.toLowerCase(letra);
		for (int i = 0; i < reportesGenerados.length; i++) {
			String palabra = reportesGenerados[i];
			boolean contiene = false;
			int j = 0;
			while (j < palabra.length() && !contiene) {
				if (Character.toLowerCase(palabra.charAt(j)) == objetivo) {
					contiene = true;
				}
				j++;
			}
			if (contiene) {
				String[] copy = Arrays.copyOf(resultado, resultado.length +1);
				copy[copy.length -1] = palabra;
				resultado = copy;
			}
		}
		return resultado;
	}
	
	public String[] clasificarReportes() {
		String[] vocales = new String[0];
		String[] numeros = new String[0];
		String[] consonantes = new String[0];
		
		for (int i = 0; i < reportesGenerados.length; i++) {
			String palabra = reportesGenerados[i];
			char first = palabra.charAt(0);
			if (esVocal(first)) {
				vocales = anadirAlFinal(vocales, palabra);
			} else if (Character.isDigit(first)) {
				numeros = anadirAlFinal(numeros, palabra);
			} else {
				consonantes = anadirAlFinal(consonantes, palabra);
			}
		}
		
		String[] resultado = Arrays.copyOf(vocales, vocales.length + numeros.length + consonantes.length);
		System.arraycopy(numeros, 0, resultado, vocales.length, numeros.length);
		System.arraycopy(consonantes, 0, resultado, vocales.length + numeros.length, consonantes.length);
		
		return resultado;
		
	}
	
	private boolean esVocal(char c) {
		char x = Character.toLowerCase(c);
		return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'; 
	}
	
	private String[] anadirAlFinal(String[] arr, String valor) {
		String[] copy = Arrays.copyOf(arr, arr.length +1);
		copy[copy.length -1] = valor;
		return copy;
	}
}
