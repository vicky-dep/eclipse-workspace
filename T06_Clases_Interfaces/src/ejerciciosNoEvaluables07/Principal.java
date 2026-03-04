package ejerciciosNoEvaluables07;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("12345678A", "Ana", true, true);
		p.trabajar(40);
		p.ingresar(500);
		
		System.out.println("Horas trabajadas: " + p.horasTrabajadasMes());
		System.out.println("Saldo: " + p.saldoCuenta());
		System.out.println(p);
	}
}