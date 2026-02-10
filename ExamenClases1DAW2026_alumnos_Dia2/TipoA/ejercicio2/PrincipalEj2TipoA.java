package ejercicio2;

public class PrincipalEj2TipoA {
	
	public static void main(String[] args) {
		/*GestionEmpresa empresa = new GestionEmpresa();
		empresa.registrarOficina("MLG-90", 50);
		empresa.registrarOficina("MD-30", 120);
		empresa.registrarOficina("BCN", 220);
		empresa.mostrarInformacion();
		System.out.println("Espacios libres: " + empresa.consultarEspacio());
		empresa.buscarOficina("Tiro1");
		empresa.buscarOficina("MD-30");
		empresa.eliminarOficina("MLG-90");
		empresa.eliminarOficina("Pirata");
		empresa.mostrarInformacion();
		System.out.println("Puntos totales:" + empresa.calcularEmpleadosTotal());
		*/
		
		GestionEmpresa empresa = new GestionEmpresa();
		empresa.registrarOficina("MLG-90", 50);
		empresa.registrarOficina("MD-30", 120);
		empresa.registrarOficina("BCN", 220);
		empresa.mostrarInformacion();
		System.out.println("Espacios libres: " + empresa.consultarEspacio());
		empresa.buscarOficina("Tiro1");
		empresa.buscarOficina("MD-30");
		empresa.eliminarOficina("MLG-90");
		empresa.eliminarOficina("Pirata");
		empresa.mostrarInformacion();
		System.out.println("Empleados totales:" + empresa.calcularEmpleadosTotal());

	}
	
}