package DAOs;

import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//Prueba CRUD Empleado
		EmpleadoDAO eDao=new EmpleadoDAO();
		OficinaDAO oDao=new OficinaDAO();
		//				EmpleadoDAO.create(new Empleado(34, "Ana Perez", 25, 11, "Administrativo", "08-05-2010"));
		//				Empleado empleado = EmpleadoDAO.read(103);
		//				System.out.println(empleado);
		//				EmpleadoDAO.update(new Empleado(1, "Ana Perez", 25, 11, "Administrativo", "09-05-2010"));
		//				Empleado empleadoActualizado = EmpleadoDAO.read(1);
		//				System.out.println(empleadoActualizado);
		//				EmpleadoDAO.delete(1);
		//				//Prueba CRUD Oficina
		//				OficinaDAO.create(new Oficina(51, "Madrid", 150, 8000.5f));
		//				Oficina of=OficinaDAO.read(50);
		//				System.out.println(of);
		//				OficinaDAO.update(new Oficina(51, "Madrid", 1500, 8000.5f));
		//				of=OficinaDAO.read(50);
		//				System.out.println(of);
		//				OficinaDAO.delete(50);

		//				List<Empleado> listarEmpleados = eDao.listarEmpleados();
		//				System.out.println(listarEmpleados);
		//				List<Oficina> listaOficinas=oDao.listarOficinas();
		//				System.out.println(listaOficinas);
		Scanner sc= new Scanner(System.in);
		//				System.out.println("Introduce el nombre de la ciudad");
		//				String ciudad=sc.nextLine();
		//				List<Oficina> oficinasPorCiudad = oDao.oficinasPorCiudad(ciudad);
		//				System.out.println(oficinasPorCiudad);
		/*
		System.out.println("Introduce la edad mínima");
		int minimo=sc.nextInt();
		System.out.println("Introduce la edad máxima");
		int maximo=sc.nextInt();
		List<Empleado> empleadosPorEdad = eDao.empleadosPorEdad(minimo,maximo);
		System.out.println(empleadosPorEdad);
		 */
		
		// ---- Prueba Ejercicio 7: ----
		/*
		System.out.println("Introduce la oficina vieja");
		int ofVieja = sc.nextInt();
		
		System.out.println("Introduce la oficina nueva");
		int ofNueva = sc.nextInt();
		
		// imprimo antes de modificar
		System.out.println(eDao.empleadosPorOficina(ofVieja));
		// modifico
		eDao.updateCambiarOficina(ofVieja, ofNueva);
		// imprimo despues de modificar
		System.out.println(eDao.empleadosPorOficina(ofNueva));
		*/
		// ---- Prueba Ejercicio 9: ----
		System.out.println("Introduce la superficie");
		int sup = sc.nextInt();
		
		System.out.println(oDao.oficinasPorSuperficie(sup));
		
		// ---- Prueba Ejercicio 10: ----
		System.out.println("Introduce el número de oficina");
		int ofi = sc.nextInt();
		
		System.out.println("Introduce la nueva ciudad");
		String ciudad = sc.next();
		
		System.out.println("Introduce el incremento de ventas");
		Float inc = sc.nextFloat();
		
		oDao.modificarCiudadYVentas(ofi, ciudad, inc);
		System.out.println(oDao.listarOficinas());
		
	}

}