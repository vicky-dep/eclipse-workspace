package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OficinaDAO {

	//CRUD
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
		public static void create(Oficina oficina) {
			Connection c=conectar();
			String sql="insert into Oficinas (oficina,ciudad,superficie,ventas) "
					+ " values(?,?,?,?)";
			try {
				PreparedStatement prepareStatement = c.prepareStatement(sql);
				prepareStatement.setInt(1, oficina.getOficina());
				prepareStatement.setString(2, oficina.getCiudad());
				prepareStatement.setInt(3, oficina.getSuperficie());
				prepareStatement.setFloat(4, oficina.getVentas());
				int filaInsertada = prepareStatement.executeUpdate();
				if(filaInsertada==1) {
					System.out.println("Oficina insertada correctamente");
				}else {
					System.out.println("No se ha podido insertar la oficina");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		public static Oficina read(int numOficina) {
			Oficina resultado=new Oficina();
			Connection c=conectar();
			String sql="Select oficina,ciudad,superficie,ventas from Oficinas where oficina =?";
			try {
				PreparedStatement ps = c.prepareStatement(sql);
				ps.setInt(1, numOficina);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					resultado.setOficina(rs.getInt("oficina"));
					resultado.setCiudad(rs.getString("ciudad"));
					resultado.setSuperficie(rs.getInt("superficie"));
					resultado.setVentas(rs.getFloat("ventas"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return resultado;
		}
		public static void update(Oficina oficina) {
			Connection c=conectar();
			String sql= "Update Oficinas set oficina=?,ciudad=?,superficie=?,ventas=? "
					+ "where oficina=?";
			try {
				PreparedStatement prepareStatement = c.prepareStatement(sql);
				prepareStatement.setInt(1, oficina.getOficina());
				prepareStatement.setString(2, oficina.getCiudad());
				prepareStatement.setInt(3, oficina.getSuperficie());
				prepareStatement.setFloat(4, oficina.getVentas());
				prepareStatement.setInt(5, oficina.getOficina());
				int filaActualizada = prepareStatement.executeUpdate();
				if(filaActualizada==1) {
					System.out.println("Oficina actualizada correctamente");
				}else {
					System.out.println("No se ha podido actualizar la oficina");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void delete(int numOf) {
			Connection c=conectar();
			String sql="Delete from Oficina where oficina=?";
			PreparedStatement ps;
			try {
				ps = c.prepareStatement(sql);
				ps.setInt(1, numOf);
				int filaBorrada = ps.executeUpdate();
				if(filaBorrada==1) {
					System.out.println("Oficina borrada correctamente");
				}else {
					System.out.println("No se ha podido borrar la oficina");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//Resto de consultas
		public List<Oficina> listarOficinas(){
			List<Oficina> lista=new ArrayList<Oficina>();
			Connection c=conectar();
			try {
				Statement createStatement = c.createStatement();
				String sql="Select * from Oficinas";
				ResultSet rs = createStatement.executeQuery(sql);
				if(rs!=null) {
					while (rs.next()) {
						Oficina o=new Oficina();
						o.setOficina(rs.getInt("oficina"));
						o.setCiudad(rs.getString("ciudad"));
						o.setSuperficie(rs.getInt("superficie"));
						o.setVentas(rs.getFloat("ventas"));
						lista.add(o);
					}
				}else {
					System.out.println("No existen oficinas");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
		
		public List<Oficina> oficinasPorCiudad(String nombreCiudad){
			List<Oficina> lista=new ArrayList<Oficina>();
			Connection c=conectar();
			try {
				Statement createStatement = c.createStatement();
				String sql="Select * from Oficinas where ciudad='"+nombreCiudad+"'";
				ResultSet rs = createStatement.executeQuery(sql);
				if(rs!=null) {
					while (rs.next()) {
						Oficina o=new Oficina();
						o.setOficina(rs.getInt("oficina"));
						o.setCiudad(rs.getString("ciudad"));
						o.setSuperficie(rs.getInt("superficie"));
						o.setVentas(rs.getFloat("ventas"));
						lista.add(o);
					}
				}else {
					System.out.println("No existen oficinas");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
		
		// EJERCICIO 9
		public List<Oficina> oficinasPorSuperficie(int superficie){
			List<Oficina> lista=new ArrayList<Oficina>();
			Connection c=conectar();
			try {
				Statement createStatement = c.createStatement();
				String sql="Select * from Oficinas where superficie > " +superficie;
				ResultSet rs = createStatement.executeQuery(sql);
				if(rs!=null) {
					while (rs.next()) {
						Oficina o=new Oficina();
						o.setOficina(rs.getInt("oficina"));
						o.setCiudad(rs.getString("ciudad"));
						o.setSuperficie(rs.getInt("superficie"));
						o.setVentas(rs.getFloat("ventas"));
						lista.add(o);
					}
				}else {
					System.out.println("No existen oficinas");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return lista;
		}
		
		// EJERCICIO 10
		public static void modificarCiudadYVentas(int oficina, String nuevaCiudad, float incrementoVentas) {
			Connection c=conectar();
			String sql= "Update Oficinas set ciudad=?,ventas=ventas+? "
					+ "where oficina=?";
			try {
				PreparedStatement prepareStatement = c.prepareStatement(sql);
				prepareStatement.setString(1, nuevaCiudad);
				prepareStatement.setFloat(2, incrementoVentas);
				prepareStatement.setInt(3, oficina);
				int filaActualizada = prepareStatement.executeUpdate();
				if(filaActualizada==1) {
					System.out.println("Ciudad e incremento en ventas actualizado correctamente");
				}else {
					System.out.println("No se ha podido actualizar");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}