package practicaFinalAPP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	private static final String RUTA_FICHERO = "conexion.txt";

	public static Connection conectar() throws ConexionException {
		Connection conexion = null;
		// esto en android hay que cambiarlo con la IP...
		String url = "jdbc:mysql://localhost:3306/spendless";
		String usuario = "";
		String password = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(RUTA_FICHERO));
			usuario = br.readLine().split("=")[1];
			password = br.readLine().split("=")[1];
			br.close();
			conexion = DriverManager.getConnection(url, usuario, password);
		} catch (IOException e) {
			throw new ConexionException(ConexionException.ERROR_FICHERO);
		} catch (SQLException e) {
			throw new ConexionException(ConexionException.ERROR_CONEXION);
		}
		return conexion;
	}
}