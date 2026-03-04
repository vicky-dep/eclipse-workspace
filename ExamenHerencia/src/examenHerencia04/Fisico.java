package examenHerencia04;

public class Fisico extends Libro {

	/*
	 * Los libros físicos además de tener los datos heredados disponen de los siguientes atributos: 
	 * numPaginas
	 * ubicacionBiblioteca
	 * prestado (booleano) 
	 * Persona
	 */
	
	private int numPaginas;
	private String ubicacionBiblioteca;
	private boolean prestado;
	private Persona persona;

	public Fisico() {
		super();
	}
	
	public Fisico(String titulo, String autor, int anioPublicacion, String isbn) {
		super(titulo, autor, anioPublicacion, isbn);
	}

	public Fisico(int numPaginas, String ubicacionBiblioteca, boolean prestado, Persona persona) {
		super();
		this.numPaginas = numPaginas;
		this.ubicacionBiblioteca = ubicacionBiblioteca;
		this.prestado = prestado;
		this.persona = persona;
	}

	public Fisico(String titulo, String autor, int anioPublicacion, String isbn, int numPaginas,
			String ubicacionBiblioteca, boolean prestado, Persona persona) {
		super(titulo, autor, anioPublicacion, isbn);
		this.numPaginas = numPaginas;
		this.ubicacionBiblioteca = ubicacionBiblioteca;
		this.prestado = prestado;
		this.persona = persona;
	}

	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getUbicacionBiblioteca() {
		return ubicacionBiblioteca;
	}
	public void setUbicacionBiblioteca(String ubicacionBiblioteca) {
		this.ubicacionBiblioteca = ubicacionBiblioteca;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Fisico [numPaginas=" + numPaginas + ", ubicacionBiblioteca=" + ubicacionBiblioteca + ", prestado="
				+ prestado + ", persona=" + persona + "]";
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Número de páginas: " + numPaginas);
		System.out.println("Ubicación: " + ubicacionBiblioteca);
		System.out.println("Está prestado?: " + prestado);
		System.out.println("Persona: " + persona);
	}

}