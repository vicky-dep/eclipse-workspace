package ejerciciosTransparencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BorrarAlumno {
	public static void main(String[] args) {
		Connection con;
		Statement sentencia;
		String sql;

		String url = "jdbc:mysql://localhost/Instituto";

		try {
			con = DriverManager.getConnection(url, "root", "1234");
			sentencia = con.createStatement();
			System.out.println("Inserte el alumno a eliminar");
			Scanner sc=new Scanner(System.in);
			int numAlumno=sc.nextInt();
			sql="DELETE FROM alumnos where num="+ numAlumno;
			 int executeUpdate = sentencia.executeUpdate(sql);
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
