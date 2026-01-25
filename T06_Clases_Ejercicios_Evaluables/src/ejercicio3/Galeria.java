package ejercicio3;

import java.util.Arrays;

public class Galeria {
	/**
	 * Es la clase de mayor nivel que coordina todas las exposiciones del edificio.
	 */
	
	// Atributos
	private String nombreGaleria;
	private Exposicion[] listaExposiciones;
	
	// Constructor por defecto y con parametros
	public Galeria() {
		super();
	}
	public Galeria(String nombreGaleria, Exposicion[] listaExposiciones) {
		super();
		this.nombreGaleria = nombreGaleria;
		this.listaExposiciones = listaExposiciones;
	}
	public Galeria(String nombreGaleria) {
		super();
		this.nombreGaleria = nombreGaleria;
		this.listaExposiciones = new Exposicion[0];
	}
	
	// Getters & Setters
	public String getNombreGaleria() {
		return nombreGaleria;
	}
	public void setNombreGaleria(String nombreGaleria) {
		this.nombreGaleria = nombreGaleria;
	}
	public Exposicion[] getListaExposiciones() {
		return listaExposiciones;
	}
	public void setListaExposiciones(Exposicion[] listaExposiciones) {
		this.listaExposiciones = listaExposiciones;
	}
	@Override
	public String toString() {
		return "Galeria [nombreGaleria=" + nombreGaleria + ", listaExposiciones=" + Arrays.toString(listaExposiciones)
				+ "]";
	}

	// Metodos
	// Añade una nueva exposición a la galería. La galería tendrá como máximo 5 exposiciones.
	public void agregarExposicion(Exposicion expo) {
		if (listaExposiciones.length < 5) {
			Exposicion[] copy = Arrays.copyOf(listaExposiciones, listaExposiciones.length + 1);
			copy[copy.length-1] = expo;
			listaExposiciones = copy;
			System.out.println("Exposición añadida correctamente");			
		} else {
			System.out.println("No se ha podido añadir, galería completa");
		}
	}
	
	// Busca una exposición específica por su nombre.
	public Exposicion buscarExposicion(String nombreExposicion) {
	    int pos = 0;
	    boolean encontrada = false;
	    Exposicion exposicionEncontrada = null;
	    while (pos < listaExposiciones.length && !encontrada) {
	        if (listaExposiciones[pos] != null && listaExposiciones[pos].getNombreExposicion().equalsIgnoreCase(nombreExposicion)) {
	            exposicionEncontrada = listaExposiciones[pos];
	            encontrada = true;
	        }
	        pos++;
	    }
	    return exposicionEncontrada;
	}
	
	// Busca una obra recorriendo todas las exposiciones disponibles. Debe devolver la primera coincidencia encontrada.
	public ObraDeArte buscarObraEnTodaLaGaleria(String tituloObra) {
	    int pos = 0;
	    boolean encontrada = false;
	    ObraDeArte obraEncontrada = null;
	    while (pos < listaExposiciones.length && !encontrada) {
	        if (listaExposiciones[pos] != null) {
	            // Llamo a buscarObra de la clase Exposicion
	            ObraDeArte aux = listaExposiciones[pos].buscarObra(tituloObra);
	            if (aux != null) {
	                obraEncontrada = aux;
	                encontrada = true;
	            }
	        }
	        pos++;
	    }
	    return obraEncontrada;
	}
	
	// Muestra para cada exposición: su nombre, el número de obras que contiene y el valor total económico de la misma.
	public void mostrarEstadisticasPorExposicion() {
	    if (listaExposiciones.length == 0) {
	        System.out.println("No hay exposiciones en la galería.");
	    } else {
	        for (int i = 0; i < listaExposiciones.length; i++) {
	            if (listaExposiciones[i] != null) {
	                String nombre = listaExposiciones[i].getNombreExposicion();
	                int numObras = listaExposiciones[i].getListaObras().length;
	                double valorTotal = listaExposiciones[i].calcularValorTotal();

	                System.out.println("Exposición: " + nombre);
	                System.out.println("Número de obras: " + numObras);
	                System.out.println("Valor total: " + valorTotal);
	                System.out.println("-------------------------");
	            }
	        }
	    }
	}
}