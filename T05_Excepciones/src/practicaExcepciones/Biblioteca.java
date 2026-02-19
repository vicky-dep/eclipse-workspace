package practicaExcepciones;

public class Biblioteca {

	// 1. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario
	public boolean esPrimo(int numero) throws BibliotecaException {
		boolean esPrimo = true;
		int divisor = 2; // Empezamos en 2 ya que 1 siempre va a ser divisible
		while(esPrimo && divisor < numero) {
			if(numero%divisor == 0) {
				esPrimo = false;
				throw new BibliotecaException(BibliotecaException.NO_PRIMO);
			}
			divisor++;
		}
		return esPrimo;
	}
	
	// 2. voltea: Le da la vuelta a un número
	public int voltea(int num) {
		int resultado = 0;
		while (num != 0) {
			int digito = num % 10; // saco el último dígito
			resultado = resultado * 10 + digito; // lo agrego al nuevo número
			num = num / 10; // elimino el último dígito
		}
		return resultado;
	}
	
	// 3. digitoN: Devuelve el dígito que está en la posición n de un número entero. 
	// Se empieza contando por el 0 y de izquierda a derecha.
	public int digitoN(int num, int pos) {
	    String numStr = String.valueOf(num);
	    int resultado = -1; // valor por defecto
	    if (pos >= 0 && pos < numStr.length()) {
	        resultado = Character.getNumericValue(numStr.charAt(pos));
	    }
	    return resultado;
	}
	
	// 4. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
	public int quitaPorDetras(int numero, int n) throws BibliotecaException {
		// contar digitos 
		int copia = numero;
		int digitos = 0;
		if (copia == 0) {
			digitos = 1;
		} else {
			while (copia != 0) {
				copia /= 10;
				digitos++;
			}
		}
		// no puedo quitar un numero negativo ni superior a la cantidad de dígitos que tengo
		if (n < 0 || n > digitos) {
			throw new IllegalArgumentException();
		}
		int resultado = numero;
	    for (int i = 0; i < n; i++) {
	        numero /= 10;
	    }
	    return resultado;
	}
	
	// 5. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
	public int quitaPorDelante(int numero, int n) throws BibliotecaException {
		// contar digitos 
		int copia = numero;
		int digitos = 0;
		if (copia == 0) {
			digitos = 1;
		} else {
			while (copia != 0) {
				copia /= 10;
				digitos++;
			}
		}
		// no puedo quitar un numero negativo ni superior a la cantidad de dígitos que tengo
		if (n < 0 || n > digitos) {
			throw new IllegalArgumentException();
		}
		int resultado;
		if (n == digitos) {
			resultado = 0;
		} else {
			int divisor = (int) Math.pow(10, digitos - n);
			resultado = numero % divisor;
 		}
		return resultado;
	}
	
	// 6. pegaPorDetras: Añade un dígito a un número por detrás.
	public int pegaPorDetras(int numero, int digito) throws BibliotecaException {
		// si el digito es negativo o de 2 cifras, lanzo execpción
		if (digito < 0 || digito > 9) {
			throw new IllegalArgumentException();
		}
		int resultado = numero * 10 + digito;
		return resultado;
	}
	
	// 7. pegaPorDelante: Añade un dígito a un número por delante.
	public int pegaPorDelante(int numero, int digito) throws BibliotecaException {
		// si el digito es negativo o de 2 cifras, lanzo execpción
		if (digito < 0 || digito > 9) {
			throw new IllegalArgumentException();
		}
		// contar digitos 
		int copia = numero;
		int digitos = 0;
		if (copia == 0) {
			digitos = 1;
		} else {
			while (copia != 0) {
				copia /= 10;
				digitos++;
			}
		}
		int potencia = (int) Math.pow(10, digitos);
		int resultado = digito * potencia + numero;
		return resultado;
	}
	
	// 8.int[] generaArrayInt(int n, int minimo, int maximo): Crea un array de tamaño n con números aleatorios dentro de un rango (mínimo y máximo). 
	
	// 9 int[] minimoYMaximoArrayInt(int[] x):Devuelve un array de dos elementos donde el primero es el valor mínimo 
	// y el segundo es el valor máximo del array pasado como parámetro.
	
	// 10. double mediaArrayInt(int[] x):Calcula la media aritmética de los números contenidos en el array. 
	// Aquí es vital gestionar la excepción si el array está vacío para evitar divisiones por cero. (ArithmeticException)
	
	// 11.int[] volteaArrayInt(int[] x):Le da la vuelta al array (el primer elemento pasa a ser el último, etc.), 
	// similar a tu función voltea para números, pero aplicada a la estructura completa.
	
	// 12. int[] filtraPrimos(int[] x):Esta es una función "maestra" que utiliza tu método esPrimo existente. 
	// Recorre un array y devuelve un nuevo array que contiene solo los números primos encontrados.

	
}