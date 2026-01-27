package ejercicio1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		/* cambio esta parte del main ya que no utilizo tipo enumerado
		Empleado c= new Empleado("Juan","Manager",50,nivel.avanzado);
		Empleado c1= new Empleado("Lucia","CEO",45,nivel.avanzado);
		Empleado c2= new Empleado("Carlos","Junior",20,nivel.principiante);
		*/
		Empleado c= new Empleado("Juan","Manager",50,"avanzado");
		Empleado c1= new Empleado("Lucia","CEO",45,"avanzado");
		Empleado c2= new Empleado("Carlos","Junior",20,"principiante");
		// agrego mas comprobaciones
		Empleado c3= new Empleado("Carlos","Junior",22,"principiante");
		Equipo p = new Equipo();
		p.anadirEmpleado(c);
		p.anadirEmpleado(c1);
		p.anadirEmpleado(c2);
		p.anadirEmpleado(c);
		p.anadirEmpleado(c3);
		System.out.println(p);
		System.out.println("Lista aleatoria:");
		System.out.println(Arrays.toString(p.generarLista(4)));
		/*System.out.println(Arrays.toString(p.generarListaPorNivel(nivel.avanzado, 3)));
		System.out.println(Arrays.toString(p.generarListaPorNivel(nivel.intermedio, 5)));*/
		System.out.println("Lista aleatoria de nivel avanzado:");
		System.out.println(Arrays.toString(p.generarListaPorNivel("avanzado", 2)));
		System.out.println("Lista aleatoria de nivel intermedio:");
		System.out.println(Arrays.toString(p.generarListaPorNivel("intermedio", 2)));
		System.out.println("Lista aleatoria de nivel principiante:");
		System.out.println(Arrays.toString(p.generarListaPorNivel("principiante", 2)));

	}

}