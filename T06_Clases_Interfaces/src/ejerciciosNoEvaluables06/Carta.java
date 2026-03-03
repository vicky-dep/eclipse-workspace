package ejerciciosNoEvaluables06;

import java.util.Arrays;

public class Carta implements CartaInterfaz, Comparable<Carta> {

	/*
	 * Las cartas, formadas por un palo y un número, son la base para muchos juegos de azar. 
	 * Construir las clases necesarias que permitan ordenar una serie de cartas según el palo y el número, 
	 * o solamente por su número. Asimismo, como el azar es algo ligado a los juegos de cartas, 
	 * implementar en la clase Carta un método que construya y devuelva una carta al azar.
	 */
	
	private int numero;
	private String[] palos = {"Oro", "Copa", "Espada", "Basto"};
	
	public Carta() {
		super();
	}
	
	public Carta(int numero, String palo) {
		super();
		this.numero = numero;
	}
	
	public Carta(int numero, String[] palos) {
		super();
		this.numero = numero;
		this.palos = palos;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String[] getPalos() {
		return palos;
	}
	public void setPalos(String[] palos) {
		this.palos = palos;
	}
	
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palos=" + Arrays.toString(palos) + "]";
	}
	
	@Override
	public Carta obtenerCartaAleatoria() {
		int numero = (int) (Math.random() * 12) + 1; // de 1 a 12
		int posPalo = (int) (Math.random() * palos.length);
		return new Carta(numero, palos[posPalo]);
	}


	@Override
	public int compareTo(Carta c) {
		
		return 0;
	}
	
}