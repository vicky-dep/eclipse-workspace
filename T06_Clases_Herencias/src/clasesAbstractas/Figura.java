package clasesAbstractas;

public abstract class Figura {
	
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}
	
	public abstract float calcularArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
		
}