package examenHerencia05;

public class GuarderiaException extends Exception {
	/*
	 * Crea una clase excepción GuarderiaException. Ejemplo de utilización: Si detectamos que queremos ingresar un animal y éste ya está, 
	 * ejecutaremos una sentencia como la siguiente:
	 * throw new GuarderiaException(GuarderiaException.ANIMAL_EXISTENTE); 
	 * public static String ANIMAL_RETIRADO= "El animal ya se lo ha llevado el dueño."; 
	 * public static String ANIMAL_EXISTENTE= "El animal ya existe."; 
	 * public static String GUARDERIA_LLENA= "No caben más animales.";
	 * Probad el tratamiento de excepciones.
	 */
	
	public static final String ANIMAL_RETIRADO= "El animal ya se lo ha llevado el dueño.";
	public static final String ANIMAL_EXISTENTE= "El animal ya existe.";
	public static final String GUARDERIA_LLENA= "No caben más animales.";
	
	public GuarderiaException() {
		super();
	}
	public GuarderiaException(String message) {
		super(message);
	}	
	
}