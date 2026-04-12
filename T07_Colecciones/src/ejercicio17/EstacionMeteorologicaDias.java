package ejercicio17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EstacionMeteorologicaDias {

	public static void main(String[] args) {
		/*
		 * Amplía la actividad anterior de forma que se gestionen los registros de temperatura de diferentes días en la misma aplicación. 
		 * Para ello, implementa un mapa cuyas entradas tendrán como clave la fecha y como valor el conjunto con los registros de un día. 
		 * Implementa también un programa que gestione los registros del día actual y permita visualizar los de un día cualquiera, junto con sus estadísticas. 
		 */

		Scanner sc = new Scanner(System.in);

        // Mapa: fecha -> lista de temperaturas de ese día
        HashMap<String, ArrayList<Double>> registros = new HashMap<>();

        System.out.print("Introduce la fecha de hoy (yyyy-mm-dd): ");
        String fechaActual = sc.nextLine();

        // Si no existe todavía, creamos la lista del día actual
        if (!registros.containsKey(fechaActual)) {
            registros.put(fechaActual, new ArrayList<Double>());
        }

        int opcion = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nuevo registro del día actual");
            System.out.println("2. Listar registros del día actual");
            System.out.println("3. Mostrar estadística del día actual");
            System.out.println("4. Ver registros de otro día");
            System.out.println("5. Ver estadística de otro día");
            System.out.println("6. Cambiar día actual");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("Introduce la temperatura: ");
                    double temperatura = Double.parseDouble(sc.nextLine());

                    registros.get(fechaActual).add(temperatura);
                    System.out.println("Registro guardado correctamente en " + fechaActual);
                    break;

                case 2:
                    listarRegistros(registros, fechaActual);
                    break;

                case 3:
                    mostrarEstadisticas(registros, fechaActual);
                    break;

                case 4:
                    System.out.print("Introduce la fecha a consultar (yyyy-mm-dd): ");
                    String fechaConsulta1 = sc.nextLine();
                    listarRegistros(registros, fechaConsulta1);
                    break;

                case 5:
                    System.out.print("Introduce la fecha a consultar (yyyy-mm-dd): ");
                    String fechaConsulta2 = sc.nextLine();
                    mostrarEstadisticas(registros, fechaConsulta2);
                    break;

                case 6:
                    System.out.print("Introduce la nueva fecha actual (yyyy-mm-dd): ");
                    fechaActual = sc.nextLine();

                    if (!registros.containsKey(fechaActual)) {
                        registros.put(fechaActual, new ArrayList<Double>());
                    }

                    System.out.println("Día actual cambiado a: " + fechaActual);
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);

        sc.close();
    }

    public static void listarRegistros(HashMap<String, ArrayList<Double>> registros, String fecha) {

        if (!registros.containsKey(fecha)) {
            System.out.println("No existen registros para esa fecha.");
        } else {
            ArrayList<Double> temperaturas = registros.get(fecha);

            if (temperaturas.isEmpty()) {
                System.out.println("No hay registros para la fecha " + fecha);
            } else {
                System.out.println("Registros del día " + fecha + ":");
                for (int i = 0; i < temperaturas.size(); i++) {
                    System.out.println("Registro " + (i + 1) + ": " + temperaturas.get(i) + " ºC");
                }
            }
        }
    }

    public static void mostrarEstadisticas(HashMap<String, ArrayList<Double>> registros, String fecha) {

        if (!registros.containsKey(fecha)) {
            System.out.println("No existen registros para esa fecha.");
        } else {
            ArrayList<Double> temperaturas = registros.get(fecha);

            if (temperaturas.isEmpty()) {
                System.out.println("No hay registros para calcular estadísticas en la fecha " + fecha);
            } else {
                double max = temperaturas.get(0);
                double min = temperaturas.get(0);
                double suma = 0;

                for (int i = 0; i < temperaturas.size(); i++) {
                    double t = temperaturas.get(i);

                    if (t > max) {
                        max = t;
                    }

                    if (t < min) {
                        min = t;
                    }

                    suma += t;
                }

                double promedio = suma / temperaturas.size();

                System.out.println("Estadísticas del día " + fecha + ":");
                System.out.println("Temperatura máxima: " + max + " ºC");
                System.out.println("Temperatura mínima: " + min + " ºC");
                System.out.println("Temperatura promedio: " + promedio + " ºC");
            }
        }
	}

}