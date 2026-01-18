package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		Agenda ag = new Agenda();
		Contacto c0 = new Contacto("Antonio", 601231470);
		Contacto c1 = new Contacto("Maria", 703123456);
		Contacto c2 = new Contacto("Marta", 991456789);
		ag.anadirContacto(c0);
		ag.anadirContacto(c1);
		ag.anadirContacto(c2);
		System.out.println(ag);
		ag.buscarContacto("Luis");
		ag.buscarContacto("Maria");
		ag.mostrarContactos();
	}

}