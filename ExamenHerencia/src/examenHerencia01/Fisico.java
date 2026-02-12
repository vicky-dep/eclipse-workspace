package examenHerencia01;

public class Fisico extends Videojuego {

	private String formato;
	private String ubicacionTienda;
	private boolean estadoAlquiler;
	private Cliente cliente;
	
	public Fisico() {
		super();
	}

	public Fisico(String titulo, String desarrollador, int anioLanzamiento, String codId) {
		super(titulo, desarrollador, anioLanzamiento, codId);
	}

	public Fisico(String formato, String ubicacionTienda, boolean estadoAlquiler, Cliente cliente) {
		super();
		this.formato = formato;
		this.ubicacionTienda = ubicacionTienda;
		this.estadoAlquiler = estadoAlquiler;
		this.cliente = cliente;
	}
	
	public Fisico(String titulo, String desarrollador, int anioLanzamiento, String codId, String formato, String ubicacionTienda, boolean estadoAlquiler, Cliente cliente) {
		super(titulo, desarrollador, anioLanzamiento, codId);
		this.formato = formato;
		this.ubicacionTienda = ubicacionTienda;
		this.estadoAlquiler = estadoAlquiler;
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
	public boolean isEstadoAlquiler() {
		return estadoAlquiler;
	}
	public void setEstadoAlquiler(boolean estadoAlquiler) {
		this.estadoAlquiler = estadoAlquiler;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Fisico [formato=" + formato + ", ubicacionTienda=" + ubicacionTienda + ", estadoAlquiler="
				+ estadoAlquiler + ", cliente=" + cliente + "]";
	}
	
	// Reimplementamos el metodo de su padre:
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Formato: " + formato);
		System.out.println("Ubicación: " + ubicacionTienda);
		System.out.println("Está alquilado?: " + estadoAlquiler);
		System.out.println("Cliente: " + cliente);
	}
	
}