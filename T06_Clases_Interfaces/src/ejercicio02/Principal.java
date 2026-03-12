package ejercicio02;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo v1 = new Vehiculo("9807DRR", 1990, "Azul", 3, "Opel");
		Vehiculo v2 = new Vehiculo("5807DRR", 1970, "Verde", 3, "Opel");
		Vehiculo v3 = new Vehiculo("9907DRR", 2020, "Rojo", 5, "Opel");
		Vehiculo v4 = new Vehiculo("1207DRR", 2025, "Amarillo", 5, "Opel");
		Vehiculo v5 = new Vehiculo("3307DRR", 1986, "Azul", 3, "BMW");
		Vehiculo v6 = new Vehiculo("7807DRR", 2002, "Azul", 3, "Renault");
		Vehiculo[] vehiculos = { v1, v2, v3, v4, v5, v6 };
		Parking p = new Parking(vehiculos);
		// Probamos los comparadores
		System.out.println("Orden natural");
		Arrays.sort(p.getVehiculos());
		System.out.println(Arrays.toString(p.getVehiculos()));
		System.out.println("Marca y año");
		MarcaAnioComparator mcc = new MarcaAnioComparator();
		Arrays.sort(p.getVehiculos(), mcc);
		System.out.println(Arrays.toString(p.getVehiculos()));
		PlazaMatriculaComparator pmc = new PlazaMatriculaComparator();
		System.out.println("Plazas y matricula");
		Arrays.sort(p.getVehiculos(), pmc);
		System.out.println(Arrays.toString(p.getVehiculos()));
		// Para comparar de forma decreciente,existen estas dos formas:
		System.out.println("Utilizando comparator");
		AnioAntiguedadComparatorInverso aaci = new AnioAntiguedadComparatorInverso();
		Arrays.sort(p.getVehiculos(), aaci);
		System.out.println(Arrays.toString(p.getVehiculos()));
		System.out.println("Utilizando reverse");
		AnioAntiguedadComparator aac = new AnioAntiguedadComparator();
		Arrays.sort(p.getVehiculos(), aac.reversed());
		System.out.println(Arrays.toString(p.getVehiculos()));
		
		System.out.println("----------------------");
		p.modificarAntiguedad(v6, 4);
		System.out.println("Nueva antiguedad: " + v6.getAnioAnt());
		System.out.println("----------------------");
		p.modificarMatricula(v1, "9808DRR");
		System.out.println("Nueva matrícula: " + v1.getMatricula());
		
	}
}