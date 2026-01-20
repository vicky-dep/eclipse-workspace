package ejercicio04;

public class EcuacionesSegundoGrado {
	/*
	 * Implementa una clase que permita resolver ecuaciones de segundo grado. 
	 * Los coeficientes pueden indicarse en el constructor y modificarse a posteriori. 
	 * Es fundamental que la clase disponga de un método que devuelva las distintas soluciones 
	 * y de un método que nos informe si el discriminante es positivo. 
	 * El discriminante es la parte de la fórmula cuadrática dentro del símbolo de raíz cuadrada: b²-4ac. 
	 * El discriminante nos indica si hay dos soluciones. una solución, o ninguna.
	 */
	
	// formula ecuaciones segundo grado: ax² + bx + c
	// solucion/es: x = (-b +- (raiz) -> b²-4ac)/2a
	
	// Atributos (coeficientes)
	private double a;
	private double b;
	private double c;
	
	// Constructor
	public EcuacionesSegundoGrado() {
		super();
	}
	public EcuacionesSegundoGrado(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Metodos
	public double obtenerDiscriminante() {
		double discriminante = b*b - 4*a*c;
		return discriminante;
	}
	
	public boolean esPositivo(double discriminante) {
		boolean esPositivo = false;
		//if (obtenerDiscriminante()>0) {
		if (discriminante > 0) {
			esPositivo = true;
		}
		return esPositivo;
	}
	
	public void obtenerSolucion() {
		double solucion = 0;
		double solucion1 = 0;
		double solucion2 = 0;
		double discriminante = obtenerDiscriminante();
		if (obtenerDiscriminante()==0) {
			solucion = -b/2*a;
			System.out.println("Existe 1 única solución");
			System.out.println("La solucion es: " + solucion);
		} else if (obtenerDiscriminante()>0){
			solucion1 = (-b + Math.sqrt(discriminante))/2*a;
			solucion2 = (-b - Math.sqrt(discriminante))/2*a;
			System.out.println("Existen 2 soluciones");
			System.out.println("Una solución es: " + solucion1);
			System.out.println("La otra solución es: " + solucion2);
		} else {
			System.out.println("No existe solución, el discriminante es negativo");
		}
	}
	
	// Getters & Setters
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}

}