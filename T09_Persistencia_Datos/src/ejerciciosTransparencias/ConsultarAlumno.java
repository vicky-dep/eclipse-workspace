package ejerciciosTransparencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConsultarAlumno {
	public static void main(String[] args) {
		Connection con;
		Statement sentencia;
		String sql;

		String url = "jdbc:mysql://localhost/Instituto";

		try {
			con = DriverManager.getConnection(url, "root", "1234");
			sentencia = con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Dime el curso que quieres para que te liste los alumnos");
			String curso=sc.next();
			sql="SELECT NOMBRE,FNAC FROM ALUMNOS WHERE CURSO='"+ curso+"'";
			ResultSet rs = sentencia.executeQuery(sql);
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String fecha=rs.getString("fnac");
				System.out.println("Nombre alumno:"+nombre+ " Fecha nacimiento:"+fecha);
			}
		}catch (Exception e) {System.out.println("Error al lista alumno");// TODO: handle exception
		}}
}
