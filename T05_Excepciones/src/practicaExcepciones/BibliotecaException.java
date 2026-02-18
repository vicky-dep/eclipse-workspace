package practicaExcepciones;

public class BibliotecaException extends Exception {

	public static final String NO_PRIMO = "El número no es primo";

	public BibliotecaException() {
		super();
	}

	public BibliotecaException(String message) {
		super(message);
	}

}