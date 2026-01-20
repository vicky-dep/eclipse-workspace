package ejercicio06;

import java.util.Arrays;

public class Estudiante {
	/**
	 * Crea una clase Estudiante con los atributos nombre, edad y un array de 5 calificaciones. 
	 * Incluye métodos para:
	 * Añadir las calificaciones.
	 * Calcular el promedio.
	 * Mostrar la información del estudiante junto con su promedio.
	 */
	
	private String nombre;
	private int edad;
	private double [] calificaciones = new double [5];
		
	// Constructor
	public Estudiante() {
		super();
	}
	
	public Estudiante(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	// Metodos
	public void anadirCalificaciones(double[] notas) {
        if (notas.length == calificaciones.length) {
            for (int i = 0; i < calificaciones.length; i++) {
                calificaciones[i] = notas[i];
            }
        } else {
            System.out.println("Debes introducir exactamente 5 calificaciones");
        }
    }
	
	/* 
	 * -- si quisieras añadir las califaciones una a una --
	private int cont = 0;
	public void anadirCalificacion(double nota) {
	    if (cont < calificaciones.length) {
	        calificaciones[cont] = nota;
	        cont++;
	    } else {
	        System.out.println("Ya se han introducido las 5 calificaciones");
	    }
	}
	*/
	
    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        return suma / calificaciones.length;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
        System.out.println("Promedio: " + calcularPromedio());
    }
	
	// Getters & Setters
    public String getNombre() {
    	return nombre;
    }
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double[] getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(double[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", calificaciones=" + Arrays.toString(calificaciones)
				+ "]";
	}
}