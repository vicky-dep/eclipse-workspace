package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo(10,4);
		int area = r.calcularArea();
		System.out.println("Area: " + area);
		int perimetro = r.calcularPerimetro();
		System.out.println("Perimetro: " + perimetro);
		r.mostrarResultados();
	}

}