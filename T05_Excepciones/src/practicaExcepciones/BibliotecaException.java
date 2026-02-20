package practicaExcepciones;

public class BibliotecaException extends Exception {
	
	/*
	 * Crear una clase BibliotecaException que nos permita lanzar excepciones del tipo 
	 * throw new BibliotecaException(BibliotecaException .NO_NUMERICO)
	 * La clase biblioteca utilizará esta clase para lanzar las Excepciones. 
	 * Además si existe la posibilidad de lanzar otro tipo de excepciones genéricas de Java, deberán de lanzarse.
	 * Para las funciones de tratamiento de array entre otras deberéis de lanzar estas excepciones:
	 * ARRAY_VACIO: Cuando se intenta operar (como sacar la media) en un array sin elementos.
	 * TAMANO_NEGATIVO: Al intentar generar un array con n < 0.
	 * NullPointerException: Aunque es de Java, asegúrate de capturar si el usuario pasa un null en lugar de un array.
	 */

	public static final String NO_PRIMO = "El número no es primo";
    public static final String ARRAY_VACIO = "El array está vacio";
    public static final String TAMANO_NEGATIVO = "El tamaño del array no puede ser negativo";

	public BibliotecaException() {
		super();
	}

	public BibliotecaException(String message) {
		super(message);
	}

}