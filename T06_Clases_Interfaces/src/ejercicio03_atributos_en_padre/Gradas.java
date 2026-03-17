package ejercicio03_atributos_en_padre;

public class Gradas extends Object {

	// número de asiento y la zona
	// nombre del comprador, del artista y de la fecha del concierto.
	private int asiento;
	private String zona;

	public Gradas(String id) {
		super(id);
	}
	public Gradas(String id, String nombreComprador, String artista, String fecha, int asiento, String zona) {
		super(id, nombreComprador, artista, fecha);
		this.asiento = asiento;
		this.zona = zona;
	}
	
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString()+ "Gradas [asiento=" + asiento + ", zona=" + zona + "]";
	}
	
}