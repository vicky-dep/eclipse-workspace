package excepciones;

public class CompletarArrayException extends Exception {

	private static final long serialVersionUID = 1L;

	// Los mensajes que van a lanzar las excepciones se declaran aqui
	public final static String TAMANIO_MAX = "Se ha superado el tamaño maximo del array";
	
	public CompletarArrayException() {
		super();
	}
	
	public CompletarArrayException(String message) {
		super(message);
	}
	
}