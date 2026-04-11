package ejercicio14;

import java.util.Arrays;
import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {

		HashMap<String, Tarea[]> proyectos = new HashMap<String, Tarea[]>();
		
		anadirTarea("Proyecto1", new Tarea("Script en bash", "alta"), proyectos);
		anadirTarea("Proyecto2", new Tarea("Terminar metodo en JAVA", "media"), proyectos);
		anadirTarea("Proyecto2", new Tarea("Completar epm", "baja"), proyectos);
		anadirTarea("Proyecto1", new Tarea("corregir estilos en CSS", "alta"), proyectos);
		anadirTarea("Proyecto3", new Tarea("Crear un usuario nuevo", "media"), proyectos);
		anadirTarea("Proyecto2", new Tarea("Crear un usuario de prueba", "baja"), proyectos);
		
		System.out.println(Arrays.toString(proyectos.get("Proyecto1")));
		System.out.println(Arrays.toString(proyectos.get("Proyecto2")));
		System.out.println(Arrays.toString(proyectos.get("Proyecto3")));

	}

	private static void anadirTarea(String proyecto, Tarea nuevaTarea, HashMap<String, Tarea[]> proyectos) {
		if (proyectos.containsKey(proyecto)) {
			Tarea[] tareas = proyectos.get(proyecto);
			if (tareas.length < 2) {
				Tarea[] aux = Arrays.copyOf(tareas, tareas.length+1);
				aux[aux.length-1] = nuevaTarea;
				proyectos.put(proyecto, aux);
				System.out.println("Nueva tarea creada correctamente");
			} else {
				System.out.println("Se ha alcanzado el maximo...");
			}
		} else {
			Tarea[] t = {nuevaTarea};
			proyectos.put(proyecto, t);
			System.out.println("Proyecto agregado y nueva tarea añadida");
 		}
		
	}
	
}