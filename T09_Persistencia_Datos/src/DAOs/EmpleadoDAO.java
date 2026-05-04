package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class EmpleadoDAO {
	
	// esta clase implementa el CRUD de empleado y el resto de consultas que se necesiten
	/*
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
	
	private static void create(Empleado empleado) { // executeUpdate
		
		if (empleado != null) {
			Connection conexion = conectar();

			String sql = "INSERT INTO Empleados(numemp, nombre, edad, oficina, puesto, contrato) "
					+ "             VALUES ( ?,    ?,     ?,     ?,     ?,    ?  )";

			try {
				PreparedStatement sentencia = conexion.prepareStatement(sql);
				sentencia.setInt(1, empleado.getNumEmpleado());
				sentencia.setString(2, empleado.getNombre());
				sentencia.setInt(3, empleado.getEdad());
				sentencia.setInt(4, empleado.getOficina());
				sentencia.setString(5, empleado.getPuesto());
				sentencia.setString(6, empleado.getContrato());

				sentencia.executeUpdate();

				conexion.close();
			} catch (SQLException ex) {
				System.out.println("Error al insertar.");
			}
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
	*/
	
	// Los daos tienen siempre estos métodos:
		// Crear, actualizar, leer, borrar (CRUD)
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

		public static void create(Empleado empleado) {
			Connection c = conectar();
			try {
				Statement sentencia = c.createStatement();
				String sql = "insert into empleados (numemp,nombre,edad,oficina,puesto,contrato)" + "VALUES ("
						+ empleado.getNumEmpleado() + ",'" + empleado.getNombre() + "'," + empleado.getEdad() + ","
						+ empleado.getOficina() + ",'" + empleado.getPuesto() + "'," + empleado.getContrato() + "')";
				int resultado = sentencia.executeUpdate(sql);
				if (resultado > 0) {
					System.out.println("Empleado insertado correctamente");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		public static Empleado read(int numEmp) {
			Empleado resultado = null;
			Connection c = conectar();
			try {
				Statement sentencia = c.createStatement();
				String sql = "Select numemp,nombre,edad,oficina,puesto,contrato from empleados where " + " numEmpleado="
						+ numEmp;
				// Utilizamos executeUpdate
				ResultSet executeQuery = sentencia.executeQuery(sql);
				// Recorremos el resultset para rellenar los datos de empleado
				if (executeQuery != null) {
					resultado = new Empleado();
					resultado.setContrato(executeQuery.getString("contrato"));
					resultado.setEdad(executeQuery.getInt("edad"));
					resultado.setNombre(executeQuery.getString("nombre"));
					resultado.setNumEmpleado(executeQuery.getInt("numemp"));
					resultado.setOficina(executeQuery.getInt("oficina"));
					resultado.setPuesto(executeQuery.getString("puesto"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return resultado;
		}

		public static void update(Empleado empleado) {
			Connection c = conectar();
			try {
				Statement sentencia = c.createStatement();
				// numEmpleado,nombre,edad,oficina,puesto,contrato
				String sql = "UPDATE empleados set numemp=" + empleado.getNumEmpleado() + ",nombre='" + empleado.getNombre()
						+ "',edad=" + empleado.getEdad() + ",oficina=" + empleado.getOficina() + ",puesto='"
						+ empleado.getPuesto() + "',contrato='" + empleado.getContrato() + "' where" + " numemp="
						+ empleado.getNumEmpleado();
				int executeUpdate = sentencia.executeUpdate(sql);
				if (executeUpdate > 0) {
					System.out.println("empleado actualizado correctamente");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		public static void delete(int numEmp) {
			Connection c = conectar();
			try {
				Statement sentencia = c.createStatement();
				String sql = "Delete from empleados where numemp=" + numEmp;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	////////////////// Resto de consultas/////////////
	public static List<Empleado> listarEmpleados() {
		List<Empleado> lista = new ArrayList<Empleado>();
		Connection c = conectar();
		try {
			Statement sentencia = c.createStatement();
			String sql = "select * from empleados";
			ResultSet rs = sentencia.executeQuery(sql);// Se usa executeQuery porque devuelve datos
			if (rs != null) {
				while (rs.next()) {
					Empleado e = new Empleado();
					e.setContrato(rs.getString("contrato"));
					e.setEdad(rs.getInt("edad"));
					e.setNombre(rs.getString("nombre"));
					e.setNumEmpleado(rs.getInt("numemp"));
					e.setOficina(rs.getInt("oficina"));
					e.setPuesto(rs.getString("puesto"));
					lista.add(e);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;

	}

	public List<Empleado> empleadosPorEdad(int edadMinima, int edadMaxima) {
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Connection c = conectar();
		try {
			Statement sentencia = c.createStatement();
			String sql = "select * from empleados where edad>="+edadMinima+ " and edad<="+edadMaxima;
			ResultSet rs = sentencia.executeQuery(sql);// Se usa executeQuery porque devuelve datos
			if (rs != null) {
				while (rs.next()) {
					Empleado e = new Empleado();
					e.setContrato(rs.getString("contrato"));
					e.setEdad(rs.getInt("edad"));
					e.setNombre(rs.getString("nombre"));
					e.setNumEmpleado(rs.getInt("numemp"));
					e.setOficina(rs.getInt("oficina"));
					e.setPuesto(rs.getString("puesto"));
					empleados.add(e);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empleados;
	}
	
	public static void updateCambiarOficina(int ofVieja, int ofNueva) {
		Connection c = conectar();
		try {
			Statement sentencia = c.createStatement();
			// numEmpleado,nombre,edad,oficina,puesto,contrato
			String sql = "UPDATE empleados set oficina=" + ofNueva + " where oficina=" + ofVieja;
			int executeUpdate = sentencia.executeUpdate(sql);
			if (executeUpdate > 0) {
				System.out.println("empleado actualizado correctamente");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public List<Empleado> empleadosPorOficina(int numOficina) {
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Connection c = conectar();
		try {
			Statement sentencia = c.createStatement();
			String sql = "select * from empleados where oficina="+numOficina;
			ResultSet rs = sentencia.executeQuery(sql);// Se usa executeQuery porque devuelve datos
			if (rs != null) {
				while (rs.next()) {
					Empleado e = new Empleado();
					e.setContrato(rs.getString("contrato"));
					e.setEdad(rs.getInt("edad"));
					e.setNombre(rs.getString("nombre"));
					e.setNumEmpleado(rs.getInt("numemp"));
					e.setOficina(rs.getInt("oficina"));
					e.setPuesto(rs.getString("puesto"));
					empleados.add(e);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empleados;
	}
}