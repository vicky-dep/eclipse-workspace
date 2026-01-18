package ejercicio2;

public class Rectangulo {

	/**
	 * Crea una clase Rectangulo con atributos base y altura. Incluye métodos para:
	 * Calcular el área del rectángulo.
	 * Calcular el perímetro.
	 * Mostrar los resultados.
	 */
	
	// Atributos
	private int base;
	private int altura;
	
	// Constructores
	public Rectangulo() {
		super();
	}

	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	// Metodos area, perimetro y resultados
	public int calcularArea() { // se crea el metodo sin argumentos para usar los atributos de la clase
		int area = 0;
		area = base * altura;
		return area;
	}
	
	public int calcularPerimetro() {
		int perimetro = 0;
		perimetro = 2 * base + 2* altura;
		return perimetro;
	}
	
	public void mostrarResultados() {
		System.out.println("El area del rectangulo es: " + calcularArea());
		System.out.println("El perimetro del rectangulo es: " + calcularPerimetro());
	}

	// Getter y setter
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
		
}