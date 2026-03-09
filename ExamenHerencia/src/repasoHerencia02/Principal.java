package repasoHerencia02;

public class Principal {
	
	public static void main(String[] args) {
		
		GestionNotificaciones gn = new GestionNotificaciones();
		
		Sms s1 = new Sms("Ana", "Hola", 656789123);
		Sms s2 = new Sms("Carlos", "Quedamos a las 14", 600459123);
		Email e1 = new Email("Jefe", "Reunion a las 10", "correo@correo.com");
		
		gn.agregar(s1);
		gn.agregar(s2);
		gn.agregar(e1);
		System.out.println(gn);
		// Probamos los metodos
		gn.dispararTodo();
		
		try {
			gn.cancelar(1);			
		} catch (IndiceInvalidoException e) {
			e.printStackTrace();
		}
		
		System.out.println("Despues de eliminar" + gn);
		
		
		/*
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
	}	*/
	}
}