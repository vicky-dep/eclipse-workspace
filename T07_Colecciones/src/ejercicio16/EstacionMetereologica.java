package ejercicio16;

import java.util.ArrayList;
import java.util.Scanner;

public class EstacionMetereologica {

	public static void main(String[] args) {
		/*
		 *  ﻿Implementar una aplicación que simula el registro de las temperaturas, a lo largo de un día, en una estación meteorológica. 
		 *  La aplicación mostrará un menú con las opciones:
		 *  1. Nuevo registro (que introduciremos manualmente, aunque se supone que, en el sistema original, estaría controlado por un reloj).
		 *  2. Listar registros.
		 *  3. Mostrar estadística (con los valores máximo,mínimo y promedio de las temperaturas
		 */

		Scanner sc = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();

        int opcion = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadistica");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce la temperatura: ");
                    double temp = sc.nextDouble();
                    temperaturas.add(temp);
                    System.out.println("Registro guardado correctamente.");
                    break;

                case 2:
                    if (temperaturas.isEmpty()) {
                        System.out.println("No hay registros.");
                    } else {
                        System.out.println("Registros de temperatura:");
                        for (int i = 0; i < temperaturas.size(); i++) {
                            System.out.println("Registro " + (i + 1) + ": " + temperaturas.get(i) + " ºC");
                        }
                    }
                    break;

                case 3:
                    if (temperaturas.isEmpty()) {
                        System.out.println("No hay registros para mostrar estadisticas.");
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

                        System.out.println("Temperatura maxima: " + max + " ºC");
                        System.out.println("Temperatura minima: " + min + " ºC");
                        System.out.println("Temperatura promedio: " + promedio + " ºC");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        sc.close();
	}
}