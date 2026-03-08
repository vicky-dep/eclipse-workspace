package repasoHerencia01;

public class Principal {

	public static void main(String[] args) {

		Concesionario c = new Concesionario();
		
		c.listarTodo();
		System.out.println();
		
		Moto m1 = new Moto("Honda", "CB250", 250);
		Moto m2 = new Moto("Honda", "Transalp", 750);
		Coche c1 = new Coche("Opel", "Meriva", 5);
		Coche c2 = new Coche("Peugeot", "106", 3);
		Coche c3 = new Coche("Ford", "Ranger", 4);
		Moto m3 = new Moto("Voge", "DS800", 800);
		
		c.anadir(m1);
		c.anadir(m2);
		c.anadir(c1);
		c.anadir(c2);
		c.anadir(c3);
		c.anadir(m3);
		System.out.println();
		System.out.println("Vehiculos en el concesionario:");
		System.out.println("------------------------------");
		c.listarTodo();
		
		System.out.println();
		System.out.println("Probando conducir");
		m1.conducir();
		m2.conducir();
		c1.conducir();
		c2.conducir();
		c3.conducir();
		
		System.out.println();
		System.out.println("Probando eliminar");
		c.eliminar(2);
		c.listarTodo();
		
		System.out.println();
		c.anadir(m3);
		c.listarTodo();
	}

}