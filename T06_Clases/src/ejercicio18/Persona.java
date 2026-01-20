package ejercicio18;

public class Persona {
	/**
	 * Los métodos que se implementaran son:
	 * calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
	 * esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
	 * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
	 * toString(): devuelve toda la información del objeto.
	 * generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
	 * Métodos set de cada parámetro, excepto de DNI.
	 */
	
	// Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo = 'H';
	private float peso;
	private float altura;
	
	
	private final int PESO_IDEAL = 0;
	private final int PESO_BAJO = -1;
	private final int PESO_ALTO = 1;
	
	// Constructor
	public Persona() {
		super();
	}
	
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String dni, char sexo, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	// Metodos 
	public int calcularIMC() {
		int result = 0;
		float calculo = (float) (peso / Math.pow(altura, 2));
		if (calculo < 20) {
			result = PESO_BAJO;
		} else if (calculo >=20 && calculo <= 25) {
			result = PESO_IDEAL;
		} else if (calculo > 25) {
			result = PESO_ALTO;
		}
		return result;
	}
	
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (edad >= 18) {
			mayor = true;
		}
		return mayor;
	}
	
	public void comprobarSexo (char sexo) {
		if (sexo != 'H' || sexo != 'M') {
		// if (Character.toUpperCase(sexo) != 'H' || Character.toUpperCase(sexo) != 'M')  
			this.sexo = 'H';
		} else {
			this.sexo = sexo;
		}
	}
	
	public void generarDNI() {
		String dni = "";
		int numero = (int) (Math.random()*99999999+1);
		char letra = generarLetra(numero);
		dni = String.valueOf(numero).concat(String.valueOf(letra));
		this.dni = dni;
	}
	
	private char generarLetra (int numero) {
		char letra = '-';
	    switch(numero%23) {
	    	case 0: letra = 'T'; break;
	        case 1: letra = 'R'; break;
	        case 2: letra = 'W'; break;
	        case 3: letra = 'A'; break;
	        case 4: letra = 'G'; break;
	        case 5: letra = 'M'; break;
	        case 6: letra = 'Y'; break;
	        case 7: letra = 'F'; break;
	        case 8: letra = 'P'; break;
	        case 9: letra = 'D'; break;
	        case 10: letra = 'X'; break;
	        case 11: letra = 'B'; break;
	        case 12: letra = 'N'; break;
	        case 13: letra = 'J'; break;
	        case 14: letra = 'Z'; break;
	        case 15: letra = 'S'; break;
	        case 16: letra = 'Q'; break;
	        case 17: letra = 'V'; break;
	        case 18: letra = 'H'; break;
	        case 19: letra = 'L'; break;
	        case 20: letra = 'C'; break;
	        case 21: letra = 'K'; break;
	        case 22: letra = 'E'; break;
	    } return letra;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	/* el enunciado pide no incluirlo
	public void setDni(String dni) {
		this.dni = dni;
	}*/
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
}