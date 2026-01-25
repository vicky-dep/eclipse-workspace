package ejercicio2;

public class Contenedores {
	
	public void calcularContenedores (int totalArticulos) {
        
		int pales = totalArticulos / 500;
        int resto = totalArticulos % 500;

        int cajasGrandes = resto / 100;
        resto = resto % 100;

        int cajasMedianas = resto / 25;
        resto = resto % 25;

        int estuches = resto;

        System.out.println("Total de artículos: " + totalArticulos);
        System.out.println("Palés: " + pales);
        System.out.println("Cajas grandes: " + cajasGrandes);
        System.out.println("Cajas medianas: " + cajasMedianas);
        System.out.println("Estuches: " + estuches);
	}
	
}