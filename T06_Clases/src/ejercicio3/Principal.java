package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("Luis", 20);
		Persona p1 = new Persona("Maria", 10);
		Coche c = new Coche("Opel", "Corsa", null);
		if(p.mayorEdad()) {
			c.setPropietario(p);
		}
		System.out.println(c);
		if(p1.mayorEdad()) {
			c.setPropietario(p1);
		}
		System.out.println(c);

	}

}