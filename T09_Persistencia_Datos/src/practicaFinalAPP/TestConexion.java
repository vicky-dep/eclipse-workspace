package practicaFinalAPP;

import java.sql.Connection;

public class TestConexion {
	public static void main(String[] args) {
		try {
			Connection conexion = ConexionBD.conectar();
			if (conexion != null) {
				System.out.println("Conexion correcta");
			}
			conexion.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}