package ejercicio06;

import java.util.Scanner;

import ejercicio05.Atleta;
import ejercicio05.Club;

public class PrincipalEj06 {

	public static void main(String[] args) {
		/*
		 * Implementa un programa donde se cree un flujo de texto de entrada, a partir del cual, 
		 * usando un objeto scanner, se leerán los datos de los deportistas, que se mostrarán por pantalla. 
		 * Al final aparecerán los valores medios de la edad, el peso y la estatura.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.next();
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		System.out.println("Introduce tu peso: ");
		double peso = sc.nextDouble();
		System.out.println("Introduce tu estatura: ");
		double estatura = sc.nextDouble();
		
		Atleta a = new Atleta(nombre, edad, peso, estatura);
		Club c = new Club();
		c.getDeportistas().add(a);
		
	}

}