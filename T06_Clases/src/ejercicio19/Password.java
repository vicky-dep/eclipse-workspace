package ejercicio19;

public class Password {
	private int longitud = 8;
	private String contrasenia;
	
	// Constructor	
	public Password() {
		super();
	}
	public Password(int longitud) {
		super();
		this.longitud = longitud;
	}
	
	// Metodos de la clase
	public boolean esFuerte() {
		boolean esFuerte = false;
		// 2 mayusculas, mas de 1 minuscula y mas de 5 numeros
		int contMay = 0;
		int contMin = 0;
		int num = 0;
		for (int i = 0; i < contrasenia.length(); i++) {
			if (contrasenia.charAt(i) >= 'A' && contrasenia.charAt(i) <= 'Z') {
				contMay++;
			}
			if (contrasenia.charAt(i) >= 'a' && contrasenia.charAt(i) <= 'z') {
				contMin++;
			}
			if (contrasenia.charAt(i) >= '0' && contrasenia.charAt(i) <= '9') {
				num++;
			}
			/* otra forma de comprobar lo anterior:
			if(Character.isUpperCase(contrasenia.charAt(i))) {
				contMay++;
			}
			if(Character.isLowerCase(contrasenia.charAt(i))) {
				contMin++;
			}
			if(Character.isDigit(contrasenia.charAt(i))) {
				num++;
			}*/
			if (contMay >= 2 && contMin >= 1 && num >=5) {
				esFuerte = true;
			}
		}
		return esFuerte;
	}
	
	public void generarContrasenia() {
		char[] generador = {'a','b','c','d','e','f','g','h','i','j', 'k','l','m','n','o', 'p','q','r','s','t', 'u','v','w','x','y', 'z',
							'A','B','C','D','E','F','G','H','I','J', 'K','L','M','N','O', 'P','Q','R','S','T', 'U','V','W','X','Y', 'Z',
							'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		String contrParcial = "";
		for (int i = 0; i < longitud; i++) {
			int pos = (int) (Math.random() * generador.length);
			contrParcial += String.valueOf(generador[pos]);
		}
		contrasenia = contrParcial;
		System.out.println("Contraseña generada correctamente");
	}

	// Getters & Setters
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	/* este set no lo solicita el ejercicio
	public void setContrasena(String contrasenia) {
		this.contrasena = contrasenia;
	}*/
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasenia=" + contrasenia + "]";
	}
		
}