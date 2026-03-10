package examenHerencia06;

public class Fisico extends Disco {

	/*
	 * Además de los atributos heredados,los discos físicos incluyen:
	 * Formato físico (Vinilo, CD, Cassette, etc.)
	 * Ubicación en la tienda
	 * Estado de alquiler (booleano)
	 * Cliente actual (si está alquilado)
	 */
	
	private String formato; // vinilo, cd, cassette, ...
	private String ubicacionTienda;
	private boolean estaAlquilado;
	private Cliente cliente;
	
	public Fisico() {
		super();
	}
	public Fisico(String formato, String ubicacionTienda, boolean estaAlquilado, Cliente cliente) {
		super();
		this.formato = formato;
		this.ubicacionTienda = ubicacionTienda;
		this.estaAlquilado = estaAlquilado;
		this.cliente = cliente;
	}
	public Fisico(String titulo, String artista, int anioLanzamiento, String id, String formato, String ubicacionTienda,
				  boolean estaAlquilado, Cliente cliente) {
		super(titulo, artista, anioLanzamiento, id);
		this.formato = formato;
		this.ubicacionTienda = ubicacionTienda;
		this.estaAlquilado = estaAlquilado;
		this.cliente = cliente;
	}
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getUbicacionTienda() {
		return ubicacionTienda;
	}
	public void setUbicacionTienda(String ubicacionTienda) {
		this.ubicacionTienda = ubicacionTienda;
	}
	public boolean isEstaAlquilado() {
		return estaAlquilado;
	}
	public void setEstaAlquilado(boolean estaAlquilado) {
		this.estaAlquilado = estaAlquilado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Fisico [formato=" + formato + ", ubicacionTienda=" + ubicacionTienda + ", estaAlquilado="
				+ estaAlquilado + ", cliente=" + cliente + "]";
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Formato físico: " + formato);
		System.out.println("Ubicación de la tienda: " + ubicacionTienda);
		System.out.println("Está alquilado?: " + estaAlquilado);
		System.out.println("Cliente actual: " + cliente);
	}
	
}