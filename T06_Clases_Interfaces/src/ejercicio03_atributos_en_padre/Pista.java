package ejercicio03_atributos_en_padre;

public class Pista extends Object {

	//del comprador, del artista y de la fecha del concierto.

	public Pista(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Pista(String id, String nombreComprador, String artista, String fecha) {
		super(id, nombreComprador, artista, fecha);
	}

}