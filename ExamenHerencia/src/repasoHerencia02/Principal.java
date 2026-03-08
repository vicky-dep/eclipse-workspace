package repasoHerencia02;

public class Principal {
	
	public static void main(String[] args) {
		
		GestionNotificaciones gn = new GestionNotificaciones();
		
		Sms n1 = new Sms("Vicky", "hola", 611000000);
		Email n2 = new Email("Carlos", "mensaje de prueba", "probando@gmail.com");
		Sms n3 = new Sms("Clarita", "hola2", 611111111);
		Email n4 = new Email("Pili", "mensaje de prueba2", "probando2@gmail.com");
	
		gn.agregar(n1);
		gn.agregar(n2);
		gn.agregar(n3);
		gn.agregar(n4);
		
		gn.dispararTodo();
		
		try {
		    gn.cancelar(10);
		} catch (IndiceInvalidoException e) {
		    System.out.println(e.getMessage());
		}
		
		try {
		    gn.cancelar(2);
		} catch (IndiceInvalidoException e) {
		    System.out.println(e.getMessage());
		}

		System.out.println();
		gn.dispararTodo();
	}	
	
}