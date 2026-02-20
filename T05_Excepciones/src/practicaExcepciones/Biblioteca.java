package practicaExcepciones;

import java.util.Arrays;

public class Biblioteca {

	// 1. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario
	// este es el que hicimos en clase
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
	
	// realizo una versión2 (sin excepcion propia) para luego reutilizarlo en el ejercicio12
	public boolean esPrimo2(int numero) {
	    boolean esPrimo = true;
	    if (numero <= 1) {
	        esPrimo = false;
	    } else {
	        int divisor = 2;
	        while (esPrimo && divisor < numero) {
	            if (numero % divisor == 0) {
	                esPrimo = false;
	            }
	            divisor++;
	        }
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
	    if (pos < 0 || pos >= numStr.length()) {
	        throw new IllegalArgumentException();
	    }
	    int resultado = Character.getNumericValue(numStr.charAt(pos)); // me pareció más fácil resolverlo con String que matemáticamente
	    return resultado;
	}
	
	// 4. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
	public int quitaPorDetras(int numero, int n) throws IllegalArgumentException {
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
		// inicialmente el método era súper corto ya que solo quitaba dígitos, 
		// al hacer el método siguiente, elegí modificar este para que lance la excepción anterior
	    for (int i = 0; i < n; i++) {
	        resultado /= 10;
	    }
	    return resultado;
	}
	
	// 5. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
	public int quitaPorDelante(int numero, int n) throws IllegalArgumentException {
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
	public int pegaPorDetras(int numero, int digito) throws IllegalArgumentException {
		// si el digito es negativo o de 2 cifras, lanzo excepción
		if (digito < 0 || digito > 9) {
			throw new IllegalArgumentException();
		}
		int resultado = numero * 10 + digito;
		return resultado;
	}
	
	// 7. pegaPorDelante: Añade un dígito a un número por delante.
	public int pegaPorDelante(int numero, int digito) throws IllegalArgumentException {
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
	
	// 8.int[] generaArrayInt(int n, int minimo, int maximo): Crea un array de tamaño n con números 
	// aleatorios dentro de un rango (mínimo y máximo).
	public int[] generaArrayInt(int n, int minimo, int maximo) throws BibliotecaException, IllegalArgumentException {
		if (n < 0) {
			throw new BibliotecaException(BibliotecaException.TAMANO_NEGATIVO);
		}
		if (minimo > maximo) {
			throw new IllegalArgumentException();
		}
	    int[] numeros = new int[n];
	    for (int i = 0; i < numeros.length; i++) {
	    	numeros[i] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
	    }
	    return numeros;
	}

	// 9 int[] minimoYMaximoArrayInt(int[] x):Devuelve un array de dos elementos donde el primero es el valor mínimo 
	// y el segundo es el valor máximo del array pasado como parámetro.
	public int[] minimoYMaximoArrayInt(int[] x) throws BibliotecaException, NullPointerException {
	    if (x == null) {
	        throw new NullPointerException();
	    }
	    if (x.length == 0) {
	        throw new BibliotecaException(BibliotecaException.ARRAY_VACIO);
	    }
	    int min = x[0];
	    int max = x[0];
	    for (int i = 1; i < x.length; i++) {
	        if (x[i] < min) min = x[i];
	        if (x[i] > max) max = x[i];
	    }
	    int[] res = {min, max};
	    return res;
	}
	
	// 10. double mediaArrayInt(int[] x):Calcula la media aritmética de los números contenidos en el array. 
	// Aquí es vital gestionar la excepción si el array está vacío para evitar divisiones por cero. (ArithmeticException)
	public double mediaArrayInt(int[] x) throws ArithmeticException, NullPointerException {
	    if (x == null) {
	        throw new NullPointerException();
	    }
	    if (x.length == 0) {
	    	throw new ArithmeticException();
	    }
	    int suma = 0;
	    for (int i = 0; i < x.length; i++) {
	        suma += x[i];
	    }
	    double media = (double) suma / x.length;
	    media = Math.round(media * 100.0) / 100.0; // estrategia para que no muestre todos los decimales, solo 2
	    return media;
	}

	// 11.int[] volteaArrayInt(int[] x):Le da la vuelta al array (el primer elemento pasa a ser el último, etc.), 
	// similar a tu función voltea para números, pero aplicada a la estructura completa.
	public int[] volteaArrayInt(int[] x) {
	    if (x == null) {
	        throw new NullPointerException();
	    }
	    int[] res = new int[x.length];
	    for (int i = 0; i < x.length; i++) {
	        res[i] = x[x.length - 1 - i];
	    }
	    return res;
	}
	
	// 12. int[] filtraPrimos(int[] x):Esta es una función "maestra" que utiliza tu método esPrimo existente. 
	// Recorre un array y devuelve un nuevo array que contiene solo los números primos encontrados.
	public int[] filtraPrimos(int[] x) {
	    if (x == null) {
	        throw new NullPointerException();
	    }
	    int[] res = new int[0];
	    for (int i = 0; i < x.length; i++) {
	    	if (esPrimo2(x[i])) {
	    		int[] copy = Arrays.copyOf(res, res.length + 1);
	    		copy[copy.length - 1] = x[i];
	    		res = copy;
	    	}
	    }
	    return res;
	}
	
}