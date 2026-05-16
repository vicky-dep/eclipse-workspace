package practicaFinalAPP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO implements CrudDAOInterfaz<Categoria> {

	@Override
	public void insertar(Categoria categoria) throws DAOException {
		if (categoria != null) {
			String sql = "INSERT INTO categorias (nombre) VALUES (?)";
			try {
				Connection conexion = ConexionBD.conectar();
				PreparedStatement sentencia = conexion.prepareStatement(sql);
				sentencia.setString(1, categoria.getNombre());
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
	public List<Categoria> listarTodos() throws DAOException {
		List<Categoria> resultado = new ArrayList<Categoria>();
		String sql = "SELECT * FROM categorias";
		try {
			Connection conexion = ConexionBD.conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			ResultSet rs = sentencia.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				Categoria categoria = new Categoria(id, nombre);
				resultado.add(categoria);
			}
			conexion.close();
		} catch (SQLException e) {
			throw new DAOException(DAOException.ERROR_LISTAR);
		}
		return resultado;
	}

	@Override
	public Categoria buscarPorId(int id) throws DAOException {
		Categoria categoria = null;
		String sql = "SELECT * FROM categorias WHERE id = ?";
		try {
			Connection conexion = ConexionBD.conectar();
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, id);
			ResultSet rs = sentencia.executeQuery();
			if (rs.next()) {
				String nombre = rs.getString("nombre");
				categoria = new Categoria(id, nombre);
			}
			conexion.close();
		} catch (SQLException e) {
			throw new DAOException(DAOException.ERROR_BUSCAR);
		}
		return categoria;
	}

	@Override
	public void actualizar(Categoria categoria) throws DAOException {
		if (categoria != null) {
			String sql = "UPDATE categorias SET nombre = ? WHERE id = ?";
			try {
				Connection conexion = ConexionBD.conectar();
				PreparedStatement sentencia = conexion.prepareStatement(sql);
				sentencia.setString(1, categoria.getNombre());
				sentencia.setInt(2, categoria.getId());
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
		String sql = "DELETE FROM categorias WHERE id = ?";
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

}