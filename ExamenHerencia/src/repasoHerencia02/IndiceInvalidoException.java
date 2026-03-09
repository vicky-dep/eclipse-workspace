package repasoHerencia02;

public class IndiceInvalidoException extends Exception {
	/* 
	 * Crea una clase llamada IndiceInvalidoException.
	 * Lanzará una excepción cuando no se pueda cancelar la notificación.
	 * El mensaje será el siguiente:Error: No existe ninguna notificación en el índice 
	 */
	
	// deberia haber creado un paquete nuevo, copiando y pegando todas las clases del ejercicio 2 y agregando ahi excepciones sin machacar el original 
	
	public static final String INDICE_INCORRECTO = "Error: No existe ninguna notificación en el índice."; // leticia la llamo CANCELAR_NOTIF
	public static final String BANDEJA_LLENA = "No se aceptan mas notificaciones."; // deberia agregarlo en el metodo agregar...

	public IndiceInvalidoException() {
		super();
	}
	public IndiceInvalidoException(String message) {
		super(message);
	}
	
}