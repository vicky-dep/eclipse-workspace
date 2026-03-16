package ejercicio03;

public class Entradas {

	/*
	 * Se pretende gestionar la venta de entradas para un concierto. 
	 * Se tendrá una clase padre llamada Entradas. Esta clase tendrá los siguientes atributos: 
	 * id único , se asigna al crear la entrada y no se puede modificar.
	 * Existen dos tipos de entradas: gradas y pista. 
	 */
	
	private int id;

	public Entradas() {
		super();
	}
	public Entradas(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Entradas [id=" + id + "]";
	}
	
}