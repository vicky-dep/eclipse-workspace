package ejercicio3;

public class PrincipalEj3TipoA {

	public static void main(String[] args) {
	/*	Escuderia ferrari = new Escuderia();

		Piloto p1 = new Piloto("Carlos", "Sainz", 55, 8, 10000);
		p1.registrarTest("deficiente");
		p1.registrarTest("deficiente");
		p1.registrarTest("deficiente");

		Piloto p2 = new Piloto("Fernando", "Alonso", 52, 9, 60000);
		p2.registrarTest("eficiente");
		p2.registrarTest("eficiente");
		p2.registrarTest("eficiente");
		ferrari.ficharMiembro(p1);
		ferrari.ficharMiembro(p2);
		// Al tener rendimiento bajo, la subida de 1000€ se queda en 900€
		p1.incrementarPresupuesto(1000);
		System.out.println("Presupuesto tras sanción: " + p1.getPresupuesto());

		ferrari.rescindirContrato(55);
		System.out.println(ferrari);
*/
		
		Escuderia ferrari = new Escuderia();

		Piloto p1 = new Piloto("Carlos", "Sainz", 55, 8, 10000);
		p1.registrarTest("deficiente");
		p1.registrarTest("deficiente");
		p1.registrarTest("deficiente");

		Piloto p2 = new Piloto("Fernando", "Alonso", 52, 9, 60000);
		p2.registrarTest("eficiente");
		p2.registrarTest("eficiente");
		p2.registrarTest("eficiente");
		ferrari.ficharMiembro(p1);
		ferrari.ficharMiembro(p2);
		// Al tener rendimiento bajo, la subida de 1000€ se queda en 900€
		p1.incrementarPresupuesto(1000);
		System.out.println("Presupuesto tras sanción: " + p1.getPresupuesto());
		
		ferrari.rescindirContrato(55);
		System.out.println(ferrari);

	}

}