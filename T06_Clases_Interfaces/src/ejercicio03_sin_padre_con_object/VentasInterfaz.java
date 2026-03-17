package ejercicio03_sin_padre_con_object;

public interface VentasInterfaz {

	int cuantasVendidas();

	int entradasPorArtista(String nombreArtista);

	void comprarEntrada(String tipoEntrada);

	boolean modificarEntrada(Object o, String fecha);

	boolean modificarAsiento(Object o, int nuevo);

}