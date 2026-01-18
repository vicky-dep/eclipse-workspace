package ejercicio9;

import java.util.Arrays;

public class Cajero {
	/**
	 * Crea una clase Cajero que almacene billetes de diferentes denominaciones en un array 
	 * (por ejemplo: 1, 5, 10, 20, 50, 100).
	 * Incluye métodos para:
	 * Registrar la cantidad de cada tipo de billete.
	 * Calcular el total de dinero disponible en el cajero.
	 * Retirar una cantidad específica (validando que el cajero tiene suficiente dinero y distribuyendo los billetes).
	 */
	
    private int[] denominaciones = {1, 5, 10, 20, 50, 100};
    private int[] cantidades = new int[denominaciones.length];
    
    // Constructor
    public Cajero() {
    	super();
    }
    
	// Metodos
    public void registrarBilletes(int denominacion, int cantidad) {
        int pos = 0;
        boolean encontrado = false;
        while (pos < denominaciones.length && !encontrado) {
            if (denominaciones[pos] == denominacion) {
                cantidades[pos] += cantidad;
                encontrado = true;
                System.out.println("Billetes registrados correctamente");
            }
            pos++;
        }
        if (!encontrado) {
            System.out.println("Denominación no válida");
        }
    }
    
    public int calcularTotal() {
        int total = 0;
        for (int i = 0; i < denominaciones.length; i++) {
            total += denominaciones[i] * cantidades[i];
        }
        return total;
    }
    
    public void retirar(int cantidad) {
        if (cantidad > calcularTotal()) {
            System.out.println("No hay suficiente dinero en el cajero");
            return;
        }
        int[] copiaCantidades = Arrays.copyOf(cantidades, cantidades.length);
        int restante = cantidad;

        // empezamos por los billetes más grandes
        for (int i = denominaciones.length - 1; i >= 0; i--) {
            while (denominaciones[i] <= restante && copiaCantidades[i] > 0) {
                restante -= denominaciones[i];
                copiaCantidades[i]--;
            }
        }
        if (restante == 0) {
            cantidades = copiaCantidades;
            System.out.println("Retiro realizado correctamente");
        } else {
            System.out.println("No se puede retirar esa cantidad con los billetes disponibles");
        }
    }
    
    public void mostrarCajero() {
        for (int i = 0; i < denominaciones.length; i++) {
            System.out.println("Billetes de " + denominaciones[i] + ": " + cantidades[i]);
        }
        System.out.println("Total disponible: " + calcularTotal());
    }
}