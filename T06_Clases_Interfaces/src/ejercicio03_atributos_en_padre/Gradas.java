package ejercicio03_atributos_en_padre;

public class Gradas extends Entradas {

	private int numAsiento;
	private String zona;
	
	public Gradas(String id, String nombre, String artista, String fecha, int numAsiento, String zona) {
		super(id, nombre, artista, fecha);
		this.numAsiento = numAsiento;
		this.zona = zona;
	}

	public Gradas(String id, String nombre, String artista, String fecha) {
		super(id, nombre, artista, fecha);
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString() + "Gradas [numAsiento=" + numAsiento + ", zona=" + zona + "]";
	}
	
	
}
