package examenTipoADAWejercicio1;

import java.util.Arrays;

public class PrincipalEj1 {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Clarita", 19, "contable", "intermedio");
		Empleado e2 = new Empleado("Pili", 22, "administrativa", "principiante");
		Empleado e3 = new Empleado("Pedro", 50, "contable", "intermedio");
		Empleado e4 = new Empleado("Clarita", 19, "contable", "intermedio");
		Equipo eq = new Equipo();
		eq.agregarEmpleados(e1);
		eq.agregarEmpleados(e2);
		eq.agregarEmpleados(e3);
		eq.agregarEmpleados(e4);
		System.out.println(eq);
		
		System.out.println("Equipo aleatorio:");
		System.out.println(Arrays.toString(eq.formarEquipoAleatorio(3)));
		
		System.out.println("Aleatorio por nivel:");
		System.out.println(Arrays.toString(eq.equipoPorNivelAleatorio("principiante", 1)));
	}
	
}