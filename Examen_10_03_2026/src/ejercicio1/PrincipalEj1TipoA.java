package ejercicio1;

public class PrincipalEj1TipoA {
	public static void main(String[] args) {
		/*GestionGimnasio gym = new GestionGimnasio();

		Socio elite = new SocioElite("E001", 50, 10.0, true); // Solo 10€ de saldo
		Socio junior = new SocioJunior("J001", 30, 100.0, "Fútbol");

		gym.darAlta(elite);
		gym.darAlta(junior);

		// 1. Probar Saldo Insuficiente
		
			System.out.println("Intentando actividad de 60 min para Socio Élite...");
			gym.realizarEntrenamiento("E001", 60); // 60 * 0.5 = 30€ (Excede los 10€)
		

		// 2. Probar Edad insuficiente
		
			System.out.println("\nValidando acceso para niño de 10 años...");
			junior.validarAcceso(10);
		

		// 3. Probar funcionamiento correcto
		
			System.out.println("\nRealizando actividad válida para Junior...");
			gym.realizarEntrenamiento("J001", 30);
		*/
		
		GestionGimnasio gym = new GestionGimnasio();

		Socio elite = new SocioElite("E001", 50, 10.0, true); // Solo 10€ de saldo
		Socio junior = new SocioJunior("J001", 30, 100.0, "Fútbol");

		gym.darAlta(elite);
		gym.darAlta(junior);

		// 1. Probar Saldo Insuficiente
		
			System.out.println("Intentando actividad de 60 min para Socio Élite...");
			gym.realizarEntrenamiento("E001", 60); // 60 * 0.5 = 30€ (Excede los 10€)
		

		// 2. Probar Edad insuficiente
		
			System.out.println("\nValidando acceso para niño de 10 años...");
			junior.validarAcceso(10);

		// 3. Probar funcionamiento correcto
		
			System.out.println("\nRealizando actividad válida para Junior...");
			gym.realizarEntrenamiento("J001", 30);
		
	}

}