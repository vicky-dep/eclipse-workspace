package repasoHerencia02;

public class IndiceInvalidoException extends Exception {
	/* 
	 * Crea una clase llamada IndiceInvalidoException.
	 * Lanzará una excepción cuando no se pueda cancelar la notificación.
	 * El mensaje será el siguiente:Error: No existe ninguna notificación en el índice 
	 */
	
	public final static String INDICE_INCORRECTO = "Error: No existe ninguna notificación en el índice";

	public IndiceInvalidoException() {
		super();
	}
	public IndiceInvalidoException(String message) {
		super(message);
	}
	
}