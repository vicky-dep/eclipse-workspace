package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpleadoDAO {
	
	// esta clase implementa el CRUD de empleado y el resto de consultas que se necesiten
	
	private static Connection conectar() {
		Connection con = null;
		String url = "jdbc:mysql://localhost/Empresa";
		try {
			con = DriverManager.getConnection(url, "vicky", "vicky");
		} catch (SQLException ex) {
			System.out.println("Error al conectar al SGBD.");
		}
		return con;
	}
	
	private static void create(Empleado e) { // executeUpdate
		Connection c = conectar();
		try {
			Statement sentencia = c.createStatement();
			String sql = "INSERT INTO Empleados(numemp, nombre, edad, oficina, puesto, contrato) VALUES (?, ?, ?, ?, ?)";
			int res = sentencia.executeUpdate(sql);
			System.out.println("Empleado creado correctamente");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	private static Empleado read(int numEmpleado) { // executeQuery devuelve un ...
		Connection c = conectar();
		
		return null;
	}

	private static void update(Empleado e) { // executeUpdate
		Connection c = conectar();
	}
	
	private static void delete(int numEmleado) { // executeUpdate
		Connection c = conectar();
	}
}