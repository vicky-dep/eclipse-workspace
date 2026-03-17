package ejercicio03_atributos_en_padre;

public class Pista extends Entradas {

	public Pista(String id, String nombre, String artista, String fecha) {
		super(id, nombre, artista, fecha);
	}

	@Override
	public String toString() {
		return "Pista [toString()=" + super.toString() + "]";
	}

}