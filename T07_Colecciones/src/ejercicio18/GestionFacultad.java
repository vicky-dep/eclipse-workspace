package ejercicio18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GestionFacultad implements GestionFacultadInterfaz {
	
	/*
	 * Esta clase contendrá el Mapa: HashMap<String, Profesor[]>
	 * Clave: Nombre de la asignatura (ej. "Programación I").
	 * Valor: Un array tradicional Profesor[] que crece y decrece manualmente.
	 */

	private HashMap<String, Profesor[]> facultad;

	public GestionFacultad() {
		super();
	}
	public GestionFacultad(HashMap<String, Profesor[]> facultad) {
		super();
		this.facultad = facultad;
	}

	public HashMap<String, Profesor[]> getFacultad() {
		return facultad;
	}
	public void setFacultad(HashMap<String, Profesor[]> facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "GestionFacultad [facultad=" + facultad + "]";
	}
	
	/*
	 * Si la asignatura no existe en el mapa, se crea una entrada nueva con un array de tamaño 1.
	 * Si existe, se debe comprobar que el idEmpleado no esté repetido en esa asignatura.
	 * Si no está repetido, se redimensiona el array (tamaño actual + 1) para insertar al nuevo profesor.
	 */
	@Override
	public void asignarProfesor(String asignatura, Profesor prof) {
		Set<String> clavesMapa = facultad.keySet();
		if (clavesMapa.contains(asignatura)) {
			// Existe esa asignatura en el mapa
			Profesor[] profesores = facultad.get(asignatura);
			// Buscamos dentro del array el profesor pasado por parametro
			// a traves de idEmpleado
			int cont = 0;
			boolean encontrado = false;
			while (!encontrado && cont < profesores.length) {
				if (profesores[cont].getId().equals(prof.getId())) {
					encontrado = true;
					System.out.println("El profesor ya esta asociado a la asignatura");
				}
				cont++;
			}
			if (!encontrado) {
				// Registramos en el mapa al profesor
				Profesor[] aux = Arrays.copyOf(profesores, profesores.length + 1);
				aux[aux.length-1] = prof;
				facultad.put(asignatura, aux); // Permite asignar valor a la clave
				System.out.println("Profesor añadido correctamente");
			}
		} else { // Registramos la asignatura nueva
			Profesor[] p = {prof};
			facultad.put(asignatura, p);
			System.out.println("Asignatura nueva almacenada correctamente");
		}	
	}
	
	/*
	 * Busca al profesor por su ID dentro del array de la asignatura correspondiente.
	 * Si lo encuentra, lo elimina y redimensiona el array para que no queden huecos (tamaño actual - 1).
	 * Uso de Iterator: Si tras la eliminación el array queda con tamaño 0, utiliza un Iterator sobre el entrySet() 
	 * del mapa para eliminar la asignatura por completo del sistema.
	 */
	@Override
	public void darDeBajaProfesor(String asignatura, String idEmpleado) {
		Set<String> clavesMapa = facultad.keySet();
		if (clavesMapa.contains(asignatura)) {
			Profesor[] profesores = facultad.get(asignatura);
			int cont = 0;
			boolean encontrado = false;
			while (!encontrado && cont < profesores.length) {
				if (profesores[cont].getId().equals(idEmpleado)) {
					encontrado = true;
				} else {
					cont++;					
				}
			}
			if (encontrado) {
				Profesor[] aux = Arrays.copyOf(profesores, profesores.length -1);
				int contAux = 0;
				for (int i = 0; i < profesores.length; i++) {
					if (i != cont) {
						aux[contAux] = profesores[i];
						contAux++;
					}
				}
				if (aux.length == 0) {
					Iterator<String> it = clavesMapa.iterator();
					boolean eliminada = false;
					while (it.hasNext() && !eliminada) {
						String clave = it.next();
						if (clave.equals(asignatura)) {
							it.remove();
							eliminada = true;
						}
					}
					System.out.println("Profesor eliminado y asignatura borrada del sistema");
				} else {
					facultad.put(asignatura, aux);
					System.out.println("Profesor dado de baja correctamente");
				}
			} else {
				System.out.println("No existe un profesor con ese id en la asignatura");
			}
		} else {
			System.out.println("La asignatura no existe en la facultad");
		}
	}
	
	/*
	 * Metodo Leticia:
	 * @Override
	public void darDeBajaProfesor(String asignatura, String idEmpleado) {
		Set<String> clavesMapa = facultad.keySet();
		if (clavesMapa.contains(asignatura)) {
			// Existe esa asignatura en el mapa
			Profesor[] profesors = facultad.get(asignatura);
			int cont = 0;
			boolean encontrado = false;
			while (!encontrado && cont < profesors.length) {
				if (profesors[cont].getId().equals(idEmpleado)) {
					encontrado = true;
					// Borramos al empleado del array, redimensionandolo
					Profesor[] aux = new Profesor[profesors.length - 1];
					int j = 0;
					for (int i = 0; i < profesors.length; i++) {
						if (i != cont) {
							aux[j] = profesors[i];
							j++;
						}
					}
					// Comprobamos que el array tenga longitud mayor que 0
					if (aux.length > 0) {
						facultad.put(idEmpleado, aux);
					} else {
						facultad.remove(asignatura);
					}
					System.out.println("Profesor borrado correctamente");
				}
				cont++;
			}
		}

	}
	 */
	
	/*
	 * Busca al profesor por ID y actualiza su especialidad.
	 */
	@Override
	public void cambiarEspecialidad(String asignatura, String idEmpleado, String nuevaEspecialidad) {
		Profesor p = buscarProfesor(asignatura, idEmpleado);
		if (p != null) {
			// Existe el profesor en esa asignatura
			// Reutilizamos los metodos de arriba
			// Damos de baja al profesor en la asignatura actual
			darDeBajaProfesor(asignatura, idEmpleado);
			// Lo asinamos a la nueva especialidad
			asignarProfesor(nuevaEspecialidad, p);
		} else {
			System.out.println("No existe ese profesor asociado a la asignatura");
		}
	}
	
	/*
	 * Muestra los profesores de la asignatura.
	 * Si porNombre es true, usa Arrays.sort(array) (Orden natural).
	 * Si es false, usa Arrays.sort(array, new CompararPorId()).
	 * Si la asignatura no existe, avisa al usuario.
	 */
	@Override
	public void listarProfesores(String asignatura, boolean porNombre) {
		Set<String> clavesMapa = facultad.keySet();
		if (clavesMapa.contains(asignatura)) {
			Profesor[] profesores = facultad.get(asignatura);
			if (porNombre) {
				Arrays.sort(profesores);
				System.out.println("Ordenados por nombres: " + Arrays.toString(profesores));
			} else {
				CompararPorId c = new CompararPorId();
				Arrays.sort(profesores, c);
				System.out.println("Ordenados por id: " + Arrays.toString(profesores));
			}
		} else {
			System.out.println("La asignatura no existe");
		}
	}
	
	/*
	 * Devuelve el objeto Profesor si existe en esa asignatura, o null si no.
	 */
	@Override
	public Profesor buscarProfesor(String asignatura, String idEmpleado) {
		Profesor p = null;
		Set<String> clavesMapa = facultad.keySet();
		if (clavesMapa.contains(asignatura)) {
			// Existe esa asignatura en el mapa
			Profesor[] profesors = facultad.get(asignatura);
			// Buscamos dentro del array el profesor pasado por parámetros
			// a través del idEmpleado
			int cont = 0;
			boolean encontrado = false;
			while (!encontrado && cont < profesors.length) {
				if (profesors[cont].getId().equals(idEmpleado)) {
					encontrado = true;
					p = profesors[cont];
				}
				cont++;
			}
		}
		return p;
	}
	
}