package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Lucía", 20);

        double[] notas = {7.5, 8, 6.5, 9, 7};
        e1.anadirCalificaciones(notas);

        e1.mostrarInformacion();

	}

}