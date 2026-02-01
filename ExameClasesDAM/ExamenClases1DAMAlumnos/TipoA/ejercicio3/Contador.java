package ejercicio3;

public class Contador {
	
	private static int cuentaGlobal = 28;
	private int cuentaIndividual;
	
	// Constructor
	public Contador() {
		super();
	}
	public Contador(int cuentaIndividual) {
		super();
		this.cuentaIndividual = cuentaIndividual;
	}

	// Getters & Setters
	public static int getCuentaGlobal() {
		return cuentaGlobal;
	}
	public static void setCuentaGlobal(int cuentaGlobal) {
		Contador.cuentaGlobal = cuentaGlobal;
	}
	public int getCuentaIndividual() {
		return cuentaIndividual;
	}
	public void setCuentaIndividual(int cuentaIndividual) {
		this.cuentaIndividual = cuentaIndividual;
	}
	@Override
	public String toString() {
		return "Contador [cuentaIndividual=" + cuentaIndividual + "]";
	}
}