package ejercicio2;

public class PrincipalEj2 {

	public static void main(String[] args) {
		Hotel e=new Hotel();
		e.registrarReserva("Juan");
		e.registrarReserva("Luis");
		e.registrarReserva("Antonio");
		e.registrarReserva("Antonio");
		System.out.println(e);
		e.eliminarReserva("Luis");
		int consultarEspacio = e.consultarEspacio();
		System.out.println("Hay "+consultarEspacio+ " vacios");
		e.mostrarHuespedHospedados();		
		System.out.println(e);
		String busqueda1 = e.buscarReserva("Juan");
		String busqueda2 = e.buscarReserva("Claudia");
		System.out.println(busqueda1);
		System.out.println(busqueda2);
	}
}