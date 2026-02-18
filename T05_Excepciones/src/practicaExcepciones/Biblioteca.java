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
		int volteado = 0;
		while (num != 0) {
			int digito = num % 10; // saco el último dígito
			volteado = volteado * 10 + digito; // lo agrego al nuevo número
			num = num / 10; // elimino el último dígito
		}
		return volteado;
	}
	
	// 3. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
	
}