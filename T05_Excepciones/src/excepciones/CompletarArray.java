package excepciones;

import java.util.Arrays;

public class CompletarArray {

	/*
	 * Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un bucle, 
	 * pida cinco valores por teclado y los introduzca en el vector. 	
	 * Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores hasta rellenar completamente el vector.
	 */
	
	private double[] numeros = new double[0];

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}
	
	public void rellenarArray(double num) throws CompletarArrayException {
		if(numeros.length < 5) {
			// rellenamos el array
			double[] copy = Arrays.copyOf(numeros, numeros.length + 1);
			copy[copy.length - 1] = num;
			numeros = copy;
		} else {
			throw new CompletarArrayException(CompletarArrayException.TAMANIO_MAX);
		}
	}
}