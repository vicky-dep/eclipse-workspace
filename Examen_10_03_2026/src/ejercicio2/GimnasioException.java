package ejercicio2;

public class GimnasioException extends Exception {

	public static final String MENOR_EDAD = "El socio no cumple la edad mínima de 14 años.";
	public static final String SALDO_INSUFICIENTE = "No tienes saldo suficiente para esta actividad.";
	
	// Constructor
	public GimnasioException() {
		super();
	}
	public GimnasioException(String message) {
		super(message);
	}
	
}