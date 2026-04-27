package ejerciciosTransparencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SentenciasParametrizadasInforme {
	public static void main(String[] args) {
        Connection con;
        PreparedStatement sentencia;
        String sql;

        String url = "jdbc:mysql://localhost/Instituto";
        try {
            con = DriverManager.getConnection(url, "root", "1234");
            sql = "SELECT nombre, media FROM Alumnos " +
                  "WHERE curso = ? AND " + 
                  "      media > ?";
            
            sentencia = con.prepareStatement(sql);
            
            System.out.println("Curso:");
            Scanner scanner = new Scanner(System.in);
			String curso = scanner.next();

            System.out.println("Nota de corte:");
            Double notaCorte = scanner.nextDouble();
            
            sentencia.setString(1, curso); 
            sentencia.setDouble(2, notaCorte); 
            
            ResultSet rs = sentencia.executeQuery();
            
            while(rs.next()) {
                System.out.println(rs.getString("nombre") + "\t" + rs.getString("media"));
            }
            
            con.close(); //cerramos la conexión
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido algún error.");
        }
    }
}
