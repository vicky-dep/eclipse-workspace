package practicaFinalAPP;

//en Android Studio esta clase iría en modelo tambien ?

public class ConexionException extends DAOException {

	private static final long serialVersionUID = 1L;

	public static final String ERROR_FICHERO = "Error al leer el fichero de conexión";
	public static final String ERROR_CONEXION = "Error al conectar con la base de datos";
	public static final String DATOS_CONEXION_INCOMPLETOS = "Faltan datos en el fichero de conexión";

	public ConexionException() {
		super();
	}

	public ConexionException(String message) {
		super(message);
	}
	
}