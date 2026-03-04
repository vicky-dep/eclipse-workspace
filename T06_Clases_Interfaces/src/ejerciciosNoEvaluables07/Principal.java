package ejerciciosNoEvaluables07;

public class Principal {

	public static void main(String[] args) {
		
		// solucion Leticia:
		Persona p = new Persona(8, 120.5f, "980567123W", "Antonio", true, true);
		System.out.println("Saldo:" + p.getSaldo());
		System.out.println("Incrementamos el saldo");
		p.incrementarSaldo(3400);
		System.out.println("Saldo tras el incremento:" + p.getSaldo());
		System.out.println("Número de horas:" + p.getNumHoras());
		System.out.println("Añadimos horas");
		p.incrementarHoras(10);
		System.out.println("Horas después de añadirlas:" + p.getNumHoras());

		////////////////////////////
		p.setEsCliente(false);
		// Probamos a incrementar el saldo a una persona que no es cliente
		// debería quedar igual, sin modificarse
		p.incrementarHoras(450);
		System.out.println("Saldo tras el incremento:" + p.getSaldo());
	
		/*
		 * Mi intento:
		
		Persona p = new Persona("12345678A", "Ana", true, true);
		p.trabajar(40);
		p.ingresar(500);
		
		System.out.println("Horas trabajadas: " + p.horasTrabajadasMes());
		System.out.println("Saldo: " + p.saldoCuenta());
		System.out.println(p);
		*
		*/
		
	}
}