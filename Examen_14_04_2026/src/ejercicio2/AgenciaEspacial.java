package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class AgenciaEspacial {
    // Estructura de la flota
    static ArrayList<ArrayList<Sonda>> flota = new ArrayList<>();

    public static void main(String[] args) {
        // --- 2. Inicialización: 5 sectores vacíos ---
      /*  for (int i = 0; i < 5; i++) {
            flota.add(new ArrayList<Sonda>());
        }

        // Ejemplo de uso:
        asignarSonda(0, new Sonda("Explorer-X", 150.5, 3));
        asignarSonda(0, new Sonda("Voyager-3", 200.0, 5));
        asignarSonda(2, new Sonda("Titan-I", 500.0, 5));

        System.out.println("Gasto energético Sector 0: " + calcularGastoEnergeticoSector(0));
        System.out.println("\nModelos en Misión Crítica (Riesgo 5):");
        mostrarMisionesCriticas();
    */
    	// --- 2. Inicialización: 5 sectores vacíos ---
        for (int i = 0; i < 5; i++) {
        	flota.add(new ArrayList<Sonda>());
        }

	    // Ejemplo de uso:
	    asignarSonda(0, new Sonda("Explorer-X", 150.5, 3));
	    asignarSonda(0, new Sonda("Voyager-3", 200.0, 5));
	    asignarSonda(2, new Sonda("Titan-I", 500.0, 5));
	
	    System.out.println("Gasto energético Sector 0: " + calcularGastoEnergeticoSector(0));
	    System.out.println("\nModelos en Misión Crítica (Riesgo 5):");
	    mostrarMisionesCriticas();
	    
	    
    }

    // este método añade la sonda al sector correspondiente de la flota
	private static void asignarSonda(int numSector, Sonda s) {
		int cont = 0;
		Iterator<ArrayList<Sonda>> it1 = flota.iterator();
		while (it1.hasNext()) {
			ArrayList<Sonda> arrayList = (ArrayList<Sonda>) it1.next();
			if (cont == numSector) {
				arrayList.add(s);
				System.out.println("Sonda asignada correctamente");
			}
			cont++;	
		}	
	}

	// este método suma el consumo de energía de todas las sondas que se encuentran en un sector específico
	private static double calcularGastoEnergeticoSector(int numSector) {
		int cont = 0;
		double sumaConsumo = 0;
		Iterator<ArrayList<Sonda>> it1 = flota.iterator();
		while (it1.hasNext()) {
			ArrayList<Sonda> arrayList = (ArrayList<Sonda>) it1.next();
			if (cont == numSector) {
				Iterator<Sonda> it2 = arrayList.iterator();
				while (it2.hasNext()) {
					Sonda sonda = (Sonda) it2.next();
					sumaConsumo += sonda.getConsumoEnergia();
				}
			cont++;	
			}
		}
		return sumaConsumo;
	}

	// este método recorre toda la flota y muestra únicamente los modelos con nivelRiesgo = 5
	private static void mostrarMisionesCriticas() {
		Iterator<ArrayList<Sonda>> it1 = flota.iterator();
		while (it1.hasNext()) {
			ArrayList<Sonda> arrayList = (ArrayList<Sonda>) it1.next();
			Iterator<Sonda> it2 = arrayList.iterator();
			while (it2.hasNext()) {
				Sonda sonda = (Sonda) it2.next();
				if (sonda.getNivelRiesgo() == 5) {
					System.out.println(sonda);
				}
			}
		}
	}
	
}