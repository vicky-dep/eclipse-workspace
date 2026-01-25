package ejercicio3;

import java.util.Arrays;

public class Exposicion {
	
	// Esta clase representa una sala o sección temática que contiene varias obras.

	// Atributos
	private String nombreExposicion;
	private ObraDeArte[] listaObras;
	
	// Constructor que inicialice el nombre y la lista
	public Exposicion(String nombreExposicion, ObraDeArte[] listaObras) {
		super();
		this.nombreExposicion = nombreExposicion;
		this.listaObras = listaObras;
	}
	// No estaba segura donde inicializar el array a 0
	public Exposicion(String nombreExposicion) {
		super();
		this.nombreExposicion = nombreExposicion;
		this.listaObras = new ObraDeArte[0];
	}		
	
	// Getters & Setters
	public String getNombreExposicion() {
		return nombreExposicion;
	}
	public void setNombreExposicion(String nombreExposicion) {
		this.nombreExposicion = nombreExposicion;
	}
	public ObraDeArte[] getListaObras() {
		return listaObras;
	}
	public void setListaObras(ObraDeArte[] listaObras) {
		this.listaObras = listaObras;
	}
	@Override
	public String toString() {
		return "Exposicion [nombreExposicion=" + nombreExposicion + ", listaObras=" + Arrays.toString(listaObras) + "]";
	}

	// Metodos
	// Añade una obra a la exposición. Se tendrá que redimensionar el array
	public void agregarObra(ObraDeArte obra) {
		ObraDeArte[] copy = Arrays.copyOf(listaObras, listaObras.length+1);
		copy[copy.length-1] = obra;
		listaObras = copy;
		System.out.println("Obra de arte agregada correctamente");
	}

	// Busca una obra por su título y la elimina de la lista. Devuelve true si se eliminó correctamente.
	public boolean eliminarObra(String titulo) {
	    int pos = 0;
	    boolean eliminada = false;
	    // Busco la posición de la obra
	    while (pos < listaObras.length && !eliminada) {
	        if (listaObras[pos] != null && listaObras[pos].getTitulo().equalsIgnoreCase(titulo)) {
	            eliminada = true;
	        } else {
	            pos++;
	        }
	    }
	    // Si se encontró, eliminar (desplazar + redimensionar)
	    if (eliminada) {
	        for (int i = pos; i < listaObras.length - 1; i++) {
	            listaObras[i] = listaObras[i + 1];
	        }
	        listaObras[listaObras.length - 1] = null;
	        listaObras = Arrays.copyOf(listaObras, listaObras.length - 1);
	        System.out.println("Obra eliminada correctamente");
	    } else {
	        System.out.println("No se encontró una obra con ese título");
	    }
	    return eliminada;
	}
	
	// Busca y retorna el objeto obra según su título.
	public ObraDeArte buscarObra(String titulo) {
	    int pos = 0;
	    boolean encontrada = false;
	    ObraDeArte obraEncontrada = null;
	    while (pos < listaObras.length && !encontrada) {
	        if (listaObras[pos] != null && listaObras[pos].getTitulo().equalsIgnoreCase(titulo)) {
	            obraEncontrada = listaObras[pos];
	            encontrada = true;
	        }
	        pos++;
	    }
	    return obraEncontrada;		
	}
	
	// Calcula y devuelve la suma de los precios de todas las obras de esta exposición.
	public double calcularValorTotal() {
		double suma = 0;
		for (int i = 0; i < listaObras.length; i++) {
			if (listaObras[i] != null) {
				suma += listaObras[i].getPrecio();				
			}
		}
		return suma;
	}
	
	// Imprime por consola el listado completo de obras de la exposición.
	public void mostrarObras() {
	    if (listaObras.length == 0) {
	        System.out.println("No hay obras en esta exposición.");
	    } else {
	        for (int i = 0; i < listaObras.length; i++) {
	            if (listaObras[i] != null) {
	                System.out.println(listaObras[i]);
	            }
	        }
	    }
	}
	
}