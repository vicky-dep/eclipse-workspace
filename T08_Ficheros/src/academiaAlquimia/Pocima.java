package academiaAlquimia;

import java.util.ArrayList;

public class Pocima {

	private int potencia;
	private ArrayList<String> ingredientes;

	public Pocima() {
		super();
	}
	public Pocima(int potencia, ArrayList<String> ingredientes) {
		super();
		this.potencia = potencia;
		this.ingredientes = ingredientes;
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public String toString() {
		return "Pocima [potencia=" + potencia + ", ingredientes=" + ingredientes + "]";
	}
	
}