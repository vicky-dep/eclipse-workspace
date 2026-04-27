package ejerciciosTransparencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class InsertarNuevoAlumno {
	 public static void main(String[] args) {
	   Connection con;
       Statement sentencia;
       String sql;

       String url = "jdbc:mysql://localhost/Instituto";
       try {
           con = DriverManager.getConnection(url, "root", "1234");
           sentencia = con.createStatement();
           System.out.println("Número de alumno:");
           Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
           
          
           System.out.println("Media:");
           Double media = scanner.nextDouble();
           System.out.println("Nombre:");
           String nombre = scanner.next();
           System.out.println("Curso:");
           String curso = scanner.next();
           System.out.println("Fecha de nacimiento:");
           String fnac = scanner.next();

           sql = "INSERT INTO Alumnos (num, nombre, fnac, media, curso) "
                   + "VALUES (" + num + ",'" + nombre + "', '" + fnac + "',"
                   + media + ", '" + curso + "')";
           sentencia.executeUpdate(sql);
           con.close(); //cerramos la conexión
           System.out.println("Se ha insertado el nuevo alumno.");
       } catch (SQLException ex) {
           System.out.println("Ha ocurrido algún error.");
       }
   }
}
