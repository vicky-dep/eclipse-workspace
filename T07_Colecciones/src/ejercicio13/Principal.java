package ejercicio13;

import java.util.ArrayList;
import java.util.Iterator;

import ejercicio010203.Gato;

public class Principal {
	
	public static void main(String[] args) {
		/*
		 * Crea un ArrayList<Gato> y añade al menos 6 gatos con diferentes nombres y razas. 
		 * Utiliza un Iterator<Gato> para recorrer la lista y eliminar a todos los gatos cuyo nombre empiece por la letra "A" o "M".
		 */
		
		ArrayList<Gato> gatos = new ArrayList<>();

        // Añadimos gatos
        gatos.add(new Gato("Milo", "Siames"));
        gatos.add(new Gato("Luna", "Persa"));
        gatos.add(new Gato("Ares", "Egipcio"));
        gatos.add(new Gato("Nala", "Bengala"));
        gatos.add(new Gato("Mia", "Angora"));
        gatos.add(new Gato("Leo", "Europeo"));

        System.out.println("Antes de eliminar");
        System.out.println(gatos);
        
        // Iterator para eliminar
        Iterator<Gato> it = gatos.iterator();

        while (it.hasNext()) {

            Gato g = it.next();

            if (g.getNombre().startsWith("A") || g.getNombre().startsWith("M")) {
                it.remove();
            }
        }

        // Mostrar resultado
        for (Gato g : gatos) {
            System.out.println(g);
        }
        
        System.out.println("Despues de eliminar");
        System.out.println(gatos);
		
	}

}