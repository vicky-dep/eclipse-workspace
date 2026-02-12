package examenHerencia01;

public class Digital extends Videojuego {

	private String plataforma;
	private int tamanio;
	private int numDescargas;

	public Digital() {
		super();
	}

	public Digital(String titulo, String desarrollador, int anioLanzamiento, String codId) {
		super(titulo, desarrollador, anioLanzamiento, codId);
	}

	public Digital(String plataforma, int tamanio, int numDescargas) {
		super();
		this.plataforma = plataforma;
		this.tamanio = tamanio;
		this.numDescargas = numDescargas;
	}

	public Digital(String titulo, String desarrollador, int anioLanzamiento, String codId, String plataforma, int tamanio, int numDescargas) {
		super(titulo, desarrollador, anioLanzamiento, codId);
		this.plataforma = plataforma;
		this.tamanio = tamanio;
		this.numDescargas = numDescargas;
	}

	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	public int getNumDescargas() {
		return numDescargas;
	}
	public void setNumDescargas(int numDescargas) {
		this.numDescargas = numDescargas;
	}
	@Override
	public String toString() {
		return "Digital [plataforma=" + plataforma + ", tamanio=" + tamanio + ", numDescargas=" + numDescargas + "]";
	}
	
	// Reimplementamos el metodo de su padre:
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Plataforma de descarga: " + plataforma);
		System.out.println("Tamaño de la descarga: " + tamanio);
		System.out.println("Número de descargas: " + numDescargas);
	}
	
}