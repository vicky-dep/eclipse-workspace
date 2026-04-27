package ejerciciosTransparencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SentenciasParametrizadasMedia {

		 public static void main(String[] args) {
		        Connection con;

		        String url = "jdbc:mysql://localhost/Instituto";
		        try {
		            con = DriverManager.getConnection(url, "root", "1234");

		            System.out.println("Alumnos con Bien:");
		            alumnosXNota(con, 6, 7);
		            System.out.println("\nAlumnos con Notable:");
		            alumnosXNota(con, 7, 9);

		            con.close(); 
		        } catch (SQLException ex) {
		            System.out.println("Ha ocurrido algún error.");
		        }
		    }

		    static public void alumnosXNota(Connection con, double n1, double n2) throws SQLException {
		        String sql = "SELECT nombre, media FROM Alumnos "
		                    + "WHERE ? <= media AND media < ? "
		                    + "ORDER BY media ASC";

		        PreparedStatement sentencia = con.prepareStatement(sql);

		        sentencia.setDouble(1, n1); 
		        sentencia.setDouble(2, n2); 

		        ResultSet rs = sentencia.executeQuery();

		        while (rs.next()) { 
		            System.out.println(rs.getString("nombre")
		                    + "\t\t" + rs.getString("media"));
		        }
		    }
}
