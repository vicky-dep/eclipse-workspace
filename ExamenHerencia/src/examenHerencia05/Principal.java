package examenHerencia05;

public class Principal {

	public static void main(String[] args) {
		
		Guarderia g = new Guarderia(4);
		
		Perro p1 = new Perro("Toby", "Labrador", 3, 120, 123, false, "grande");
        Perro p2 = new Perro("Luna", "Beagle", 2, 90, 456, true, "pequenio");

        Gato g1 = new Gato("Misu", "Persa", 4, 60, 789, false, "largo");
        Gato g2 = new Gato("Nina", "Siames", 5, 30, 987, true, "corto");
        
        // Ingresar mascotas
        try {
        	g.ingresarMascota(p1);		
		} catch (GuarderiaException e) {
			e.printStackTrace();
		}
        
        try {
        	g.ingresarMascota(p2);			
		} catch (GuarderiaException e) {
			e.printStackTrace();
		}
        
        try {
        	g.ingresarMascota(g1);			
		} catch (GuarderiaException e) {
			e.printStackTrace();
		}
        
        try {
        	g.ingresarMascota(g2);			
		} catch (GuarderiaException e) {
			e.printStackTrace();
		}

        // Intentar repetir
        try {
        	g.ingresarMascota(p1);			
		} catch (GuarderiaException e) {
			e.printStackTrace();
		}
        
        // Intentar agregar mas cantidad de la capacidad
        try {
        	Perro p3 = new Perro("Coco", "Jack Russel", 1, 100, 1234, true, "mediano");
        	g.ingresarMascota(p3);			
		} catch (GuarderiaException e) {
			e.printStackTrace();
		}
        
        System.out.println();
        
        // Retirar una mascota
        try {
        	g.retirarMascota("Luna");			
		} catch (GuarderiaException e) {
			e.printStackTrace();
		}
        
        // Intentar retirar una que no existe
        try {
        	g.retirarMascota("Rocky");			
		} catch (GuarderiaException e) {
			e.printStackTrace();
		}

	}
}