package DAOsTransparencia;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Alumno a;
	        
		 AlumnoDAO dao=new AlumnoDAO();
	        Date hoy = new Date();
	        System.out.println(hoy);
	        
	        a = new Alumno(990, "Ana", hoy, 6.7, "1A");
	        dao.create(a);
	        a = new Alumno(991, "Juan", hoy, 7.8, "2A");
	        dao.create(a);
	        a = new Alumno(992, "Luis", hoy, 8.9, "1B");
	        dao.create(a);
	        
	        
	        a = dao.read(991);
	        System.out.println(a);
	        
	        a = dao.read(990);
	        System.out.println(a);
	        
	        a.setNombre("Ana María Pérez García");
	        a.setNotaMedia(10.0);
	        dao.update(a);
	        
	        dao.delete(992);   
	        List<Alumno> listarAlumnos = dao.listarAlumnos();
	        System.out.println(listarAlumnos);
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Introduce un curso");
	        List<Alumno> listarAlumnosCurso =dao.buscarAlumnos(sc.next());
	        System.out.println("Alumnos por curso:"+listarAlumnosCurso);
	        
	        
	    }
	}


