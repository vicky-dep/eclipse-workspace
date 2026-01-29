package ejercicio01;

import java.util.Arrays;

public abstract class Instrumento {
	String[] melodia = {"la", "la", "re", "re", "fa"};

	public Instrumento(String[] melodia) {
		super();
		this.melodia = melodia;
	}

	public Instrumento() {
		super();
	}

	public String[] getMelodia() {
		return melodia;
	}
	public void setMelodia(String[] melodia) {
		this.melodia = melodia;
	}

	@Override
	public String toString() {
		return "Instrumento [melodia=" + Arrays.toString(melodia) + "]";
	}
	
	public void add(String nota) {
		String[] copy = Arrays.copyOf(melodia, melodia.length + 1);
		copy[copy.length -1] = nota;
		melodia = copy;
	}
	
	public abstract void interpretar();
}