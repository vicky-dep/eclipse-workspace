package practicaFinalAPP;

//en Android Studio esta clase iría en modelo tambien ?

public class DAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public static final String ERROR_INSERTAR = "Error al insertar el registro";
	public static final String ERROR_LISTAR = "Error al listar los registros";
	public static final String ERROR_BUSCAR = "Error al buscar el registro";
	public static final String ERROR_ACTUALIZAR = "Error al actualizar el registro";
	public static final String ERROR_ELIMINAR = "Error al eliminar el registro";
	public static final String ERROR_CALCULAR = "Error al calcular el total";
	public static final String DATOS_INVALIDOS = "Los datos introducidos no son válidos";
	public static final String CANTIDAD_INVALIDA = "La cantidad debe ser mayor que cero";

	public DAOException() {
		super();
	}

	public DAOException(String message) {
		super(message);
	}

}