package ejercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		
		System.out.println("Introduce el nombre");
		p.setNombre(sc.nextLine());
		System.out.println("Introduce edad");
		p.setEdad(sc.nextInt());
		System.out.println("Introduce sexo H o M");
		p.setSexo(sc.next().charAt(0));
		System.out.println("Introduce la altura");
		p.setAltura(sc.nextFloat());
		System.out.println("Introduce el peso");
		p.setPeso(sc.nextFloat());
		
		System.out.println("--------------------------------------");
		Persona p2 = new Persona();
		// tuve que agregar la siguiente linea porque sino me pedia el nombre y la edad a la vez
		sc.nextLine();
		System.out.println("Introduce el nombre P2");
		p2.setNombre(sc.nextLine());
		System.out.println("Introduce edad P2");
		p2.setEdad(sc.nextInt());
		System.out.println("Introduce sexo P2 H o M");
		p2.setSexo(sc.next().charAt(0));
		p2.setAltura(1.90f);
		p2.setPeso(120);

		System.out.println("--------------------------------------");
		Persona p3 = new Persona("Luis", 20, 'H');
		p3.setAltura(1.80f);
		p3.setPeso(65);
		p.generarDNI();
		p2.generarDNI();
		p3.generarDNI();
		
		System.out.println("IMC P1: " + p.calcularIMC());
		System.out.println("IMC P2: " + p2.calcularIMC());
		System.out.println("IMC P3: " + p3.calcularIMC());
		
		System.out.println("Es mayor de edad P1: " + p.esMayorDeEdad());
		System.out.println("Es mayor de edad P2: " + p2.esMayorDeEdad());
		System.out.println("Es mayor de edad P3: " + p3.esMayorDeEdad());
		
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
	
	}

}