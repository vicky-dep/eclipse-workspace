package ejercicio03;

public interface VentasInterfaz {

	int cuantasVendidas();
	int entradasPorArtista(String nombreArtista);
	void comprarEntrada(String tipoEntrada);
	boolean modificarEntrada(Entradas o, String fecha);
	boolean modificarAsiento(Entradas o, int nuevo);
	
}