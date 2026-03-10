package examenHerencia06;

public class Digital extends Disco {

	/*
	 * Además de los atributos heredados, incluyen:
	 * Plataforma de descarga (Spotify, Apple Music, Amazon Music, etc.)
	 * Calidad del archivo (MP3, FLAC, WAV, etc.)
	 * Número de descargas
	 */
	
	private String plataforma; // Spotify, Apple Music, Amazon Music, ...
	private String calidadArchivo; // MP3, FLAC, WAV, ...
	private int numDescargas;

	public Digital() {
		super();
	}
	public Digital(String plataforma, String calidadArchivo, int numDescargas) {
		super();
		this.plataforma = plataforma;
		this.calidadArchivo = calidadArchivo;
		this.numDescargas = numDescargas;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getCalidadArchivo() {
		return calidadArchivo;
	}
	public void setCalidadArchivo(String calidadArchivo) {
		this.calidadArchivo = calidadArchivo;
	}
	public int getNumDescargas() {
		return numDescargas;
	}
	public void setNumDescargas(int numDescargas) {
		this.numDescargas = numDescargas;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Digital [plataforma=" + plataforma + ", calidadArchivo=" + calidadArchivo + ", numDescargas="
				+ numDescargas + "]";
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Plataforma de descarga: " + plataforma);
		System.out.println("Calidad del archivo: " + calidadArchivo);
		System.out.println("Número de descargas: " + numDescargas);
	}
	
}