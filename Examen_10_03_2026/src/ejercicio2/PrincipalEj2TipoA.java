package ejercicio2;

public class PrincipalEj2TipoA {
	
	public static void main(String[] args) {

		GestionGimnasio gym = new GestionGimnasio();

		Socio elite = new SocioElite("E001", 50, 10.0, true); // Solo 10€ de saldo
		Socio junior = new SocioJunior("J001", 30, 100.0, "Fútbol");

		gym.darAlta(elite);
		gym.darAlta(junior);

		// 1. Probar Saldo Insuficiente
		try {
			System.out.println("Intentando actividad de 60 min para Socio Élite...");
			gym.realizarEntrenamiento("E001", 60); // 60 * 0.5 = 30€ (Excede los 10€)			
		} catch (GimnasioException e) {
			e.printStackTrace();
		}
		
		// 2. Probar Edad insuficiente
		try {
			System.out.println("\nValidando acceso para niño de 10 años...");
			junior.validarAcceso(10);			
		} catch (GimnasioException e) {
			e.printStackTrace();
		}
		
		// 3. Probar funcionamiento correcto
		try {
			System.out.println("\nRealizando actividad válida para Junior...");
			gym.realizarEntrenamiento("J001", 30);			
		} catch (GimnasioException e) {
			e.printStackTrace();
		}
		
	}

}