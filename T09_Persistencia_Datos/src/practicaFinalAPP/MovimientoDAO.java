package practicaFinalAPP;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovimientoDAO implements CrudDAOInterfaz<Movimiento> {

	@Override
	public void insertar(Movimiento movimiento) throws DAOException {
		if (movimiento != null) {
			if (movimiento.getCantidad() <= 0) {
				throw new DAOException(DAOException.CANTIDAD_INVALIDA);
			}
			// aunque el campo tipo se almacena como VARCHAR en la base de datos, 
			// la aplicación valida previamente que únicamente puedan utilizarse los valores INGRESO y GASTO.
			if (!movimiento.getTipo().equals("INGRESO") && !movimiento.getTipo().equals("GASTO")) {
				throw new DAOException(DAOException.DATOS_INVALIDOS);
			}
			String sql = "INSERT INTO movimientos (descripcion, cantidad, fecha, tipo, categoria_id) "
					+ "VALUES (?, ?, ?, ?, ?)";
			try {
				Connection conexion = ConexionBD.conectar();
				PreparedStatement sentencia = conexion.prepareStatement(sql);
				sentencia.setString(1, movimiento.getDescripcion());
				sentencia.setDouble(2, movimiento.getCantidad());
				sentencia.setDate(3, Date.valueOf(movimiento.getFecha()));
				sentencia.setString(4, movimiento.getTipo());
				sentencia.setInt(5, movimiento.getCategoriaId());
				sentencia.executeUpdate();
				conexion.close();
			} catch (SQLException e) {
				throw new DAOException(DAOException.ERROR_INSERTAR);
			}
		} else {
			throw new DAOException(DAOException.DATOS_INVALIDOS);
		}
	}

	@Override
	public List<Movimiento> listarTodos() throws DAOException {
		List<Movimiento> resultado = new ArrayList<Movimiento>();
		String sql = "SELECT * FROM movimientos";
		try {
			Connection conexion = ConexionBD.conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			ResultSet rs = sentencia.executeQuery();
			while (rs.next()) {
				Movimiento movimiento = new Movimiento(
						rs.getInt("id"),
						rs.getString("descripcion"),
						rs.getDouble("cantidad"),
						rs.getDate("fecha").toLocalDate(),
						rs.getString("tipo"),
						rs.getInt("categoria_id")
				);
				resultado.add(movimiento);
			}
			conexion.close();
		} catch (SQLException e) {
			throw new DAOException(DAOException.ERROR_LISTAR);
		}
		return resultado;
	}

	@Override
	public Movimiento buscarPorId(int id) throws DAOException {
		Movimiento movimiento = null;
		String sql = "SELECT * FROM movimientos WHERE id = ?";
		try {
			Connection conexion = ConexionBD.conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, id);
			ResultSet rs = sentencia.executeQuery();
			if (rs.next()) {
				movimiento = new Movimiento(
						rs.getInt("id"),
						rs.getString("descripcion"),
						rs.getDouble("cantidad"),
						rs.getDate("fecha").toLocalDate(),
						rs.getString("tipo"),
						rs.getInt("categoria_id")
				);
			}
			conexion.close();
		} catch (SQLException e) {
			throw new DAOException(DAOException.ERROR_BUSCAR);
		}
		return movimiento;
	}

	@Override
	public void actualizar(Movimiento movimiento) throws DAOException {
		if (movimiento != null) {
			if (movimiento.getCantidad() <= 0) {
				throw new DAOException(DAOException.CANTIDAD_INVALIDA);
			}
			// lo mismo que aclaramos en el método insertar
			if (!movimiento.getTipo().equals("INGRESO") && !movimiento.getTipo().equals("GASTO")) {
				throw new DAOException(DAOException.DATOS_INVALIDOS);
			}
			String sql = "UPDATE movimientos "
					+ "SET descripcion = ?, cantidad = ?, fecha = ?, tipo = ?, categoria_id = ? "
					+ "WHERE id = ?";
			try {
				Connection conexion = ConexionBD.conectar();
				PreparedStatement sentencia = conexion.prepareStatement(sql);
				sentencia.setString(1, movimiento.getDescripcion());
				sentencia.setDouble(2, movimiento.getCantidad());
				sentencia.setDate(3, Date.valueOf(movimiento.getFecha()));
				sentencia.setString(4, movimiento.getTipo());
				sentencia.setInt(5, movimiento.getCategoriaId());
				sentencia.setInt(6, movimiento.getId());
				sentencia.executeUpdate();
				conexion.close();
			} catch (SQLException e) {
				throw new DAOException(DAOException.ERROR_ACTUALIZAR);
			}
		} else {
			throw new DAOException(DAOException.DATOS_INVALIDOS);
		}
	}

	@Override
	public void eliminar(int id) throws DAOException {
		String sql = "DELETE FROM movimientos WHERE id = ?";
		try {
			Connection conexion = ConexionBD.conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, id);
			sentencia.executeUpdate();
			conexion.close();
		} catch (SQLException e) {
			throw new DAOException(DAOException.ERROR_ELIMINAR);
		}
	}
	
	public List<Movimiento> listarPorCategoria(int categoriaId) throws DAOException {
		List<Movimiento> resultado = new ArrayList<Movimiento>();
		String sql = "SELECT * FROM movimientos WHERE categoria_id = ?";
		try {
			Connection conexion = ConexionBD.conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, categoriaId);
			ResultSet rs = sentencia.executeQuery();
			while (rs.next()) {
				Movimiento movimiento = new Movimiento(
						rs.getInt("id"),
						rs.getString("descripcion"),
						rs.getDouble("cantidad"),
						rs.getDate("fecha").toLocalDate(),
						rs.getString("tipo"),
						rs.getInt("categoria_id")
				);
				resultado.add(movimiento);
			}
			conexion.close();
		} catch (SQLException e) {
			throw new DAOException(DAOException.ERROR_LISTAR);
		}
		return resultado;
	}
	
	public double calcularTotalIngresos() throws DAOException {
		return calcularTotalPorTipo("INGRESO");
	}

	public double calcularTotalGastos() throws DAOException {
		return calcularTotalPorTipo("GASTO");
	}

	public double calcularBalance() throws DAOException {
		return calcularTotalIngresos() - calcularTotalGastos();
	}

	private double calcularTotalPorTipo(String tipo) throws DAOException {
		double total = 0;
		String sql = "SELECT SUM(cantidad) AS total FROM movimientos WHERE tipo = ?";
		try {
			Connection conexion = ConexionBD.conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, tipo);
			ResultSet rs = sentencia.executeQuery();
			if (rs.next()) {
				total = rs.getDouble("total");
			}
			conexion.close();
		} catch (SQLException e) {
			throw new DAOException(DAOException.ERROR_CALCULAR);
		}
		return total;
	}

}