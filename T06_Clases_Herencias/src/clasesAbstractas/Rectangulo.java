package clasesAbstractas;

public class Rectangulo extends Figura {

	private float alto;
	private float ancho;
	
	public Rectangulo(String color) {
		super(color);
	}

	@Override
	public float calcularArea() {
		return ancho*alto;
	}
	
}