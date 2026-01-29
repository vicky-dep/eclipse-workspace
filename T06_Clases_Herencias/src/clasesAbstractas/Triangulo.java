package clasesAbstractas;

public class Triangulo extends Figura {
	
	private float base;
	private float altura;
		
	public Triangulo(String color) {
		super(color);
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float calcularArea() {
		return (base*altura)/2;
	}	
}