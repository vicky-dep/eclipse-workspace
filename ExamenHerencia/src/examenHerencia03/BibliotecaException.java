package examenHerencia03;

public class BibliotecaException extends Exception {

	public static String LIBRO_DEVUELTO = "El libro ya está devuelto.";
	public static String LIBRO_PRESTADO = "El libro ya está prestado.";
	public static String BIBLIOTECA_LLENA = "No se pueden almacenar más libros.";

	public BibliotecaException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BibliotecaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}