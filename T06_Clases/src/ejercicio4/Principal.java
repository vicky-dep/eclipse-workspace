package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		
		EcuacionesSegundoGrado e = new EcuacionesSegundoGrado(2,-3,4);
		e.obtenerSolucion();
		System.out.println("------------------");
		EcuacionesSegundoGrado e1 = new EcuacionesSegundoGrado(1,-5,6);
		e1.obtenerSolucion();
		System.out.println("------------------");
		EcuacionesSegundoGrado e2 = new EcuacionesSegundoGrado(1,-4,4);
		e2.obtenerSolucion();
		System.out.println("------------------");
		
		// Otras pruebas para comprobar si funcionan los métodos
		double discriminante = e.obtenerDiscriminante();
		System.out.println("El disciminante es: " + discriminante);
		System.out.println("El discriminante es positivo?: " + e.esPositivo(discriminante));
	}

}