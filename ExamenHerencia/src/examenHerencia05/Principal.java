package examenHerencia05;

public class Principal {

	public static void main(String[] args) {
		
		Guarderia g = new Guarderia(4);
		
		Perro p1 = new Perro("Toby", "Labrador", 3, 120, 123, false, "grande");
        Perro p2 = new Perro("Luna", "Beagle", 2, 90, 456, true, "pequenio");

        Gato g1 = new Gato("Misu", "Persa", 4, 60, 789, false, "largo");
        Gato g2 = new Gato("Nina", "Siames", 5, 30, 987, true, "corto");
        
        // Ingresar mascotas
        g.ingresarMascota(p1);
        g.ingresarMascota(p2);
        g.ingresarMascota(g1);
        g.ingresarMascota(g2);

        // Intentar repetir
        g.ingresarMascota(p1);
        
        // Intentar agregar mas cantidad de la capacidad
        Perro p3 = new Perro("Coco", "Jack Russel", 1, 100, 1234, true, "mediano");
        g.ingresarMascota(p3);
        
        System.out.println();
        
        // Retirar una mascota
        g.retirarMascota("Luna");

        System.out.println();

        // Intentar retirar una que no existe
        g.retirarMascota("Rocky");
	}
}